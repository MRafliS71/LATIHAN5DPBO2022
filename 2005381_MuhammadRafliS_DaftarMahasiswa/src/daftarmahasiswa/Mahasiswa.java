/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daftarmahasiswa;
/*
    /Saya Muhammad Rafli Syaputra dengan NIM 2005381 mengerjakan 
    Tugas Latihan 5 dalam mata kuliah Desain dan Pemrograman 
    Berorientasi Objek untuk keberkahanNya maka saya tidak 
    melakukan kecurangan seperti yang telah dispesifikasikan. 
    Aamiin../
*/

public class Mahasiswa {
    private String NIM;
    private String Name;
    private String Nilai;
    
    public Mahasiswa(String n1, String n2, String n3){
        NIM = n1;
        Name = n2;
        Nilai = n3;
    }
    
    public void setNim(String n) {
        NIM = n;
    }
    
    public void setNama(String n) {
        Name= n;
    }
    
    public void setNilai(String n) {
        Nilai = n;
    }
    
    public String getNim() {
        return NIM;
    }
    
    public String getNama() {
        return Name;
    }
    
    public String getNilai() {
        return Nilai;
    }
}
