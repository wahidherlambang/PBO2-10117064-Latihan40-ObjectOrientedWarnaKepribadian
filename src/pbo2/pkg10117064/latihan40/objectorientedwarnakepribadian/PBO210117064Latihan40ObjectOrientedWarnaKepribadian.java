/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117064.latihan40.objectorientedwarnakepribadian;

import java.util.Scanner;

/**
 *
 * @author WAHID HERLAMBANG
 * NAMA     : Wahid Herlambang Suroso
 * KELAS    : PBO2
 * NIM      : 10117064
 * Deskripsi Program : Program ini berisi program untuk mengetahui 
 * kepribadian seseorang.
 */
public class PBO210117064Latihan40ObjectOrientedWarnaKepribadian {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String warnaMu;
        String namaMu;
        WarnaKepribadian warna = new WarnaKepribadian();
        Scanner scn = new Scanner(System.in);
        
        System.out.print(warna.ANSI_RED+"YUK "+warna.ANSI_RESET);
        System.out.print(warna.ANSI_GREEN+"CEK "+warna.ANSI_RESET);
        System.out.print(warna.ANSI_YELLOW+"KEPRIBADIANMU "+warna.ANSI_RESET);
        System.out.print(warna.ANSI_CYAN+"DARI "+warna.ANSI_RESET);
        System.out.print(warna.ANSI_PURPLE+"WARNA "+warna.ANSI_RESET);
        System.out.print(warna.ANSI_BLUE+"FAVORITMU "+warna.ANSI_RESET+"\n");
        
        System.out.print("\n"+warna.ANSI_RED_BACKGROUND+warna.ANSI_WHITE
                +"\t MERAH \t\t\n"+warna.ANSI_RESET);
        System.out.print(warna.ANSI_GREEN_BACKGROUND+warna.ANSI_WHITE
                +"\t HIJAU \t\t\n"+warna.ANSI_RESET);
        System.out.print(warna.ANSI_YELLOW_BACKGROUND+warna.ANSI_WHITE
                +"\t KUNING \t\n"+warna.ANSI_RESET);
        System.out.print(warna.ANSI_BLUE_BACKGROUND+warna.ANSI_WHITE
                +"\t BIRU \t\t\n"+warna.ANSI_RESET);
        System.out.print(warna.ANSI_PURPLE_BACKGROUND+warna.ANSI_WHITE
                +"\t UNGU \t\t\n\n"+warna.ANSI_RESET);
        
        System.out.print("PILIH WARNA FAVORITMU : ");
        warnaMu = scn.next();
        System.out.print("NAMA KAMU : ");
        namaMu = scn.next();
        
        System.out.println("\n====HASIL TEST KEPRIBADIAN "
                + namaMu.toUpperCase()+"====");
        warna.hasilWarna(warnaMu);
    }
    
}