/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package map;

/**
 *
 * @author benje
 */
public class Departement {
    private int id;
    private String nom;
    
    Departement()
    {
        
    }
    
    Departement(int id,String nom)
    {
        this.id=id;
        this.nom=nom;
    }
    
    int get_id()
    {
        return this.id;
    }
    void set_id()
    {
        this.id=id;
    }    
    String get_nom()
    {
        return this.nom;
    }
    void set_nom(String nom)
    {
        this.nom=nom;
    }    
    @Override
    public String toString()
    {
        return "Departement"+" id= "+ id +" , nom= "+ nom;
    }    
    @Override
    public boolean equals(Object obj)
    {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Departement d = (Departement) obj;
        if (this.id != d.id) {
            return false;
        }
        return true;
    }
}

