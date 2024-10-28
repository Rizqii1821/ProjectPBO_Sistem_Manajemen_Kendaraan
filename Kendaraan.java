class Kendaraan {
    private String platNomor; // Encapsulation (private attribute)
    private String merk;
    protected int tahun;
    private int kapasitasMesin;

    // Overloading constructor
    public Kendaraan(String platNomor, String merk, int tahun, int kapasitasMesin) {
        this.platNomor = platNomor;
        this.merk = merk;
        this.tahun = tahun;
        this.kapasitasMesin = kapasitasMesin;
    }

    // Getter dan Setter untuk platNomor (Encapsulation)
    public String getPlatNomor() {
        return platNomor;
    }

    public void setPlatNomor(String platNomor) {
        this.platNomor = platNomor;
    }

    public String getMerk() {
        return merk;
    }

    public String jenisKendaraan() {
        return "Kendaraan Umum"; 
    }

    public String infoKendaraan() {
        return "Plat Nomor: " + platNomor + ", Merk: " + merk + ", Tahun: " + tahun + "Kapasitas Mesin: " + kapasitasMesin + " cc";
    }
}