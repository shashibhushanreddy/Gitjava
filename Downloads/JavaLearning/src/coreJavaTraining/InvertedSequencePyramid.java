package coreJavaTraining;

public class InvertedSequencePyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k=10;
		
		for (int i = 1; i < 5; i++) 
		{
			
			for (int j = 1; j <=i ; j++) 
			{
				System.out.print(k);
				System.out.print(" ");
				k--;
				
			}
			System.out.println("");
		}

	}

}
