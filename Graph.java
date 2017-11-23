
public interface Graph {
	
	public void addEdge(int v1, int v2);
	public void topologicalSort();
	public int[] neighbors(int vertex);

}
