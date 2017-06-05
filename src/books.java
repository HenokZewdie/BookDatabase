
public class books {

	private String SKU,Title, Author, Description;
	private double Price;
	
	public books(String SKUs, String Titles, String Authors, String Descriptions, double Prices){
		this.SKU=SKUs;
		this.Title = Titles;
		this.Author=Authors;
		this.Description=Descriptions;
		this.Price=Prices;
	}
	
	public String getSKU() {
		return SKU;
	}
	public void setSKU(String sKU) {
		SKU = sKU;
	}
	public String getTitle() {
		return Title;
	}
	public void setTitle(String title) {
		Title = title;
	}
	public String getAuthor() {
		return Author;
	}
	public void setAuthor(String author) {
		Author = author;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public double getPrice() {
		return Price;
	}
	public void setPrice(double price) {
		Price = price;
	}
	@Override
	public String toString(){
		return this.getSKU() + "  " + this.getTitle() + "  " + this.getAuthor() + "  "+ this.getDescription()+  "  " + this.getPrice();
	}
	
}

/*SKU 	Title 	Author 	Description 	Price*/