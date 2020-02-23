package day60_collections2;
public class Product implements Comparable<Product>{
    private String name;
    private double price;
/*
 This method returns an int of 3 types:
   1.positive number - this Product is larger than another Product
   2.zero 0  - this product and another product is equal
   3.negative number - this product is smaller than another product
 */

    @Override
    public int compareTo(Product anotherProduct) {
        if(this.price> anotherProduct.price){
            return 1;
        } else if(this.price==anotherProduct.price){
            return 0;
        } else {
            return -1;
        }
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;

    }
}