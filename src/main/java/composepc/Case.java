package composepc;

public class Case {
	private String manufacturer;
	private String powerSupply;
	protected Dimension dimension;
	private String model;

	public Case(String manufacturer, String powerSupply, Dimension dimension, String model) {
		this.manufacturer = manufacturer;
		this.powerSupply = powerSupply;
		this.dimension = dimension;
		this.model = model;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public String getPowerSupply() {
		return powerSupply;
	}

	public String getModel() {
		return model;
	}

	public void pressPowerButton(){
		System.out.println("PowerButton Pressed");
	}

	@Override
	public String toString() {
		return "Case: " +
				manufacturer +", " +
				powerSupply +", " +
				dimension +", " +
				model+".";
	}
}
