import java.util.Scanner;

public class Tugaskelompok7 {
    public static void main(String[] args) {
        Scanner input19 = new Scanner(System.in);
        String pilihBuku, isTersedia, isBeli;

        while (true) {
            System.out.println("______________________________");
            System.out.println("______________________________");
            System.out.println("         Daftar Buku          ");
            System.out.println("------------------------------");
            System.out.println("Sistem Perpustakaan Diponegoro");
            System.out.println("______________________________");
            System.out.println("Buku A");
            System.out.println("Buku B");
            System.out.println("Buku C");
            System.out.println("Masukkan Nama Buku : ");

            isTersedia = input19.nextLine();
            
            if (isTersedia.equalsIgnoreCase("Buku A")) {
                System.out.println("                              ");
                System.out.println("Buku ini tersedia");
                System.out.println("Apakah anda ingin menambahkan buku kedalam keranjang (ya/tidak) ? ");
                isBeli = input19.nextLine();
                
                if (isBeli.equals("ya")) {
                    System.out.println("                              ");
                    System.out.println("Buku berhasil ditambahkan silahkan membayar dikasir.");
                    System.out.println("                              ");
                    System.out.println("                              ");
                    System.out.println("Apakah Anda ingin melihat daftar buku lagi (ya/tidak) ? ");
                    pilihBuku = input19.nextLine();
                    if (!pilihBuku.equals("ya")) {
                        break; // Keluar dari loop jika tidak ingin melihat daftar buku lagi
                    }
                } else {
                    System.out.println("Apakah Anda ingin melihat daftar buku lagi (iya/tidak) ? ");
                    pilihBuku = input19.nextLine();
                    if (!pilihBuku.equals("ya")) {
                        break; // Keluar dari loop jika tidak ingin melihat daftar buku lagi
                    }
                }
            }
            
            if (isTersedia.equalsIgnoreCase ("Buku B")) {
                    System.out.println("                              ");
                    System.out.println("Buku ini tersedia");
                    System.out.println("Apakah anda ingin menambahkan buku kedalam keranjang (ya/tidak) ? ");
                    isBeli = input19.nextLine();
                    
                    if (isBeli.equals("ya")) {
                        System.out.println("                              ");
                        System.out.println("Buku berhasil ditambahkan silahkan membayar dikasir.");
                        System.out.println("                              ");
                        System.out.println("                              ");
                        System.out.println("Apakah Anda ingin melihat daftar buku lagi (ya/tidak) ? ");
                        pilihBuku = input19.nextLine();
                        if (!pilihBuku.equals("ya")) {
                            break; // Keluar dari loop jika tidak ingin melihat daftar buku lagi
                        }
                    } else {
                        System.out.println("Apakah Anda ingin melihat daftar buku lagi (iya/tidak) ? ");
                        pilihBuku = input19.nextLine();
                        if (!pilihBuku.equals("ya")) {
                            break; // Keluar dari loop jika tidak ingin melihat daftar buku lagi
                        }
                    }
            }

                        
                    
        }
        input19.close();
    }
}