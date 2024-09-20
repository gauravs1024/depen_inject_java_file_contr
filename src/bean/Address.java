package bean;

public class Address {
	private String city;
	private int houseno;
	private int pincode;

	public Address(int houseno,String city, int pincode) {
		this.houseno=houseno;
		this.city=city;
		this.pincode=pincode;
	}
	
	

	
	@Override
	public String toString() {
		return "#"+houseno+","+city+","+pincode;
	}
//	public void disp(){
//		System.out.print("city:"+city);
//		System.out.print("house no:"+houseno);
//		System.out.print("pin code:"+pincode);
//
//		
//	}
//	

}
