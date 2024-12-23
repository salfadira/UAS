/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polymorphism;

/**
 *
 * @author salfa
 */
public class MatematikaCanggihBeraksi {
  public static void main(String[] args) {
        MatematikaCanggih mtk = new MatematikaCanggih();
        mtk.pertambahan(23, 34);
        System.out.println("pertambahan 2 int = " + mtk.operasi);
        mtk.pertambahan(12, 28, 14);
        System.out.println("pertambahan 3 int = " + mtk.operasi);
        mtk.pertambahan(3.4, 4.9);
        System.out.println("pertambahan 2 double = " + mtk.operasiDouble);
        mtk.pertambahan(12.5, 28.7, 14.1);
        System.out.println("pertambahan 3 double = " + mtk.operasiDouble);
        
        mtk.pengurangan(23, 34);
        System.out.println("pengurangan 2 int = " + mtk.operasi);
        mtk.pengurangan(12, 28, 14);
        System.out.println("pengurangan 3 int = " + mtk.operasi);
        mtk.pengurangan(3.4, 4.9);
        System.out.println("pengurangan 2 double = " + mtk.operasiDouble);
        mtk.pengurangan(12.5, 28.7, 14.1);
        System.out.println("pengurangan 3 double = " + mtk.operasiDouble);
        
        mtk.perkalian(23, 34);
        System.out.println("perkalian 2 int = " + mtk.operasi);
        mtk.perkalian(12, 28, 14);
        System.out.println("perkalian 3 int = " + mtk.operasi);
        mtk.perkalian(3.4, 4.9);
        System.out.println("perkalian 2 double = " + mtk.operasiDouble);
        mtk.perkalian(12.5, 28.7, 14.1);
        System.out.println("perkalian 3 double = " + mtk.operasiDouble);
        
        mtk.pembagian(23, 34);
        System.out.println("pembagian 2 int = " + mtk.operasi);
        mtk.pembagian(12, 28, 14);
        System.out.println("pembagian 3 int = " + mtk.operasi);
        mtk.pembagian(3.4, 4.9);
        System.out.println("pembagian 2 double =" + mtk.operasiDouble);
        mtk.pembagian(12.5, 28.7, 14.1);
        System.out.println("pembagian 3 double = " + mtk.operasiDouble);
        
        mtk.modulus(23, 34);
        System.out.println("modulus 2 int = " + mtk.operasi);
        mtk.modulus(12, 28, 14);
        System.out.println("modulus 3 int = " + mtk.operasi);
        mtk.modulus(3.4, 4.9);
        System.out.println("modulus 2 double = " + mtk.operasiDouble);
        mtk.modulus(12.5, 28.7, 14.1);
        System.out.println("modulus 3 double = " + mtk.operasiDouble);
    }   
}
