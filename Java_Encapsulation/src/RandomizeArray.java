import java.util.Random;

public class RandomizeArray {
    private final int[] numbers;

    public RandomizeArray(int[] numbers) {
        this.numbers = numbers;
        Random r = new Random();
        for (int i = 0; i < numbers.length; i++) {

            int num  = r.nextInt(1,numbers.length + 1);
            while(existsInArray(num, numbers)){
                num  = r.nextInt(1,numbers.length + 1);
            }
            numbers[i] = num;
        }
    }

    public int[] getNumbers() {
        return numbers;
    }
    public boolean existsInArray(int num, int[] numbers) {
        for (int i:numbers){
            if(i == num){
                return true;
            }
        }
        return false;
    }
}
