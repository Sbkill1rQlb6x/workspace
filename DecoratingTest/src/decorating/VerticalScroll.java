package decorating;

public class VerticalScroll extends ScrollingWindowDecorator {

	private Window window;

	public VerticalScroll(Window window) {
		this.window=window;
	}

	public String scroll() {
		return window.getWindowName()+"使用：VerticalScroll";
	}

}
