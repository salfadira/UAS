/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polymorphism;

/**
 *
 * @author salfa
 */
public class Matematika {
  int operasi;
    double operasiDouble;
            
    void pertambahan (int a, int b) {
        operasi = a + b;
    }
    void pertambahan (int a, int b, int c){
        operasi = a + b + c;
    }
    void pertambahan (double a, double b){
        operasiDouble = a + b;
    }
    void pertambahan (double a, double b, double c){
        operasiDouble = a + b + c;
    }
    void pengurangan (int a, int b) {
        operasi = a - b;
    }
    void pengurangan (int a, int b, int c) {
       operasi = a - b - c; 
    }
    void pengurangan (double a, double b){
        operasiDouble = a - b;
    }
    void pengurangan (double a, double b, double c){
        operasiDouble = a - b - c;
    }
    void perkalian (int a, int b ) {
        operasi = a * b;
    }
    void perkalian (int a, int b,int c){
        operasi = a * b * c;
    }
    void perkalian (double a, double b){
        operasiDouble = a * b;
    }
    void perkalian (double a, double b, double c){
        operasiDouble = a * b * c;
    }
    void pembagian (int a, int b) {
        operasi = a / b;
    }
    void pembagian (int a, int b,int c){
        operasi = a / b / c;
    }
    void pembagian (double a, double b){
        operasiDouble = a / b;
    }
    void pembagian (double a, double b, double c){
        operasiDouble = a / b / c;
    }
    int operasi () {
        return operasi;
    }
    double operasiDouble (){
        return operasiDouble;
    }  
}
