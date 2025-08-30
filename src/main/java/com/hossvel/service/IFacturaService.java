package com.hossvel.service;

import com.hossvel.model.Factura;
import com.hossvel.model.FacturaDTO;

import java.util.Set;

public interface IFacturaService {
    public Factura crearFactura(FacturaDTO dto);
    public Set<Factura> listAll();
}
