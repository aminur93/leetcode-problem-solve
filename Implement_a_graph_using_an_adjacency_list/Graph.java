package Implement_a_graph_using_an_adjacency_list;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Graph {

    //declare hashmap to store graph
    private Map<Integer, List<Integer>> adjList;

    //constructor
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
        // declare user input
        Scanner scanner = new Scanner(System.in);

        // create graph object
        Graph graph = new Graph();

        // user input for number of nodes
        System.out.println("Enter the number of nodes: ");
        int numbNodes = scanner.nextInt();

        // add nodes
        for(int i=0; i < numbNodes; i++)
        {
            int node = scanner.nextInt();
            graph.addNode(node);
        }

        // user input for number of edges
        System.out.println("Enter the number of edges: ");
        int numbEdges = scanner.nextInt();

        // add edges
        for(int i=0; i < numbEdges; i++)
        {
            int node1 = scanner.nextInt();
            int node2 = scanner.nextInt();
            graph.addEdge(node1, node2);
        }

        // print graph
        System.out.println("\nGraph Representation:");
        graph.printGraph();

        scanner.close();
    }
}
