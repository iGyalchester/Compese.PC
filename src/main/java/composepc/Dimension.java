package composepc;

public class Dimension {
	private int width, height, depth;

	public Dimension(int width, int height, int depth) {
		this.width = width;
		this.height = height;
		this.depth = depth;
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

	public int getDepth() {
		return depth;
	}

	@Override
	public String toString() {
		return "Dimension: " +
				width +", " +
				height +", " +
				depth+".";
	}
}