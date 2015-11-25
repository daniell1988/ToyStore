
package br.com.toystore.ejb;

import br.com.toystore.entity.Toy;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Stateless
public class SearchEngine {

    private List<Toy> brinquedos = null;
    private List<Toy> carrinho = null;
    
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    public SearchEngine(){
    
        
    }
    
    public List<Toy> buscar(String palavra){
        brinquedos = new ArrayList<Toy>();
        brinquedos.add(new Toy(1, "Lego", "Descrição do Lego", "Lego.gif", 100));
        brinquedos.add(new Toy(2, "Banco Imobiliário", "Descrição do Banco Imobiliário", "banco.gif", 150));
        brinquedos.add(new Toy(3, "Jogo da vida", "Descrição do Jogo da vida", "vida.gif", 80));
        brinquedos.add(new Toy(4, "Carro controle remoto", "Descrição do carro controle remoto", "carro.gif", 100));
        
        List<Toy> retorno = new ArrayList<Toy>(); 
        
        for (Toy brinquedo : brinquedos) {
            if(brinquedo.getName().toUpperCase().contains(palavra.toUpperCase())){
                retorno.add(brinquedo);
            }
                
        }
        
        return retorno;
    }
}
