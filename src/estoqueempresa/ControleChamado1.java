
package estoqueempresa;

import java.util.Date;
import javafx.scene.chart.PieChart.Data;

public class ControleChamado1 {
    
    private String titulo;
    private String descricao;
    private Date dataAbertura;
    private int numeroEquipamento;

    public ControleChamado1(String titulo, String descricao, Date dataAbertura, int numeroEquipamento) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.dataAbertura = dataAbertura;
        this.numeroEquipamento = numeroEquipamento;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Date getDataAbertura() {
        return dataAbertura;
    }

    public void setDataAbertura(Date dataAbertura) {
        this.dataAbertura = dataAbertura;
    }

    public int getNumeroEquipamento() {
        return numeroEquipamento;
    }

    public void setNumeroEquipamento(int numeroEquipamento) {
        this.numeroEquipamento = numeroEquipamento;
    }

    
    
    
    
    
}
