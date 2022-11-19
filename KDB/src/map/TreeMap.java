/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package map;
import java.util.*;
/**
 *
 * @author benje
 */
public class TreeMap implements Interface {
    TreeMap<Employe, Departement> tree_map;
    
    @Override
    public void ajouterEmployeDepartement(Employe e, Departement d) {
        tree_map.put(e,d);
    }
    @Override
    public void supprimerEmploye(Employe e) {
        tree_map.remove(e);
    }
    @Override
    public void afficherLesEmployesLeursDepartements() {
        for (Map.Entry i : tree_map.entrySet()) {
            Employe e = (Employe)i.getKey();
            Departement d = (Departement)i.getValue();
            System.out.println( e.toString() + " : " + d.toString() );
        }
    }
    @Override
    public void afficherLesEmployes() {
        for (Map.Entry i : tree_map.entrySet()) {
            Employe e = (Employe)i.getKey();
            System.out.println( e.toString() );
            }
        }
    @Override
    public void afficherLesDepartements() {
            for (Map.Entry i : tree_map.entrySet()) {
            Departement d = (Departement)i.getValue();
            System.out.println(  d.toString() );
        }
    }
    @Override
    public void afficherDepartement(Employe e) {
        for(Map.Entry i : tree_map.entrySet())
        {
            if(i.getKey().equals(e))
            {
                Departement d = (Departement)i.getValue();
                System.out.println(d.toString());
            }            
        }       
    }
    @Override
    public boolean rechercherEmploye(Employe e) {
        for(Map.Entry i : tree_map.entrySet())
        {
            if(i.getKey().equals(e))
            {
               return true;
            }
        }
        return false;
    }
    @Override
    public boolean rechercherDepartement(Departement e) {
        for(Map.Entry i : tree_map.entrySet())
        {
            if(i.getValue().equals(e))
            {
                return true;
            }           
        }
        return false;
    }    
}
