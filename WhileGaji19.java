import java.util.Scanner;
public class WhileGaji19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jumlahKaryawan, jumlahJamLembur;
        double gajiLembur = 0, totalGajiLembur = 0;
        String jabatan;
        System.out.print("Masukkan jumlah karyawan : ");
        jumlahKaryawan = input.nextInt();

        int i = 0;
        while (i < jumlahKaryawan) {
            System.out.println("Pilihan jabatan - Direktur, Manajer, Karyawan");
            System.out.print("Masukkan jabatan ke-" +(i+1)+" : ");
            jabatan = input.next();
            System.out.print("Masukkan jumlah jam lembur : ");
            jumlahJamLembur = input.nextInt();
            i++;
            if(jabatan.equalsIgnoreCase("direktur")){
                continue;
            }
            else if(jabatan.equalsIgnoreCase("manajer")){
                gajiLembur = jumlahJamLembur * 100000;
            }
            else if(jabatan.equalsIgnoreCase("karyawan")){
                gajiLembur = jumlahJamLembur * 75000;
                
            }
                totalGajiLembur += gajiLembur;
        }
        System.out.println("Total gaji lembur : "+totalGajiLembur);
    }
}
