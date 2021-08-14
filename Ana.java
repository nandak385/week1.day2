package week1.day2;

import java.util.Arrays;

public class Ana {
	
	public static void main(String[] args) {


	String str1 = "Stops" , str2 = "potss";
	str1=str1.toLowerCase();
	str2=str2.toLowerCase();
	System.out.println("The given Strings "+str1+" and " +str2);
	int count =0;

	if(str1.length()==str2.length())
	{

		char[] str3 = str1.toCharArray(), str4 = str2.toCharArray();

		Arrays.sort(str3);
		Arrays.sort(str4);

		for(int i=0;i<str3.length; i++)
		{
			if(str3[i] == str4[i]) 
			{

				count ++; 
				System.out.println(str3[i]+" "+str4[i]);
			} 

		}

	if(count==str1.length() && count==str2.length())
	{
		System.out.println("The given Strings "+str1+" and " +str2+ " are Anagram");
	} else
	{
		System.out.println("The given Strings "+str1+" and " +str2+ " are not an Anagram because contains different characters");
	}

    } else 
    { 
	System.out.println("The given Strings "+str1+" and " +str2+ " are not an Anagram because of length different");
}
}
}