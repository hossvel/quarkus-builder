package com.hossvel.service;

import com.hossvel.builder.FacturaDirector;
import com.hossvel.builder.FacturaInternacionalBuilder;
import com.hossvel.builder.FacturaNacionalBuilder;
import com.hossvel.builder.IFacturaBuilder;
import com.hossvel.factory.FacturaFactory;
import com.hossvel.model.Factura;
import com.hossvel.model.FacturaDTO;
import com.hossvel.repository.FacturaRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

import java.util.Set;

@ApplicationScoped
public class FacturaServiceImpl implements IFacturaService{

    @Inject
    FacturaFactory facturaFactory;

    @Inject
    FacturaRepository facturaRepository;

    public Factura crearFactura(FacturaDTO dto) {

        IFacturaBuilder builder = facturaFactory.createFactory(dto.tipo);
        FacturaDirector director = new FacturaDirector(builder);
        director.construirFactura(dto.cliente, dto.direccion, dto.subtotal);
        Factura factura = director.getFactura();
        return facturaRepository.guardar(factura);

    }

    @Override
    public Set<Factura> listAll() {
        return facturaRepository.listAll();
    }

}
