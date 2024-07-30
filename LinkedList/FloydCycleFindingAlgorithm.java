//DataStructures and Algorithms Made Easy:Chapter-3: Problem 10
public class FloydCycleFindingAlgorithm {
    public static boolean isCyclic(Node head){
        Node sp = head;
        Node fp = head;
        while (sp!=null && fp!=null){
            fp=fp.next.next;
            sp=sp.next;
            if(sp==fp){
                return true;
            }
        }
        return false;
    }
    public static void main(String [] args){
        LinkedList linkedList = new LinkedList(new Node(6));
        linkedList.head.next = new Node(3);
        linkedList.head.next.next = new Node(8);
        linkedList.head.next.next.next = new Node(2);
        linkedList.head.next.next.next.next = linkedList.head.next.next;
        System.out.println(isCyclic(linkedList.head));
    }
}
