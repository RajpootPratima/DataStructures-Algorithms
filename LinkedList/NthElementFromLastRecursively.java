//DataStructures and Algorithms Made Easy:Chapter-3: Problem 6

public class NthElementFromLastRecursively {
    static int  count=0;
    public static Integer nthElementFromLast(Node ln, int n){
        if(ln != null) {
           Integer result = nthElementFromLast(ln.next, n);
           if(result!=null){
               return result;
           }
            else if (count == n-1) {
                return ln.data;
            }
            count++;

        }


        return null;
    }
    public static void main(String [] args){
        LinkedList linkedList = new LinkedList(new Node(6));
        linkedList.head.next = new Node(3);
        linkedList.head.next.next = new Node(8);
        System.out.println(nthElementFromLast(linkedList.head,4));

    }
}
