package com.hossvel.builder;

import com.hossvel.model.Factura;
import jakarta.inject.Inject;

public class FacturaDirector {

    private IFacturaBuilder iFacturaBuilder;

    public FacturaDirector(IFacturaBuilder iFacturaBuilder) {
        this.iFacturaBuilder = iFacturaBuilder;
    }

    public void construirFactura(String cliente, String direccion, double subtotal) {
        iFacturaBuilder.construirCliente(cliente);
        iFacturaBuilder.construirDireccion(direccion);
        iFacturaBuilder.construirMoneda();
        iFacturaBuilder.calcularTotal(subtotal);
        iFacturaBuilder.calcularImpuestos();
    }

    public Factura getFactura() {
        return iFacturaBuilder.getFactura();
    }
}
