public class InsertNodeInSortedLL {
    public static Node insert(int data,Node head){
        Node newNode = new Node(data);
        if(head==null){
            return newNode;
        }
        else{
            Node prev = head;
            Node current = head;
            while(current!=null){
                if(current.data>=data){
                    newNode.next=current;
                    if(prev==head){
                        head=newNode;
                    }
                    else {
                        prev.next=newNode;
                    }
                }
                prev=current;
                current=current.next;
            }
        }
        return head;
    }
    public static void printLl(Node head){
        while (head!=null){
            System.out.println(head.data);
            head=head.next;
        }
    }
    public static void main(String [] args){
        LinkedList linkedList = new LinkedList(new Node(1));
        linkedList.head.next = new Node(2);
        linkedList.head.next.next = new Node(6);
        linkedList.head.next.next.next = new Node(9);
        Node head=insert(5,linkedList.head);
        printLl(head);
    }
}
