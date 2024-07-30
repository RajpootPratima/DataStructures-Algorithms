public class XORNode{
    int data;
    int both;
    public XORNode(int data,int prev, int next){
        this.data=data;
        this.both = prev ^ next;
    }
}