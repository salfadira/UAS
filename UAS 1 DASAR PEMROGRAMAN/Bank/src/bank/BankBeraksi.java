/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bank;

/**
 *
 * @author salfa
 */
public class BankBeraksi {
  public static void main(String[] args){
        Bank bnk = new Bank(100000);
        bnk.getSaldo(100000);
        bnk.simpanUang(500000);
        bnk.ambilUang(150000);
  }
}
