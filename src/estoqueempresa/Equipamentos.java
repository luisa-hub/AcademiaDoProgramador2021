/*
Classe responsável pelos atributos e métodos
utilizados com os equipamentos
 */
package estoqueempresa;

import java.util.ArrayList;
import java.util.Date;


public class Equipamentos {
    
    private String nome;
    private double preco;
    private int nro_serie;
    private Date dt_fabricacao;
    private String fabricante;

    
    // Construtor
    public Equipamentos(String nome, double preco, int nro_serie, Date dt_fabricacao, String fabricante) {
        this.nome = nome;
        this.preco = preco;
        this.nro_serie = nro_serie;
        this.dt_fabricacao = dt_fabricacao;
        this.fabricante = fabricante;
    }

    
    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getNro_serie() {
        return nro_serie;
    }

    public void setNro_serie(int nro_serie) {
        this.nro_serie = nro_serie;
    }

    public Date getDt_fabricacao() {
        return dt_fabricacao;
    }

    public void setDt_fabricacao(Date dt_fabricacao) {
        this.dt_fabricacao = dt_fabricacao;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }
    
    
     // Getters e Setters
    
  
    
    
}
