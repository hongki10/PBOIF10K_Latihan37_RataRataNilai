import java.util.Scanner;

/**
 * Nama     : M.Hongki Alfikram
 * Kelas    : IF10K
 * NIM      : 10119915
 */
 
class RatarataNilai {
    double Ratarata;
    double jumlahNilai = 0;
    
    public void hitungNilai(int jumlahMhs){
        int i;
        double nilai;
        Scanner scanner = new Scanner(System.in);
        
        for (i = 1; i <= jumlahMhs; i++) {
            System.out.print("Nilai Mahasiswa ke-" + i + " : ");
            nilai = scanner.nextDouble();
            jumlahNilai = jumlahNilai + nilai;
        }
    }
    
    public double hitungRatarataNilai(double jumlahNilai, int jumlahMhs) {
        Ratarata = jumlahNilai / jumlahMhs;
        return Ratarata;
    }
    
}