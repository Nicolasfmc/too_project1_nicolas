/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsul.bcc.too.topico5.exercicios.estudocaso_csgo;

import java.util.Calendar;
import java.util.Collection;

/**
 *
 * @author 20202PF.CC0012
 */
public class Compra {
    private Integer id;
    private Calendar data;
    private Float total;
    private Collection<ItensCompra> itensCompra;
    
    public Compra() {
    }

    public Compra(Integer id, Calendar data, Float total, Collection<ItensCompra> itensCompra) {
        this.id = id;
        this.data = data;
        this.total = total;
        this.itensCompra = itensCompra;
    }

    public void setData(Calendar data) {
        this.data = data;
    }

    public Calendar getData() {
        return data;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setItensCompra(Collection<ItensCompra> itensCompra) {
        this.itensCompra = itensCompra;
    }

    public Collection<ItensCompra> getItensCompra() {
        return itensCompra;
    }
    
    public void setItemCompra(ItensCompra itemCompra) {
        this.itensCompra.add(itemCompra);
    }

    public void setTotal(Float total) {
        this.total = total;
    }

    public Float getTotal() {
        return total;
    }
    
}
