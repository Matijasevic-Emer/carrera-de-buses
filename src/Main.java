import bus.Bus;
import java.util.Random;
public class Main {
    public static void main(String[] args) {

        Random random = new Random();
        int randomNumber = random.nextInt(3) + 1; // Genera un numero aleatorio entre 1 y 3
        System.out.println();

        Bus bus1 = new Bus("ARGENTINA", 0);
        Bus bus2 = new Bus("URUGUAY", 0);

        for (int i = 0; i < 55; i++) {
            try {
                Thread.sleep(250);
            } catch (InterruptedException e) {

                e.printStackTrace();

                break;
            }
            randomNumber = random.nextInt(3) + 1;
            System.out.println();
            System.out.println();
            bus1.paint(bus1.getTrace());
            bus1.sumTrace(randomNumber);
            System.out.println();
            System.out.println("_________________________________________________________________________________________________________________________________________________________________________________________________");
            System.out.println();
            randomNumber = random.nextInt(3) + 1;
            bus2.paint(bus2.getTrace());
            bus2.sumTrace(randomNumber);
        }
        System.out.println();
        System.out.println("======================================================================================");

        if (bus1.getTrace()> bus2.getTrace()){
            System.out.println("PALIZAAAA DE "+bus1.getName()+" !!!!!! VMOSS CARAJO!!!");
        }else {
            System.out.println("QUE LOCURA GANÓ "+bus2.getName()+" !!!!!! PAPAAAA!!!!");
        }
        System.out.println("======================================================================================");
    }
}