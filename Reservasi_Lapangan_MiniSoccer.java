package com.mycompany.reservasi_lapangan_minisoccer;
import java.util.ArrayList;
import java.util.Scanner;

class Reservasi_Lapangan_MiniSoccer {

    static class Reservasi {
        String namaPemesan;
        String tanggal;
        String jam;
        int durasi; 

        Reservasi(String namaPemesan, String tanggal, String jam, int durasi) {
            this.namaPemesan = namaPemesan;
            this.tanggal = tanggal;
            this.jam = jam;
            this.durasi = durasi;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Reservasi> daftarReservasi = new ArrayList<>();

        while (true) {
            System.out.println("\n=== SISTEM RESERVASI LAPANGAN MINI SOCCER ===");
            System.out.println("1. Tambah Reservasi");
            System.out.println("2. Lihat Reservasi");
            System.out.println("3. Ubah Reservasi");
            System.out.println("4. Hapus Reservasi");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            int menu = input.nextInt();
            input.nextLine();

            if (menu == 1) {
                // Tambah Reservasi
                System.out.print("Nama Pemesan: ");
                String nama = input.nextLine();
                System.out.print("Tanggal (dd-mm-yyyy): ");
                String tanggal = input.nextLine();
                System.out.print("Jam (contoh: 18:00): ");
                String jam = input.nextLine();
                System.out.print("Durasi (jam): ");
                int durasi = input.nextInt();
                input.nextLine();

                daftarReservasi.add(new Reservasi(nama, tanggal, jam, durasi));
                System.out.println("Reservasi berhasil ditambahkan!");

            } else if (menu == 2) {
                // Lihat Reservasi
                if (daftarReservasi.isEmpty()) {
                    System.out.println("Belum ada data reservasi.");
                } else {
                    System.out.println("\n--- Daftar Reservasi ---");
                    for (int i = 0; i < daftarReservasi.size(); i++) {
                        Reservasi r = daftarReservasi.get(i);
                        System.out.println((i+1) + ". " + r.namaPemesan + " - " + r.tanggal + 
                                           " " + r.jam + " (" + r.durasi + " jam)");
                    }
                }

            } else if (menu == 3) {
                // Ubah Reservasi
                if (daftarReservasi.isEmpty()) {
                    System.out.println("Belum ada data reservasi untuk diubah.");
                } else {
                    System.out.print("Masukkan nomor reservasi yang ingin diubah: ");
                    int index = input.nextInt();
                    input.nextLine();
                    if (index > 0 && index <= daftarReservasi.size()) {
                        Reservasi r = daftarReservasi.get(index - 1);
                        System.out.print("Nama Pemesan baru ("+r.namaPemesan+"): ");
                        String nama = input.nextLine();
                        System.out.print("Tanggal baru ("+r.tanggal+"): ");
                        String tanggal = input.nextLine();
                        System.out.print("Jam baru ("+r.jam+"): ");
                        String jam = input.nextLine();
                        System.out.print("Durasi baru ("+r.durasi+" jam): ");
                        int durasi = input.nextInt();
                        input.nextLine();

                        r.namaPemesan = nama;
                        r.tanggal = tanggal;
                        r.jam = jam;
                        r.durasi = durasi;

                        System.out.println("Reservasi berhasil diubah!");
                    } else {
                        System.out.println("Nomor tidak valid.");
                    }
                }

            } else if (menu == 4) {
                // Hapus Reservasi
                if (daftarReservasi.isEmpty()) {
                    System.out.println("Belum ada data reservasi untuk dihapus.");
                } else {
                    System.out.print("Masukkan nomor reservasi yang ingin dihapus: ");
                    int index = input.nextInt();
                    input.nextLine();
                    if (index > 0 && index <= daftarReservasi.size()) {
                        daftarReservasi.remove(index - 1);
                        System.out.println("Reservasi berhasil dihapus!");
                    } else {
                        System.out.println("Nomor tidak valid.");
                    }
                }

            } else if (menu == 5) {
                System.out.println("Terima kasih! Program selesai.");
                break;
            } else {
                System.out.println("Pilihan tidak valid.");
            }
        }

        input.close();
    }
}
