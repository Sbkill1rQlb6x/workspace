package factory;

import java.awt.HeadlessException;

public class  FactoryAuthority {

	 Authority authority;

	public Authority createAuthority(int type) {
		switch(type)
		{
		case 1:
			authority=new LowLevelAuthority();
			break;
		case 2:
			authority=new MediumLevelAuthority();
			break;
		case 3:
			authority=new HighLevelAuthority();
			break;
		
		}
		return authority;
	}

}
