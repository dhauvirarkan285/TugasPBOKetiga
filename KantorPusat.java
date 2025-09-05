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
class KantorPusat extends Perusahaan {
    KantorPusat(String namaPerusahaan) {
        super(namaPerusahaan);
    }

    @Override
    void visiMisi() {
        System.out.println(namaPerusahaan + " memiliki visi: Menjadi perusahaan global.");
    }
}
