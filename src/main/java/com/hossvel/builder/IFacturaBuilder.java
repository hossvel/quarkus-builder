package com.hossvel.builder;

import com.hossvel.model.Factura;

public interface IFacturaBuilder {
    void construirCliente(String nombre);
    void construirDireccion(String direccion);
    void construirMoneda();
    void calcularTotal(double subtotal);
    void calcularImpuestos();
    Factura getFactura();
}
