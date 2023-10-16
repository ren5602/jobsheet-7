import java.util.Scanner;
public class ForKelipatan19v2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jumlah, kelipatan;
        System.out.print("Masukkan bilangan kelipatan (1-9) : ");
        kelipatan = input.nextInt();
        
        int total=0;
        int counter=0;
        int avarage=0;
        int av=0;

        for(int i = 1; i <= 50; i++){
            if(i % kelipatan == 0){
                total += i;
                counter ++;
            }
        }
        
        avarage = total/counter;
        av=avarage;
        System.out.printf("banyaknya bilangan kelipatan %d dari 1 sampai 50 adalah %d\n", kelipatan, counter );
                System.out.printf("total bilangan kelipatan %d dari 1 sampai 50 adalah %d\n", kelipatan, total );
                System.out.println();
                System.out.printf("rata-rata bilangan kelipatan %d dari 1 sampai 50 adalah %d\n", kelipatan, av);
    }
}
