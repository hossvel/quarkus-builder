package com.hossvel.resource;

import com.hossvel.model.Factura;
import com.hossvel.model.FacturaDTO;
import com.hossvel.service.IFacturaService;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.Response;

import java.util.Set;

@Path("/factura")

public class FacturaResource {

    @Inject
    IFacturaService ifacturaService;

    @POST
    public Response crearFactura(FacturaDTO facturaDTO) {

        Factura factura =  ifacturaService.crearFactura(facturaDTO);

        return Response.status(Response.Status.CREATED).entity(factura).build();
    }

    @GET
    public Set<Factura> listAll() {
        return ifacturaService.listAll();
    }

}
