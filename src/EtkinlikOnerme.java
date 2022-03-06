import java.util.Scanner;

public class EtkinlikOnerme {
    public static void main(String[] args) {
        double heat;
        Scanner input= new Scanner(System.in);
        System.out.println("sicaklik kac derece:");
        heat= input.nextDouble();
        if (heat < 5) {
            System.out.println("kayak yapabilirsiniz");

        }else if (heat>=5 && heat <=15){
            System.out.println("sinemaya gidebilirsiniz");
        }else if (heat >15 && heat <= 25){
            System.out.println("piknige gidebilirsiniz");
        }else{
            System.out.println("yuzmeye gidebilirsiniz");
        }

    }
}
