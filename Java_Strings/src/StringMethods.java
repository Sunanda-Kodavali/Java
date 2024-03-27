public class StringMethods {
    public static void main(String[] args) {
        String strInput = "Hello and welcome. Nice to meet you tomorrow.";


        String[] strArray = strInput.split(" ");
        for(String str : strArray){
            System.out.println(str);
        }

        String[] strArrayDots = strInput.split("\\.");
        for(String strDots : strArrayDots){
            System.out.println(strDots.trim()+".");
        }


    }
}
