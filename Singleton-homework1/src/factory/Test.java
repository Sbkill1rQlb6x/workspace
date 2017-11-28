package factory;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FactoryAuthority  factoryAuthority=FactoryAuthority.getInstance();
		User user1=new User(factoryAuthority,"user1");
		Authority authority=user1.getAuthority(3);
		System.out.println("UserName:"+user1.userName+",Authority:"+authority.getDescription());
	}

}
