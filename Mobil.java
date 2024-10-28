class Mobil extends Kendaraan {
    private String tipeMobil;

    public Mobil(String platNomor, String merk, int tahun, int kapasitasMesin, String tipeMobil) {
        super(platNomor, merk, tahun, kapasitasMesin); 
        this.tipeMobil = tipeMobil;
    }

    public String jenisKendaraan() {
        return "Mobil";
    }

    public String infoKendaraan() {
        return super.infoKendaraan() + ", Tipe Mobil: " + tipeMobil;
    }
}