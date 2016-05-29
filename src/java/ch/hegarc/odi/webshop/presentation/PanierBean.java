/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hegarc.odi.webshop.presentation;

import ch.hegarc.odi.webshop.business.Produit;
import ch.hegarc.odi.webshop.service.Services;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import javax.inject.Named;
import javax.enterprise.context.Dependent;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.SessionScoped;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;

/**
 *
 * @author floriane.sapin
 */
@Named(value = "panierBean")
@SessionScoped
public class PanierBean implements Serializable{

    @Inject
    Services services;

    /**
     * Creates a new instance of PanierBean
     */
    public PanierBean() {

    }

    public Set<Produit> getProduits() {
        return services.getPanier().keySet();

    }

    public void addProduitToPanier(Produit produit, Integer qty) {
        services.addProduitToPanier(produit, qty);
    }

    public Integer getQtyproduit(Produit produit) {
        return services.getPanier().get(produit);
    }

    public void supprProduit(Produit produit) {
        services.supprProduit(produit);
    }
    
    public void updateQry(Produit produit, Integer qty){
        services.updateQty(produit, qty);
    }

}
