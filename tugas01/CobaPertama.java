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
public class CobaPertama implements interfaceA{
    public void methodSatuA(){
        System.out.println("Isi konstanta dari interface A");
    }
    public String methodDuaA(){
        return atributA;
    }
    public static void main(String[] args) {
        CobaPertama obj = new CobaPertama();
        obj.methodSatuA();
        String pesan = obj.methodDuaA();
        System.out.println(pesan);
    }
}
