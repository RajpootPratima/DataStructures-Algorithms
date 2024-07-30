public class LengthOfLoop {
    public static Integer lengthOfLoop(Node head){
        if(head==null){
            return null;
        }
        Node sp=head;
        Node fp=head;
        boolean cyclic = false;
        while(sp!=null && fp!=null){
            sp=sp.next;
            fp=fp.next.next;
            if(sp==fp){
                cyclic = true;
                break;
            }
        }
        if(cyclic){
        int count=1;
        sp=sp.next;
        while (fp!=sp){
            sp=sp.next;
            count++;
        }
        return count;
        }
        else{
            return 0;
        }
    }
    public static void main(String [] args){
        LinkedList linkedList = new LinkedList(new Node(6));
        linkedList.head.next = new Node(3);
        linkedList.head.next.next = new Node(8);
        linkedList.head.next.next.next = new Node(2);
//        linkedList.head.next.next.next.next = linkedList.head;
        System.out.println(lengthOfLoop(linkedList.head));
    }
}
