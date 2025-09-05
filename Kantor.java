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
abstract class Kantor {
    String lokasi;

    Kantor(String lokasi) {
        this.lokasi = lokasi;
    }

    abstract void bukaKantor();
}
