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
class KantorCabangDalamNegeri extends Kantor implements BisaMeeting, BisaGaji, BisaLaporan {
    KantorCabangDalamNegeri(String lokasi) {
        super(lokasi);
    }

    @Override
    void bukaKantor() {
        System.out.println("Kantor cabang dalam negeri di " + lokasi + " dibuka.");
    }

    @Override
    public void adakanMeeting() {
        System.out.println("Meeting rutin di kantor " + lokasi + ".");
    }

    @Override
    public void bayarGaji() {
        System.out.println("Gaji pegawai kantor " + lokasi + " dibayarkan.");
    }

    @Override
    public void buatLaporan() {
        System.out.println("Laporan bulanan kantor " + lokasi + " dibuat.");
    }
}