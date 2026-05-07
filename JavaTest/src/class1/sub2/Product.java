package class1.sub2;

public class Product {
	private String productId; // 상품 아이디
	private String productName; // 상품 이름
	private int price; // 상품 가격
	private int quantity; // 재고 수량
	
	public Product(String productId, String productName, int price, int quantity) {
		this.productId = productId;
		this.productName = productName;
		this.price = price;
		this.quantity = quantity;
	}
	
	public void updatePrice(int newPrice) {
		if (newPrice <= 0) {
			System.out.println("잘못된 입력 입니다.");
			return;
		}
		
		System.out.println(productName + " 가격 수정 됨");
		price = newPrice;
	}
	
	public void addStock(int amount) {
		System.out.println(productName + " " + amount + "개 추가 됨");
		quantity += amount;
	}
	
	public void printProductInfo() {
		System.out.println("상품 ID : " + productId);
		System.out.println("상품 이름 : " + productName);
		System.out.println("상품 가격 : " + price);
		System.out.println("재고수량 : " + quantity);
	}
}
