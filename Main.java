

/**
 *
 * @author HP
 */
public class Main {
    public static void main(String[] args) {
        Mahasiswa mhs1 = new Mahasiswa("Amelinda Renjani", "20220040163");
        Mahasiswa2 mhs2 = new Mahasiswa2("Nadine", "12345", "Teknik Informatika");

        // Memanggil method info() dengan overloading
        printInfo(mhs1);
        printInfo(mhs2);
    }

    // Overloading method untuk menangani kedua tipe mahasiswa
    public static void printInfo(Mahasiswa mhs) {
        mhs.info();
        System.out.println("Tingkat: Sarjana");
        System.out.println("================================");
    }

    public static void printInfo(Mahasiswa2 mhs) {
        mhs.info();
        System.out.println("Tingkat: Pascasarjana");
        System.out.println();
    }
}
