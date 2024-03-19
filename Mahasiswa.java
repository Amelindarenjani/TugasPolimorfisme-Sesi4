/**
 *
 * @author HP
 */
public class Mahasiswa {

    private String nama;
    private String nim;

    public Mahasiswa(String nama, String nim) {
        this.nama = nama;
        this.nim = nim;
    }

    public void info() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
    }
}
