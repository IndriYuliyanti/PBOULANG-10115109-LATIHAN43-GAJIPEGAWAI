/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboulang.pkg10115109.latihan43.gajipegawai;
import java.util.Scanner;
/**
 *
 * @author nama : indri yuliyanti
 *          nim ; 10115109
 *          kelas : pbo ulng
 *          tugas pbo pert 4 menghitung gaji pegawai
 */
public class Pboulang10115109Latihan43Gajipegawai {
private static int gajitotal;
private static int masajenis;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Gaji gaji1 = new Gaji();
       
        System.out.println("=== Data Gaji Karyawan PT. KAKATU ===   ");
        System.out.println("----------------------------------------");
        
        gaji1.setNama("rizki adam kurniawa");
        gaji1.setAlamat("jalan semar dlm no 72/66");
        gaji1.setUangtransport(250000);
        gaji1.setUangtunjangan(30000);
        gaji1.setGajipokok(450000);
        gaji1.totalgaji(gaji1.getUangtransport(),gaji1.getUangtunjangan(),gaji1.getGajipokok());
        
        System.out.println("== data gaji karyawan PT. KAKATU ===");
        System.out.println("------------------------------------");
        gaji1.tampildata(gaji1.getNama(),
                gaji1.getAlamat(),
                gaji1.getUangtransport(),
                gaji1.getUangtunjangan(),
                gaji1.getGajipokok(),
                gaji1.getTotalgaji());
        
        
        
    }
    
}
