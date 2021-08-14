package week1.day2;

public class ChangeTheInd {

	public static class ChangeOddIndexToUpperCase {
		
		public static void main(String[] args) { 
			
			//String st1="Have a nice day";
			String st1="ford";
			System.out.println("The given string is " +st1);
			String[] arr1= st1.split("");
			String str2 = "";
					
			for (int i=0; i<arr1.length; i++)
			{ 
			 if(i%2==1)
			  {
			   str2=str2+arr1[i].toUpperCase();
			  }
			 else {
				 str2=str2+arr1[i].toLowerCase();
			 }
			}

			System.out.println("Converted String is " +str2);
		}

	}
	}