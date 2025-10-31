/**
 * Kelas {@code MoodEntry} digunakan untuk menyimpan satu entri data mood pengguna.
 * <p>
 * Setiap entri terdiri dari:
 * <ul>
 *     <li>Tanggal pencatatan mood</li>
 *     <li>Deskripsi mood pengguna pada tanggal tersebut</li>
 * </ul>
 *
 * Kelas ini biasanya digunakan bersama dengan {@code MoodTrackerAfter} untuk mencatat dan
 * menampilkan riwayat mood harian pengguna.
 *
 * <p><b>Contoh penggunaan:</b>
 * <pre>
 * MoodEntry entry = new MoodEntry("2025-10-31", "Bahagia");
 * System.out.println(entry); // Output: 2025-10-31 - Bahagia
 * </pre>
 * </p>
 *
 * @author
 * @version 1.0
 */
class MoodEntry {

    /** Tanggal pencatatan mood dalam format YYYY-MM-DD */
    private String date;

    /** Deskripsi mood pengguna pada tanggal tersebut */
    private String mood;

    /**
     * Membuat objek {@code MoodEntry} baru dengan tanggal dan mood yang ditentukan.
     *
     * @param date tanggal pencatatan mood (format: YYYY-MM-DD)
     * @param mood deskripsi mood pengguna, misalnya "Senang", "Sedih", atau "Lelah"
     */
    public MoodEntry(String date, String mood) {
        this.date = date;
        this.mood = mood;
    }

    /**
     * Mengambil nilai tanggal dari entri mood.
     *
     * @return tanggal mood dicatat dalam format YYYY-MM-DD
     */
    public String getDate() {
        return date;
    }

    /**
     * Mengambil deskripsi mood pengguna.
     *
     * @return mood pengguna pada tanggal tertentu
     */
    public String getMood() {
        return mood;
    }

    /**
     * Mengembalikan representasi teks dari entri mood.
     * <p>
     * Format output: {@code "YYYY-MM-DD - Mood"}
     *
     * @return representasi string dari entri mood
     */
    @Override
    public String toString() {
        return date + " - " + mood;
    }
}
