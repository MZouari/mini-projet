package maze;

import java.io.PrintWriter;

public class PathBox extends MBox {
	
	public PathBox(Maze maze,int line, int column) {
		super(maze,line,column);
	}
   
	public void writeCharTo(PrintWriter pWriter) {
		pWriter.print('*') ;
	}
	
	public String getSymbol() {
		return "*";
	}
}
