package dijkstra;

import java.util.ArrayList;

public interface graphInterface {
	
	public ArrayList<VertexInterface> getAllVertices() ;
	
	public ArrayList<VertexInterface> getSuccessors(VertexInterface vertex);
	
	public int getWeight(VertexInterface src, VertexInterface dst); 

}
