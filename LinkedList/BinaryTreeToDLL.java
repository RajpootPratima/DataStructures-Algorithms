public class BinaryTreeToDLL {
    public static DLLNode head;
    public static DLLNode prev;
    public static void bTreeToDll(DLLNode root){
        if(root==null){
            return;
        }
        bTreeToDll(root.prev);
        if(prev==null){
            head=root;
        }
        else {
            prev.next=root;
            root.prev=prev;
        }
        prev=root;
        bTreeToDll(root.next);
    }
    public static void main(String [] args){

        DLLNode root = new DLLNode(10);
        root.prev= new DLLNode(12);
        root.next = new DLLNode(15);
        root.prev.prev = new DLLNode(25);
        root.prev.next = new DLLNode(30);
        root.next.prev = new DLLNode(36);
        head = null;
        prev = null;
        bTreeToDll(root);
        while (head!=null){
            System.out.println(head.data);
            head=head.next;
        }




    }
}
