class Motor extends Kendaraan {
    private String tipeMotor;

    public Motor(String platNomor, String merk, int tahun, int kapasitasMesin, String tipeMotor) {
        super(platNomor, merk, tahun, kapasitasMesin); 
        this.tipeMotor = tipeMotor;
    }

    public String jenisKendaraan() {
        return "Motor";
    }

    public String infoKendaraan() {
        return super.infoKendaraan() + ", Tipe Motor: " + tipeMotor;
    }
}