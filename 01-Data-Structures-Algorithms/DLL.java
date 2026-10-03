class Node {
    int data ;
    Node next;
    Node prev;

    Node( int data ){
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

class linked_list {
    Node head;

    void insertatbeginnig( int data ){
        Node nd = new Node(data);

        if( head == null ){
            head = nd;
            return;
        }

        Node curr_nod = head;

        nd.next = curr_nod;
        curr_nod.prev = nd;
        head = nd;
    }

    void print(){

        if( head == null ){
            System.out.println("The Linked Lis is empty");
            return;
        }

        Node curr_nd = head;
        while( curr_nd != null ){
            System.out.print(curr_nd.data + "-->");
            curr_nd = curr_nd.next;
        }

        System.out.print("null");

    }
}
public class DLL{

    public static void main(String[] args) {

           linked_list ll = new linked_list();
           ll.insertatbeginnig(85);
           ll.insertatbeginnig(25);
           ll.insertatbeginnig(12);

           ll.print();

    }
}