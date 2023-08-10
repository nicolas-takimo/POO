/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.empresatransportes.tranportes;

/**
 *
 * @author nicolas
 */
public class Veiculo {
    private String placa; 
    private String modelo; 
    private String motora; 
    private String cityori;
    private String citydest; 
    private float distper;
    private int qtdvocu; 
    private int qtdvliv;
    private float valor;
    private float valort;


Veiculo( String placa, String modelo, String motora, String cityori, String citydest, float distper, int qtdvocu, int qtdvliv, float valor){
    this.placa = placa;
    this.modelo = modelo;
    this.motora = motora; 
    this.cityori = cityori;
    this.citydest = citydest; 
    this.distper = distper;
    this.qtdvocu = qtdvocu;
    this.qtdvliv = qtdvliv;
    this.valor = valor;
    this.valort = valor * qtdvocu;
    


}

void adicionarPas(int pa){
    int aux = this.qtdvocu;
    if (this.qtdvliv > this.qtdvocu){
        this.qtdvliv -= pa; 
        this.qtdvocu += pa;
    }
    this.valort = this.valort +(this.valor *(this.qtdvocu - aux));
} 
void verifiAssent(){
    if(this.qtdvliv > this.qtdvocu){
        this.qtdvocu --;
    System.out.println("Tem vagas livres e a quantidade é "+ this.qtdvliv);
    }else{
        System.out.println("Não tem vagas livres ");
    }
        
}
public String getPlaca(){
    return this.placa;
}
public String getModelo(){
    return this.modelo;
}public String getMotora(){
    return this.motora;
}public String getCityOri(){
    return this.cityori;
}public String getCityDest(){
    return this.citydest;
}
public float getDistPer(){
    return this.distper;
}
public int getQtdVOcu(){
    return this.qtdvocu;
}
public float getValor (){
    return this.valor;
}

public float getValoT(){
    return this.valort;
}

public void setPlaca( String p){
    this.placa = p;
}

public void setModelo(String m){
    this.modelo = m;
}
public void setCityOri(String co){
    
    
    this.valor -= 5.0f;
    this.cityori = co;
    System.out.println("Chegamos em uma parada o novo valor da passagem é "+ this.valor +"R$");
    
}
public void setCityDest(String cd){
    this.valor += 25.0f;
    this.citydest = cd;
    System.out.println("Você alterou o destino da viagem e agora o novo valor é "+this.valor+"R$");
    
}
public void setDistPer(float d){
    if(this.qtdvocu < this.qtdvliv){
    }
    this.distper = d;
}
public void setQtdVOcu(int q){
    this.qtdvocu = q;
}
public void setQtdLiv(int ql){
    this.qtdvliv = ql;
}
public void setValor(float v){
    this.valor = v;
}
public void setValorT(float vt){
    this.valort = vt;
}




}