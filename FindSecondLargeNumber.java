package week1.day2;

import java.util.Arrays;

public class FindSecondLargeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] data = {3,2,11,4,6,7};
        Arrays.sort(data);
        //2,3,4,6,7,11
        int length = data.length;
        System.out.println("The second large number is " + data[length-2]);

	}

}
