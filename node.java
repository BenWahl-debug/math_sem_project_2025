public class node{
    int x;
    int y;
    public node(int x, int y){
        this.x = x;
        this.y = y;
    }
    public static void main(String[] args) {
        node node1 = new node(5, 7);
        System.out.println(node1.get_pos());
        System.out.println("The main method ran");
    }
    public int[] get_pos(){
        return new int[]{this.x, this.y};
    }
}