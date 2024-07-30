import java.util.HashMap;

public class cloneLinkedList {
    public static DLLNode cloneLL(DLLNode head){
        DLLNode newLL;
        DLLNode temp=head;
        newLL=new DLLNode(temp.data);

        HashMap<DLLNode,DLLNode> map=new HashMap<>();
        map.put(temp,newLL);
        while (temp.next!=null){
            newLL.next=new DLLNode(temp.next.data);
            temp=temp.next;
            newLL=newLL.next;
            map.put(temp,newLL);
        }
        temp=head;
        while (temp!=null){
            map.get(temp).prev=map.get(temp.prev);
            temp=temp.next;
        }
        return map.get(head);
    }
    public static void main(String [] s) {
        DLLNode head = new DLLNode(1);
        head.next = new DLLNode(2);
        head.next.next = new DLLNode(3);
        head.next.next.next = new DLLNode(4);
        head.next.next.next.next = new DLLNode(5);
        head.prev = head.next.next;
        head.next.prev = head;
        head.next.next.prev = head.next.next.next.next;
        head.next.next.next.prev = head.next.next;
        head.next.next.next.next.prev = head.next;
        DLLNode clone = cloneLL(head);
        while (clone!=null){
            System.out.println(clone.data);
            clone=clone.next;
        }
    }
}
