/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pbolat57;

import java.util.Scanner;

/**
 *
 * @author ThinkPad
 */
public class PBOLat57 {

    private String myBrand;
    private String myModel;

    public PBOLat57() {
    }

    public PBOLat57(String myBrand, String myModel) {
        this.myBrand = myBrand;
        this.myModel = myModel;
    }

    public String getMyBrand() {
        return myBrand;
    }

    public void setMyBrand(String myBrand) {
        this.myBrand = myBrand;
    }

    public String getMyModel() {
        return myModel;
    }

    public void setMyModel(String myModel) {
        this.myModel = myModel;
    }

    public void tampilNama() {
        System.out.println("Nama kendaraan ini adalah: " + getMyBrand() + " " + getMyModel());
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan merek kendaraan: ");
        String myBrand = input.nextLine();

        System.out.print("Masukkan model kendaraan: ");
        String myModel = input.nextLine();

        PBOLat57 bicycle = new PBOLat57(myBrand, myModel);
        bicycle.tampilNama();
    }
}


    
