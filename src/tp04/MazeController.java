package tp04;

import maze.Maze;
import fr.enst.inf103.ui.MazeViewController;
import fr.enst.inf103.ui.MazeViewSource;

public class MazeController implements MazeViewController {

	private Maze maze ; 
	
	public void calculateShortestPath() {	
    maze.clearPathBox();
    maze.calculateShortestPath();
	}


	public MazeViewSource getMazeViewSource() {
		
		return (MazeViewSource)maze;
	}

	
	public MazeViewSource newMaze() {
	
		maze = new Maze();
		maze.newMaze() ;
		return (MazeViewSource)maze ;
	}

	
	public MazeViewSource openMaze(String filePath) {
		
		maze = new Maze();
		maze.newMaze();
		maze.initFromTextFile(filePath);
		return (MazeViewSource)maze;
		

	}

	
	public void saveMazeAs(String filePath) {
		
		maze.saveToTextFile(filePath);
		
        
	}


	

}
