package com.hossvel.builder;

import com.hossvel.model.Factura;

public class FacturaInternacionalBuilder implements IFacturaBuilder{
    private Factura factura = new Factura();

    public void construirCliente(String nombre) {
        factura.setCliente(nombre);
    }

    public void construirDireccion(String direccion) {
        factura.setDireccion(direccion);
    }

    public void construirMoneda() {
        factura.setMoneda("USD");
    }

    public void calcularTotal(double subtotal) {
        factura.setTotal(subtotal);
    }

    public void calcularImpuestos() {
        factura.setImpuestos(0); // Exento de impuestos
    }

    public Factura getFactura() {
        return factura;
    }
}
