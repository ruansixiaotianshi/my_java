package test_6;

public class SortGrade {

	public static void main(String[] args) {
		 // Students' answers to the questions
		  char[][] answers = {
		 {'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
		 {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
		 {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
		 {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
		 {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
		 {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
		 {'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
		 {'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}};
		
		 // Key to the questions
		char[] keys = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};
		int[]count=new int[10];
		int[]num= {0,1,2,3,4,5,6,7};
		 // Grade all answers
		 for (int i = 0; i < answers.length; i++) {
		 // Grade one student
		 int correctCount = 0;
		 for (int j = 0; j < answers[i].length; j++) {
		 if (answers[i][j] == keys[j])
		 correctCount++;
		 }
		 }
		 count[i]= correctCount;
	 }
	for(int i=0;i<answers.length;i++) {
	for (int j=i+1;j<answers.length;j++) {
		if(count[j]<count[i]) {
			int tmp1=count[j];
			count[j]=count[i];
			count[i]=tmp1;
			int tmp2=num[j];
			num[j]=num[i];
			num[i]=tmp2;
		}
			
		}
	}
for(int i=0;i<answer.length;i++) {
		 System.out.println("Student " + num[i]+ "'s correct count is " +
		 count[i]);
}
}
		
		 }