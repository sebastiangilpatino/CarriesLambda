package LmbdLab3;

public class Fedex extends ACompany {

	public Fedex(String name) {
		super(name);
	}

	@Override
	public void calculateCost() {
		/*
		 * Zone = 0.35 for IA, MT, OR and CA Zone = 0.30 for TX, and UT Zone = 0.55 for
		 * FL, MA and OH Zone = 0.43 for all others
		 */

		if (super.getZone().equals("IA") || super.getZone().equals("MT") || super.getZone().equals("OR")
				|| super.getZone().equals("CA")) {
			super.setCost(0.35 * super.getWeight());
		} else if (super.getZone().equals("TX") || super.getZone().equals("UT")) {
			super.setCost(0.3 * super.getWeight());
		} else if (super.getZone().equals("FL") || super.getZone().equals("MA") || super.getZone().equals("OH")) {
			super.setCost(0.55 * super.getWeight());
		} else {
			super.setCost(0.43 * super.getWeight());
		}
	}

}
