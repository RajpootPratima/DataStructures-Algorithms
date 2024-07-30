//DataStructures and Algorithms Made Easy:Chapter-3: Problem 12

public class FindStartOfLoop {
    public static Integer startOfLoop(Node head){
        if(head==null){
            return null;
        }
        Node sp=head;
        Node fp=head;
        boolean start=true;
        boolean cycleFound = false;
        while (sp!=null && fp!=null) {
            if (!cycleFound) {
                if (sp == fp && !start) {
                    cycleFound = true;
                    sp = head;
                    continue;
                }
                fp = fp.next.next;
                sp = sp.next;
                start=false;
            } else {

                if (sp == fp && cycleFound) {
                    return sp.data;
                }
                fp = fp.next;
                sp = sp.next;
            }
        }
        return null;
    }
    public static void main(String [] args){

        LinkedList linkedList = new LinkedList(new Node(6));
        linkedList.head.next = new Node(3);
        linkedList.head.next.next = new Node(8);
        linkedList.head.next.next.next = new Node(2);
//        linkedList.head.next.next.next.next = linkedList.head;
        System.out.println(startOfLoop(linkedList.head));

    }
}
