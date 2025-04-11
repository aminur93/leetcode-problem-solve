package find_the_shortest_path_between_two_nodes_using_bfs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;

class Graph
{
    private Map<Integer, List<Integer>> adjList;

    public Graph()
    {
        this.adjList = new HashMap<>();
    }

    public void addNode(int node)
    {
        adjList.putIfAbsent(node, new ArrayList<>());
    }

    public void addEdges(int node1, int node2)
    {
        adjList.get(node1).add(node2);
        adjList.get(node2).add(node1);
    }

    public int shortestPath(int source, int destination)
    {

        if (!adjList.containsKey(source) || !adjList.containsKey(destination)) {
            return -1;
        }

        Queue<Integer> queue = new LinkedList<>();
        Map<Integer, Integer> distance = new HashMap<>();
        
        queue.offer(source);
        distance.put(source, 0);

        while (!queue.isEmpty()) {
            
            int current = queue.poll();

            for(int neighbar : adjList.get(current))
            {
                if(!distance.containsKey(neighbar))
                {
                    distance.put(neighbar, distance.get(current) + 1);
                    queue.offer(neighbar);

                    if (neighbar == destination) {
                        
                        return distance.get(neighbar);
                    }
                }
            }
        }

        return -1;
    }

    public void printGraph()
    {
        for(var entry : adjList.entrySet())
        {
            System.out.println(entry.getKey() + " → " + entry.getValue());
        }
    }
}

public class Main {

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

        System.out.print("Enter the number of edges: ");
        int numdEdges = scanner.nextInt();

        System.out.println("Enter edges (format: node1 node2):");
        for (int i = 0; i < numdEdges; i++) {
            int node1 = scanner.nextInt();
            int node2 = scanner.nextInt();
            graph.addEdges(node1, node2);
        }

        // **Source & Destination ইনপুট**
        System.out.println("Enter the source: ");
        int source = scanner.nextInt();

        System.out.println("Enter the destination: ");
        int destination = scanner.nextInt();

        int shortestPath = graph.shortestPath(source, destination);

        if (shortestPath != -1) {
            System.out.println("Shortest Path from " + source + " to " + destination + " is: " + shortestPath);
        } else {
            System.out.println("No path exists between " + source + " and " + destination);
        }

        scanner.close();
    }
}
