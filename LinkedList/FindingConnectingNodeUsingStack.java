import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class FindingConnectingNodeUsingStack {
    public static Node findConnection(Node l1, Node l2){
        if(l1==null || l2==null){
            return null;
        }
        Stack<Node> s1=new Stack<>();
        Stack<Node> s2=new Stack<>();
        while(l1!=null || l2!=null){
            if(l1!=null){
                s1.push(l1);
                l1=l1.next;
            }
            if(l2!=null){
                s2.push(l2);
                l2=l2.next;
            }
        }
        Node temp = null;
        while (!s1.isEmpty() && !s2.isEmpty()){
            Node temp1 = s1.pop();
            Node temp2 = s2.pop();
           if(temp1==temp2){
               temp=temp1;
           }
           else{
                break;
           }
        }
        return temp;
    }

    public static void main(String [] args)
    {
        LinkedList ll = new LinkedList(new Node(4));
        ll.head.next = new Node(6);
        ll.head.next.next =  new Node(7);
        ll.head.next.next.next =  new Node(8);
        LinkedList ll2 = new LinkedList(new Node(3));
        ll2.head.next=new Node(5);
        ll2.head.next.next = ll.head.next.next.next;
        Node l =findConnection(ll.head,ll2.head);
        if(l==null){
            System.out.println(l);
        }
        else{
            System.out.println(l.data);}
    }
}
