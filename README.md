<h1 align="center">🧾 Polimorfisme Employee Payroll Java</h1>
<p align="center">
  <b>Demo Polimorfisme dan Pewarisan untuk Penggajian Karyawan di Java</b><br>
  <sub>Proyek Java yang mengimplementasikan konsep inheritance dan polymorphism untuk mengelola data karyawan tetap dan kontrak, serta menyaring karyawan kontrak berdasarkan upah total.</sub>
</p>

<div align="center">

[![Java](https://img.shields.io/badge/Java-17-red?logo=oracle)](https://www.oracle.com/java/)
[![OOP](https://img.shields.io/badge/Concept-Inheritance%20%26%20Polymorphism-blue)]()
[![Educational](https://img.shields.io/badge/Type-OOP%20Project-green)]()
[![Author](https://img.shields.io/badge/Author-MBAHSINGO22-brightgreen)](https://github.com/MBAHSINGO22)

</div>

---

## 📖 Deskripsi Proyek

Proyek Java yang mendemonstrasikan penggunaan **pewarisan (inheritance)** dan **polimorfisme (polymorphism)** dalam mengelola data karyawan tetap dan kontrak. Program ini menyimpan data dalam array bertipe induk, menghitung pendapatan masing-masing karyawan, dan menyaring karyawan kontrak dengan upah total di bawah Rp1.000.000.

Proyek ini berfokus pada:
- 📊 **Karyawan.java** – Kelas induk yang merepresentasikan karyawan dengan atribut `NPP`, `nama`, `jumlah anak`, dan metode untuk menghitung tunjangan anak (`Rp100.000` per anak).
- 🔍 **KaryawanTetap.java** – Kelas turunan untuk karyawan tetap, dengan atribut `gaji pokok` dan metode `hitungPendapatan()`.
- 🔍 **KaryawanKontrak.java** – Kelas turunan untuk karyawan kontrak, dengan atribut `upah harian` dan `hari masuk`, serta metode `hitungPendapatan()`.
- 🛠️ **MainKaryawan.java** – Program utama untuk menguji sistem menggunakan **array bertipe `Karyawan`** dan menyaring data menggunakan `instanceof`.

---

## 📂 Struktur File

```
Polymorphic_Employee_Payroll_Java/
├── src/Modul_8/
├── MainKaryawan.java       # 🛠️ Kelas utama untuk pengujian
├── Karyawan.java           # 📊 Kelas induk untuk data karyawan
├── KaryawanTetap.java      # 🔍 Kelas turunan untuk karyawan tetap
├── KaryawanKontrak.java    # 🔍 Kelas turunan untuk karyawan kontrak
```

---

## 🧰 Teknologi

- ☕ Java 17+
- 🧪 IDE: IntelliJ IDEA / NetBeans / Eclipse / Terminal (javac)

---

## 🧪 Catatan

- Program menggunakan data statis untuk membuat **8 karyawan** (3 tetap dan 5 kontrak).
- Semua objek disimpan dalam **array bertipe `Karyawan`** untuk mendemonstrasikan **polimorfisme**.
- Pengecekan tipe objek dilakukan menggunakan **`instanceof`**.
- Tunjangan anak berlaku untuk semua jenis karyawan (`Rp100.000 × jumlah anak`).

---

## 📈 Contoh Output

```
Nama: Coki, Jenis: Tetap, Gaji Total: 5200000
Nama: Ius, Jenis: Tetap, Gaji Total: 700000
Nama: Galih, Jenis: Tetap, Gaji Total: 200000
Nama: Ari, Jenis: Kontrak, Upah Total: 200000
Nama: Dennis, Jenis: Kontrak, Upah Total: 40100000
Nama: Krisna, Jenis: Kontrak, Upah Total: 40100000
Nama: Sisko, Jenis: Kontrak, Upah Total: 40100000
Nama: Gilbert, Jenis: Kontrak, Upah Total: 6200000

Daftar Karyawan Kontrak dengan Upah Total < 1 Juta:
Nama: Ari, Upah Total: 200000
```

---

## 🧠 Fitur

- Pewarisan (Inheritance) untuk hierarki kelas `Karyawan`
- Polimorfisme dengan array bertipe superclass
- Penyaringan karyawan kontrak berdasarkan pendapatan
- Penggunaan `instanceof` untuk validasi tipe objek

---

## 👨‍💻 Pengembang

**MBAHSINGO22**  
🔗 [GitHub](https://github.com/MBAHSINGO22)
