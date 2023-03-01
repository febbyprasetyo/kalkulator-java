package kalkulator.java;

/**
 *
 * @author User
 */
import java.util.Scanner;
public class Kalkulator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pil;
        double jumlah, angka1, angka2;
        System.out.println("--------------------------------");
        System.out.println("|===== PROGRAM KALKULATOR =====|");
        System.out.println("--------------------------------");
        System.out.println("|1. Penjumlahan                |");
        System.out.println("|2. Perkalian                  |");
        System.out.println("|3. Pengurangan                |");
        System.out.println("|4. Pembagian                  |");
        System.out.println("|------------------------------|");
        System.out.println("Masukkan Pilihan Anda (1/2/3/4) ");
        pil = input.nextInt();
        System.out.println("Bilangan 1");
        angka1 = input.nextDouble();
        System.out.println("Bilangan 2");
        angka2 = input.nextDouble();
        switch (pil) {
            case 1 -> {
                System.out.println("MENGHITUNG PENJUMLAHAN");
                System.out.println("----------------------");
                jumlah = angka1 + angka2;
                System.out.println("Hasil Penjumlahan Adalah : "+jumlah);
            }
                
            case 2 -> {
                System.out.println("MENGHITUNG PERKALIAN");
                System.out.println("--------------------");
                jumlah = angka1 * angka2;
                System.out.println("Hasil Perkalian Adalah : "+jumlah);
            }
                
            case 3 -> {
                System.out.println("MENGHITUNG PENGURANGAN");
                System.out.println("----------------------");
                jumlah = angka1 - angka2;
                System.out.println("Hasil Pengurangan Adalah : "+jumlah);
            }
                
            case 4 -> {
                System.out.println("MENGHITUNG PEMBAGIAN");
                System.out.println("-----------------------");
                jumlah = angka1 / angka2;
                System.out.println("Hasil Pembagian Adalah : "+jumlah);
            }
                
            case 5 -> System.out.println("Pilihan Anda Salah");   
            }
    }
}
