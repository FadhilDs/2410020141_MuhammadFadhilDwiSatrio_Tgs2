package akademis;

public class main {
    public static void main(String[] args) {

        // Object Mahasiswa
        Mahasiswa mhs = new Mahasiswa("2410020160", "Anisa", 3.8, 4);
        mhs.tampil();

        System.out.println("------------------");

        // Object MataKuliah
        MataKuliah mk = new MataKuliah("IF101", "Pemrograman");
        mk.tampil();
    }
}