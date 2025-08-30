package com.hossvel.model;

public class Factura {
    private String cliente;
    private String direccion;
    private String moneda;
    private double total;
    private double impuestos;

    // Setters
    public void setCliente(String cliente) { this.cliente = cliente; }
    public void setDireccion(String direccion) { this.direccion = direccion; }
    public void setMoneda(String moneda) { this.moneda = moneda; }
    public void setTotal(double total) { this.total = total; }
    public void setImpuestos(double impuestos) { this.impuestos = impuestos; }

    public String getCliente() {
        return cliente;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getMoneda() {
        return moneda;
    }

    public double getTotal() {
        return total;
    }

    public double getImpuestos() {
        return impuestos;
    }

    @Override
    public String toString() {
        return "Factura para " + cliente + " | Total: " + total + " " + moneda + " | Impuestos: " + impuestos;
    }

}
