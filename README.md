**Sistem Reservasi Lapangan Mini Soccer**

Program ini merupakan aplikasi sederhana berbasis Java untuk melakukan manajemen reservasi lapangan mini soccer.
Pengguna dapat menambahkan, melihat, mengubah, dan menghapus data reservasi menggunakan menu interaktif di terminal/console.

**Fitur Utama**
1.Tambah Reservasi

Pengguna dapat memasukkan data reservasi berupa:
Nama pemesan

Tanggal (dd-mm-yyyy)

Jam (contoh: 18:00)

Durasi pemakaian (dalam jam)

2.Lihat Reservasi

Menampilkan seluruh data reservasi yang sudah tersimpan.

3.Ubah Reservasi

Pengguna dapat mengubah data reservasi berdasarkan nomor urut yang ditampilkan, baik sebagian maupun seluruh data.

4.Hapus Reservasi

Menghapus reservasi berdasarkan nomor urut pada daftar reservasi.

5.Keluar Program

Menghentikan eksekusi program.



**Penjelasan kode Program**

1. Import Library

<img width="352" height="52" alt="image" src="https://github.com/user-attachments/assets/15417eef-69e7-49c3-86f8-9d359655646d" />

- ArrayList → untuk menyimpan daftar reservasi (dinamis, bisa nambah/kurang data).

- Scanner → untuk membaca input dari user.

2. Class Main dan Class Reservasi

<img width="809" height="350" alt="image" src="https://github.com/user-attachments/assets/225dc472-6071-4c52-ad80-33788b4afdfb" />

- Class Main → program utama.

- Class Reservasi (inner class) → untuk menyimpan 1 data reservasi:

  - namaPemesan (nama orang yang booking)

  - tanggal (tanggal reservasi)

  - jam (jam mulai main)

  - durasi (berapa lama main, dalam jam)

- Constructor (Reservasi(...)) digunakan untuk mengisi data saat objek dibuat.

3. main Method

 <img width="660" height="81" alt="image" src="https://github.com/user-attachments/assets/21bf21af-ccd5-449d-afda-7f2097935443" />

- Scanner input → baca input user dari keyboard.

- ArrayList daftarReservasi → tempat nyimpen semua data reservasi.

4. Loop Menu Utama

   <img width="729" height="230" alt="image" src="https://github.com/user-attachments/assets/e48c6ac5-76c6-46d5-9aad-8f5a8331bed9" />

- while(true) → program jalan terus sampai user pilih keluar.

- menu (1–5) → pilihan user untuk jalankan fitur tertentu.

5. Tambah Reservasi

<img width="820" height="649" alt="image" src="https://github.com/user-attachments/assets/27ffc699-d6f2-4b60-9966-4e2e156a5b21" />

<img width="781" height="443" alt="image" src="https://github.com/user-attachments/assets/dde6c3a0-8ef5-4314-b66e-eab4e8c0f83f" />

- User isi nama, tanggal, jam, durasi (dengan validasi input).

- Data dimasukkan ke daftarReservasi (pakai add).

6. Lihat Reservasi

<img width="808" height="292" alt="image" src="https://github.com/user-attachments/assets/ceb2eefc-eeb-428c-933a-e07b34b5b67c" />

- Kalau ArrayList kosong → tampilkan pesan belum ada data.

- Kalau ada → tampilkan semua reservasi (loop pakai for).

7. Ubah Reservasi

<img width="892" height="677" alt="image" src="https://github.com/user-attachments/assets/71173cbc-d4f3-4eaf-a3fd-e254ef3d5087" />

<img width="769" height="681" alt="image" src="https://github.com/user-attachments/assets/4d1bcdba-5035-4f8e-8988-aa0e17db064c" />

<img width="771" height="436" alt="image" src="https://github.com/user-attachments/assets/48d521c3-aef4-4dc5-9577-d81bf2d074ba" />

- User pilih nomor reservasi yang ingin diubah.

- Bisa ubah satu data saja (misal hanya jam), atau semua sekaligus.

= Kalau input kosong/0 → data lama tetap dipakai.

8. Hapus Reservasi

<img width="738" height="362" alt="image" src="https://github.com/user-attachments/assets/5ecaf150-62b8-4d35-b42c-1c8f0f27b3fc" />

-  User pilih nomor reservasi.

-  -Kalau valid -> data dihapus (remove)

9. Keluar Program

<img width="671" height="175" alt="image" src="https://github.com/user-attachments/assets/6a4c24ac-52a1-434b-bc1f-d31460f2f934" />

- Menutup loop while(true) dan menghentikan program.

10. Penutup

<img width="308" height="98" alt="image" src="https://github.com/user-attachments/assets/9876a272-f5b9-4d0c-b732-c1f8e5362d3d" />

- Scanner ditutup setelah program selesai
