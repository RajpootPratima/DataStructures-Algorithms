public class AddTwoNumbersStoredReverse {
    public static Node add(Node l1, Node l2){
        if(l1==null)return l2;
        else if (l2==null) {
            return l1;
        }
        Node sum=null;
        Node current=sum;
        int carry = 0;
        while (l1!=null && l2!=null){
            if(sum==null){
                sum=new Node((l1.data+l2.data)%10);
                carry=(l1.data+l2.data)/10;
                current=sum;
            }
            else {
                current.next=new Node((l1.data+l2.data+carry)%10);
                carry=(l1.data+l2.data+carry)/10;
                current=current.next;
            }
            l1=l1.next;
            l2=l2.next;
        }
        if (l1!=null){
            if(carry!=0)current.next=add(l1,new Node(carry));
            else current.next=l1;
        }
        else if (l2!=null){
            if(carry!=0)current.next=add(l2,new Node(carry));
            else current.next=l2;
        } else if (carry!=0) {
            current.next= new Node(carry);

        }
        return sum;
    }
    public static void main(String [] args) {
        LinkedList ll = new LinkedList(new Node(4));
        ll.head.next = new Node(6);
        ll.head.next.next = new Node(7);
        LinkedList ll2 = new LinkedList(new Node(8));
        ll2.head.next = new Node(9);
//        ll2.head.next.next = new Node(3);
        Node sum = add(ll.head, ll2.head);
        while (sum != null) {
            System.out.println(sum.data);
            sum = sum.next;
        }
    }
}
