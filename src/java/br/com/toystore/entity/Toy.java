
package br.com.toystore.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Toy {
    private int id;
    private String name;
    private String description;
    private String image;
    private double price;
    
    public Toy(){}
    public Toy(int _id, String _name, String _description, String _image, double _price){
        this.setId(_id);
        this.setImage(_image);
        this.setDescription(_description);
        this.setName(_name);
        this.setPrice(_price);
    }
}
