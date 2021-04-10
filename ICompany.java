package LmbdLab3;

public interface ICompany extends Cloneable {
	public void calculateCost();

	public void setZone(String zone);

	public void setWeight(double weight);

	public void setDescript(String desc);

	public String getDescript();

	public String getName();

	public double getWeight();

	public String getZone();

	public double getCost();

	public void setCost(Double cost);

	public Object clone() throws CloneNotSupportedException;
}
