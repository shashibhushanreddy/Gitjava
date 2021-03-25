package coreJavaTraining;



public class ReverseStringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="shashi";
		String str1="";
		
		for (int i =str.length()-1; i>=0  ; i--) 
		{
		
		str1=str1+str.charAt(i);
			
		}
		
		System.out.println(str1);
		
		if (str1.equals(str)) {
			
			System.out.println("its a palli");
		}
		
		else {
			System.out.println("its not a palli");
		}
		
		
	}

}
