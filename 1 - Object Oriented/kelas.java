/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pertemuan1;
public class kelas {
    String kode_kelas;
    String info;
    String nama_dosen;
    mahasiswa [] mhs = new mahasiswa[45];
    int index = 0;
    kelas(String kode_kelas, String info, String dosen){
        this.kode_kelas = kode_kelas;
        this.info = info;
        this.nama_dosen = dosen;
    }
    
    public void tambah_mahasiswa(mahasiswa mahasiswa){
        mhs[index++] = mahasiswa;
    }
    
    public void rerata_ipk_mahasiswa(){
        double total =0;
        for(int i = 0; i<=index-1; i++){
           total+=mhs[i].ipk;
        }
        System.out.println("Rerata IPK = "+total/index+1);
    }
    
}
