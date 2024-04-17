public class Movie implements Product, Comparable<Movie>{

    private long productId;
    private String title;
    private MovieGenre genre;
    private int price;

    public Movie(long productId, String title, MovieGenre genre, int price) {
        this.productId = productId;
        this.title = title;
        this.genre = genre;
        this.price = price;
    }

    public long getProductId() {
        return productId;
    }

    public void setProductId(long productId) {
        this.productId = productId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public MovieGenre getGenre() {
        return genre;
    }

    public void setGenre(MovieGenre genre) {
        this.genre = genre;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public void printDetails() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "---------------Movie Details-----------"
                +"\nproductId: " + productId +
                "\ntitle: " + title +
                "\ngenre: " + genre +
                "\nprice: " + price ;
    }

    @Override
    public int compareTo(Movie o) {

//        return Long.compare(getProductId(), o.getProductId());

        if(getProductId() ==  o.getProductId()){
            return 0;
        } else if(productId < o.getProductId()){
            return -1;
        } else {
            return 1;
        }

    }
}
