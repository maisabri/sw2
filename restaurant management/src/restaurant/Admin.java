package restaurant;

public class Admin {
	//attributes
	  public String username;
	  private int password;
	  //Employee e;

	    public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public int getPassword() {
		return password;
	}

	public void setPassword(int password) {
		this.password = password;
	}

	public void alterPassword(int password) {
		this.password=password;
	}

	public void alterUsername(String username) {
		this.username=username;
	}
}
