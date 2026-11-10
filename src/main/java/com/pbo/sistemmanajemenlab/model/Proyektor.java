package com.pbo.sistemmanajemenlab.model;

public class Proyektor extends Alat {

    // Atribut spesifik proyektor lab (PRIVATE)
    private String resolusi;
    private int kecerahanLumens;

    // ==================== CONSTRUCTOR ====================
    public Proyektor(String idAlat, String namaAlat, String kondisi, 
                     String resolusi, int kecerahanLumens) {
        // Memanggil constructor Superclass (Alat) menggunakan keyword super()
        super(idAlat, namaAlat, kondisi);
        this.resolusi = resolusi;
        this.kecerahanLumens = kecerahanLumens;
    }

    // ==================== GETTER & SETTER ====================
    public String getResolusi() {
        return resolusi;
    }

    public void setResolusi(String resolusi) {
        this.resolusi = resolusi;
    }

    public int getKecerahanLumens() {
        return kecerahanLumens;
    }

    public void setKecerahanLumens(int kecerahanLumens) {
        this.kecerahanLumens = kecerahanLumens;
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("  [Kategori: Proyektor Lab]");
        super.tampilkanInfo(); // Memanggil method milik Superclass
        System.out.println("  Resolusi   : " + resolusi);
        System.out.println("  Kecerahan  : " + kecerahanLumens + " Lumens");
    }
}
