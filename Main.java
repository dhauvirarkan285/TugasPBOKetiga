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
public class Main {
    public static void main(String[] args) {
        // Abstract + Interface
        KantorCabangDalamNegeri cabangJakarta = new KantorCabangDalamNegeri("Jakarta");
        cabangJakarta.bukaKantor();
        cabangJakarta.adakanMeeting();
        cabangJakarta.bayarGaji();
        cabangJakarta.buatLaporan();

        KantorCabangLuarNegeri cabangTokyo = new KantorCabangLuarNegeri("Tokyo");
        cabangTokyo.bukaKantor();

        System.out.println("\n--- Overloading ---");
        LaporanKeuangan laporan = new LaporanKeuangan();
        laporan.cetakLaporan("Januari");
        laporan.cetakLaporan("Februari", 2025);

        System.out.println("\n--- Overriding ---");
        Perusahaan pusat = new KantorPusat("PT Nusantara Tech");
        Perusahaan cabang = new KantorCabang("PT Nusantara Tech");

        pusat.visiMisi();   // Override di KantorPusat
        cabang.visiMisi();  // Override di KantorCabang
    }
}
