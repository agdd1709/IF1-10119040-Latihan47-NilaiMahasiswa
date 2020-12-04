/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119040.latihan47.nilaimahasiswa;

/**
 *
 * @author User
 * Nama : Agus Deri Dermawan
 * NIM  :10119040
 * Kelas: IF1
 * Program menghitung dan menampilkan nilai mahasiswa dengan metode
 * pendekatan berbasis objek
 */
public class IF110119040Latihan47NilaiMahasiswa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Rumus nilai1,nilai2,nilai3;
        nilai1 = new Rumus(75,45,34);
        nilai1.tampil();
        nilai2 = new Rumus(60,80,75);
        nilai2.tampil();
        nilai3 = new Rumus(30,80,40);
        nilai3.tampil();
    }
    
}
