import java.util.Scanner;

public class positive {

	public static void main(String[] args) {
	
      int number,positive,negative;
      
      
      Scanner pos=new Scanner(System.in);
      
      System.out.println("enter any no ");
      number=pos.nextInt();
      
      if(number>0)
    	  System.out.println("no is positive");
      
      else
    	  System.out.println("no is negative");
      
	}

}
