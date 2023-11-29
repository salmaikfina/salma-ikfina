/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pbolat56;

/**
 *
 * @author ThinkPad
 */
  public class PBOLat56 {

    private int umur;
    private String name;

    public PBOLat56(int umur) {
        this.umur = umur;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void tampilUmur() {
        System.out.println("Nama barang antik ini adalah: " + getName());
        System.out.println("Umur barang antik ini adalah: " + getUmur() + " tahun.");
    }

    public static void main(String[] args) {
        PBOLat56 radio = new PBOLat56(234);
        radio.setName("Radio AM");
        radio.tampilUmur();
    }
}