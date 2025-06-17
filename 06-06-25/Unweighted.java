public class Main{
	public static void main(String[] args) {
	    Graph graph=new Graph(4);
	    graph.addEdge(0,1);
	    graph.addEdge(0,2);
	    graph.addEdge(0,3);
	    graph.addEdge(1,0);
	    graph.addEdge(1,3);
	    graph.printGraph();
	    
	    
	  }
}
class Graph{
    int[][] graph;
    int vertices;
    
    Graph(int vertices){
         this.graph=new int[vertices][vertices];
         this.vertices=vertices;
        
    }
    public void addEdge(int src, int dest){
        if(src>=0&dest>=0&&src<vertices&&dest<vertices&&src!=dest){
            graph[src][dest]=1;
            graph[dest][src]=1;
        }else{
            System.out.println("Invalid source and Destination");
            
        }
    }
    public void removeEdge(int src, int dest){
        if(src>=0&dest>=0&&src<vertices&&dest<vertices&&src!=dest){
            graph[src][dest]=0;
            graph[dest][src]=0;
        }else{
            System.out.println("Invalid source and Destination");
            
        }
    }
    boolean isValid(int src, int dest){
        return src>=0&dest>=0&&src<vertices&&dest<vertices&&src!=dest;
    }
    boolean HavingEdge(int src, int dest){
        if(isValid(src,dest)){
            if(graph[src][dest]==1)
            return true;
            else
            return false;
        }
        System.err.println("Invalid source and Destinations");
        return false;
    }
    
   
    void printGraph(){
        System.out.println("matrix representation of Graph:");
        for(int i=0;i<vertices;i++){
            for(int j=0;j<vertices;j++){
            System.out.print(graph[i][j]+" ");
        }
        System.out.println();
   }
}
}
