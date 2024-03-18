import java.util.Scanner;

public class HotelExc {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int pricePerNight = 90;
        System.out.println("How many nights you would like to stay?");
        int daysStay = scanner.nextInt();

        System.out.println("which type of room would you like to take? Press N for Normal room(90€), D for Deluxe room(120€), DS for Deluxe suites(150€)");
        String roomType = scanner.next();
        System.out.println("how many guests will stay in the room(1 or 2)?");
        int guestCount = scanner.nextInt();

        int costPerDays;
        if(roomType.equalsIgnoreCase("D")){
            pricePerNight = 120;
            if (guestCount==2) {
                costPerDays = (daysStay * pricePerNight)+(daysStay * 10);
            }else{
                costPerDays = daysStay * pricePerNight;
            }
        }else if(roomType.equalsIgnoreCase("DS")){
            pricePerNight = 150;
            if (guestCount==2) {
                costPerDays = (daysStay * pricePerNight)+(daysStay * 10);
            }else{
                costPerDays = daysStay * pricePerNight;
            }
        }else{
            if (guestCount==2) {
                costPerDays = (daysStay * pricePerNight)+(daysStay * 10);
            }else{
                costPerDays = daysStay * pricePerNight;
            }
        }



        double discount;
        double costInclDisc = 0;
        if(daysStay>=5 && daysStay<10){
            discount = costPerDays * 0.1;
            costInclDisc = costPerDays-discount;
               System.out.println("For "+daysStay+" days, you need to pay including discount "+costInclDisc+"€");
        }else if(daysStay>=10 && daysStay<15){
            discount = costPerDays * 0.15;
            costInclDisc = costPerDays-discount;
               System.out.println("For "+daysStay+" days, you need to pay including discount "+costInclDisc+"€");
        }else if(daysStay>=15){
            discount = costPerDays * 0.2;
            costInclDisc = costPerDays-discount;
                System.out.println("For "+daysStay+" days, you need to pay including discount "+costInclDisc+"€");
        }else{
              System.out.println("For "+daysStay+" days, you need to pay "+costPerDays+"€");
        }


        System.out.println("would you like to include breakfast? Press Y for Yes and N for No");
        String yesOrNo = scanner.next();
        double costInclBf;
        if (yesOrNo.equalsIgnoreCase("y") && guestCount==1){
            costInclBf = costInclDisc + (daysStay * 10);
            //   System.out.println("For "+daysStay+" days, you need to pay including Breakfast "+costInclBf+"€");
        }else if (yesOrNo.equalsIgnoreCase("y") && guestCount==2){

            costInclBf = costInclDisc + (daysStay * 10 * 2) ;
        }else{
            costInclBf = costPerDays;
            //  System.out.println("For "+daysStay+" days, you need to pay "+costInclBf+"€");
        }
        System.out.println("For "+daysStay+" days, you need to pay including Breakfast "+costInclBf+"€");

    }
}
