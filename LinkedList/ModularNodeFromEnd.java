public class ModularNodeFromEnd {
    public static Node modularNode(Node head,int mod){
        if (mod<=0){
            return null;
        }
        Node modNode=head;
        int i =1;
        while (head!=null){
            if (i<=mod){
                i++;
            }
            else{
                modNode=modNode.next;
            }

            head=head.next;
        }
        return modNode;
    }
    public static void main(String [] args)
    {
        LinkedList ll = new LinkedList(new Node(4));
        ll.head.next = new Node(6);
        ll.head.next.next =  new Node(7);
        ll.head.next.next.next =  new Node(8);
        ll.head.next.next.next.next =  new Node(9);
        ll.head.next.next.next.next.next =  new Node(10);

        Node modNode=modularNode(ll.head,3);
        if(modNode!=null) {
            System.out.println(modNode.data);
        }
        else {
            System.out.println(modNode);
        }
    }
}
