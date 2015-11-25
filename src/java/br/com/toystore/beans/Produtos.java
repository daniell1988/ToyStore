/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.toystore.beans;

import br.com.toystore.ejb.SearchEngine;
import br.com.toystore.entity.Toy;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author 71520562
 */
@ManagedBean
@SessionScoped
@Getter
@Setter
public class Produtos {

    private String palavraBusca;
    @EJB
    private SearchEngine searchEngine;
    private List<Toy> resultadoBusca;

    /**
     * Creates a new instance of Produtos
     */
    public Produtos() {
        palavraBusca = "";
        resultadoBusca = new ArrayList<>();
    }

    public void buscar() {
        resultadoBusca = searchEngine.buscar(this.palavraBusca);
    }
    
    

}
