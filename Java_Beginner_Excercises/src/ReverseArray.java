public class ReverseArray {
    public static void main(String[] args) {

        int[] arr = { 12, 4, 2, 10, 17, 23};
        int[] revArr = reverseArray(arr);
        for (int i = 0; i < revArr.length; i++) {
            System.out.print(revArr[i]+" ");
        }
    }

    private static int[] reverseArray(int[] arr) {
        int[] revArr = new int[arr.length];
        int index = 0;
        for(int i=arr.length-1;i>=0;i--){
            revArr[index]=arr[i];
            index++;
        }
        return revArr;
    }
}
