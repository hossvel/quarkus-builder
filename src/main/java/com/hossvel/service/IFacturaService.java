package com.hossvel.service;

import com.hossvel.model.Factura;
import com.hossvel.model.FacturaDTO;

public interface IFacturaService {
    public Factura construirFactura(FacturaDTO dto);
}
