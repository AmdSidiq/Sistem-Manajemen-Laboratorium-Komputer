package com.pbo.sistemmanajemenlab;

import com.pbo.sistemmanajemenlab.model.Alat;
import com.pbo.sistemmanajemenlab.model.Komputer;
import com.pbo.sistemmanajemenlab.model.Proyektor;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * ============================================================
 *        SISTEM MANAJEMEN LABORATORIUM KOMPUTER
 *        Project Akhir - Pemrograman Berorientasi Objek (Tugas 4)
 * ============================================================
 * 
 * 4 Materi OOP yang diimplementasikan:
 * 1. Input Scanner & Control Flow (Pert. 2)
 *    - Menggunakan Scanner untuk membaca input dari keyboard
 *    - Menggunakan while, switch-case, if/else, dan for loop
 * 
 * 2. Class dan Object (Pert. 3)
 *    - Struktur kode dipisahkan dalam Class terpisah (model: Alat, Komputer, Proyektor)
 *    - Instansiasi Object dilakukan di main class ini
 * 
 * 3. Encapsulation (Pert. 4)
 *    - Seluruh atribut model bersifat private
 *    - Akses data menggunakan Getter dan Setter
 * 
 * 4. Inheritance (Pert. 6)
 *    - Komputer extends Alat (Superclass -> Subclass)
 *    - Proyektor extends Alat (Superclass -> Subclass)
 */
public class Main {

    public static void main(String[] args) {

        // ==================== 2. CLASS DAN OBJECT (Pert. 3) ====================
        // Menggunakan ArrayList untuk menampung koleksi objek Alat laboratorium komputer
        ArrayList<Alat> daftarAlat = new ArrayList<>();

        // Instansiasi Object dari Subclass (Komputer & Proyektor) dan disimpan pada referensi Superclass (Alat)
        // Menerapkan konsep INHERITANCE (Pert. 6)
        daftarAlat.add(new Komputer("PC-001", "PC Workstation Lab 1", "Baik", "Intel Core i7-12700", 32, "1 TB NVMe SSD"));
        daftarAlat.add(new Komputer("PC-002", "PC Client Lab 1", "Baik", "Intel Core i5-11400", 16, "512 GB SSD"));
        daftarAlat.add(new Komputer("PC-003", "PC Client Lab 2", "Rusak Ringan", "Intel Core i3-10100", 8, "256 GB SSD"));
        daftarAlat.add(new Proyektor("PRJ-001", "Proyektor Epson EB-E01", "Baik", "1024x768 (XGA)", 3300));
        daftarAlat.add(new Proyektor("PRJ-002", "Proyektor BenQ MX560", "Baik", "1920x1080 (Full HD)", 4000));
        daftarAlat.add(new Proyektor("PRJ-003", "Proyektor InFocus IN112x", "Rusak Ringan", "800x600 (SVGA)", 3800));

        // ==================== 1. SCANNER & CONTROL FLOW (Pert. 2) ====================
        Scanner scanner = new Scanner(System.in);
        boolean running = true; // Variabel kontrol perulangan WHILE

        System.out.println("=====================================================");
        System.out.println("     SISTEM MANAJEMEN LABORATORIUM KOMPUTER         ");
        System.out.println("   Tugas 4 - Pemrograman Berorientasi Objek (PBO)   ");
        System.out.println("=====================================================");

        // CONTROL FLOW: WHILE LOOP
        while (running) {
            System.out.println("\n-------------------- MENU UTAMA --------------------");
            System.out.println("1. Tampilkan Semua Alat Lab Komputer");
            System.out.println("2. Tambah Alat Baru");
            System.out.println("3. Cari Alat Berdasarkan ID");
            System.out.println("4. Pinjam Alat");
            System.out.println("5. Kembalikan Alat");
            System.out.println("0. Keluar Program");
            System.out.println("----------------------------------------------------");
            System.out.print("Pilih opsi menu [0-5]: ");

            int pilihan = -1;

            // CONTROL FLOW: IF / ELSE untuk validasi input angka
            if (scanner.hasNextInt()) {
                pilihan = scanner.nextInt();
                scanner.nextLine(); // membersihkan newline buffer
            } else {
                System.out.println(">> Peringatan: Masukkan angka menu yang valid!");
                scanner.nextLine(); // membersihkan input salah
                continue;
            }

            // CONTROL FLOW: SWITCH-CASE
            switch (pilihan) {
                case 1:
                    // --- 1. TAMPILKAN SEMUA ALAT ---
                    System.out.println("\n=== DAFTAR SELURUH ALAT LABORATORIUM KOMPUTER ===");
                    if (daftarAlat.isEmpty()) {
                        System.out.println("Belum ada alat yang tersimpan di lab.");
                    } else {
                        // CONTROL FLOW: FOR LOOP
                        for (int i = 0; i < daftarAlat.size(); i++) {
                            System.out.println("\n[Data Alat ke-" + (i + 1) + "]");
                            // Memanggil method yang telah di-override di Subclass
                            daftarAlat.get(i).tampilkanInfo();
                        }
                    }
                    break;

                case 2:
                    // --- 2. TAMBAH ALAT BARU ---
                    System.out.println("\n=== TAMBAH ALAT BARU KE LAB KOMPUTER ===");
                    System.out.println("Pilih Kategori Alat:");
                    System.out.println("1. Komputer / PC Lab");
                    System.out.println("2. Proyektor Lab");
                    System.out.print("Pilihan [1/2]: ");

                    int kategori = -1;
                    if (scanner.hasNextInt()) {
                        kategori = scanner.nextInt();
                        scanner.nextLine();
                    } else {
                        System.out.println(">> Input pilihan kategori tidak valid!");
                        scanner.nextLine();
                        break;
                    }

                    // Input atribut umum (Superclass Alat)
                    System.out.print("Masukkan ID Alat   : ");
                    String id = scanner.nextLine();
                    System.out.print("Masukkan Nama Alat : ");
                    String nama = scanner.nextLine();
                    System.out.print("Masukkan Kondisi (Baik / Rusak Ringan / Rusak Berat): ");
                    String kondisi = scanner.nextLine();

                    // CONTROL FLOW: IF - ELSE IF - ELSE
                    if (kategori == 1) {
                        // Input spesifik komputer
                        System.out.print("Masukkan Processor (misal: Intel Core i5): ");
                        String processor = scanner.nextLine();
                        System.out.print("Masukkan Kapasitas RAM (GB): ");
                        int ram = scanner.nextInt();
                        scanner.nextLine();
                        System.out.print("Masukkan Penyimpanan/Storage (misal: 512 GB SSD): ");
                        String storage = scanner.nextLine();

                        // Instansiasi Object Komputer (Subclass)
                        Komputer komputerBaru = new Komputer(id, nama, kondisi, processor, ram, storage);
                        daftarAlat.add(komputerBaru);
                        System.out.println(">> Sukses: Data Komputer berhasil ditambahkan ke inventaris lab!");

                    } else if (kategori == 2) {
                        // Input spesifik proyektor
                        System.out.print("Masukkan Resolusi (misal: 1920x1080): ");
                        String resolusi = scanner.nextLine();
                        System.out.print("Masukkan Tingkat Kecerahan (Lumens): ");
                        int lumens = scanner.nextInt();
                        scanner.nextLine();

                        // Instansiasi Object Proyektor (Subclass)
                        Proyektor proyektorBaru = new Proyektor(id, nama, kondisi, resolusi, lumens);
                        daftarAlat.add(proyektorBaru);
                        System.out.println(">> Sukses: Data Proyektor berhasil ditambahkan ke inventaris lab!");

                    } else {
                        System.out.println(">> Kategori tidak dikenali! Penambahan dibatalkan.");
                    }
                    break;

                case 3:
                    // --- 3. CARI ALAT BERDASARKAN ID ---
                    System.out.println("\n=== PENCARIAN ALAT LAB KOMPUTER ===");
                    System.out.print("Masukkan ID Alat yang ingin dicari: ");
                    String cariId = scanner.nextLine();

                    boolean ditemukan = false;
                    for (int i = 0; i < daftarAlat.size(); i++) {
                        // Penerapan GETTER (Encapsulation)
                        if (daftarAlat.get(i).getIdAlat().equalsIgnoreCase(cariId)) {
                            System.out.println("\n>> Alat Ditemukan:");
                            daftarAlat.get(i).tampilkanInfo();
                            ditemukan = true;
                            break;
                        }
                    }

                    if (!ditemukan) {
                        System.out.println(">> Alat dengan ID '" + cariId + "' tidak ditemukan di lab.");
                    }
                    break;

                case 4:
                    // --- 4. PINJAM ALAT ---
                    System.out.println("\n=== PEMINJAMAN ALAT LAB KOMPUTER ===");
                    System.out.print("Masukkan ID Alat yang ingin dipinjam: ");
                    String pinjamId = scanner.nextLine();

                    boolean statusPinjam = false;
                    for (int i = 0; i < daftarAlat.size(); i++) {
                        if (daftarAlat.get(i).getIdAlat().equalsIgnoreCase(pinjamId)) {
                            statusPinjam = true;
                            // Penerapan GETTER & SETTER (Encapsulation)
                            if (daftarAlat.get(i).isTersedia()) {
                                daftarAlat.get(i).setTersedia(false);
                                System.out.println(">> Sukses: Alat '" + daftarAlat.get(i).getNamaAlat() + "' berhasil dipinjam!");
                            } else {
                                System.out.println(">> Gagal: Alat ini sedang dipinjam oleh pengguna lain!");
                            }
                            break;
                        }
                    }

                    if (!statusPinjam) {
                        System.out.println(">> Alat dengan ID '" + pinjamId + "' tidak ditemukan di lab.");
                    }
                    break;

                case 5:
                    // --- 5. KEMBALIKAN ALAT ---
                    System.out.println("\n=== PENGEMBALIAN ALAT LAB KOMPUTER ===");
                    System.out.print("Masukkan ID Alat yang ingin dikembalikan: ");
                    String kembaliId = scanner.nextLine();

                    boolean statusKembali = false;
                    for (int i = 0; i < daftarAlat.size(); i++) {
                        if (daftarAlat.get(i).getIdAlat().equalsIgnoreCase(kembaliId)) {
                            statusKembali = true;
                            if (!daftarAlat.get(i).isTersedia()) {
                                daftarAlat.get(i).setTersedia(true);
                                System.out.println(">> Sukses: Alat '" + daftarAlat.get(i).getNamaAlat() + "' telah berhasil dikembalikan ke lab!");
                            } else {
                                System.out.println(">> Informasi: Alat ini sudah ada di laboratorium (tidak sedang dipinjam).");
                            }
                            break;
                        }
                    }

                    if (!statusKembali) {
                        System.out.println(">> Alat dengan ID '" + kembaliId + "' tidak ditemukan di lab.");
                    }
                    break;

                case 0:
                    // --- KELUAR ---
                    System.out.println("\nTerima kasih telah menggunakan Sistem Manajemen Laboratorium Komputer!");
                    System.out.println("Program selesai.");
                    running = false;
                    break;

                default:
                    System.out.println(">> Menu tidak valid! Masukkan angka antara 0 sampai 5.");
                    break;
            }
        }

        scanner.close();
    }
}
