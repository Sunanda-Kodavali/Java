public class Main {
    public static void main(String[] args) {


        Rectangle<Integer> r1 = new Rectangle<>(1, 2);
        System.out.println(r1.getHeight());
        Rectangle<Float> r2 = new Rectangle<>(1.2f, 2.3f);
        System.out.println(r2.getHeight());
    }
}