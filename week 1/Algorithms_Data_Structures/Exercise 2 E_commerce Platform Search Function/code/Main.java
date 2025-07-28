public class Main {
    //linear search
    public static Product linearSearch(Product[] products, String target) {
        for (Product product : products) {
            if (product.getProductName().equalsIgnoreCase(target)) {
                return product;
            }
        }
        return null; 
    }

    //binary search
    public static Product binarySearch(Product[] products, String target) {
        sortProducts(products); // Ensure products are sorted before binary search
        int left = 0;
        int right = products.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int comparison = products[mid].getProductName().compareToIgnoreCase(target);

            if (comparison == 0) {
                return products[mid];
            } else if (comparison < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return null;
    }

    public static void sortProducts(Product[] products) {
        java.util.Arrays.sort(products, (p1, p2) -> p1.getProductName().compareToIgnoreCase(p2.getProductName()));
    }
    public static void main(String[] args) {
        Product[] products = {
            new Product(1, "Laptop", "Electronics"),
            new Product(2, "Smartphone", "Electronics"),
            new Product(3, "Coffee Maker", "Home Appliances"),
            new Product(4, "Blender", "Home Appliances"),
            new Product(5, "T-shirt", "Clothing"),
            new Product(6, "Jeans", "Clothing")
        };

        String target = "Jeans";


        System.out.println("Liner Search");
        Product resultLinear = linearSearch(products, target);
        System.out.println(resultLinear != null ? resultLinear : "Product not found");
        System.out.println("Binary Search");
        Product resultBinary = binarySearch(products, target);
        System.out.println(resultBinary != null ? resultBinary : "Product not found");

    }
}
