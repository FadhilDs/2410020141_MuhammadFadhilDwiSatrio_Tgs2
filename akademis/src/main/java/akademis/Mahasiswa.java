package akademis;

public class Mahasiswa {
    String npm;
    String nama;
    double ipk;
    int semester;

    // Constructor
    public Mahasiswa(String npm, String nama, double ipk, int semester) {
        this.npm = npm;
        this.nama = nama;
        this.ipk = ipk;
        this.semester = semester;
    }

    // Method tampil data
    public void tampil() {
        System.out.println("NPM: " + npm);
        System.out.println("Nama: " + nama);
        System.out.println("IPK: " + ipk);
        System.out.println("Semester: " + semester);
    }
}