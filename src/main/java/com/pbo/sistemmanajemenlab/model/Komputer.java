package com.pbo.sistemmanajemenlab.model;

public class Komputer extends Alat {

    // Atribut spesifik komputer lab (PRIVATE)
    private String processor;
    private int ramGb;
    private String storage;

    // ==================== CONSTRUCTOR ====================
    public Komputer(String idAlat, String namaAlat, String kondisi, 
                    String processor, int ramGb, String storage) {
        // Memanggil constructor Superclass (Alat) menggunakan keyword super()
        super(idAlat, namaAlat, kondisi);
        this.processor = processor;
        this.ramGb = ramGb;
        this.storage = storage;
    }

    // ==================== GETTER & SETTER ====================
    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public int getRamGb() {
        return ramGb;
    }

    public void setRamGb(int ramGb) {
        this.ramGb = ramGb;
    }

    public String getStorage() {
        return storage;
    }

    public void setStorage(String storage) {
        this.storage = storage;
    }

    // ==================== OVERRIDE METHOD ====================
    @Override
    public void tampilkanInfo() {
        System.out.println("  [Kategori: Komputer / PC Lab]");
        super.tampilkanInfo(); // Memanggil method milik Superclass
        System.out.println("  Processor  : " + processor);
        System.out.println("  RAM        : " + ramGb + " GB");
        System.out.println("  Penyimpanan: " + storage);
    }
}
