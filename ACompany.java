package LmbdLab3;

public abstract class ACompany implements ICompany {

	private String name;
	private String zone;
	private double weight;
	private String descript;
	private double cost;

	public ACompany(String name) {
		this.name = name;
	}

	@Override
	public String getZone() {
		return zone;
	}

	@Override
	public double getWeight() {
		return weight;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public String getDescript() {
		return descript;
	}

	@Override
	public void setZone(String zone) {
		this.zone = zone;
	}

	@Override
	public void setWeight(double weight) {
		this.weight = weight;
	}

	@Override
	public void setDescript(String descript) {
		this.descript = descript;
	}

	@Override
	public double getCost() {
		return cost;
	}

	@Override
	public void setCost(Double cost) {
		this.cost = cost;
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	@Override
	public String toString() {
		return descript + " $" + cost + " " + name;
	}

	@Override
	public abstract void calculateCost();
}
