package test_5;
import java.util.Scanner;
public class ScoresRank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input =new Scanner(System.in);
		
	    System.out.println("Enter the number of students:");
		int number=input.nextInt();
		int []score=new int [number];
	    int best =0;
		
	   System.out.println("Enter "+number+" scores:");
	   for(int i=0;i<number;i++) 
		 score[i]=input.nextInt();			   
	       
	      for(int i=0;i<number;i++) {
	    	  if (score[i]>=best)
		        	 best=score[i];	  
	      }
	 
		
		for(int count=0;count<number;count++) 
			if(score[count]>=best-10)
				System.out.println("Student score is "+score[count]+" and grade is A"  );
			else if(score[count]>=best-20)
				System.out.println("Student score is "+score[count]+" and grade is B " );
		    else if(score[count]>=best-30)
			    System.out.println("Student score is "+score[count]+" and grade is C"  );
		    else if(score[count]>=best-40)
		     	System.out.println("Student score is "+score[count]+" and grade is D" );
		    else 
            	System.out.println("Student score is "+score[count]+" and grade is F");


	}

}
