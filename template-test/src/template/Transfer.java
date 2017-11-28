package template;

public class Transfer extends BankTransactions {

	public void doBusiness() {
		System.out.println("办理转账业务");
	}

	public boolean customerWantsJudgeOrder() {
		return false;
	}

}
