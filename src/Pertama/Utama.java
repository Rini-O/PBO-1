/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertama;

/**
 *
 * @author acer_user
 */
public class Utama {
   public static void main (String[] args){
   Hewan monyet = new Hewan();
   monyet.bernafas();
   monyet.tumbuh();
   monyet.setJumlahKaki(2);
//   
    System.out.println("jumlah kaki monyet "+monyet.getJumlahKaki());
       System.out.println(" ");
    Reptil buaya = new Reptil();
    buaya.bernafas();
    buaya.tumbuh();
    System.out.println("buaya merupakan Hewan reptil  ");
    buaya.setKebiasaanMakan("memakan daging ");
    buaya.setMelindungiDiri("berkamuflase dengan kulitnya");
    System.out.println("kebiasaan makannya yaitu "+buaya.getKebiasaanMakan() +"dan melindungi diri dengan "+buaya.getMelindungiDiri());
   
     System.out.println(" ");
     
   Pisces IkanSalmon = new Pisces();
    IkanSalmon.bernafas();
    IkanSalmon.tumbuh();
    System.out.println("Ikan Salmon merupakan Hewan tergolong pisces ");
    IkanSalmon.setSisik("bersisik sikloid");
    IkanSalmon.setSiripEkor("bentuk sirip ekor homoserkal");
    System.out.println("Ikan salmon adalah pisces yang " + IkanSalmon.getSisik() + " dan memiliki " + IkanSalmon.getSiripEkor());
    System.out.println(" ");
    
    Aves Elang = new Aves();
    Elang.bernafas();
    Elang.tumbuh();
    System.out.println("Elang merupakan hewan tergolong Aves");
    Elang.setBentukParuh("Melengkung dan Tajam");
    Elang.setBulu("Bulu Primer dan sekunder");
    System.out.println("Aves yang bentuk paruhnya "+ Elang.getBentukParuh()+ " dan memiliki "+ Elang.getBulu());
    System.out.println("");
    
    Mamalia Rusa = new Mamalia();
    Rusa.bernafas();
    Rusa.tumbuh();
    System.out.println("Rusa merupakan hewan tergolong mamalia");
    Rusa.setJumlahKelenjarSusu(12);
    Rusa.setJumlahTanduk(2);
    System.out.println("Rusa memiliki kelenjar susu sebanyak  "+Rusa.getJumlahKelenjarSusu()+ " dan juga memiliki tanduk sebanyak "+Rusa.getJumlahTanduk());
     System.out.println("");
     
    Amphibi Sesilia =new Amphibi();
    Sesilia.bernafas();
    Sesilia.tumbuh();
    System.out.println("Sesilia merupakan hewan tergolong Amphibi");
    Sesilia.setBentukTubuh("panjang");
   Sesilia.setJumlahKelenjarKulit(3);
   System.out.println("bentuk tubuh sesilia yaitu "+Sesilia.getBentukTubuh()+ "dan jumlah kelenjar kulit yang beracun ada "+ Sesilia.getJumlahKelenjarKulit());
 System.out.println("");
         
   Monokotil Lili = new Monokotil();
   System.out.println("Bunga Lili tergolong tumbuhan Monokotil");
   Lili.setWarnaBunga("Merah");
   Lili.setJumlahKelopakBunga(5);
   System.out.println("Bunga Lili bewarna "+Lili.getWarnaBunga()+" dan memiliki jumlah kelopak bunga sebanyak "+ Lili.getJumlahKelopakBunga());
  System.out.println("");
  
  Dikotil Stroberi = new Dikotil();
  System.out.println("Tumbuhan Stroberi tergolong tumbuhan dikotil ");
  Stroberi.setWarnaBuah("merah");
  Stroberi.setBentukDaun("Menjari");
  System.out.println("Buah Stroberi bewarna"+ Stroberi.getWarnaBuah()+"dan bentuk daunnya "+Stroberi.getBentukDaun());
   } 
   
   
}