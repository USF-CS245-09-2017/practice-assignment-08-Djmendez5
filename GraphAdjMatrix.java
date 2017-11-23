

public class GraphAdjMatrix implements Graph {
	int[][]edges;
	
	public GraphAdjMatrix(int vertices) {
		edges = new int[vertices][vertices];
	}
	public void addEdge(int v1, int v2) {
		edges[v1][v2] = 1;
		edges[v2][v1] =1;
		

	}

	
	
 
		
	public void topsort(int v) {
		if(neighbors(v).length ==0) {
			System.out.println("end");
		}
		else {
			int[] arr = neighbors(v);
		if(neighbors(v).length >0) {
			for(int i =0; i<arr.length; i++) {
				System.out.println(arr[i]);
			}
	}
	}
	}
	public void topologicalSort() {
		if(edges.length != 0) {
			System.out.println(edges[0][0]);
			
			topsort(0);
		}
		//topsort(0);
		
		}
	 

	@Override
	public int[] neighbors(int vertex) {
		int[] arr = new int[edges.length-1];
		int j =0;
		for( int i= 0; i< edges.length; i++) {
			if(edges[vertex][i]==1) {
				arr[j] = i;
				j++;
			}
			
		}
		return arr;
	}

}
