package com.morgado.jardineria.model.Entity;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

//La funcion de esta clase + @Entity va a crear la tabla
//Gamas en el SGBD --> Create Table
@Entity
@Table(name = "Gamas")
public class Gamas {
    
    @Id //primary key
    private String gamaid;
    
    @Column(name = "descripcion", length=50, nullable = true)
    @NotEmpty
    private String descripcionTexto;
    
    @Column(name = "imagen",nullable = true)
    @NotEmpty
    private String imagen;

    public Gamas(){}
    public Gamas(String Gama, String DescripcionTexto, String Imagen ){
        this.setGamaid(Gama);
        this.setDescripcionTexto(DescripcionTexto);
        this.setImagen(Imagen);
    }
 
    public void setGamaid(String id){
        this.gamaid = id; 
    }
    
    public String getGamaid(){
        return this.gamaid;
    }

    public void setDescripcionTexto(String descTexto){
        this.descripcionTexto = descTexto;
    }
    public String getDescripcionTexto(){
        return this.descripcionTexto;
    }

    public void setImagen(String img){
        this.imagen = img;
    }
    public String getImagen(){
        return this.imagen;
    }

    @Override
    public String toString() {
        return 
                "[" + this.gamaid + "," 
                + this.descripcionTexto + "," 
                + this.imagen + "]";
    }
}
