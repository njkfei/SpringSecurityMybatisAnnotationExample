package xyz.hollysys.springsecurity.model;

public class UserProfile {

	private int id;	

	private String type = UserProfileType.USER.getUserProfileType();
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}


	

	@Override
	public String toString() {
		return "UserProfile [id=" + id + ",  type=" + type	+ "]";
	}
	

}
