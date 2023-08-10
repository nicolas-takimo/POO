/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.empresatransportes.tranportes;

/**
 *
 * @author nicolas
 */
class VeiculoSemEncap {
    String placa; 
    String modelo; 
    String motora; 
    String cityori;
    String citydest; 
    float distper;
    int qtdvocu; 
    int qtdvliv;
    float valor;
    float valort;

    VeiculoSemEncap(String placa, String modelo, String motora, String cityori, String citydest, float distper, int qtdvocu, int qtdvliv, float valor) {
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

    void adicionarPas(int pa) {
        int aux = this.qtdvocu;
        if (this.qtdvliv > this.qtdvocu) {
            this.qtdvliv -= pa; 
            this.qtdvocu += pa;
        }
        this.valort = this.valort + (this.valor * (this.qtdvocu - aux));
    }

    void verifiAssent() {
        if (this.qtdvliv > this.qtdvocu) {
            this.qtdvocu--;
            System.out.println("Tem vagas livres e a quantidade é " + this.qtdvliv);
        } else {
            System.out.println("Não tem vagas livres ");
        }
    }

    String getPlaca() {
        return this.placa;
    }

    String getModelo() {
        return this.modelo;
    }

    String getMotora() {
        return this.motora;
    }

    String getCityOri() {
        return this.cityori;
    }

    String getCityDest() {
        return this.citydest;
    }

    float getDistPer() {
        return this.distper;
    }

    int getQtdVOcu() {
        return this.qtdvocu;
    }

    float getValor() {
        return this.valor;
    }

    float getValoT() {
        return this.valort;
    }

    void setPlaca(String p) {
        this.placa = p;
    }

    void setModelo(String m) {
        this.modelo = m;
    }

    void setCityOri(String co) {
        this.valor -= 5.0f;
        this.cityori = co;
        System.out.println("Chegamos em uma parada o novo valor da passagem é " + this.valor + "R$");
    }

    void setCityDest(String cd) {
        this.valor += 25.0f;
        this.citydest = cd;
        System.out.println("Você alterou o destino da viagem e agora o novo valor é " + this.valor + "R$");
    }

    void setDistPer(float d) {
        if (this.qtdvocu < this.qtdvliv) {
        }
        this.distper = d;
    }

    void setQtdVOcu(int q) {
        this.qtdvocu = q;
    }

    void setQtdLiv(int ql) {
        this.qtdvliv = ql;
    }

    void setValor(float v) {
        this.valor = v;
    }

    void setValorT(float vt) {
        this.valort = vt;
    }
}
