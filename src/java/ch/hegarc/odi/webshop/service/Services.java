/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hegarc.odi.webshop.service;

import ch.hegarc.odi.webshop.business.Magasin;
import ch.hegarc.odi.webshop.business.Panier;
import ch.hegarc.odi.webshop.business.Produit;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.ejb.Stateful;
import javax.enterprise.context.SessionScoped;

/**
 *
 * @author floriane.sapin
 */
@SessionScoped
@Stateful
public class Services implements Serializable{
    
    Magasin magasin;
            Panier panier;
    
    public Services(){
        magasin = new Magasin(1, "Amazon");
        panier = new Panier(1, "Panier de Floriane");
        
        Produit produi1 = new Produit(1, "Dictionnaire Larousse", "Dictionnaire français", 25);
        Produit produi2 = new Produit(2, "Livre SMSI", "Management di système d'information", 40);
        Produit produi3 = new Produit(3, "Poster", "Poster 1m x 1m", 20);
        Produit produi4 = new Produit(4, "CD Linkin Park", "Dernier album", 30);
        
        magasin.addProduit(produi1);
        magasin.addProduit(produi2);
        magasin.addProduit(produi3);
        magasin.addProduit(produi4);
        
        panier.addProduits(produi4, 2);

        
    }
    
    public Set<Produit> getProduit(){
        return magasin.getListProduit();
    }
    
    public Map<Produit, Integer> getPanier(){
       

        return panier.getListProduit();
    }
    
    public void addProduitToPanier(Produit produit, Integer qty){
        panier.addProduits(produit, qty);
    }
    
    public void supprProduit(Produit produit){
        panier.suppProduits(produit);
    }
    
    public void updateQty(Produit produit, Integer qty){
        panier.updateQty(produit, qty);
    }
}
