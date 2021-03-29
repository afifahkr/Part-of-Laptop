/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composition;

/**
 *
 * @author lenovo
 */
public class Laptop {
    private String merek, tipe;
    private CPU c;
    private Storage s;

    public Laptop(String merek, String tipe) {
        this.merek = merek;
        this.tipe = tipe;
    }

    public void addData(CPU c, Storage s){
        this.c = c;
        this.s = s;
    }
    
    public void displayData(){
        System.out.println(" Laptop " + this.merek + " bertipe " + this.tipe);
        System.out.println(" Dengan spesifikasi sebagai berikut:");
        System.out.println("" +c.getTipe());
        System.out.println("" +s.getJenis());
        System.out.println("_________________________________");
    }
}
