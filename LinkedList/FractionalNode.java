public class FractionalNode {
        public static Node fractionalNode(Node head,int mod){
            if (mod<=0){
                return null;
            }
            Node fracNode=null;
            int i =0;
            while (head!=null){
                if (i%mod==0){
                    if(fracNode==null)fracNode=head;
                    else {
                        fracNode = fracNode.next;
                    }
                }
                i++;
                head=head.next;
            }
            return fracNode;
        }
        public static void main(String [] args)
        {
            LinkedList ll = new LinkedList(new Node(4));
            ll.head.next = new Node(6);
            ll.head.next.next =  new Node(7);
            ll.head.next.next.next =  new Node(8);
            ll.head.next.next.next.next =  new Node(9);
            ll.head.next.next.next.next.next =  new Node(10);

            Node modNode=fractionalNode(ll.head,5);
            if(modNode!=null) {
                System.out.println(modNode.data);
            }
            else {
                System.out.println(modNode);
            }
        }
    }


