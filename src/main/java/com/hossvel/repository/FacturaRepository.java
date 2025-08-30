package com.hossvel.repository;

import com.hossvel.model.Factura;
import jakarta.enterprise.context.ApplicationScoped;

import java.util.Collections;
import java.util.HashMap;
import java.util.Set;

@ApplicationScoped
public class FacturaRepository {
    private Set<Factura> facturas = Collections.newSetFromMap(Collections.synchronizedMap(new HashMap<>()));

    public Set<Factura> listAll() {

        return facturas;
    }

    public Factura guardar(Factura factura) {
       System.out.println(factura.toString());
        facturas.add(factura);

        return factura;
    }
}
