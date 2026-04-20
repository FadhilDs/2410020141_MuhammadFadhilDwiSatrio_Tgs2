package Tugas2;

public class Game {

    String namaKarakter;
    int level;

    // Constructor tanpa parameter
    public Game() {
        System.out.println("Game Dimulai");
        namaKarakter = "Balmond";
        level = 15;
    }

    // Constructor dengan parameter
    public Game(String namaKarakter, int level) {
        this.namaKarakter = namaKarakter;
        this.level = level;
    }

    // Method tanpa return
    public void tampilData() {
        System.out.println("Karakter: " + namaKarakter);
        System.out.println("Level: " + level);
    }

    // Method dengan return
    public String getNamaKarakter() {
        return namaKarakter;
    }
}