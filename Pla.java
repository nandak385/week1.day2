package week1.day2;


public class Pla {
	


	public static void main(String[] args) {
		
		String str1 = "madam";
		
	System.out.println("Original String is " +str1);
		 
	String revstr="";
		
		for(int j=str1.length()-1; j>=0; j--)
		{
			revstr = revstr + (str1.charAt(j));
					}
	
		System.out.println("Reversed String is " +revstr);
		
		if(str1.equals(revstr))
		{
			System.out.println("Given String is Palindrome");
		}else
		{
		System.out.println("Given String is not a Palindrome");	
		}
		
	}
	
}
