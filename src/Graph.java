import java.util.LinkedList;

public class Graph {
    int vertices;
    LinkedList<Edge>[] adjacencyList;

        Graph(int vertices){
            this.vertices = vertices;
            adjacencyList = new LinkedList[vertices];
            for(int i = 0; i < vertices; i++){
                adjacencyList[i] = new LinkedList<>();
            }
        }

        public void addEdge(int source, int destination, int weight){
            Edge path = new Edge(source, destination, weight);
            adjacencyList[source].addFirst(path);
            // for undirected graph, so it goes both ways
            path = new Edge(destination, source, weight);
            adjacencyList[destination].addFirst(path);
        }

        public void prims(){
            boolean[] inHeap = new boolean[vertices];
            ResultSet[] resultSet = new ResultSet[vertices];
            int[] key = new int[vertices];
            HeapNode[] heapNodes = new HeapNode[vertices];

            for(int i = 0; i < vertices; i++){
                heapNodes[i] = new HeapNode();
                heapNodes[i].vertex = i;
                heapNodes[i].key = Integer.MAX_VALUE;
                resultSet[i] = new ResultSet();
                resultSet[i].parent = -1;
                inHeap[i] = true;
                key[i] = Integer.MAX_VALUE;
            }

            // continue line 65
        }
}
