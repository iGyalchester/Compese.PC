package composepc;

public class Resolution {
	private int height;
	private int width;

	public Resolution(int height, int width) {
		this.height = height;
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public int getWidth() {
		return width;
	}

	@Override
	public String toString() {
		return "Resolution: " +
				height + ", " +
				width +".";
	}
}
