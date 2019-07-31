import jsjf.Graph;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
System.out.println("Please enter size of adjacency matrix");
        Graph testGraph = new Graph();
        Scanner input = new Scanner(System.in);

        int sizeOfMatrix = input.nextInt();
        for (int i = 0; i <= sizeOfMatrix; i++ ){
            testGraph.addVertex(i);
        }

        System.out.println("Please enter TWO integer values seperated by the Return key to add edge between designated elements");


        while (input.hasNextInt()){
            int firstIndex = input.nextInt();
            int secondIndex = input.nextInt();
            testGraph.addEdge(firstIndex, secondIndex);
        }

    System.out.println(testGraph.toString());
    }
}
