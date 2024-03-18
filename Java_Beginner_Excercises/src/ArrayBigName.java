public class ArrayBigName {
    public static void main(String[] args) {
        String[] names = new String[]{"Bob", "Max456457657", "Swetha", "John12345", "Harry"};
        int len = Integer.MIN_VALUE;
        int index = 0;
        for (int i = 0; i < names.length ; i++) {
            if(names[i].length()>len){
                len = names[i].length();
                index = i;
            }
        }
        System.out.print(names[index]);
    }
}
