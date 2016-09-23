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
public class Pertemuan1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        matkul asd = new matkul("1111","ASD",3);
        matkul basdat = new matkul("2222","Basis Data",4);
        mahasiswa m1 = new mahasiswa("Jono","151",2.9);
        
        m1.ambil_matkul(basdat);
        m1.ambil_matkul(asd);
        m1.lihat_matkul();
        
        mahasiswa m2 = new mahasiswa("Aku","222",2.9);
        m2.ambil_matkul(basdat);
        
        kelas B = new kelas("B",null,null);
        B.tambah_mahasiswa(m1);
        B.tambah_mahasiswa(m2);
        B.rerata_ipk_mahasiswa();
        
        
        
        
    }
    
}
