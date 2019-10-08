 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif11k.pkg10118905.latihan27.hurufbesarkecil;

import java.util.Scanner;
/**
 *
 * @author Fitri
 * Nama     : Anindira Dina FItriani
 * Kelas    : IF11-K
 * Nim      : 10118905
 * Deskripsi: Huruf Besar Kecil
 */
public class PBOIF11K10118905Latihan27HurufBesarKecil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan kalimat :");
        String kalimat =sc.nextLine();
        System.out.println("\n=======Hasil Formating=======");
        System.out.println("Huruf besar :" +kalimat.toUpperCase());
        System.out.println("Huruf kecil :" +kalimat.toLowerCase());
       
    }
    
}
