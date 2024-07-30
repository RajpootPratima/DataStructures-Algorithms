public class Test {
    public static boolean isCyclic(Node head){
        if(head==null){
            return false;
        }
        Node sp=head;
        Node fp=head;
        while(sp!=null && fp!=null){
            sp=sp.next;
            fp=fp.next.next;
            if(sp==fp){
                return true;
            }
        }
        return false;

    }
    public static void main(String [] args){
        Node head = new Node(5);
        head.next=new Node(6);
        head.next.next=new Node(7);
        head.next.next.next=new Node(8);
//        head.next.next.next.next=head.next.next;
        System.out.println(isCyclic(head));

    }
}
