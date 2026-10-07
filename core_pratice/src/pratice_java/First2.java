package pratice_java;

public class First2 {

	public static void main(String[] args) {

		Flipkart_Order ord = new Flipkart_Order("9999","parth","40112","pune");
		System.out.println(ord.name);
		System.out.println(ord.phone);	
		System.out.println(ord.pincode);
		System.out.println(ord.city);
	}

}
class Flipkart_Order
{
	double price;
	String name;
	String pincode;
	String phone;
	String city;
	
	public Flipkart_Order(String phone, String name) {
		
		this.name=name;
		this.phone=phone;
	}
	public Flipkart_Order(String phone, String name, String pincode) {
		
		this.name=name;
		this.phone=phone;
		this.pincode=pincode;
	}
	public Flipkart_Order(String phone, String name, String pincode,String city) {
		
		this.name=name;
		this.phone=phone;
		this.pincode=pincode;
		this.city=city;
	}
}
