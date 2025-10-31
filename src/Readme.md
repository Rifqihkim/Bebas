#  Mood Tracker After

Aplikasi **Mood Tracker After** adalah program berbasis console sederhana yang dibuat menggunakan bahasa **Java**.  
Program ini memungkinkan pengguna untuk **mencatat dan melihat suasana hati (mood)** berdasarkan tanggal.

---

##  Deskripsi Singkat
Aplikasi ini membantu pengguna mencatat bagaimana perasaannya setiap hari, misalnya "Bahagia", "Sedih", "Lelah", dll.  
Data mood disimpan sementara dalam memori (ArrayList), dan dapat ditampilkan kapan saja selama program berjalan.

---

##  Fitur Utama
-  **Tambah Mood:**  
  Pengguna dapat menambahkan entri mood dengan memasukkan tanggal dan deskripsi perasaan.

-  **Lihat Semua Mood:**  
  Menampilkan daftar semua mood yang pernah dicatat.

- **Keluar dari Aplikasi:**  
  Menutup program dengan aman.

---

##  Struktur Program

### 1. `MoodEntry.java`
Kelas ini merepresentasikan **satu entri mood** yang terdiri dari:
- `date` → tanggal pencatatan (format: YYYY-MM-DD)
- `mood` → deskripsi mood pengguna  
  Memiliki konstruktor, getter, dan `toString()` untuk menampilkan entri dalam format teks.

```java
class MoodEntry {
    private String date;
    private String mood;

    public MoodEntry(String date, String mood) {
        this.date = date;
        this.mood = mood;
    }

    public String getDate() { return date; }
    public String getMood() { return mood; }

    @Override
    public String toString() {
        return date + " - " + mood;
    }
}
