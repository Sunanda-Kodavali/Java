public class Product {

    protected long productId;
    protected int price;

    public Product(long productId, int price) {
        this.productId = productId;
        this.price = price;
    }

    @Override
    public String toString() {
        return "productId: " + productId
                +"\nprice: " + price;
    }
}
