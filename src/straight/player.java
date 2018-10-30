package straight;



public class player {
	
	public static int getPoints(int ballsOnTable, int ballsPrevious) {		
		int pointsToAdd = ballsPrevious - ballsOnTable;
		return pointsToAdd;
		}
	
	public static int foul(int typeOfFoul) {
		if(typeOfFoul == 1) {
			return 1;
		}
		else if (typeOfFoul == 2) {
			return 2;
		}
		else if (typeOfFoul == 14){
			
			return 15;
			
			
		} 
		
		else {
			return 0;
		}
		
	}
	
	
}
