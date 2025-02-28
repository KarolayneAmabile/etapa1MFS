package user;

public class Customer extends User {
	private String address;
	
	public Customer(int id, String name, String phone, String address) {
		super(id, name, phone);
		this.setAddress(address);
	}
	
	public Customer(int id, String name, String phone) {
		super(id, name, phone);
	}
	
	public String getAddress() {
		return this.address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
}
