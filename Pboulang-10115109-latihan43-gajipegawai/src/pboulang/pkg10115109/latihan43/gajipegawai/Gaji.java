/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboulang.pkg10115109.latihan43.gajipegawai;

/**
 *
 * @author nama : indri yuliyanti
 *          nim ; 10115109
 *          kelas : pbo ulng
 *          tugas pbo pert 4 menghitung gaji pegawai
 */
public class Gaji {
    private String nama;
    private String alamat;
    private int uangtransport;
    private int uangtunjangan;
    private int gajipokok;
    private int totalgaji;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public int getUangtransport() {
        return uangtransport;
    }

    public void setUangtransport(int uangtransport) {
        this.uangtransport = uangtransport;
    }

    public int getUangtunjangan() {
        return uangtunjangan;
    }

    public void setUangtunjangan(int uangtunjangan) {
        this.uangtunjangan = uangtunjangan;
    }

    public int getGajipokok() {
        return gajipokok;
    }

    public void setGajipokok(int gajipokok) {
        this.gajipokok = gajipokok;
    }

    public int getTotalgaji() {
        return totalgaji;
    }

    public void setTotalgaji(int totalgaji) {
        this.totalgaji = totalgaji;
    }
    
    public int totalgaji(int uangtunjangan, int uangtransport, int gajipokok){
        totalgaji = uangtunjangan + uangtransport + gajipokok;
        return totalgaji;
        
    }
public void tampildata(String nama, String alamat, int uangtunj,int uangtrans, int gapok, int total ){
 System.out.println("Nama Karyawan \t: Rp. "+nama);
        System.out.println("Alamat \t\t: Rp. "+alamat);
        System.out.println("Uang Transport \t: Rp. "+uangtunj);
        System.out.println("Uang Tunjangan \t: Rp. "+uangtrans);
        System.out.println("Gaji Pokok \t: Rp. "+gapok);
        System.out.println("TOTAL GAJI \t: Rp. "+total+"\n");

        
}

    void tampilData(String nama, String alamat, int uangtransport, int uangtunjangan, int gajipokok, int totalgaji) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
        
        