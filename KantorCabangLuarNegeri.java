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
class KantorCabangLuarNegeri extends Kantor {
    KantorCabangLuarNegeri(String lokasi) {
        super(lokasi);
    }

    @Override
    void bukaKantor() {
        System.out.println("Foreign branch office at " + lokasi + " is opened.");
    }
}