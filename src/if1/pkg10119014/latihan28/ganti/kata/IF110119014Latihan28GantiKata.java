/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119014.latihan28.ganti.kata;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class IF110119014Latihan28GantiKata {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    String hasil = "";
    Scanner scanner = new Scanner (System.in);
    System.out.println("====Program Mengganti Kata====\n");
    System.out.print("Masukan Kalimat : ");
    String kalimat = scanner.nextLine();
    System.out.print("Ganti kata : ");
    String kata_lama = scanner.nextLine();
    System.out.print("Menjadi kata : ");
    String kata_baru = scanner.nextLine();
    String[] perkata = kalimat.split(" ");
    for (String kata : perkata){
        if (kata.equalsIgnoreCase(kata_lama)){
            hasil += kata_baru + " ";
        }
        else {
            hasil += kata + " ";
        }
        }
    System.out.println("Kalimat Baru : "+hasil.trim());
    }
    }
    

