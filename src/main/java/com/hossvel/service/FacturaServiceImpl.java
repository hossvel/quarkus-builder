package com.hossvel.service;

import com.hossvel.builder.FacturaDirector;
import com.hossvel.builder.FacturaInternacionalBuilder;
import com.hossvel.builder.FacturaNacionalBuilder;
import com.hossvel.builder.IFacturaBuilder;
import com.hossvel.model.Factura;
import com.hossvel.model.FacturaDTO;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class FacturaServiceImpl implements IFacturaService{

    public Factura construirFactura(FacturaDTO dto) {

        IFacturaBuilder builder = switch (dto.tipo.toLowerCase()) {
            case "nacional" -> new FacturaNacionalBuilder();
            case "internacional" -> new FacturaInternacionalBuilder();
            default -> throw new IllegalArgumentException("Tipo de factura no válido");
        };

        FacturaDirector director = new FacturaDirector(builder);
        director.construirFactura(dto.cliente, dto.direccion, dto.subtotal);
        return director.getFactura();
    }
}
