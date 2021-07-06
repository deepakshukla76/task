package eg1;

public  class Product implements Comparable<Product>{

	
	private int productId;
	private String manufacturerName;
	private String productName;
	private int cost ;
	public boolean productAvailability;
	
	public Product() {
		// TODO Auto-generated constructor stub
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getManufacturerName() {
		return manufacturerName;
	}

	public void setManufacturerName(String manufacturerName) {
		this.manufacturerName = manufacturerName;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public boolean isProductAvailability() {
		return productAvailability;
	}

	public void setProductAvailability(boolean productAvailability) {
		this.productAvailability = productAvailability;
	}

	public Product(int productId, String manufacturerName, String productName, int cost, boolean productAvailability) {
		super();
		this.productId = productId;
		this.manufacturerName = manufacturerName;
		this.productName = productName;
		this.cost = cost;
		this.productAvailability = productAvailability;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", manufacturerName=" + manufacturerName + ", productName="
				+ productName + ", cost=" + cost + ", productAvailability=" + productAvailability + "]";
	}

	@Override
	public int compareTo(Product o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
	
	
}
