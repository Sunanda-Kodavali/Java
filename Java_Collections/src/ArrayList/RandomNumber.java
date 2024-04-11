package ArrayList;

import java.util.ArrayList;
import java.util.Random;

public class RandomNumber {
    public static void main(String[] args) {

        Random random = new Random();
        ArrayList<Integer> uniqueNumbers = new ArrayList<>();

        while (uniqueNumbers.size() < 10){
            int newNumber = random.nextInt(1, 11);
            if(!uniqueNumbers.contains(newNumber)){
                uniqueNumbers.add(newNumber);
            }
        }
        System.out.println(uniqueNumbers);
    }
}
