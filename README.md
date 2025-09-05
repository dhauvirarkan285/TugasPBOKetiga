# TugasPBOKetiga
Implementasi OOP Java: Abstract Class, Interface, Overload, Override
Deskripsi

Program ini dibuat untuk mempraktikkan konsep Object-Oriented Programming (OOP) di Java dengan menggunakan:

3 Abstract Class

3 Interface

Polymorphism (Overloading & Overriding)

Tujuan program adalah menunjukkan bagaimana abstract class dan interface dapat diimplementasikan secara bersamaan, serta bagaimana polymorphism bekerja melalui method overload dan override.

Struktur Program

Abstract Class

Perusahaan

KantorCabang

KantorPusat

Interface

BisaRekrutKaryawan

BisaPHK

BisaPromosiProduk

Implementasi Abstract + Interface

CabangDalamNegeri (mengimplementasikan 3 interface + abstract class)

CabangLuarNegeri (extends abstract class)

Polymorphism

Overloading: OperasionalCabang

Overriding: Kantor & KantorInternasional

Main Class

Main (sebagai titik eksekusi program)

Cara Menjalankan

Clone / download repository.

Buka project di NetBeans / IntelliJ / Eclipse.

Jalankan file Main.java.

Output Program
Perusahaan: PT Maju Jaya | Cabang: Jakarta
Layanan operasional cabang dalam negeri di Jakarta
Cabang Jakarta merekrut karyawan baru.
Cabang Jakarta melakukan promosi produk lokal.
Cabang Jakarta melakukan PHK.

Perusahaan: PT Maju Jaya | Cabang Luar Negeri: Singapura
Layanan cabang luar negeri mengikuti aturan internasional.

--- Overload ---
Membuka cabang baru di Bandung (dalam negeri).
Membuka cabang di Surabaya dengan 200 karyawan.

--- Override ---
Operasional standar perusahaan.
Operasional cabang luar negeri mengikuti regulasi internasional.

Kesimpulan

Abstract class dan interface memiliki perbedaan, namun keduanya dapat dipadukan untuk fleksibilitas program.

Overloading menunjukkan polimorfisme pada saat compile-time.

Overriding menunjukkan polimorfisme pada saat runtime.

Program ini telah mengimplementasikan konsep inti OOP: Abstraction, Inheritance, Encapsulation, dan Polymorphism.
