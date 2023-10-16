import java.util.Scanner;
public class DoWhileCuti19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jumlahHari, jatahCuti;
        String konfirmasi;

        System.out.print("Jatah cuti: ");
        jatahCuti = input.nextInt();

        do{
            System.out.print("apakah anda ingin mengambil cuti (y/t)? ");
            konfirmasi = input.next();
            if(konfirmasi.equalsIgnoreCase("y")){
                System.out.print("jumlahHari: ");
                jumlahHari = input.nextInt();

                if(jumlahHari <= jatahCuti){
                    jatahCuti -= jumlahHari;
                    System.out.println("Sisa jatah cuti: "+jatahCuti);
                }else{
                    System.out.println("sisah jatah cuti tidak mencukupi");
                    break;
                }
            }
        } while(jatahCuti > 0);
    }
}
