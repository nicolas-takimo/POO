/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula2;

/**
 *
 * @author nicolas
 */
public class Veiculos {
    	String modelo;
	String compania; 
	String origem;
	String destino;
        
        int plat;
        int codvoo;
	int qtdcomb;
        int tempVoo;
	int numeroPassageiros; 
	int qtd_pilotos ;
	int qtd_aero_mocas;
        
        
        Veiculos (String modelo, String campania, String origem, String destino, int plat, int codvoo, int qtdcomb,int tempVoo, int numeroPassageiros, int qtd_pilotos, int qtd_aero_mocas){
            this.modelo = modelo; 
            this.compania = compania; 
            this.origem = origem; 
            this.destino = destino; 
            this.plat = plat; 
            this.qtdcomb = qtdcomb;
            this.tempVoo = tempVoo;
            this.numeroPassageiros = numeroPassageiros;
            this.qtd_pilotos = qtd_pilotos;
            this.qtd_aero_mocas = qtd_aero_mocas;
        }
        void imprimirRota(){
            System.out.println("VOO:"+ codvoo +"DE ORIGEM: "+ origem +"Com destino: "+destino+" Está na plataforma "+plat);
}
      void checkList(){
          System.out.println(""
                  + "O avião da compania "+compania+"com o voo de código"+codvoo+"Está na plataforma"+plat+"Com "+qtdcomb+" litros de avgás com uma equipe de "+qtd_pilotos+" pilotos "
          + "e conta com uma equipe de "+ qtd_aero_mocas+ "aero mocas e está com "+numeroPassageiros+" passageiros e se encontra pronto para viagem");
      }
      int combuGasto(int qtdcomb,int tempVoo){
          for(int i = tempVoo; i >= 0 ; i--){
              qtdcomb --;
          }
          return qtdcomb;
      }
      void queda(int qtdcomb){
          if (qtdcomb == 0){
              System.out.println("FUDEUUUUUUUU! avião está em queda pois o combustível acabou");
          }
}
      void tempodeVoo (int tempVoo,int lim ){
          if(tempVoo > lim){
              System.out.println("IXI SEU VOO ESTÁ ATRASADO");
          }
      }
} 






