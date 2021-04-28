package classesWithAttributes;

public class Product {
	
	public Product(int id, String name, String description, double price, int stockAmount, String renk) {
		System.out.println("Yapýcý blog çalýþtý");
		this.id = id;
		this.renk = renk;
		this.name = name;
		this.price = price;
		this.description = description;
		this.stackAmount = stockAmount;
	}
	
	//attribute | field
	 int id;
	 private String name;
	 private String description;
	 private double price;
	 private int stackAmount;
	 private String renk;
	// private String kod;
	
	
	

	//getter
	public int getId() { // ürünün id sini yazamaz ama okuyabilir
		return id;
	}
	
	//setter
	public void setId(int id) {
		this.id=id;  //this icinde bulunan class
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getStackAmount() {
		return stackAmount;
	}

	public void setStackAmount(int stackAmount) {
		this.stackAmount = stackAmount;
	}

	public String getRenk() {
		return renk;
	}

	public void setRenk(String renk) {
		this.renk = renk;
	}

	public String getKod() {
		return this.name.substring(0,1) + id;
	}

	

}
