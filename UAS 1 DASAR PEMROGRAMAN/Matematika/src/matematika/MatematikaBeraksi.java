/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matematika;

/**
 *
 * @author salfa
 */
public class MatematikaBeraksi {
    public static void main (String[] agrs) {
    Matematika mtk = new Matematika();
        mtk.pertambahan(20, 17);
        System.out.println("pertambahan 20 + 17 = " + mtk.operasi());
        mtk.pengurangan(15, 5);
        System.out.println("pengurangan 15 + 5 = " + mtk.operasi());
        mtk.perkalian(18, 3);
        System.out.println("perkalian 18 + 3 = " + mtk.operasi());
        mtk.pembagian(90, 9);
        System.out.println("pembagian 90 + 9 = " + mtk.operasi());
    }  
}
