import java.util.ArrayList;
import java.util.List;

class Bengkel {
    private String namaBengkel;
    private List<Kendaraan> kendaraanList;
    private List<Pelanggan> pelangganList;
    private List<String> riwayatServis;

    public Bengkel(String namaBengkel) {
        this.namaBengkel = namaBengkel;
        this.kendaraanList = new ArrayList<>();
        this.pelangganList = new ArrayList<>();
        this.riwayatServis = new ArrayList<>();
    }

    public String getNamaBengkel() {
        return namaBengkel;
    }

    public void tambahKendaraan(Kendaraan kendaraan) {
        kendaraanList.add(kendaraan);
    }

    public void tambahPelanggan(Pelanggan pelanggan) {
        pelangganList.add(pelanggan);
    }

    public void catatServis(Pelanggan pelanggan, Kendaraan kendaraan, Servis layanan) {
        String riwayat = "Pelanggan: " + pelanggan.infoPelanggan() + 
                         "\nKendaraan: " + kendaraan.infoKendaraan() + 
                         "\nLayanan: " + layanan.infoServis();
        riwayatServis.add(riwayat);
    }

    public void tampilkanRiwayatServis() {
        for (int i = 0; i < riwayatServis.size(); i++) {
            System.out.println("Riwayat " + (i + 1) + ":");
            System.out.println(riwayatServis.get(i));
            System.out.println();
        }
    }
}