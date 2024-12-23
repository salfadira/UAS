/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mahasiswa;

/**
 *
 * @author salfa
 */
public class Mahasiswa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    String membaca, nyontek, modifikasi, lulus;
    Double ipk;
    int semester;
    
    void printMahasiswa(){
        System.out.println("Mahasiswa Semester " + semester + " Membaca " + membaca);
        System.out.println("Mahasiswa Semester " + semester + " Memodifikasi " + modifikasi);
        System.out.println("Mahasiswa Semester " + semester +  nyontek);
        
    }
}
