//DataStructures and Algorithms Made Easy:Chapter-3: Problem 5

public class NthElementFromLast {

    public static int lastNthElement(LinkedList ll, int n){
        try {


            Node temp = ll.head;
            Node target = ll.head;
            int count = 0;
            while (temp != null) {
                if (count < n) {
                    count++;
                    temp = temp.next;
                } else {
                    temp = temp.next;
                    target = target.next;
                }
            }
            if (count<n) {
                throw new Exception("out of range error");
            }
            return target.data;
        }
            catch (Exception e){
                System.out.println(e);
            }
        return -1;
    }
    public static void main(String [] args){
        LinkedList linkedList = new LinkedList(new Node(6));
        linkedList.head.next = new Node(3);
        linkedList.head.next.next = new Node(8);
        System.out.println(lastNthElement(linkedList,4));

    }
}
