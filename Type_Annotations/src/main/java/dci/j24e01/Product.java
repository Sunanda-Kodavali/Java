package dci.j24e01;

import org.jetbrains.annotations.NotNull;

public class Product {

    private int productId;
    private @NotNull String productName;

    public Product(int productId, @NotNull String productName) {
        this.productId = productId;
        this.productName = productName;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public @NotNull String getProductName() {
        return productName;
    }

    public void setProductName(@NotNull String productName) {
        this.productName = productName;
    }


}
