package LmbdLab3;

public class Ups extends ACompany {

	public Ups(String name) {
		super(name);
	}

	@Override
	public void calculateCost() {
		super.setCost(0.45 * super.getWeight());
	}

}
