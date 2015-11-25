/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.toystore.beans;

import br.com.toystore.entity.Toy;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author Daniel
 */
@ManagedBean
@SessionScoped
@Getter
@Setter
public class Carrinho {

    private List<Toy> carrinho;
    private String carrinhoTmp;

    /**
     * Creates a new instance of Carrinho
     */
    public Carrinho() {
        carrinho = new ArrayList<>();
    }

    public void addCart() {

        switch (carrinhoTmp) {
            case "1":
                carrinho.add(new Toy(1, "Lego", "Descrição do Lego", "Lego.gif", 100));
                break;
            case "2":
                carrinho.add(new Toy(2, "Banco Imobiliário", "Descrição do Banco Imobiliário", "banco.gif", 150));
                break;
            case "3":
                carrinho.add(new Toy(3, "Jogo da vida", "Descrição do Jogo da vida", "vida.gif", 80));
                break;
            case "4":
                carrinho.add(new Toy(4, "Carro controle remoto", "Descrição do carro controle remoto", "carro.gif", 100));
                break;
        }
    }
    
    public void listCart(){
        
    }

}
