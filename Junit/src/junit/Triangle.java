package junit;

public class Triangle {
	private long a;
	private long b;
	private long c;
	
	public Triangle(int a,int b,int c)
	{//////
		this.a = a;
		this.b = b;
		this.c = c;
	}
	public boolean inScope()
	{
		if(a>=1 && a<=100 &&
				b>=1 && b<=100 &&
				c>=1 && c<=100)
		{
			return true;
		}
		return false;
	}
	public boolean isTri()
	{//�ж��ܷ񹹳�������
		if(a+b>c && a+c>b && b+c>a)
			return true;
		return false;
	}
	public String isType()
	{
		String iType = null;
		if(inScope()){
			if(isTri()){
				if(a==b && b==c)
					iType="�ȱ�������";
				else if(a==b || b==c || c==a)
					iType="����������";
				else
					iType = "һ��������";
			}else{
				iType="������������";
			}
		}else{
			iType="���벻����";
		}
		return iType;
	}
}
