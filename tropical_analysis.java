
import java.util.*;

public class tropical_analysis {

    private static Scanner sc;

    public tropical_analysis(){
        sc = new Scanner(System.in);
    }

    public node take_input(int nodes)
    {
        for (int i = 0; i < nodes; i++)
        {
            System.out.println("Enter x value for node " + i + ":");
            int x = sc.nextInt();
            System.out.println("Enter y value for node " + i + ":");
            int y = sc.nextInt();
            node node = new node(x, y);
            return node;
        }
    }

    public static void main(String[] args){
    
        System.out.println("How many nodes?");
        int num_nodes = sc.nextInt();
        System.out.println("Enter nodes in format [x, y].");
        
        for(int i = 0; i < num_nodes; i++){
            System.out.println();
            System.out.print("Node: ");
        }
    
    }

    
}