import java.util.Scanner;

/**
 * Nama     : M.Hongki Alfikram
 * Kelas    : IF10K
 * NIM      : 10119915
 */
 
public class PBOIF10K10119915Latihan37 {
    public static void main(String[] args) {
        int jumlahMhs;
        Scanner scanner = new Scanner(System.in);
        RatarataNilai Ratarata = new RatarataNilai();
        
        System.out.print("Masukan Banyaknya Mahasiswa : ");
        jumlahMhs = scanner.nextInt();
        
        Ratarata.hitungNilai(jumlahMhs);
        double jumlahNilai;
        System.out.println("\n" + "Rata Rata Nilainya adalah : " + 
        Ratarata.hitungRatarataNilai(Ratarata.jumlahNilai,jumlahMhs));
    } 
}