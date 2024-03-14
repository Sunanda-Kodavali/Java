public class ArrayBigName {
    public static void main(String[] args) {
        String[] names = new String[]{"Bob", "Max", "Swetha", "John12345", "Harry"};
        int len = Integer.MIN_VALUE;
        int index = 0;
        for (int i = 0; i < names.length ; i++) {

            if(names[i].length()>len){
                len = names.length;
                index = i;
            }

        }
        System.out.println(names[index]);
    }
}
