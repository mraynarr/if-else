/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas1;
import java.util.Scanner;

/**
 *
 * @author Muhammad Raynar
 */
public class Tugas2 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        
        int barang, jumlah;
        double harga = 0, diskon, total = 0, uangBayar, uangKembalian;
        
         System.out.println("==========================================");
        System.out.println("TOKO SEDERHANA");
        System.out.println("(!). Sandal <50000>");
        System.out.println("(2). Sepatu <150000>");
        System.out.println("(3). Tas    <100000>");
        System.out.println("(4). Baju   <80000>");
        System.out.println("(5). Celana <120000>");
        System.out.println("==========================================");
        System.out.print("Pilih barang (1/2/3/4/5) = ");
        barang = sc.nextInt();
        System.out.print("Masukkan jumlah barang : ");
        jumlah = sc.nextInt();
        System.out.println("==========================================");
        
        if (barang <= 1) {
            harga = 50000; 
        } else if (barang <= 2) {
            harga = 150000; 
        } else if (barang <= 3) {
            harga = 100000; 
        } else if (barang <= 4) {
            harga = 80000; 
        } else if (barang <= 5) {
            harga = 120000;
        }
        
        total = harga * jumlah;
                
        if (total <= 100000) {
            diskon = 0.00; 
        } else if (total <= 200000) {
            diskon = 0.05; 
        } else if (total <= 300000) {
            diskon = 0.10; 
        } else if (total <= 400000) {
            diskon = 0.15; 
        } else if (total <= 500000) {
            diskon = 0.20;
        } else {
            diskon = 0.25;
        }
        
        System.out.println("Total belanja anda    Rp " + total);
        
        diskon = total * diskon;
        total -= diskon;

        System.out.println("Mendapatkan diskon    Rp " + diskon);
        System.out.println("Total belanja menjadi Rp " + total);
        System.out.println("==========================================");
        System.out.print("Masukkan nominal pembayaran : ");
        uangBayar = sc.nextDouble();
        
        if(uangBayar > total){
            uangKembalian = uangBayar - total;
            System.out.println("Kembalian anda senilai : Rp " + uangKembalian); 
        }else if(uangBayar == total){
            System.out.println("Uang Pas");
        }else{
            uangKembalian = uangBayar - total;
            System.out.println("Maaf Uang anda kurang : Rp " + uangKembalian); 
        }
    }
}
