package Implementation;

import java.util.ArrayList;
import java.util.List;

public class Product {
    String productName;
    int price;

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Product(String productName, int price)
    {
        this.productName = productName;
        this.price = price;
    }

    public List<String> getProductList()
    {
        List<String> allProductList = new ArrayList<>();
        allProductList.add("Apple Macbook Pro");
        allProductList.add("Apple Macbook Air");
        allProductList.add("Apple iPhone 12");
        return allProductList;
    }
}
