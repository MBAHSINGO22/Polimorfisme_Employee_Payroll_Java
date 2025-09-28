package Modul_8;

public class KaryawanTetap extends Karyawan {
    public int gajiPokok;

    public KaryawanTetap(int npp, String nama, int jumlahAnak, int gajiPokok) {
        super(npp, nama, jumlahAnak);
        this.gajiPokok = gajiPokok;
    }

    public int hitungPendapatan() {
        return gajiPokok + hitungTunjangAnak();
    }
}