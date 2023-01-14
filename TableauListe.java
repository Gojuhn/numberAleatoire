package tableau;
import java.lang.Thread;  
import java.io.*;  
import java.util.Arrays;

public class TableauListe  {

	public static void main(String[] args) {
		
		int[][] tableau = new int[100][10];
		for(int i = 0;i < tableau.length ; i++) {
			for(int j = 0;j < tableau[i].length ; j++) {
				
				
				 tableau[i][j] = numberRandom();
				
			}
		
		
			
			
		}
		
		
		print2Darray(tableau);
		
		
		
		
		
		
		
	}
	public static int numberRandom() {
		
		
		double number = (Math.random() * 100);
		
		 
		return (int) number ;
		
		
		
	}
	
	public static void print2Darray(int[][] liste ) {
		
		try {
		
		for(int i = 0;i < liste.length ; i++) {
			for(int j = 0;j < liste[i].length ; j++) {
				
				
				System.out.print( liste[i][j]+ " ");
				Thread.sleep(100);  
				
			}
			
			System.out.print( "\n");
			
		}
		
		
		
		
	}catch(Exception e) {
		
		System.out.println("Something went wrong.");
		
	}
		
	

}
}
