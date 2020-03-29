package test_6;

public class SumMajorDiagonal {
	public static double SumMajorDiagonal (double [][]m) {
		double sum=0;
		for (int i=0;i<m.length;i++) {
			sum=sum+m[i][i];
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
