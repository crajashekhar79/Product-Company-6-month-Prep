
class LL_Kunal{

    private Node head;
    private Node tail;
    private int size;

    public LL_Kunal(){
        this.size = 0;
    }

    public void insert_First( int val ){
        Node node = new Node(val);
        node.next = head;
        head = node;

        if( tail == null ){
            tail = head;
        }
        size += 1;

    }

    public void insert_Last( int val ){
        if( tail == null ){
            insert_First(val);
            return;
        }

        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }

    public void insert_at_pos( int val, int index ){


        if( index == 0 ){
            insert_First(val);
            return;
        }

        if( index == size ){
            insert_Last(val);
            return;
        }

        Node curr_node = head;
        int count = 0;

       for( int i = 1 ; i < index; i++ ) {

           curr_node = curr_node.next;

       }

        Node node = new Node(val,curr_node.next);
        curr_node.next = node;

        size++;




    }

    public int deleteFirst(){

        int val = head.value;
        head = head.next;

        if( head == null ){
            tail = null;
        }

        size--;
        return val;

    }
    public void insertRec( int val, int index){
            head = inseRtRec(val,index,head);
    }

    private Node inseRtRec(int val, int index, Node node){
           if( index == 0){
               Node temp = new Node(val,node);
               size++;
               return temp;
           }

           node.next = inseRtRec(val, index-1,node.next);

           return node;
    }
    public int deleteLast(){
       if( size <= 1 ){
           return deleteFirst();
       }

       Node secondLast =get(size-2);
       int val = tail.value;

       tail = secondLast;
       tail.next = null;

       return val;
    }

    public int delete( int index ){
        if( index == 0 ){
            return deleteFirst();
        }
        if( index == size - 1 ){
            return deleteLast();
        }

        Node prev = get(index -1);
        int val = prev.next.value;

        prev.next = prev.next.next;

        return val;
    }

    public Node get( int index ){
        Node node = head;
        for( int i = 0; i < index; i++ ){
            node = node.next;
        }
        return node;
    }

    public void display(){
        Node curr_node = head;

        while( curr_node != null ){
            System.out.print(curr_node.value+" -> ");
            curr_node = curr_node.next;
        }

        System.out.print("END");

    }

    //Questions
    public void duplicates(){
        Node node = head;

        while( node.next != null ){
            if( node.value == node.next.value ){
                node.next = node.next.next;
                size--;
            }
            else{
                node = node.next;
            }
        }
        tail = node;
        tail.next = null;
    }

    public static LL_Kunal merge( LL_Kunal first, LL_Kunal second ){
        Node f = first.head;
        Node s = second.head;

        LL_Kunal ans = new LL_Kunal();

        while( f != null && s != null ){
            if( f.value < s.value ){
                ans.insert_Last(f.value);
                f = f.next;
            }
            else{
                ans.insert_Last(s.value);
                s = s.next;
            }
        }

        while( f != null ){
            ans.insert_Last(f.value);
            f = f.next;

        }
        while( s != null ){
            ans.insert_Last(s.value);
            s = s.next;

        }
        return ans;
    }

    private class Node{

        private  int value;
        private Node next;

        public Node( int value ){
            this.value = value;
        }

        public Node( int value, Node next ){
            this.value = value;
            this.next = next;
        }
    }


}
public class Main_Kunal{
    public static void main(String[] args) {
        LL_Kunal ll = new LL_Kunal();
        LL_Kunal first = new LL_Kunal();
        LL_Kunal second = new LL_Kunal();

        first.insert_Last(1);
        first.insert_Last(3);
        first.insert_Last(5);

        second.insert_Last(1);
        second.insert_Last(2);
        second.insert_Last(4);
        second.insert_Last(6);
        second.insert_Last(14);

        LL_Kunal ans = LL_Kunal.merge(first,second);

        ans.display();


    }
}
