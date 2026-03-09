/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package studikita;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Lab Informatika
 */
public class StudiKita {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
           Scanner input = new Scanner(System.in);
           
           ArrayList<String> rekap = new ArrayList<>();
           
           int pilihan;
           do{
               System.out.println("\n=== SISTEM KURSUS . StudiKita ===");
               
               System.out.println("1. Daftar Peserta");
               
               System.out.println("2. Keluar");
               
               System.out.print("Pilih menu: ");
               
               pilihan = input.nextInt();
               input.nextLine();
               if(pilihan == 1){
                   try {
                       System.out.println("Nama: ");
                       String nama = input.nextLine();
                       
                       System.out.println("Nomor Telepon: ");
                       String telp = input.nextLine();
                       if (!telp.matches("\\d+")){
                           throw new Exception("Nomor telepon harus angka saja");
                       }
                       
                       Peserta peserta = new Peserta(nama, telp);
                       System.out.println("Harga Kursus: ");
                       double harga = input.nextDouble();
                       
                       System.out.println("Jenis Paket (1. Online / 2. Offline / 3. Bundle): ");
                       System.out.print("Pilih: ");
                       
                       int jenis = input.nextInt();
                       PaketKursus paket;
                       if(jenis == 1){
                           paket = new KursusOnline(harga);
                       } if(jenis == 2){
                           paket = new KursusOffline(harga);
                       } else {
                           paket = new KursusBundle(harga);
                       }
                       
                       double total = paket.hitungTotalBiaya();
                       String data = peserta.getNama() + " | " + paket.getNamaKursus() + " | Rp" + total;
                       rekap.add(data);
                       
                       System.out.println("[OK] Peserta berhasil didaftarkan!");
                   } catch(DataKursusTidakValidException e){
                       System.out.println("Error: " + e.getMessage());
                   } catch(Exception e){
                       System.out.println("Input tidak valid: " + e.getMessage());
                       input.nextLine();
                   }
               }
           } while(pilihan != 2);
           
           System.out.println("\n== Rekap Peserta ===");
           for(String r : rekap){
               System.out.println(r);
           }
           
           System.out.println("Program selesai.");
    }
    
}
