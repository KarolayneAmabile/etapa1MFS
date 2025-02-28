package user;

public class Adm extends User {
	private String password;
	private String email;
	
	public Adm (int id, String name, String phone, String password, String email) {
		super(id, name, phone);
		this.setPassword(password);
		this.setEmail(email);
	}
	
	public String getPassword() {
		return this.password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getEmail() {
		return this.email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}
