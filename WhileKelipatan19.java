import java.util.Scanner;
public class WhileKelipatan19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jumlah, kelipatan;
        System.out.print("Masukkan bilangan kelipatan (1-9) : ");
        kelipatan = input.nextInt();
        
        int total=0;
        int counter=0;
        int avarage=0;
        int av=0;

        int i = 1;
        while(i <= 50){
            if(i % kelipatan == 0){
                total += i;
                counter ++;
            }
            i++;
        }
        avarage = total/counter;
        av=avarage;
        System.out.printf("banyaknya bilangan kelipatan %d dari 1 sampai 50 adalah %d\n", kelipatan, counter );
                System.out.printf("total bilangan kelipatan %d dari 1 sampai 50 adalah %d\n", kelipatan, total );
                System.out.println();
                System.out.printf("rata-rata bilangan kelipatan %d dari 1 sampai 50 adalah %d\n", kelipatan, av);
        }
}