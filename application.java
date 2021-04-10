package LmbdLab3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class application {

	public static void main(String[] args) throws CloneNotSupportedException {

		String descript = "", zone = "";
		double weight = 0;
		int numbPackage = 0;

		ICompany ups = new Ups("UPS");
		ICompany usMail = new USMail("USMail");
		ICompany fedEx = new Fedex("Fedex");

		List<ICompany> companies = new ArrayList<ICompany>();
		List<Double> cost = new ArrayList<Double>();
		List<ICompany> cheapCompa = new ArrayList<ICompany>();
		Comparator<ICompany> compareByCost = Comparator.comparing(ICompany::getCost);

		companies.add(fedEx);
		companies.add(usMail);
		companies.add(ups);

		System.out.print("Number of Package: ");
		Scanner sc = new Scanner(System.in);

		try {
			String s = sc.nextLine();
			numbPackage = Integer.valueOf(s);
		} catch (NumberFormatException e) {
			System.err.println("wrong input");
		}

		for (int i = 0; i < numbPackage; i++) {
			System.out.println("");
			System.out.print("Input Description: ");

			try {
				descript = sc.nextLine();
				System.out.print("Input the weight: ");
				weight = Double.valueOf(sc.nextLine());
				System.out.print("Input the zone: ");
				zone = sc.nextLine();
			} catch (NumberFormatException e) {
				System.out.println("Error");
			}

			for (int j = 0; j < companies.size(); j++) {
				companies.get(j).setDescript(descript);
				companies.get(j).setWeight(weight);
				companies.get(j).setZone(zone);
				companies.get(j).calculateCost();
			}

			cheapCompa.add((ICompany) companies.stream().min(compareByCost).orElse(null).clone());
		}

		System.out.println("\n");
		cheapCompa.stream().forEach(c -> System.out.println(c.toString()));

	}

}
