package com.pbo.sistemmanajemenlab.model;

/**
 * SUBCLASS - PeralatanElektronik (extends Peralatan)
 * Merepresentasikan peralatan elektronik di laboratorium.
 * 
 * Materi yang diterapkan:
 * - Inheritance (Pert. 6): Mewarisi sifat dari Superclass Peralatan
 * - Encapsulation (Pert. 4): Atribut tambahan bersifat private dengan Getter dan Setter
 */
public class PeralatanElektronik extends Peralatan {

    // Atribut tambahan khusus peralatan elektronik (PRIVATE - Encapsulation)
    private int dayaWatt;
    private String tegangan; // contoh: "220V", "110V"

    // ==================== CONSTRUCTOR ====================
    public PeralatanElektronik(String idPeralatan, String namaPeralatan, String kondisi,
                                int dayaWatt, String tegangan) {
        // Memanggil constructor Superclass (Peralatan) menggunakan super()
        super(idPeralatan, namaPeralatan, kondisi);
        this.dayaWatt = dayaWatt;
        this.tegangan = tegangan;
    }

    // ==================== GETTER & SETTER ====================

    public int getDayaWatt() {
        return dayaWatt;
    }

    public void setDayaWatt(int dayaWatt) {
        this.dayaWatt = dayaWatt;
    }

    public String getTegangan() {
        return tegangan;
    }

    public void setTegangan(String tegangan) {
        this.tegangan = tegangan;
    }

    // ==================== OVERRIDE METHOD ====================

    /**
     * Override method tampilkanInfo() dari Superclass
     * untuk menambahkan informasi spesifik peralatan elektronik
     */
    @Override
    public void tampilkanInfo() {
        System.out.println("  [Peralatan Elektronik]");
        super.tampilkanInfo(); // Memanggil method dari Superclass
        System.out.println("  Daya       : " + dayaWatt + " Watt");
        System.out.println("  Tegangan   : " + tegangan);
    }
}
