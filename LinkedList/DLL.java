public class DLL {
    DLLNode head;
    public DLL(DLLNode head){
        this.head=head;
    }
    public void addAtStart(DLLNode node){
        node.next = this.head;
        this.head.prev=node;
        this.head=node;
    }

    public DLLNode getHead() {
        return head;
    }

}
