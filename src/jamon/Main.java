/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jamon;

/**
 *
 * @author portatil_profesorado
 */
public class Main {
    
    public static void main(String[] args) {
        JamónMoralesMunozJonathanJose2122 miJamonMoralesMunozJonathanJose2122;
        int stockActual;
        
        miJamonMoralesMunozJonathanJose2122 = new JamónMoralesMunozJonathanJose2122("5Jotas",580,100);
        vendeJamMoralesMunozJonathanJose2122(miJamonMoralesMunozJonathanJose2122, España);
        
        compraJamMoralesMunozJonathanJose2122(miJamonMoralesMunozJonathanJose2122);
        stockActual = miJamonMoralesMunozJonathanJose2122.obtenerStock();
        System.out.println("El stock actual es "+ stockActual );
    }

    private static void compraJamMoralesMunozJonathanJose2122(JamónMoralesMunozJonathanJose2122 miJamonMoralesMunozJonathanJose2122) {
        try
        {
            System.out.println("Compra de Jamones");
            miJamonMoralesMunozJonathanJose2122.comprar(50);
        } catch (Exception e)
        {
            System.out.print("Fallo al ingresar " + e);
        }
    }

    private static void vendeJamMoralesMunozJonathanJose2122(JamónMoralesMunozJonathanJose2122 miJamonMoralesMunozJonathanJose2122, String paisMoralesMunozJonathanJose2122) {
        try
        {
            System.out.println("Venta de Jamones");
            miJamonMoralesMunozJonathanJose2122.vender(80);
        } catch (Exception e)
        {
            System.out.print("Fallo al vender " + e);
        }
    }
}
