/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MatematikaCanggih;

/**
 *
 * @author salfa
 */
public class Matematika {
   
    int operasi;         
    void pertambahan (int a, int b) {
        operasi = a + b;
    }
   
    void pengurangan (int a, int b) {
        operasi = a - b;
    }
    
    void perkalian (int a, int b ) {
        operasi = a * b;
    }
    
    void pembagian (int a, int b) {
        operasi = a / b;
    }
    
    void modulus(int a, int b) {
        operasi = a % b;
    }
    
    int operasi () {
        return operasi;
    }
    
     
    
    
    }
    

