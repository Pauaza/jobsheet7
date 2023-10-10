import java.util.Scanner;
public class WhileKelipatan25 {
public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
     int kelipatan, total = 0, counter = 0;
    System.out.print("Masukkan bilangan kelipatan (1-9): ");
    kelipatan = scan.nextInt();
   int i = 1;
    while (i <= 50) {
        if (i % kelipatan == 0) {
            total += i;
            counter++;
        }
        System.out.println("Banyaknya bilangan " + kelipatan + "dari 1 sampai 50 adalah " + counter);
        i++;
        System.out.println("Total bilangan kelipatan " + kelipatan + "dari 1 sampai 50 adalah " +  total);
    }
    
}
}

