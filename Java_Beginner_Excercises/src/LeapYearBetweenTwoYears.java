

public class LeapYearBetweenTwoYears {
    public static void main(String[] args) {

        for (int year = 1900; year <= 2100 ; year++) {
            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    if (year % 400 == 0)
                        System.out.print(year+" ");
                }
                else
                    System.out.print(year+" ");
            }
        }
    }

}
