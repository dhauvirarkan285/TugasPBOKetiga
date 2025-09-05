/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan3;

/**
 *
 * @author RAISSA
 */
class LaporanKeuangan {
    // Overload 1
    void cetakLaporan(String bulan) {
        System.out.println("Mencetak laporan bulan: " + bulan);
    }

    // Overload 2
    void cetakLaporan(String bulan, int tahun) {
        System.out.println("Mencetak laporan: " + bulan + " " + tahun);
    }
}
