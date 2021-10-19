package composepc;

public class PcMain {
	public static void main(String[] args) {
		Dimension caseDimension = new Dimension(210, 460, 428);
		Resolution resolution = new Resolution(1970, 1080);
		Case pcCase = new Case("NZXT", "EVGA", caseDimension, "H150");
		Monitor monitor = new Monitor(resolution, "ASUS", "VG278QR");
		MotherBoard motherBoard = new MotherBoard("X570 Phantom Gaming 4", "ASROCK", 4,4, "Z39PG4_130");
		Pc pc = new Pc(pcCase, monitor, motherBoard);

		pc.description();
		System.out.println("==============================");
		pc.powerUp();
	}
}
