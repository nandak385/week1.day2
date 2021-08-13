package week1.day2;

public class MyMobile {
	
	String brandName = "Redmi";
	String Model = "K20 pro";
	char color = 'B';
	int price = 26000;
	
	public void MyMobile() {
		int num=1;
		System.out.println("make a call");
	}

	public void MyMobile1() {
		System.out.println("send message");
	}
	
	private void MyMobile2() {
		System.out.println("enter password");

	}
	private void MyMobile3() {
		System.out.println("enter password");

	}
	
	public static void main(String[] args) {
		
		MyMobile MyObj= new MyMobile();
		MyObj.MyMobile();
		MyObj.MyMobile1();
		//MyObj.MyMobile12(); private
		
		String Model=MyObj.Model;
		System.out.println("Model name" + Model);
	}


}
