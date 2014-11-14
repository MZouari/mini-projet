package tp04;

public class WBox extends MBox {
 public WBox(Maze maze, int line, int column)
 {
	 super(maze, line, column) ;
 }
 @Override
 public final boolean isAccessible()
 {
	 return false ;
 }
}
