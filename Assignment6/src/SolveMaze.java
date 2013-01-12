
public class SolveMaze {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Maze solver = new Maze();
		int count = 0;
		boolean north = false;
		boolean south = false;
		boolean east = false;
		boolean west = false;
		
		north = false;
		south = false;
		east = false;
		west = false;
		
		if(solver.wallPresent(Maze.WEST) == true && solver.wallPresent(Maze.NORTH) == false) {
			solver.moveNorth();
			north = true;

		}
		
		else if(solver.wallPresent(Maze.EAST) == true && solver.wallPresent(Maze.SOUTH) == false) {
			solver.moveSouth();
			south = true;
		}
		else if(solver.wallPresent(Maze.SOUTH) == true && solver.wallPresent(Maze.WEST) == false) {
			solver.moveWest();
			west = true;
		}
		else if(solver.wallPresent(Maze.NORTH) == true && solver.wallPresent(Maze.EAST) == false) {
			solver.moveEast();
			east = true;
		}
		
		//The looping condition
		
		while(solver.goalIsNotReached() == true){
			if(north == true){
				if(solver.wallPresent(Maze.WEST) == false && solver.wallPresent(Maze.NORTH) == false && solver.wallPresent(Maze.EAST) == false  && solver.wallPresent(Maze.SOUTH) == false){
					solver.moveWest();
					west = true;
					north = false;
					south = false;
					east = false;
				}
				else if(solver.wallPresent(Maze.WEST) == true && solver.wallPresent(Maze.NORTH) == true && solver.wallPresent(Maze.EAST) == true){
					south = true;
					north = false;
					east = false;
					west = false;
				}
				else if(solver.wallPresent(Maze.WEST) == true && solver.wallPresent(Maze.NORTH) == false) {
					solver.moveNorth();
					north = true;
					south = false;
					east = false;
					west = false;
				}
				
				else if((solver.wallPresent(Maze.NORTH) == true || solver.wallPresent(Maze.EAST) == true || solver.wallPresent(Maze.SOUTH) == true) && solver.wallPresent(Maze.WEST) == false) {
					solver.moveWest();
					west = true;
					north = false;
					south = false;
					east = false;
				}
				
				else if(solver.wallPresent(Maze.NORTH) == true && solver.wallPresent(Maze.EAST) == false) {
					solver.moveEast();
					east = true;
					north = false;
					south = false;
					west = false;
				}
				
				else if(solver.wallPresent(Maze.EAST) == true && solver.wallPresent(Maze.SOUTH) == false) {
					solver.moveSouth();
					south = true;
					north = false;
					east = false;
					west = false;
				}
				else if(solver.wallPresent(Maze.SOUTH) == true && solver.wallPresent(Maze.WEST) == false) {
					solver.moveWest();
					west = true;
					north = false;
					south = false;
					east = false;
				}
			}
			
			
			
			else if(south == true){
				if(solver.wallPresent(Maze.WEST) == false && solver.wallPresent(Maze.NORTH) == false && solver.wallPresent(Maze.EAST) == false  && solver.wallPresent(Maze.SOUTH) == false){
					solver.moveEast();
					west = false;
					north = false;
					south = false;
					east = true;
				}
				else if(solver.wallPresent(Maze.WEST) == true && solver.wallPresent(Maze.EAST) == true && solver.wallPresent(Maze.SOUTH) == true){
					south = false;
					north = true;
					east = false;
					west = false;
				}
				else if(solver.wallPresent(Maze.EAST) == true && solver.wallPresent(Maze.SOUTH) == false) {
					solver.moveSouth();
					south = true;
					north = false;
					east = false;
					west = false;
				}
				
				else if((solver.wallPresent(Maze.SOUTH) == true || solver.wallPresent(Maze.WEST) == true || solver.wallPresent(Maze.NORTH) == true) && solver.wallPresent(Maze.EAST) == false) {
					solver.moveEast();
					east = true;
					north = false;
					south = false;
					west = false;
				}
				
				else if(solver.wallPresent(Maze.SOUTH) == true && solver.wallPresent(Maze.WEST) == false) {
					solver.moveWest();
					west = true;
					north = false;
					south = false;
					east = false;
				}
				
				
				else if(solver.wallPresent(Maze.NORTH) == true && solver.wallPresent(Maze.EAST) == false) {
					solver.moveEast();
					east = true;
					north = false;
					south = false;
					west = false;
				}
				
				else if(solver.wallPresent(Maze.WEST) == true && solver.wallPresent(Maze.NORTH) == false) {
					solver.moveNorth();
					north = true;
					south = false;
					east = false;
					west = false;
				}
			}
			
			//Moving East conditions
			
			else if(east == true){
				if(solver.wallPresent(Maze.WEST) == false && solver.wallPresent(Maze.NORTH) == false && solver.wallPresent(Maze.EAST) == false  && solver.wallPresent(Maze.SOUTH) == false){
					solver.moveNorth();
					west = false;
					north = true;
					south = false;
					east = false;
				}
				else if(solver.wallPresent(Maze.SOUTH) == true && solver.wallPresent(Maze.EAST) == true && solver.wallPresent(Maze.NORTH) == true){
					south = false;
					north = false;
					east = false;
					west = true;
				}
				else if(solver.wallPresent(Maze.NORTH) == true && solver.wallPresent(Maze.EAST) == false) {
					solver.moveEast();
					east = true;
					north = false;
					south = false;
					west = false;
				}
				
				else if((solver.wallPresent(Maze.EAST) == true || solver.wallPresent(Maze.WEST) == true || solver.wallPresent(Maze.SOUTH) == true) && solver.wallPresent(Maze.NORTH) == false) {
					solver.moveNorth();
					north = true;
					south = false;
					east = false;
					west = false;
				}
				
				else if(solver.wallPresent(Maze.EAST) == true && solver.wallPresent(Maze.SOUTH) == false) {
					solver.moveSouth();
					south = true;
					north = false;
					east = false;
					west = false;
				}
				
				
				else if(solver.wallPresent(Maze.WEST) == true && solver.wallPresent(Maze.NORTH) == false) {
					solver.moveNorth();
					north = true;
					south = false;
					east = false;
					west = false;
				}
				
				else if(solver.wallPresent(Maze.SOUTH) == true && solver.wallPresent(Maze.WEST) == false) {
					solver.moveWest();
					west = true;
					north = false;
					south = false;
					east = false;
				}
			}
			
			//Moving West Conditions
			
			else if(west == true){
				if(solver.wallPresent(Maze.WEST) == false && solver.wallPresent(Maze.NORTH) == false && solver.wallPresent(Maze.EAST) == false  && solver.wallPresent(Maze.SOUTH) == false){
					solver.moveSouth();
					west = false;
					north = false;
					south = true;
					east = false;
				}
				else if(solver.wallPresent(Maze.WEST) == true && solver.wallPresent(Maze.NORTH) == true && solver.wallPresent(Maze.SOUTH) == true){
					south = false;
					north = false;
					east = true;
					west = false;
				}
				else if(solver.wallPresent(Maze.SOUTH) == true && solver.wallPresent(Maze.WEST) == false) {
					solver.moveWest();
					west = true;
					north = false;
					south = false;
					east = false;
				}
				
				
				else if((solver.wallPresent(Maze.WEST) == true || solver.wallPresent(Maze.NORTH) == true || solver.wallPresent(Maze.EAST) == true)  && solver.wallPresent(Maze.SOUTH) == false) {
					solver.moveSouth();
					south = true;
					north = false;
					east = false;
					west = false;
				}
				
				else if(solver.wallPresent(Maze.WEST) == true && solver.wallPresent(Maze.NORTH) == false) {
					solver.moveNorth();
					north = true;
					south = false;
					east = false;
					west = false;
				}
				
				else if(solver.wallPresent(Maze.NORTH) == true && solver.wallPresent(Maze.EAST) == false) {
					solver.moveEast();
					east = true;
					north = false;
					south = false;
					west = false;
				}
				
				else if(solver.wallPresent(Maze.EAST) == true && solver.wallPresent(Maze.SOUTH) == false) {
					solver.moveSouth();
					south = true;
					north = false;
					east = false;
					west = false;
				}
				
				else if(solver.wallPresent(Maze.SOUTH) == true && solver.wallPresent(Maze.WEST) == false) {
					solver.moveWest();
					west = true;
					north = false;
					south = false;
					east = false;
				}
			}
		}


		
	}

}
