package coreJavaTraining;

public class InterviewMinNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int b[][]= {{28,4,5},{3,4,7},{11,22,9}};
		int min=b[0][0];
		
		int mincoloumn=0;;
		for (int i = 0; i < 3; i++) 
		{
			for (int j = 0; j < 3; j++) 
			{
			   if (b[i][j]<min) 
			   {
				min=b[i][j];
				mincoloumn=j;
			   }
				
			}
		}
		
System.out.println(min);

int max=b[0][mincoloumn];
int k = 0;
while(k<3)
{
if(b[k][mincoloumn]>max)
{
max=b[k][mincoloumn];
}
k++;
}

System.out.println(max);



	}

}
