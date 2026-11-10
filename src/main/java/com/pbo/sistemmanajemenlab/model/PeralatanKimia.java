package com.pbo.sistemmanajemenlab.model;

/**
 * SUBCLASS - PeralatanKimia (extends Peralatan)
 * Merepresentasikan peralatan kimia/kaca di laboratorium.
 * 
 * Materi yang diterapkan:
 * - Inheritance (Pert. 6): Mewarisi sifat dari Superclass Peralatan
 * - Encapsulation (Pert. 4): Atribut tambahan bersifat private dengan Getter dan Setter
 */
public class PeralatanKimia extends Peralatan {
    // Atribut tambahan khusus peralatan kimia (PRIVATE - Encapsulation)
    private String bahanMaterial; // contoh: "Kaca Borosilikat", "Plastik PP"
    private int kapasitasMl;     // kapasitas dalam mililiter

    // ==================== CONSTRUCTOR ====================
    public PeralatanKimia(String idPeralatan, String namaPeralatan, String kondisi,
                           String bahanMaterial, int kapasitasMl) {
        // Memanggil constructor Superclass (Peralatan) menggunakan super()
        super(idPeralatan, namaPeralatan, kondisi);
        this.bahanMaterial = bahanMaterial;
        this.kapasitasMl = kapasitasMl;
    }

    // ==================== GETTER & SETTER ====================

    public String getBahanMaterial() {
        return bahanMaterial;
    }

    public void setBahanMaterial(String bahanMaterial) {
        this.bahanMaterial = bahanMaterial;
    }

    public int getKapasitasMl() {
        return kapasitasMl;
    }

    public void setKapasitasMl(int kapasitasMl) {
        this.kapasitasMl = kapasitasMl;
    }

    // ==================== OVERRIDE METHOD ====================

    /**
     * Override method tampilkanInfo() dari Superclass
     * untuk menambahkan informasi spesifik peralatan kimia
     */
    @Override
    public void tampilkanInfo() {
        System.out.println("  [Peralatan Kimia]");
        super.tampilkanInfo(); // Memanggil method dari Superclass
        System.out.println("  Bahan      : " + bahanMaterial);
        System.out.println("  Kapasitas  : " + kapasitasMl + " ml");
    }
}
