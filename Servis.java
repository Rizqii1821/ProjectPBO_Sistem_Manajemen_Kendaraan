class Servis {
    private String deskripsi;
    private int biaya;
    private String barang;

    public Servis(String deskripsi, int biaya, String barang) {
        this.deskripsi = deskripsi;
        this.biaya = biaya;
        this.barang = barang;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public int getBiaya() {
        return biaya;
    }

    public String getBarang() {
        return barang;
    }

    public String infoServis() {
        return "Deskripsi: " + deskripsi + ", Biaya: Rp" + biaya + ", Barang: " + barang;
    }
}