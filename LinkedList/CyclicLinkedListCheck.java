//DataStructures and Algorithms Made Easy:Chapter-3: Problem 8

import java.util.ArrayList;
import java.util.List;

public class CyclicLinkedListCheck {
    public static boolean isCyclic( Node ln){
        List<Node> visitedNodes= new ArrayList<Node>();
        while(ln!=null){
            if(visitedNodes.contains(ln)){
                return true;
            }
            visitedNodes.add(ln);
            ln = ln.next;
        }
        return false;
    }

    public static void main(String[] args){
        LinkedList linkedList = new LinkedList(new Node(6));
        linkedList.head.next = new Node(3);
        linkedList.head.next.next = new Node(8);
        linkedList.head.next.next.next = new Node(2);
//        linkedList.head.next.next.next.next = linkedList.head.next.next;
        System.out.println(isCyclic(null));

    }
}
