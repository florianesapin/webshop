/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hegarc.odi.webshop.business;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author floriane.sapin
 */
public class Panier {
    
    private Integer id;
    private String nom;
    private Map<Produit, Integer> listProduit;

    public Panier(Integer id, String nom) {
        this.id = id;
        this.nom = nom;
        listProduit = new HashMap<Produit, Integer>();
        
    }
    
    public void addProduits(Produit produit, Integer qty){
        if (listProduit.containsKey(produit)){
            listProduit.replace(produit, listProduit.get(produit) + qty);
        } else{
            listProduit.put(produit, qty);
        }
    }
    
    public void suppProduits(Produit produit, Integer qty){
        if(listProduit.containsKey(produit)){
            if (listProduit.get(qty)> qty){
                listProduit.replace(produit, listProduit.get(produit) - qty);
            } else {
                listProduit.remove(produit);
            }
        }
    }
    
    public void updateQty(Produit produit, Integer newQty){
        listProduit.replace(produit, newQty);
    }
    
    
    
    
    
}
