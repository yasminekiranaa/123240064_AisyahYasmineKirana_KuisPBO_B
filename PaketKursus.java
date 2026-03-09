/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studikita;

/**
 *
 * @author Lab Informatika
 */
public abstract class PaketKursus {
    protected String namaKursus;
    protected double hargaKursus;
    
    public PaketKursus(String namaKursus, double hargaKursus) throws DataKursusTidakValidException{
        if(hargaKursus<=0){
            throw new DataKursusTidakValidException("Harga dasar tidak boleh 0 atau negatif");
        }
        this.namaKursus = namaKursus;
        this.hargaKursus = hargaKursus;
    }
    
    public String getNamaKursus(){
        return namaKursus;
    }
    
    public abstract double hitungTotalBiaya();
}
