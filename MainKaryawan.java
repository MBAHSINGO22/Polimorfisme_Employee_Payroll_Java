package Modul_8;

public class MainKaryawan {
    public static void main(String[] args) {
        // Membuat array untuk menyimpan objek karyawan
        // Ukuran array ditentukan sebagai 10, yang berarti dapat menyimpan hingga 10 objek karyawan
        Karyawan[] roster = new Karyawan[10];

        // Menambahkan objek karyawan ke dalam array
        roster[0] = new KaryawanTetap(1, "Coki", 2, 5000000); // Contoh Karyawan Tetap
        roster[1] = new KaryawanTetap(2, "Ius", 5, 200000); // Contoh Karyawan Tetap
        roster[2] = new KaryawanTetap(2, "Galih", 0, 200000); // Contoh Karyawan Kontrak
        roster[3] = new KaryawanKontrak(2, "Ari", 1, 20000, 5); // Contoh Karyawan Kontrak
        roster[4] = new KaryawanKontrak(2, "Dennis", 1, 2000000, 20); // Contoh Karyawan Kontrak
        roster[5] = new KaryawanKontrak(2, "Krisna", 1, 2000000, 20); // Contoh Karyawan Kontrak
        roster[6] = new KaryawanKontrak(2, "Sisko", 1, 2000000, 20); // Contoh Karyawan Kontrak
        roster[7] = new KaryawanKontrak(2, "Gilbert", 2, 300000, 20); // Contoh Karyawan Kontrak

        // Menampilkan daftar nama karyawan, jenis karyawan, gaji total atau upah total
        // Looping melalui setiap elemen dalam array roster
        for (int i = 0; i < roster.length; i++) {
            // Menggunakan instanceof untuk mengecek jenis objek
            if (roster[i] instanceof KaryawanTetap) {
                // objek ke KaryawanTetap dan menampilkan detail
                KaryawanTetap karyawanTetap = (KaryawanTetap) roster[i];
                System.out.println("Nama: " + karyawanTetap.nama + ", Jenis: Tetap, Gaji Total: " + karyawanTetap.hitungPendapatan());
            } else if (roster[i] instanceof KaryawanKontrak) {
                // objek ke KaryawanKontrak dan menampilkan detail
                KaryawanKontrak karyawanKontrak = (KaryawanKontrak) roster[i];
                System.out.println("Nama: " + karyawanKontrak.nama + ", Jenis: Kontrak, Upah Total: " + karyawanKontrak.hitungPendapatan());
            }
        }

        // Menampilkan daftar karyawan kontrak dengan upah total < 1 juta
        System.out.println("\nDaftar Karyawan Kontrak dengan Upah Total < 1 Juta:");
        // Looping melalui setiap elemen dalam array roster
        for (int i = 0; i < roster.length; i++) {
            // Menggunakan instanceof untuk mengecek jenis objek dan kondisi upah total
            if (roster[i] instanceof KaryawanKontrak && ((KaryawanKontrak) roster[i]).hitungPendapatan() < 1000000) {
                // objek ke KaryawanKontrak dan menampilkan detail
                KaryawanKontrak karyawanKontrak = (KaryawanKontrak) roster[i];
                System.out.println("Nama: " + karyawanKontrak.nama + ", Upah Total: " + karyawanKontrak.hitungPendapatan());
            }
        }
    }
}
