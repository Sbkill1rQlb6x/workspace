package factory;

import java.awt.HeadlessException;

public class  FactoryAuthority {

	 Authority authority=null;
     private static FactoryAuthority fAuthority=null;
	 private FactoryAuthority(){
		 
	 }
     public static FactoryAuthority getInstance()
     {
    	 if (fAuthority==null) {
			synchronized (FactoryAuthority.class) {
				if (fAuthority==null) {
					fAuthority=new FactoryAuthority();
					
				}
			}
		}
    	 return fAuthority;
     }
     
     
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
