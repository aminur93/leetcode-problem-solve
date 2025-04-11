package detect_a_cycle_in_a_graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Graph {

    // declare map
    private Map<Integer, List<Integer>> adjList;

    public Graph()
    {
        this.adjList = new HashMap<>();
    }

    // নোড যোগ করা
    public void addNode(int node)
    {
        adjList.putIfAbsent(node, new ArrayList<>());
    }

    // এজ (Edge) যোগ করা (Undirected Graph)
    public void addEdge(int node1, int node2)
    {
        adjList.get(node1).add(node2);
        adjList.get(node2).add(node1);
    }


    // DFS ব্যবহার করে Cycle চেক করা
    public boolean hasCyleDfs(int node, int parent, Set<Integer> visited)
    {
        visited.add(node);

        for(int neighbar : adjList.get(node))
        {
            // if not visit
            if(!visited.contains(neighbar))
            {
                if (hasCyleDfs(neighbar, node, visited)) {
                    
                    return true;
                } 
                
            }else if (neighbar != parent) {
                    
                return true;
            }
        }

        return false;
    }

    //  Graph-এ Cycle আছে কিনা চেক করা (Multiple Components-এর জন্য)
    public boolean hasCyle()
    {
        Set<Integer> visited = new HashSet<>();

        for(int node : adjList.keySet())
        {
            if (!visited.contains(node)) {
                
                if (hasCyleDfs(node, -1, visited)) {
                    
                    return true;
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        Graph graph = new Graph();

        System.out.print("Enter the number of nodes: ");
        int numbNodes = scanner.nextInt();

        System.out.println("Enter node values: ");
        for(int i=0; i < numbNodes; i++)
        {
            int node = scanner.nextInt();

            graph.addNode(node);
        }

        System.out.println("Enter the number of edges: ");
        int numdEdges = scanner.nextInt();

        System.out.println("Enter edges (format: node1 node2):");
        for(int i=0; i < numdEdges; i++)
        {
            int node1 = scanner.nextInt();
            int node2 = scanner.nextInt();

            graph.addEdge(node1, node2);
        }

        // 🔹 Cycle চেক করা
        if (graph.hasCyle()) {
            
            System.out.println("\nCycle Detected!");

        }else{

            System.out.println("\nNo Cycle Found.");
        }

        scanner.close();
    }
}
