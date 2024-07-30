public class LinkedList {
    Node head;
    public LinkedList(Node head){
        this.head=head;
    }
    public void addAtStart(Node node){
        node.next = this.head;
        this.head=node;
    }

    public Node getHead() {
        return head;
    }

}
