import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class TrafficLights {
    enum TrafficLight{
        RED,
        YELLOW,
        GREEN
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        TrafficLight color = TrafficLight.RED;
        System.out.println("Press Enter key to see transition or Press q to exit.");
        while (true){

            String key = scanner.nextLine();
            if(key.equalsIgnoreCase("q")){
                break;
            }
            color = enterKeyTransitions(color);
            System.out.println(color);
        }

      //  infinitetrafficLight();



    }

    private static TrafficLight enterKeyTransitions(TrafficLight color) {
        switch(color){
            case RED: return TrafficLight.GREEN;
            case YELLOW: return TrafficLight.RED;
            case GREEN: return TrafficLight.YELLOW;
            default: return TrafficLight.RED;
        }
    }

    private static void infinitetrafficLight() {
        try {
        while (true){
            switch(TrafficLight.RED){
                case RED: System.out.println(TrafficLight.GREEN);
                    TimeUnit.SECONDS.sleep(3);
                case YELLOW: System.out.println(TrafficLight.RED);
                    TimeUnit.SECONDS.sleep(3);
                case GREEN: System.out.println(TrafficLight.YELLOW);
                    TimeUnit.SECONDS.sleep(3);
                default: System.out.println(TrafficLight.RED);
                    TimeUnit.SECONDS.sleep(3);
            }
        }

        }catch (InterruptedException e){
            System.out.println(e.getMessage());
        }
    }
}
