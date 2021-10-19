package composepc;

public class Pc {
	protected Case pcCase;
	protected Monitor monitor;
	protected MotherBoard motherBoard;

	public Pc(Case pcCase, Monitor monitor, MotherBoard motherBoard) {
		this.pcCase = pcCase;
		this.monitor = monitor;
		this.motherBoard = motherBoard;
	}

	private void drawLogo(){
		monitor.drawPixel(20, 30, "Purple!");
	}

	public void description(){
		System.out.println("Welcome to worst buy! Below is the description of the pc on sale today: ");
		System.out.println(toString());
	}

	public void powerUp(){
		pcCase.pressPowerButton();
		drawLogo();
		motherBoard.loadProgram("IntelliJ ");
	}

	@Override
	public String toString() {
		return "Pc On Sale: \n" +
				 pcCase + "\n" +
				monitor + "\n" +
				motherBoard+".";
	}


}
