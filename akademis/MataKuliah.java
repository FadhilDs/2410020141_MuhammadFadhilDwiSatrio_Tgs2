package akademis;

public class MataKuliah {
    String kode_mk;
    String nama_mk;

    public MataKuliah(String kode_mk, String nama_mk) {
        this.kode_mk = kode_mk;
        this.nama_mk = nama_mk;
    }

    public void tampil() {
        System.out.println("Kode MK: " + kode_mk);
        System.out.println("Nama MK: " + nama_mk);
    }
}