package perform_depth_first_search_on_graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Graph {

    // declare hashmap
    private Map<Integer, List<Integer>> adjList;

    // constructor
    public Graph()
    {
        this.adjList = new HashMap<>();
    }

    //new node adding
    public void addNode(int node)
    {
        adjList.putIfAbsent(node, new ArrayList<>());
    }
   

    //new edge adding
    public void addEdge(int node1, int node2)
    {
        adjList.get(node1).add(node2);
        adjList.get(node2).add(node1);
    }
  

   

    //dfs
    public void dfs(int startNode, Set<Integer> visited)
    {
        if (visited.contains(startNode)) {
            return; // যদি নোড আগে Visit করা হয়ে থাকে, তাহলে রিটার্ন করো
        }

        System.out.println(startNode + " "); // নোড Visit করে প্রিন্ট করো
        visited.add(startNode); // নোডকে Visited হিসেবে মার্ক করো

        // সংযুক্ত নোডগুলোর জন্য Recursive DFS কল করো
        for(Integer neighber : adjList.get(startNode))
        {
            dfs(neighber, visited);
        }
    }

   //print graph
   public void printGraph()
   {
       for( Map.Entry<Integer, List<Integer>> entry : adjList.entrySet())
       {
           System.out.print(entry.getKey() + " -> ");

           for( Integer neighber : entry.getValue())
           {
               System.out.print(neighber + " ");
           }

           System.out.println();
       }
   }

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        Graph graph = new Graph();

        // user input for number of nodes
        System.out.print("Enter the number of nodes: ");
        int numbNodes = scanner.nextInt();

        // add node
        System.out.println("Enter node values: ");
        for(int i=0; i < numbNodes; i++)
        {
            int node = scanner.nextInt();
            graph.addNode(node);
        }

        // user input for number of edges
        System.out.println("Enter the number of edges: ");
        int numbEdges = scanner.nextInt();

        // add edges
        System.out.println("Enter node Edge values: ");
        for(int i=0; i < numbEdges; i++)
        {
            int node1 = scanner.nextInt();
            int node2 = scanner.nextInt();
            graph.addEdge(node1, node2);
        }

        //print graph
        System.out.println("\nGraph Representation:");
        graph.printGraph();

        //Dfs 
        System.out.println("Enter starting node for DFS: ");
        int startNode = scanner.nextInt();

        System.out.println("DFS Traversal:");
        graph.dfs(startNode, new HashSet<>());

        scanner.close();
    }
}
