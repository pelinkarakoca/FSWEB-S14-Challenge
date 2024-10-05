package org.example.models;

public class HealthyBurger extends Hamburger{
	private String healthyExtra1Name;
	private double healthyExtra1Price;
	private String healthyExtra2Name;
	private double healthyExtra2Price;

	public HealthyBurger(String name, double price, String breadRollType) {
		super(name, "Tofu", price, breadRollType);
	}

	public String getHealthyExtra1Name() {
		return healthyExtra1Name;
	}

	public double getHealthyExtra1Price() {
		return healthyExtra1Price;
	}

	public String getHealthyExtra2Name() {
		return healthyExtra2Name;
	}

	public double getHealthyExtra2Price() {
		return healthyExtra2Price;
	}

	public void addHealthyAddition1(String healthyExtra1Name, double healthyExtra1Price){
		System.out.println(healthyExtra1Name + healthyExtra1Price + "is added");
		super.setPrice(super.getPrice() + healthyExtra1Price);
	}
	public void addHealthyAddition2(String healthyExtra2Name, double healthyExtra2Price){
		System.out.println(healthyExtra2Name + healthyExtra2Price + "is added");
		super.setPrice(super.getPrice() + healthyExtra2Price);
	}

	@Override
	public double itemizeHamburger() {
		System.out.println("name=" + super.getName() + '\'' +
				", meat=" + super.getMeat() + '\'' +
				", breadRollType=" + super.getBreadRollType() + '\'' +
				", price=" + super.getPrice() +
				", addition1Name=" + healthyExtra1Name+ '\'' +
				", addition1Price=" + healthyExtra1Price +
				", addition2Name=" + healthyExtra2Name + '\'' +
				", addition2Price=" + healthyExtra2Price
		);
		return super.getPrice();
	}
}
