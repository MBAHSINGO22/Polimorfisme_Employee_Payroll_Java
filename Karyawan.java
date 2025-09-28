package Modul_8;

public class Karyawan {
    public int npp;
    public String nama;
    public int jumlahAnak;
    public static final int subsidiPerAnak = 100000;

    public Karyawan(int npp, String nama, int jumlahAnak) {
        this.npp = npp;
        this.nama = nama;
        this.jumlahAnak = jumlahAnak;
    }

    public int hitungTunjangAnak() {
        return jumlahAnak * subsidiPerAnak;
    }
}
