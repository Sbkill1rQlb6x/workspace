package decorating;

public class HorizontalScroll extends ScrollingWindowDecorator {

	private Window window;

	public HorizontalScroll(Window window) {
		this.window=window;
	}

	public String scroll() {
		return window.getWindowName()+"使用：HorizontalScroll";
	}

}
