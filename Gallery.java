import java.util.Scanner;
import java.util.Arrays;
import java.util.NoSuchElementException;

public class Gallery {
    
	public static int maxValue(int[] doors) {
		int maxval = doors[0];
		//System.out.println(maxval)
		for (int i = 1; i < doors.length; i++){
			maxval = Math.max(maxval, doors[i]);
		    //System.out.println(maxval)
		}
		return maxval;
	}
	
	//Main Method
	public static void main(String[] args) {
        try{
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int k = scan.nextInt();
		
		//Looping through all the rows 
		while (n > 0) {
			
			int[][] room = new int[n][2]; //There are two rooms in a row
			for (int i = 0; i < n; i++){
			
				for (int j = 0; j < 2; j++){
				
					room[i][j] = scan.nextInt(); //Saving the value of each room in a row for all rows
					//System.out.println(room[i][j]);
				    
				}
			    
			}

			int door [][][] = new int[n][k+1][3]; //First two parameters represent location of the door, the third dimension in door array represents which door is blocked if any. 
			//0 represents no doors blocked in that row, 1 represents left door is blocked and 2 represents right door is blocked
			
			for (int i = 0; i < n; i++){
				for (int j = 0; j <= k; j++){
					Arrays.fill(door[i][j], -1);
			    }
			}
			//Setting the first row 
			door[0][0][0] = room[0][0] + room[0][1]; 
			if (k > 0){ //Checking that atleast one door needs to be blocked
				door[0][1][1] = room[0][1];
			}
			if (k > 0){
				door[0][1][2] = room[0][0];
			}

			for (int i = 1; i < n; i++) {

				for (int j = 0; j <= i+1 && j <= k; j++) {
					
					
					if (maxValue(door[i-1][j]) >= 0)
						door[i][j][0] = room[i][0] + room[i][1] + maxValue(door[i-1][j]);

					 
					if (j > 0 && Math.max(door[i-1][j-1][1], door[i-1][j-1][0]) >= 0){
						door[i][j][1] = room[i][1] + Math.max(door[i-1][j-1][1], door[i-1][j-1][0]);
					}
					
					if (j > 0 && Math.max(door[i-1][j-1][2], door[i-1][j-1][0]) >= 0){
						door[i][j][2] = room[i][0] + Math.max(door[i-1][j-1][2], door[i-1][j-1][0]);
					}
				}
			}

			System.out.println(maxValue(door[n-1][k]));
		}
	}
        catch (NoSuchElementException e) {
                System.out.println("The last row 0 0 is not stored");
	    }
	}

}
