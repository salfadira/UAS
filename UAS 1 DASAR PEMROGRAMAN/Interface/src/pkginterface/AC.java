/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkginterface;

/**
 *
 * @author salfa
 */
public class AC implements InterfaceAC {
 int statusAC;
    String modeAC = "Normal"; 

    public void hidupkanAC() {
        if (statusAC == KEADAAN_MATI) {
            statusAC = KEADAAN_HIDUP;
            System.out.println("Hidupkan AC!  -->  AC Hidup");
        } else {
            System.out.println("Hidupkan AC!  -->  AC Sudah Hidup");
        }
    }

    public void matikanAC() {
        if (statusAC == KEADAAN_HIDUP) {
            statusAC = KEADAAN_MATI;
            modeAC = "Normal";
            System.out.println("Matikan AC!  -->  AC Mati");
        } else {
            System.out.println("Matikan AC!  -->  AC Sudah Mati");
        }
    }

    public void dinginkanAC() {
        if (statusAC == KEADAAN_HIDUP) {
            modeAC = "Dingin";
            System.out.println("Atur Mode AC!  -->  Mode Dingin");
        } else {
            System.out.println("Atur Mode AC!  -->  Hidupkan AC Terlebih Dahulu");
        }
    }

    public void panaskanAC() {
        if (statusAC == KEADAAN_HIDUP) {
            modeAC = "Panas";
            System.out.println("Atur Mode AC!  -->  Mode Panas");
        } else {
            System.out.println("Atur Mode AC!  -->  Hidupkan AC Terlebih Dahulu");
        }
    }   
}
