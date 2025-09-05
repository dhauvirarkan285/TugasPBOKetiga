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
abstract class Pegawai {
    String nama;
    String id;

    Pegawai(String nama, String id) {
        this.nama = nama;
        this.id = id;
    }

    abstract void bekerja();
}