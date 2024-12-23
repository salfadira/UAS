/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MatematikaCanggih;

/**
 *
 * @author salfa
 */
public class MatematikaCanggihBeraksi {
     public static void main(String[] args) {
        MatematikaCanggih mtk = new MatematikaCanggih();
        mtk.pertambahan(10, 12);
        System.out.println("Pertambahan 10 + 12 = " + mtk.operasi());
        mtk.pengurangan(50, 21);
        System.out.println("Pengurangan 50 - 21 = " + mtk.operasi());
        mtk.perkalian(25, 4);
        System.out.println("Perkalian 25 * 4 = " + mtk.operasi());
        mtk.pembagian(70, 10);
        System.out.println("Pembagian 70 / 10 = " + mtk.operasi());
        mtk.modulus(10, 3);
        System.out.println("Modulus 10 % 3 = " + mtk.operasi());
    }
}
