public class BTreeNode {
    // Class containing left and right child
// of current node and key value
        int key;
        BTreeNode left, right;

        public BTreeNode(int item)
        {
            key = item;
            left = right = null;
        }


}
