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
public class Employe {
    private int cin;
    private String matr;
    private String nom;
    private String prenom;    
    Employe()
    {}      
    Employe(int cin,String matr,String nom,String prenom)
    {
        this.cin=cin;
        this.matr=matr;
        this.nom=nom;
        this.prenom=prenom;
    }    
    int get_cin()
    {
        return this.cin;
    }
    void set_cin(int cin)
    {
        this.cin=cin;
    }
    
    String get_matr()
    {
        return this.matr;
    }
    void set_matr(String matr)
    {
        this.matr=matr;
    }
    
    String get_nom()
    {
        return this.nom;
    }
    void set_nom(String nom)
    {
        this.nom=nom;
    }
    String get_prenom()
    {
        return this.prenom;
    }
    void set_prenom(String prenom)
    {
        this.prenom=prenom;
    }    
    @Override
    public  String toString()
    {
        return  "Employe" + "cin=" + cin + ", matr=" + matr  + ", nom=" + nom +", prenom=" + prenom ;
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
        Employe e = (Employe) obj;
        if (this.cin != e.cin) {
            return false;
        }
        return true;        
    }    
}
