package com.hossvel.builder;

import com.hossvel.model.Factura;

public class FacturaNacionalBuilder implements IFacturaBuilder{

    private Factura factura = new Factura();

    public void construirCliente(String nombre) {
        factura.setCliente(nombre);
    }

    public void construirDireccion(String direccion) {
        factura.setDireccion(direccion);
    }

    public void construirMoneda() {
        factura.setMoneda("PEN");
    }

    public void calcularTotal(double subtotal) {
        factura.setTotal(subtotal);
    }

    public void calcularImpuestos() {
        factura.setImpuestos(factura.getTotal() * 0.18); // IGV 18%
    }

    public Factura getFactura() {
        return factura;
    }
   }
