package template;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WithdrawMoney withdrawMoney=new WithdrawMoney();
		Deposit deposit=new Deposit();
		Transfer transfer=new Transfer();
		
		withdrawMoney.executionProcess();
		deposit.executionProcess();
		transfer.executionProcess();
	}

}
