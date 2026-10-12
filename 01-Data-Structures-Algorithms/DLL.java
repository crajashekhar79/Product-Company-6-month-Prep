class Doubly_LL {

    private Node head;
    private int size = 0;

    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        if (head != null) {
            head.prev = node;
        }

        head = node;
        size++;

    }

    public void insertLast( int val ){
        Node node = new Node(val);

        if( head == null ){
            node.next = null;
            node.prev = null;
            head = node;
            return;
        }
        Node curr_node = head;
        for( int i = 1; i < size ; i++ ){
            curr_node = curr_node.next;
        }

        node.prev = curr_node;
        curr_node.next = node;
        size++;

    }

    public Node find( int value ){
        Node node = head;
        while( node != null ){
            if( node.val == value ){
                return node;
            }
            node= node.next;
        }

        return null;
    }

    public void insert( int after , int val ){
        Node p = find(after);

        if( p == null ){
            System.out.println("Value Does'nt exist");
            return;
        }
        Node node = new Node(val);

        node.next = p.next;
        p.next = node;
        node.prev = p;
        if( node.next != null ) {
            node.next.prev = node;
        }


    }

    public void display() {
        Node node = head;
        Node last = null;

        while (node != null) {
            System.out.print(node.val + " -> ");
            last = node;
            node = node.next;
        }
        System.out.println("END");

        System.out.println("print in reverse:- ");
        while( last != null ){
            System.out.print(last.val+" -> ");
            last = last.prev;
        }
        System.out.print("START");
    }

    private class Node {
        int val;
        Node next;
        Node prev;
        int size;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next, Node prev) {
            this.val = val;
            this.next = next;
            this.prev = prev;
        }
    }
}

public class DLL {
    public static void main(String[] args) {

        Doubly_LL dll = new Doubly_LL();

        dll.insertFirst(15);
        dll.insertFirst(14);
        dll.insertFirst(23);

        dll.insertLast(52);
        dll.insertLast(12);

        dll.insert(14,65);





        dll.display();




    }
}

