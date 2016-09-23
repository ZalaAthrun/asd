/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pertemuan1;

/**
 *
 * @author Rizky Maulana Akbar
 */
public class mahasiswa {
    String nama;
    String nim;
    double ipk;
    matkul [] matkul = new matkul[12];
    int index = 0;
    mahasiswa(String nama, String nim, double ipk){
     this.nama = nama;
     this.nim = nim;
     this.ipk = ipk;
    }
    
    public void ambil_matkul(matkul matkul){
        this.matkul[index++] = matkul; 
    }
    
    public void lihat_matkul(){
        System.out.println("Nama Matkul - SKS");
        for(int i = 0; i<=index-1; i++){
            System.out.println(matkul[i].nama +"  -   "+matkul[i].sks);
        }
    }
    
    
    
    
}
