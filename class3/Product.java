package Class3;

public class Product {
	
	private int id;
	private String name = "Cansu";
	private String discription;
	private double price;
	private int stockAmount = 3;
	private String color;
	private String code;
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getname() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getDiscription() {
		return discription;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public int getAmount() {
		return stockAmount;
	}
	
	public void setAmount(int stockAmount) {
		this.stockAmount = stockAmount;
	}


	public String getCode() {
		return code;
	}


	public void setCode(String code) {
		this.code = code;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}
	
}
