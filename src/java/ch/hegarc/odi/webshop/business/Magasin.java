/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hegarc.odi.webshop.business;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author floriane.sapin
 */
public class Magasin {
    
    private Integer id;
    private String nom;
    private Set<Produit> listProduit;

    public Magasin(Integer id, String nom) {
        this.id = id;
        this.nom = nom;
        listProduit = new HashSet<Produit>();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
    
    public void addProduit(Produit produit){
        listProduit.add(produit);
    }

    public Set<Produit> getListProduit() {
        return listProduit;
    }

    public void setListProduit(Set<Produit> listProduit) {
        this.listProduit = listProduit;
    }
    
    
    
    
     
}
