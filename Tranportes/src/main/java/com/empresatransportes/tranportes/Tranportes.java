/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.empresatransportes.tranportes;

/**
 *
 * @author nicolas
 */
public class Tranportes {

    public static void main(String[] args) {
        Veiculo oni = new Veiculo("45682252A","Scania","Motora","Cuiaba","GOiania ",6000.0f,10,20,300.0f);
        
        VeiculoSemEncap oni1 = new VeiculoSemEncap("45682252A","Scania","Motora","Cuiaba","GOiania ",6000.0f,10,20,300.0f);
        
        oni.setCityOri("primavera");
        oni.adicionarPas(10);
         System.out.println("O valor total dessa viagem foi "+ oni.getValoT());
         
         
        oni1.setCityOri("primavera");
        oni1.adicionarPas(10);
         System.out.println("O valor total dessa viagem foi "+ oni1.getValoT());
    }
}
