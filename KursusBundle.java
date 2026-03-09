/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studikita;

/**
 *
 * @author Lab Informatika
 */
public class KursusBundle extends PaketKursus implements Perpanjang {
    public KursusBundle(double hargaKursus) throws DataKursusTidakValidException{
        super("Kursus Bundle", hargaKursus);
    }
    
    @Override
    public double hitungTotalBiaya(){
        return hargaKursus + 150000;
    }

    @Override
    public void cetakInfoPerpanjangan() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
