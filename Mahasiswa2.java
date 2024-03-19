

/**
 *
 * @author HP
 */
public class Mahasiswa2 extends Mahasiswa {
    private String prodi;

    public Mahasiswa2(String nama, String nim, String prodi) {
        super(nama, nim);
        this.prodi = prodi;
    }

    @Override
    public void info() {
        super.info();
        System.out.println("Program Studi: " + prodi);
    }
}


