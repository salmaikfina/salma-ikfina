/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pbolat55;

/**
 *
 * @author ThinkPad
 */
public class PBOLat55 {

    public static void main(String[] args) {
   Smartphone samsung = new Smartphone("Samsung", "Android", "Android", 3000000, "234ibfd3840fo");
        Smartphone blackberry = new Smartphone("BlackB", "RIM", "Curve", 2000000, "BHS249");
        Smartphone nokia = new Smartphone("Nokia", "Win8", "Lumia", 1000000, "UUUQIJWORJ");

        // Menampilkan informasi setiap smartphone
        samsung.displayInfo();
        blackberry.displayInfo();
        nokia.displayInfo();
    }
}
class Smartphone {
    private String manufaktur;
    private String os;
    private String model;
    private int harga;
    private String kunci;
// Konstruktor
    public Smartphone(String manufaktur, String os, String model, int harga, String kunci) {
        this.manufaktur = manufaktur;
        this.os = os;
        this.model = model;
        this.harga = harga;
        this.kunci = kunci;
    }

    // Metode untuk menampilkan informasi smartphone
    public void displayInfo() {
        System.out.println("Manufaktur: " + manufaktur);
        System.out.println("Model: " + model);
        System.out.println("Harga: " + harga);
        

    }
}

