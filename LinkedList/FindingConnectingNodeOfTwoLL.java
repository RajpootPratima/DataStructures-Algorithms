import java.util.ArrayList;
import java.util.List;

public class FindingConnectingNodeOfTwoLL {
    public static Node findConnection(Node l1, Node l2){
        if(l1==null || l2==null){
            return null;
        }
        List<Node> listOfNodes = new ArrayList<Node>();
        while(l1!=null){
            listOfNodes.add(l1);
            l1=l1.next;
        }
        while (l2!=null){
            if(listOfNodes.contains(l2)){
                return l2;
            }
            l2=l2.next;
        }
        return null;
    }

    public static void main(String [] args)
    {
        LinkedList ll = new LinkedList(new Node(4));
        ll.head.next = new Node(6);
        ll.head.next.next =  new Node(7);
        ll.head.next.next.next =  new Node(8);
        LinkedList ll2 = new LinkedList(new Node(3));
        ll2.head.next=new Node(5);
//        ll2.head.next.next = ll.head;
        Node l =findConnection(ll.head,ll2.head);
        if(l==null){
            System.out.println(l);
        }
        else{
        System.out.println(l.data);}
    }
}
