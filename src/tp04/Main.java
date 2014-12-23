package tp04;

import fr.enst.inf103.ui.MazeWindow;

public class Main {

	public static void main(String[] args) {
		MazeController mazeController = new MazeController() ;
		MazeWindow mazeWindow = new MazeWindow("The Mazouari Solver", mazeController) ;
		

	}

}
