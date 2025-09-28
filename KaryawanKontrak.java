package Modul_8;

public class KaryawanKontrak extends Karyawan {
    public int upahHarian;
    public int jumlahHariMasuk;

    public KaryawanKontrak(int npp, String nama, int jumlahAnak, int upahHarian, int jumlahHariMasuk) {
        super(npp, nama, jumlahAnak);
        this.upahHarian = upahHarian;
        this.jumlahHariMasuk = jumlahHariMasuk;
    }

    public int hitungPendapatan() {
        return (upahHarian * jumlahHariMasuk) + hitungTunjangAnak();
    }
}

