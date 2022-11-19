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
public class HashMap implements Interface{
    HashMap<Employe, Departement> ges_emp = new HashMap<Employe, Departement>();


    @Override
    public void ajouterEmployeDepartement(Employe e, Departement d) {
        ges_emp.put(e,d);
    }
    @Override
    public void supprimerEmploye(Employe e) {
        ges_emp.remove(e);
    }
    @Override
    public void afficherLesEmployesLeursDepartements() {
       for (Employe i : ges_emp.keySet()) {
        System.out.println("key: " + i.toString() + " value: " + ges_emp.get(i).toString());
        }
    }
    @Override
    public void afficherLesEmployes() {
       for (Employe i : ges_emp.keySet()) {
            System.out.println(i.toString());
        }
    }
    @Override
    public void afficherLesDepartements() {
        for (Departement i : ges_emp.values()) {
        System.out.println(i.toString());
        }
    }
    @Override
    public void afficherDepartement(Employe e) {
        System.out.println(ges_emp.get(e).toString());
    }
    @Override
    public boolean rechercherEmploye(Employe e) {
        for(Employe i : ges_emp.keySet())
        {
            if(i.equals(e)==true)
            {
               return true;
            }
        }
        return false;
    }
    @Override
    public boolean rechercherDepartement(Departement e) {
        for(Departement i : ges_emp.values())
        {
            if(i.equals(e)==true)
            {
               return true;
            }
        }
        return false;      
    }   
}    

