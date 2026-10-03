class Node{
    int data;
    Node next;

    Node( int data ){
        this.data = data;
        this.next = null;
    }

}

class LinkedList{
    Node head;

    // Insert at the beginning of the linked list
    void insertAtBeginning( int val ){
        Node nd = new Node(val);
        nd.next = head;
        head = nd;
    }

    // Insert at the end of the linked list

    void insertAttheEnd( int val ){

        Node nd = new Node(val);


        if( head == null ){
            head = nd ;
            return;
        }

        Node curr_nd = head;

        while( curr_nd.next != null ){
           curr_nd  = curr_nd.next;

        }
        curr_nd.next = nd;
    }


    void insertAtapos( int val, int pos ){

        Node nd = new Node(val);

        if( pos == 0 ){
            nd.next = head;
            head = nd;
            return;
        }
        Node curr_nd = head;
        int count = 1;

        while( count < pos-1 ){
            count++;
            curr_nd = curr_nd.next;
        }
        nd.next = curr_nd.next;
        curr_nd.next = nd;

    }

    void deleteatbeginning(){
        if( head == null ){
            return;
        }

        head = head.next;
    }

    void deleteatend(){

        if( head == null ){
            return;
        }

        if (head.next == null) {
            head = null;
            return;
        }

        //int len = this.count();
        Node curr_nd = head;

        while( true ){
            if( curr_nd.next.next == null ){
                break;
            }
            curr_nd = curr_nd.next;

        }

        curr_nd.next = null ;
    }

    void deleteatpos( int pos ){

        if( pos == 0 ){
            deleteatbeginning();
            return;
        }
        else{
              Node curr_node = head;

              for( int i = 0 ; i < pos-1 ; i++ ){
                  curr_node = curr_node.next;
              }
              System.out.println(curr_node.data);
              curr_node.next = curr_node.next.next;



        }


    }


    void display() {

        Node current_nod = head;
        while (current_nod!= null) {
            System.out.print(current_nod.data + " --> ");
            current_nod = current_nod.next;
        }

        System.out.print("null");

    }



    int count ( ){
        int c = 0;
        Node c_nd = head;

        while( c_nd != null ){
            c++;
            c_nd = c_nd.next;
        }

        return c;
    }
}



public class LL{
    public static void main(String[] args) {

        System.out.println("This code is running");

        LinkedList ll = new LinkedList();

        ll.insertAtBeginning(8);
        ll.insertAtBeginning(9);
        ll.insertAtBeginning(48);
        ll.insertAtBeginning(25);
        ll.insertAtBeginning(21);

        ll.insertAttheEnd((85));
        ll.insertAttheEnd(87);
        ll.insertAttheEnd(45);
        ll.insertAttheEnd(78);
//
//        ll.insertAtapos(45,1);
//        ll.insertAtapos(67,0);

        //ll.deleteatbeginning();
//        ll.deleteatend();
        ll.deleteatpos(4);
        ll.deleteatpos(5);
        ll.deleteatpos(3);
        ll.deleteatpos(1);


        System.out.println("No of nodes in the LinkedList :- "+ ll.count());
        ll.display();
    }
}
