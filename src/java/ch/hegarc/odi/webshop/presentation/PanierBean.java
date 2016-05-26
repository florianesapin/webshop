/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hegarc.odi.webshop.presentation;

import ch.hegarc.odi.webshop.business.Produit;
import ch.hegarc.odi.webshop.service.Services;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import javax.inject.Named;
import javax.enterprise.context.Dependent;
import javax.inject.Inject;

/**
 *
 * @author floriane.sapin
 */
@Named(value = "panierBean")
@Dependent
public class PanierBean {
    
    @Inject Services services;

    /**
     * Creates a new instance of PanierBean
     */
    public PanierBean() {
        
    }
    
        public Set<Produit> getProduits(){
      
            return services.getPanier().keySet();
        


    }
        
        public void addProduitToPanier(Produit produit, Integer qty){
            services.addProduitToPanier(produit, qty);
        }
    
}
