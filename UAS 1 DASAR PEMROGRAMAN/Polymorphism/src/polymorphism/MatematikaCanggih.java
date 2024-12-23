/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polymorphism;

/**
 *
 * @author salfa
 */
public class MatematikaCanggih extends Matematika{
    
  void modulus(int a, int b) {
        operasi = a % b;
    }
    void modulus (int a, int b, int c){
        operasi = a % b % c;
    }
    void modulus (double a, double b){
        operasiDouble = a % b;
    }
    void modulus (double a, double b, double c){
        operasiDouble = a % b % c;
    }  
}
