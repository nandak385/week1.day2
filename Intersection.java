package week1.day2;

public class Intersection {
	
	public static void main(String[] args) {
		int[] arr1 = {2,4,11,5,6,7};	
		int[] arr2 = {1,3,8,6,9,7};
		System.out.println("The Missing elements are");
		for (int i=0; i<arr1.length;i++)
		{
			for(int j=arr1.length -1; j>=0;j--)
			{
				if (arr1[i] == arr2[j])
					System.out.println (arr1[i]);
			}
		}

	}
}


