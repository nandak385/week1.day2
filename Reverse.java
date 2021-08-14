package week1.day2;

public class Reverse {

	public static void main(String[] args) {
		
		String str1 ="Name some good movie ?";
	   String[] str2 = str1.split(" ");
	   		  		   
			for (int i=0;i<str2.length;i++)
			{
				if (i%2!=0) {
			
				for(int j=str2[i].length()-1;j>=0;j--)
					{
						System.out.print(str2[i].charAt(j));
					}
					System.out.print(" ");
					    } else
					    {
					    	System.out.print(str2[i]+" ");
					    }
			}  
			
}

}