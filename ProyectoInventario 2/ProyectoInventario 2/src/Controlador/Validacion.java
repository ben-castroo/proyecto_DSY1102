/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

/**
 *
 * @author Hp
 */
public class Validacion {
    public static boolean validarVarchar20 (String string){
        return string.length()<20;
    }
    public static boolean validarVarchar30 (String string){
        return string.length()<30;
    }
    public static boolean validarNotNullString (String string){
        return !(string.isBlank());
    }
    public static boolean validarInt(int numero){
        return numero <=999999999 && numero > 0;
    }
}
