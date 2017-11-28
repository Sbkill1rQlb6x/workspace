package template;

public abstract class BankTransactions {

	public void getNumber() {
		System.out.println("取号");
	}

	public abstract void doBusiness();

	public void judgeOrder() {
		System.out.println("评分");
	}

	public boolean customerWantsJudgeOrder() {
		return true;
	}

	public void executionProcess() {
		getNumber();
		doBusiness();
		if(customerWantsJudgeOrder())
		{
			judgeOrder();
		}
	}

}
