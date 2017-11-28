package adapter2;

public class SocketAdapter implements DBSocketInterface {
	
	private GBSocketInterface gbSocket;

	public SocketAdapter(GBSocketInterface gbSocket) {
		this.gbSocket = gbSocket;
	}

	public void powerWithTwoRound() {
		gbSocket.powerWithThreeFlat();
	}
}
