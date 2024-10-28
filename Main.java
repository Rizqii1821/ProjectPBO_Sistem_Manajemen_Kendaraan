public class Main {
    public static void main(String[] args) {
        Bengkel bengkel = new Bengkel("Bengkel Selalu Bahagia");

        Pelanggan pelanggan1 = new Pelanggan("Rizki", "081265437809");
        Pelanggan pelanggan2 = new Pelanggan("Andi", "082346758091");
        Pelanggan pelanggan3 = new Pelanggan("Budi", "082134576554");

        Mobil mobil1 = new Mobil("AB 1334 DS", "Honda", 2020, 2300, "SUV");
        Motor motor1 = new Motor("B 5328 CAD", "Yamaha", 2018, 250, "Sport");
        Mobil mobil2 = new Mobil("L 1835 DA", "BMW", 2022, 2500, "Sedan");

        bengkel.tambahPelanggan(pelanggan1);
        bengkel.tambahKendaraan(mobil1);

        bengkel.tambahPelanggan(pelanggan2);
        bengkel.tambahKendaraan(motor1);

        bengkel.tambahPelanggan(pelanggan3);
        bengkel.tambahKendaraan(mobil2);

        Servis servis1 = new Servis("Ganti Oli", 250000, "Oli Mesin");
        Servis servis2 = new Servis("Perbaikan Mesin", 500000, "Suku Cadang Mesin");
        Servis servis3 = new Servis("Ganti Lampu", 300000, "Lampu Mobil");

        bengkel.catatServis(pelanggan1, mobil1, servis1);
        bengkel.catatServis(pelanggan2, motor1, servis2);
        bengkel.catatServis(pelanggan3, mobil2, servis3);

        bengkel.tampilkanRiwayatServis();
    }
}