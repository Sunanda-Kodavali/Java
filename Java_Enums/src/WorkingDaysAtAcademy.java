public class WorkingDaysAtAcademy {
    enum Day {
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY,
        SUNDAY,
        CATURDAY,
        SUITDAY,
        LITTLE_SATURDAY
    }
    public static void main(String[] args) {
        whatsTheSituation(Day.CATURDAY);
    }

    private static void whatsTheSituation(Day day) {
        switch (day) {

            case MONDAY: System.out.println("Uuugh!");
                break;
            case TUESDAY: System.out.println("TT Aaaah Yeeeaaahh!");
                break;
            case WEDNESDAY: System.out.println("We like Wednesday fika!");
                break;
            case LITTLE_SATURDAY: System.out.println("See you at Ugglan!");
                break;
            case THURSDAY: System.out.println("Almost there!");
                break;
            case FRIDAY: System.out.println("WHOOP WHOOP!");
                break;
            case CATURDAY: System.out.println(":3");
                break;
            case SATURDAY: System.out.println("See you in town!");
                break;
            case SUNDAY: System.out.println("Edward Blom and online pizza");
                break;
            case SUITDAY: System.out.println("Haters gonna hate");
                break;
        }
    }
}
