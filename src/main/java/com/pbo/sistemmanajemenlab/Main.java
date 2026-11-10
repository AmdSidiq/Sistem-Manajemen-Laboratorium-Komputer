package com.pbo.sistemmanajemenlab;

import com.pbo.sistemmanajemenlab.model.Peralatan;
import com.pbo.sistemmanajemenlab.model.PeralatanElektronik;
import com.pbo.sistemmanajemenlab.model.PeralatanKimia;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // ==================== 2. CLASS DAN OBJECT (Pert. 3) ====================
        // Menggunakan ArrayList untuk menampung objek-objek Peralatan
        ArrayList<Peralatan> daftarPeralatan = new ArrayList<>();

        // Instansiasi Object Subclass dan menyimpannya sebagai referensi Superclass (Polymorphism dasar/Inheritance)
        daftarPeralatan.add(new PeralatanElektronik("EL-001", "Multimeter Digital", "Baik", 5, "220V"));
        daftarPeralatan.add(new PeralatanElektronik("EL-002", "Osiloskop Digital", "Baik", 45, "220V"));
        daftarPeralatan.add(new PeralatanElektronik("EL-003", "Power Supply DC", "Rusak Ringan", 150, "220V"));
        daftarPeralatan.add(new PeralatanKimia("KM-001", "Gelas Beaker", "Baik", "Kaca Borosilikat", 500));
        daftarPeralatan.add(new PeralatanKimia("KM-002", "Labu Erlenmeyer", "Baik", "Kaca Borosilikat", 250));
        daftarPeralatan.add(new PeralatanKimia("KM-003", "Gelas Ukur", "Rusak Ringan", "Plastik PP", 100));

        // ==================== 1. SCANNER & CONTROL FLOW (Pert. 2) ====================
        Scanner scanner = new Scanner(System.in);
        boolean running = true; // Flag untuk while loop

        System.out.println("=====================================================");
        System.out.println("      SISTEM MANAJEMEN LABORATORIUM KOMPUTER         ");
        System.out.println("=====================================================");

        // CONTROL FLOW: WHILE LOOP
        while (running) {
            System.out.println("\n-------------------- MENU UTAMA --------------------");
            System.out.println("1. Tampilkan Semua Peralatan Lab");
            System.out.println("2. Tambah Peralatan Baru");
            System.out.println("3. Cari Peralatan Berdasarkan ID");
            System.out.println("4. Pinjam Peralatan");
            System.out.println("5. Kembalikan Peralatan");
            System.out.println("0. Keluar Program");
            System.out.println("----------------------------------------------------");
            System.out.print("Pilih opsi menu [0-5]: ");

            int pilihan = -1;

            // CONTROL FLOW: IF / ELSE untuk validasi input angka
            if (scanner.hasNextInt()) {
                pilihan = scanner.nextInt();
                scanner.nextLine(); // membersihkan newline buffer
            } else {
                System.out.println(">> Peringatan: Masukkan angka yang valid!");
                scanner.nextLine(); // membersihkan input string yang salah
                continue;
            }

            // CONTROL FLOW: SWITCH-CASE
            switch (pilihan) {
                case 1:
                    // --- 1. TAMPILKAN SEMUA PERALATAN ---
                    System.out.println("\n=== DAFTAR SELURUH PERALATAN LABORATORIUM ===");
                    if (daftarPeralatan.isEmpty()) {
                        System.out.println("Belum ada peralatan yang tersimpan.");
                    } else {
                        // CONTROL FLOW: FOR LOOP
                        for (int i = 0; i < daftarPeralatan.size(); i++) {
                            System.out.println("\n[Data ke-" + (i + 1) + "]");
                            daftarPeralatan.get(i).tampilkanInfo();
                        }
                    }
                    break;

                case 2:
                    // --- 2. TAMBAH PERALATAN BARU ---
                    System.out.println("\n=== TAMBAH PERALATAN BARU ===");
                    System.out.println("Pilih Kategori Peralatan:");
                    System.out.println("1. Peralatan Elektronik");
                    System.out.println("2. Peralatan Kimia");
                    System.out.print("Pilihan [1/2]: ");

                    int jenis = -1;
                    if (scanner.hasNextInt()) {
                        jenis = scanner.nextInt();
                        scanner.nextLine();
                    } else {
                        System.out.println(">> Input jenis tidak valid!");
                        scanner.nextLine();
                        break;
                    }

                    // Input atribut umum (Superclass)
                    System.out.print("Masukkan ID Peralatan   : ");
                    String id = scanner.nextLine();
                    System.out.print("Masukkan Nama Peralatan : ");
                    String nama = scanner.nextLine();
                    System.out.print("Masukkan Kondisi (Baik / Rusak Ringan / Rusak Berat): ");
                    String kondisi = scanner.nextLine();

                    // CONTROL FLOW: IF - ELSE IF - ELSE
                    if (jenis == 1) {
                        System.out.print("Masukkan Daya Listrik (Watt): ");
                        int daya = scanner.nextInt();
                        scanner.nextLine();
                        System.out.print("Masukkan Tegangan Listrik (misal: 220V): ");
                        String tegangan = scanner.nextLine();

                        // Instansiasi Object PeralatanElektronik (Subclass)
                        PeralatanElektronik pe = new PeralatanElektronik(id, nama, kondisi, daya, tegangan);
                        daftarPeralatan.add(pe);
                        System.out.println(">> Sukses: Peralatan Elektronik berhasil ditambahkan!");

                    } else if (jenis == 2) {
                        System.out.print("Masukkan Bahan Material (misal: Kaca Borosilikat): ");
                        String bahan = scanner.nextLine();
                        System.out.print("Masukkan Kapasitas (ml): ");
                        int kapasitas = scanner.nextInt();
                        scanner.nextLine();

                        // Instansiasi Object PeralatanKimia (Subclass)
                        PeralatanKimia pk = new PeralatanKimia(id, nama, kondisi, bahan, kapasitas);
                        daftarPeralatan.add(pk);
                        System.out.println(">> Sukses: Peralatan Kimia berhasil ditambahkan!");

                    } else {
                        System.out.println(">> Kategori tidak dikenali! Penambahan dibatalkan.");
                    }
                    break;

                case 3:
                    // --- 3. CARI PERALATAN BERDASARKAN ID ---
                    System.out.println("\n=== PENCARIAN PERALATAN ===");
                    System.out.print("Masukkan ID Peralatan yang ingin dicari: ");
                    String cariId = scanner.nextLine();

                    boolean ditemukan = false;
                    for (int i = 0; i < daftarPeralatan.size(); i++) {
                        // Penerapan GETTER (Encapsulation)
                        if (daftarPeralatan.get(i).getIdPeralatan().equalsIgnoreCase(cariId)) {
                            System.out.println("\n>> Peralatan Ditemukan:");
                            daftarPeralatan.get(i).tampilkanInfo();
                            ditemukan = true;
                            break;
                        }
                    }

                    if (!ditemukan) {
                        System.out.println(">> Peralatan dengan ID '" + cariId + "' tidak ditemukan.");
                    }
                    break;

                case 4:
                    // --- 4. PINJAM PERALATAN ---
                    System.out.println("\n=== PEMINJAMAN PERALATAN ===");
                    System.out.print("Masukkan ID Peralatan yang ingin dipinjam: ");
                    String pinjamId = scanner.nextLine();

                    boolean statusPinjam = false;
                    for (int i = 0; i < daftarPeralatan.size(); i++) {
                        if (daftarPeralatan.get(i).getIdPeralatan().equalsIgnoreCase(pinjamId)) {
                            statusPinjam = true;
                            // Penerapan GETTER & SETTER (Encapsulation)
                            if (daftarPeralatan.get(i).isTersedia()) {
                                daftarPeralatan.get(i).setTersedia(false);
                                System.out.println(">> Sukses: Peralatan '" + daftarPeralatan.get(i).getNamaPeralatan() + "' berhasil dipinjam!");
                            } else {
                                System.out.println(">> Gagal: Peralatan ini sedang dipinjam!");
                            }
                            break;
                        }
                    }

                    if (!statusPinjam) {
                        System.out.println(">> Peralatan dengan ID '" + pinjamId + "' tidak ditemukan.");
                    }
                    break;

                case 5:
                    // --- 5. KEMBALIKAN PERALATAN ---
                    System.out.println("\n=== PENGEMBALIAN PERALATAN ===");
                    System.out.print("Masukkan ID Peralatan yang ingin dikembalikan: ");
                    String kembaliId = scanner.nextLine();

                    boolean statusKembali = false;
                    for (int i = 0; i < daftarPeralatan.size(); i++) {
                        if (daftarPeralatan.get(i).getIdPeralatan().equalsIgnoreCase(kembaliId)) {
                            statusKembali = true;
                            if (!daftarPeralatan.get(i).isTersedia()) {
                                daftarPeralatan.get(i).setTersedia(true);
                                System.out.println(">> Sukses: Peralatan '" + daftarPeralatan.get(i).getNamaPeralatan() + "' berhasil dikembalikan ke lab!");
                            } else {
                                System.out.println(">> Informasi: Peralatan ini sudah berada di laboratorium (tidak sedang dipinjam).");
                            }
                            break;
                        }
                    }

                    if (!statusKembali) {
                        System.out.println(">> Peralatan dengan ID '" + kembaliId + "' tidak ditemukan.");
                    }
                    break;

                case 0:
                    // --- KELUAR ---
                    System.out.println("\nTerima kasih telah menggunakan Sistem Manajemen Laboratorium!");
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
