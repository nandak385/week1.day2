package week1.day2;

public class CharAcc {

	
		public static void main(String[] args) {
			String str = "WeTeamSpace";  
			char[] arr = str.toCharArray();
			
			for (int i=0; i<arr.length;i++)
			{
				int count=1;
				for (int j=i+1;j<arr.length;j++)
				{
					if (arr[i] == arr[j])
					{
						count++;
						arr[j] = '0';
					}

				}

				if(arr[i]!='0')
				{
					System.out.println(arr[i]+" : " +count);
				}

			}

		}

	}