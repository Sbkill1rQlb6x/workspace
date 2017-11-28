package factory;

public class User {

	private FactoryAuthority factoryAuthority;
	 String userName;
	public User(FactoryAuthority factoryAuthority,String userName) {
		this.factoryAuthority=factoryAuthority;
		this.userName=userName;
	}

	public Authority getAuthority(int type) {
		Authority authority=factoryAuthority.createAuthority(type);
		
		return authority;
	}

}
