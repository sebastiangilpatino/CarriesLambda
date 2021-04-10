package LmbdLab3;

public class USMail extends ACompany {

	public USMail(String name) {
		super(name);
	}

	@Override
	public void calculateCost() {
		if (super.getWeight() < 3)
			super.setCost(1d);
		else if (super.getWeight() > 3) {
			super.setCost(0.55 * super.getWeight());
		}
	}

}
