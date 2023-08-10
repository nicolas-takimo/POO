/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.aula2;

/**
 *
 * @author nicolas
 */
public class Aula2 {

    public static void main(String[] args) {
       // Personagem p ;
       // Personagem sc;
        
       //p= new Personagem("Miranha",'m',"Marvel",'p');
       //sc = new Personagem("Super Choque", 'm', "Dc comics",'p');
        
       //p.imprimirNome();
       //sc.imprimirNome();
        //p.imprimir();
        
        Veiculos av1;
        Veiculos av2;
        Veiculos av3;
        Veiculos av4;
        Veiculos av5;
        
        av1 = new Veiculos("antonv", "Gol", "amapa", "cuiaba", 3, 123, 10000, 2, 300, 2,4);
        av2 = new Veiculos("Embraer", "TAM", "Recife", "Guarulhos", 6,456,5000,3,200,2,6);
        av3 = new Veiculos("Boing","AZUL","São paulo","Rio de janeiro",15,567,7000,3,350,2,4);
        av4 = new Veiculos("AirBus","American air lines","Texas USA","Guarulhos", 300,8000,3,5,200,6,3);
        av5 = new Veiculos("AIrbus","EMIRATES","Texas USA","Guarulhos", 300,8000,3,5,200,6,3);
        
        
        av1.checkList();
        av2.checkList();
        av3.checkList();
        av4.checkList();
        av5.checkList();
        
        av1.imprimirRota();
        av2.imprimirRota();
        av3.imprimirRota();
        av4.imprimirRota();
        av5.imprimirRota();
        
        av1.queda(300000);
        av2.queda(300000);
        av3.queda(300000);
        av4.queda(300000);
        av5.queda(300000);
        
        av1.combuGasto(3000000, 4000);
        av2.combuGasto(3000000, 4000);
        av3.combuGasto(3000000, 4000);
        av4.combuGasto(3000000, 4000);
        av5.combuGasto(3000000, 4000);
        
        av1.tempodeVoo(3, 5);
        av2.tempodeVoo(3, 4);
        av3.tempodeVoo(3, 2);
        av4.tempodeVoo(3, 1);
        av5.tempodeVoo(3, 1);
    }
}
