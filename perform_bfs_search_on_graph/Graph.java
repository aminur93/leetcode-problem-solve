package perform_bfs_search_on_graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;

public class Graph {

    // declare map
    private Map<Integer, List<Integer>> adjList;

    // create constructor
    public Graph()
    {
        this.adjList = new HashMap<>();
    }

    // add node
    public void addNode(int node)
    {
        adjList.putIfAbsent(node, new ArrayList<>());
    }

    // add edges
    public void addEdge(int node1, int node2)
    {
        adjList.get(node1).add(node2);
        adjList.get(node2).add(node1);
    }

    //bfs
    public void bfs(int startNode)
    {
        Queue<Integer> queue = new LinkedList<>();
        Set<Integer> visited = new HashSet<>();

        queue.add(startNode);
        visited.add(startNode);

        while (!queue.isEmpty()) {
            
            int node = queue.poll();

            System.out.println(node + " ");

            for(int neighbar : adjList.get(node) )
            {
                if (!visited.contains(neighbar)) {
                    
                    queue.add(neighbar);
                    visited.add(neighbar);
                }
            }
        }
    }

    //print graph
    public void printGraph()
    {
        for(Map.Entry<Integer, List<Integer>> entry : adjList.entrySet())
        {
            System.out.print(entry.getKey() + " -> ");

            for(Integer neighbar : entry.getValue())
            {
                System.out.print(neighbar + " ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        Graph graph = new Graph();

        System.out.println("Enter the number of nodes:");
        int nodes = scanner.nextInt();

        for(int i=0; i < nodes; i++)
        {
            int node = scanner.nextInt();

            graph.addNode(node);
        }

        System.out.println("Enter the number of edges:");
        int edges = scanner.nextInt();

        System.out.println("Enter the edges (node1 node2):");
        for (int i = 0; i < edges; i++) {
            int node1 = scanner.nextInt();
            int node2 = scanner.nextInt();
            graph.addEdge(node1, node2);
        }

        System.out.println("Enter the start node for BFS:");
        int startNode = scanner.nextInt();

        System.out.println("BFS traversal starting from node " + startNode + ":");
        graph.bfs(startNode);

        System.out.println("Graph representation:");
        graph.printGraph();

        scanner.close();
    }
}
