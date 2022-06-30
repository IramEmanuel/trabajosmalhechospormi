package com.upchiapas.cola;

import com.upchiapas.cola.modelos.CatalogoPizza;
import com.upchiapas.cola.modelos.OrdenCompra;

public class Main {
public static void main (String [] args){
    CatalogoPizza Catalogo = new CatalogoPizza() {
    @Override
    public void Catalogo() {}
    };
    OrdenCompra orden = new OrdenCompra() {
        @Override
        public void orden() {}
    };
    System.out.println(Catalogo);
    System.out.println("\n*****************************************\n");
    System.out.println(orden);

    }
}
