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
public class CobaKedua implements interfaceA{
    public void methodSatuA(){
        System.out.println("Isi konstanta dari interface A");
    }
    public  String methodDuaA(){
        return atributA;
    }
    public void methodSatuB(){
        System.out.println("Isi method kedua dari interface B");
    }
    public void methodDuaB(){
        System.out.println("Isi method kedua dari interface B");
    }
    public static void main(String[] args) {
        CobaKedua obj= new CobaKedua();
        String pesan = obj.methodDuaA();
        System.out.println(pesan);
                obj.methodSatuA();
                obj.methodSatuB();
                obj.methodDuaB();
    }
}
