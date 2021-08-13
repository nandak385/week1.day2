package week1.day2;

public class Cal {
	


	public  void Add(int num1, int num2, int num3) {
			int add= (num1+num2+num3 );
			System.out.println(add);

	}
		  
	 
	public  void Sub(int num1, int num2) {
		int sub= (num1-num2 );
		System.out.println(sub);

		  }
	 
	public  void Multi(double num1, double num2) {
		double multi= (num1*num2 );
		System.out.println(multi);

		  }
	 
	public  void Div(float num1, float num2) {
		float div= (num1/num2 );
		System.out.println(div);

		  }

	
	public static void main(String[] args) {
        Cal MyObj= new Cal();
		
		MyObj.Add(15, 20, 30);


}

}