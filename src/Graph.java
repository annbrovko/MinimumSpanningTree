import java.util.LinkedList;

class Graph {
    // num of vertices (towns) in the graph
    int V;
    // list of adjacent nodes of a given vertex
    LinkedList<Edge>[] adjacencyList;

        // constructor for the graph object
        Graph(int V){
            // number og vertices
            this.V = V;
            // initialize a new LinkedList with V positions
            adjacencyList = new LinkedList[V];
            // for every vertex create a new LinkedList
            for(int i = 0; i < V; i++){
                adjacencyList[i] = new LinkedList<>();
            }
        }

        // add edge to the adj list
        public void addEdge(int src, int dest, int weight){
            Edge edge = new Edge(src, dest, weight);
            adjacencyList[src].addFirst(edge);
            // for undirected graph, so it goes both ways
            edge = new Edge(src, dest, weight);
            adjacencyList[dest].addFirst(edge);
        }

        public void getMST(){
            boolean[] inHeap = new boolean[V];
            ResultSet[] resultSet = new ResultSet[V];
            int[] key = new int[V];
            HeapNode[] heapNodes = new HeapNode[V];

            for(int i = 0; i < V; i++){
                heapNodes[i] = new HeapNode();
                heapNodes[i].vertex = i;
                heapNodes[i].key = Integer.MAX_VALUE;
                resultSet[i] = new ResultSet();
                resultSet[i].parent = -1;
                inHeap[i] = true;
                key[i] = Integer.MAX_VALUE;
            }

            // the starting node's key is set to 0, it doesn't have a source
            heapNodes[0].key = 0;

            // add all the vertices to the minHeap
            // init minHeap with the size of number of towns
            MinHeap minHeap = new MinHeap(V);
            // add all the vertices to priority queue
            for (int i = 0; i < V; i ++){
                minHeap.insert(heapNodes[i]);
            }

            // while minHeap is not empty
            while (!minHeap.isEmpty()){
                HeapNode extractedNode = minHeap.extractMin();

                // extracted vertex
                int extractedVertex = extractedNode.vertex;
                inHeap[extractedVertex] = false;

                // iterate through all the adj vertices
                LinkedList<Edge> list = adjacencyList[extractedVertex];
                for (int i = 0; i < list.size(); i++){
                    Edge edge = list.get(i);
                    // only if edge destination is present in heap
                    if(inHeap[edge.dest]){
                        int dest  = edge.dest;
                        int newKey = edge.weight;

                        if (key[dest]>newKey){
                            decreaseKey(minHeap, newKey, dest);
                            // update the parent node for destination
                            resultSet[dest].parent = extractedVertex;
                            resultSet[dest].weight = newKey;
                            key[dest] = newKey;
                        }
                    }
                }
            }

            // print MST
            printMST(resultSet);
        }

        public void decreaseKey(MinHeap minHeap, int newKey, int vertex){
            // get the index which key's needs a decrease
            int index = minHeap.indexes[vertex];

            // get the node and update its value
            HeapNode node = minHeap.minH[index];
            node.key = newKey;
            minHeap.moveUp(index);
        }

        public void printMST(ResultSet[] resultSet){
            int total_min_weight = 0;
            System.out.println("Minimum Spanning Tree: ");
            for (int i = 1; i < V; i++){
                System.out.println("Edge: " + i + " - " + resultSet[i].parent + " km: " + resultSet[i].weight);
                total_min_weight += resultSet[i].weight;
            }
            System.out.println("Total minimum km: " + total_min_weight);
        }
}
