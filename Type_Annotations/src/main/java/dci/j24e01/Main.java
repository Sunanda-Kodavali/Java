package dci.j24e01;

public class Main {
    public static void main(String[] args) {

        try {
            Product product = new Product(0,null);
            System.out.println(product.getProductName());
        }catch (Exception exception){
            System.out.println(exception.getMessage());
        }

        Example e = new Example(-2);
        if(e.getNumber() < 0){
            System.out.println("Number should be positive");
        }else {
            System.out.println(e.getNumber());
        }



    }
}