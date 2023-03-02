/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas01;

/**
 *
 * @author UMUM FISIP
 */
public class UjiSemua {
    public static void main(String[] args) {
        kalkulator obj = new kalkulator();
        obj.pengurangan();
        obj.penjumlahan();
        
        Superhero obj2 = new Superhero();
        obj2.superman();
        obj2.spiderman();
        obj2.thor();
        
        Bank obj3 = new Bank();
        obj3.Menabung();
        obj3.Transfer();
        obj3.Menarik();
    }
}
