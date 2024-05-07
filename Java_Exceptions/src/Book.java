public class Book implements Product{

    private long productId;
    private String title;
    private String author;
    private int price;

    public Book(long productId, String title, String author, int price) throws IncorrectProductIdException {
        if(productId < 0){
            throw new IncorrectProductIdException(productId);
        }else {
            this.productId = productId;
        }
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public void printDetails() {
        System.out.println(this);
    }
    @Override
    public String toString() {
        return "---------Book Details---------"
                +"\nproductId: " + productId +
                "\ntitle: " + title +
                "\nauthor: " + author +
                "\nprice: " + price ;
    }


}
