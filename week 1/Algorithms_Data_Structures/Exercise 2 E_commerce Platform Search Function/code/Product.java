public class Product {
    private int ProductID;
    private String ProductName;
    private String Category;

    public Product(int productID, String productName, String category) {
        this.ProductID = productID;
        this.ProductName = productName;
        this.Category = category;
    }

    public String getProductName() {
        return ProductName;
    }

    public String toString(){
        return "ProductID: " + ProductID + ", ProductName: " + ProductName + ", Category: " + Category;
    }
}
