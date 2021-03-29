/*
  Anggota Kelompok:
 - Afifah Khairiyyah Rusli
 - Khaira Isyara
 - Moh. Reyhand Fatturrahman
 */
package composition;

/**
 *
 * @author lenovo
 */
public class Composition {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Laptop 1
        System.out.println(" Object 1 ");
        Laptop satu = new Laptop(" Lenovo ", " Ideapad Flex 5i ");
        satu.addData(new CPU (" Intel Core i5 gen 10th "), new Storage ( " SSD 512GB" ));
        satu.displayData();
        
        // Laptop 2
        System.out.println(" Object 2 ");
        Laptop dua = new Laptop(" Pavilion x360 ", " 14-cd1042tx ");
        dua.addData(new CPU (" Intel Core i7 gen 8th "), new Storage ( " HDD 1TB"));
        dua.displayData();
    }
    
}
