/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118084.latihan40.warnakepribadian;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.UIManager;

import java.awt.Color;
import static java.awt.Color.red;
import java.awt.Component;
import java.util.Scanner;

/**
 *
 *Nama  : Divi Adiffia Freza Alana
*Kelas : PBO2
*Nim   : 10118084
*Deskripsi Program : Program ini berisi program untuk menampilkan warna

 */
public class warna {
    public static final String ANSI_RESET = "\u001B[0m";
public static final String ANSI_BLACK = "\u001B[30m";
public static final String ANSI_RED = "\u001B[31m";
public static final String ANSI_GREEN = "\u001B[32m";
public static final String ANSI_YELLOW = "\u001B[33m";
public static final String ANSI_BLUE = "\u001B[34m";
public static final String ANSI_PURPLE = "\u001B[35m";
public static final String ANSI_CYAN = "\u001B[36m";
public static final String ANSI_WHITE = "\u001B[37m";
    public void pilihwarna(){
      Scanner Scanner = new Scanner (System.in);
        System.out.println(ANSI_RED+" YUK "+ANSI_GREEN+" CEK "+ANSI_YELLOW+" KEPRIBADIANMU "+ANSI_CYAN+" DARI "+ANSI_PURPLE+" WARNA "+ANSI_BLUE+" FAVORITMU ");
        System.out.println(ANSI_WHITE+"MERAH");
        System.out.println(ANSI_WHITE+"HIJAU");
        System.out.println(ANSI_WHITE+"KUNING");
        System.out.println(ANSI_WHITE+"BIRU");
        System.out.println(ANSI_WHITE+"UNGU"+ANSI_RESET);
        System.out.print("PILIH WARNA FAVORITMU :");
        String warna=Scanner.nextLine();
        System.out.print("NAMA KAMU  :");
        String nama=Scanner.nextLine();
        System.out.println(" ===HASIL TEST KEPRIBADIAN "+ nama +"=== ");
         if(!"hijau".equals(warna)) {
            System.out.println("Warna Favoritmu adalah "+ANSI_RED+ warna);
            System.out.println("1.  Periang,");
            System.out.println("2.  Pemberani,");
            System.out.println("3.  Berani mengambil risiko dalam setiap langkah,");
            System.out.println("4.  Menyukai tantangan,");
            System.out.println("5.  Kurang sabar,");
            System.out.println("6.  Dapat menahan marah namun jika sudah tahap puncak toleransi, kemarahnnya akan sulit di kontrol,");
            System.out.println("7.  Memiliki energi kehangatan dan cinta.");
    } 
         else if(!"merah".equals(warna)) {
            System.out.println("Warna Favoritmu adalah "+ANSI_GREEN+ warna);
            System.out.println("1.  Romantis,");
            System.out.println("2.  Menyukai hal yang berbau alami dan keindahan,");
            System.out.println("3.  Teguh pada prinsip,");
            System.out.println("4.  Menginginkan kesempurnaan,");
            System.out.println("5.  Mudah cemburu,");
            System.out.println("6.  Mudah merasa iri,");
            System.out.println("7.  Menjunjung tinggi suatu nilai toleransi dan kepercayaan.");
    }
        else if(!"kuning".equals(warna)) {
            System.out.println("Warna Favoritmu adalah "+ANSI_BLUE+ warna);
            System.out.println("1.  Menyenangkan,");
            System.out.println("2.  Bijaksana,");
            System.out.println("3.  Pembawaan diri tenang saat menghadapi masalah,");
            System.out.println("4.  Dinamis,");
            System.out.println("5.  Senang berbagi,");
            System.out.println("6.  Bersahabat,");
            System.out.println("7.  Tidak terlalu suka menjadi sorotan banyak orang.");
    } 
      else if(!"biru".equals(warna)) {
            System.out.println("Warna Favoritmu adalah "+ANSI_YELLOW+ warna);
            System.out.println("1.  Optimis,");
            System.out.println("2.  Suka bergaul,");
            System.out.println("3.  Periang,");
            System.out.println("4.  Senang menolong,");
            System.out.println("5.  Lincah dan aktid,");
            System.out.println("6.  Tidak suka meremahkan kekurangan orang lain,");
            System.out.println("7.  Loyal");
            System.out.println("8.  Hangat");
            System.out.println("9.  Meskipun karakternya optimis dan idealis, seringkali goyah dan tidak stabil,");
            System.out.println("10. Cenderung penakut");
    }   
         else if(!"ungu".equals(warna)) {
            System.out.println("Warna Favoritmu adalah "+ANSI_PURPLE+ warna);
            System.out.println("1.  Optimis,");
            System.out.println("2.  Tidak pernah ragu,");
            System.out.println("3.  Menurutnya pasangan yang ideal adalah yang memiliki mental yang kuat,");
            System.out.println("4.  Memiliki ambisi yang besar,");
            System.out.println("5.  Memiliki empati yang besar,");
            System.out.println("6.  Memiliki sisi misterius sebab seringkali menutupi perasaanya,,");
            System.out.println("7.  Terkadang bersikap keras kepala dan angkuh.");
    }   
        
       
        
        
    }
    }

