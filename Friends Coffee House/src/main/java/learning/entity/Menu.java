package learning.entity;

public class Menu {
	private int item_id;
	private String item_name;
	private String category_name;
	private double price;
	public Menu(int item_id, String item_name, String category_name, double price) {
		this.item_id = item_id;
		this.item_name = item_name;
		this.category_name = category_name;
		this.price = price;
	}
	public Menu(String item_name, String category_name, double price) {
		this.item_name = item_name;
		this.category_name = category_name;
		this.price = price;
	}

	public Menu(String item_name, double price) {
		this.item_name = item_name;
		this.price = price;
	}
	
	public int getItem_id() {
		return item_id;
	}
	public void setItem_id(int item_id) {
		this.item_id = item_id;
	}
	public String getItem_name() {
		return item_name;
	}
	public void setItem_name(String item_name) {
		this.item_name = item_name;
	}
	public String getCategory_name() {
		return category_name;
	}
	public void setCategory_name(String category_name) {
		this.category_name = category_name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
}
