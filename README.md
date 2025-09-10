f**Sistem Reservasi Lapangan Mini Soccer**

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

ArrayList → untuk menyimpan daftar reservasi (dinamis, bisa nambah/kurang data).

Scanner → untuk membaca input dari user.

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
