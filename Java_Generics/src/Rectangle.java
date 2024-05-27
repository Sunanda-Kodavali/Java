public class Rectangle<T> {
    private final T width;
    private final T height;

    public Rectangle(T width, T height) {
        this.width = width;
        this.height = height;
    }

    public T getWidth() {
        return width;
    }


    public T getHeight() {
        return height;
    }

}
