import java.util.ArrayList;
import java.util.Scanner;

/**
 * Kelas {@code MoodTrackerAfter} digunakan untuk mencatat dan menampilkan mood harian pengguna.
 * <p>
 * Aplikasi ini memungkinkan pengguna untuk:
 * <ul>
 *     <li>Menambahkan catatan mood berdasarkan tanggal</li>
 *     <li>Melihat seluruh riwayat mood yang sudah dimasukkan</li>
 *     <li>Keluar dari program</li>
 * </ul>
 *
 * Program berjalan secara interaktif di terminal/console.
 *
 * @author
 * @version 1.0
 */
public class MoodTrackerAfter {

    /** Daftar seluruh entri mood yang telah dimasukkan pengguna */
    private ArrayList<MoodEntry> entries;

    /** Scanner untuk membaca input pengguna */
    private Scanner input;

    /**
     * Konstruktor utama untuk inisialisasi list entri mood dan input scanner.
     */
    public MoodTrackerAfter() {
        entries = new ArrayList<>();
        input = new Scanner(System.in);
    }

    /**
     * Metode utama untuk menjalankan aplikasi Mood Tracker.
     * <p>
     * Program akan menampilkan menu secara berulang hingga pengguna memilih untuk keluar.
     */
    public void start() {
        boolean running = true;
        while (running) {
            showMenu();
            int choice = getUserChoice();
            switch (choice) {
                case 1 -> addMood();
                case 2 -> showAllMoods();
                case 3 -> running = false;
                default -> System.out.println("Pilihan tidak valid!");
            }
        }
    }

    /**
     * Menampilkan menu utama aplikasi ke layar pengguna.
     */
    private void showMenu() {
        System.out.println("\n=== Mood Tracker ===");
        System.out.println("1. Tambah Mood");
        System.out.println("2. Lihat Semua Mood");
        System.out.println("3. Keluar");
        System.out.print("Pilih menu: ");
    }

    /**
     * Membaca dan memvalidasi input angka dari pengguna untuk pilihan menu.
     *
     * @return pilihan menu yang dimasukkan pengguna
     */
    private int getUserChoice() {
        while (!input.hasNextInt()) {
            System.out.println("Masukkan angka yang valid!");
            input.next();
        }
        int choice = input.nextInt();
        input.nextLine(); // membuang newline agar input berikutnya tidak terlewat
        return choice;
    }

    /**
     * Menambahkan catatan mood baru berdasarkan input pengguna.
     * <p>
     * Pengguna diminta untuk memasukkan tanggal dan deskripsi mood.
     */
    private void addMood() {
        System.out.print("Masukkan tanggal (YYYY-MM-DD): ");
        String date = input.nextLine();
        System.out.print("Bagaimana mood kamu hari ini? ");
        String mood = input.nextLine();
        entries.add(new MoodEntry(date, mood));
        System.out.println("Mood berhasil ditambahkan!");
    }

    /**
     * Menampilkan seluruh riwayat mood yang telah dicatat pengguna.
     * <p>
     * Jika belum ada entri, sistem akan menampilkan pesan bahwa data masih kosong.
     */
    private void showAllMoods() {
        System.out.println("\n=== Riwayat Mood ===");
        if (entries.isEmpty()) {
            System.out.println("Belum ada data mood.");
        } else {
            entries.forEach(System.out::println);
        }
    }

    /**
     * Metode utama program. Membuat objek {@code MoodTrackerAfter} dan menjalankan aplikasi.
     *
     * @param args argumen baris perintah (tidak digunakan dalam program ini)
     */
    public static void main(String[] args) {
        new MoodTrackerAfter().start();
    }
}
