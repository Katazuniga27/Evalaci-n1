/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package casoevaluado;

/**
 *
 * @author milkyaakath
 */
public class Facturas {
    //Atributos
    private String nombreCliente;
    private String cedulaCliente;
    private String codigoFactura;
    private String montoFactura;
    private String mes;
    private boolean productosElectricos;
    private boolean productosAutomotrices;
    private boolean productosConstruccion;
    
    //método cosntructor
    public Facturas(String nombreCliente, String cedulaCliente, String codigoFactura, String montoFactura, String mes, boolean productosElectricos, boolean productosAutomotrices, boolean productosConstruccion) {
        this.nombreCliente = nombreCliente;
        this.cedulaCliente = cedulaCliente;
        this.codigoFactura = codigoFactura;
        this.montoFactura = montoFactura;
        this.mes = mes;
        this.productosElectricos = productosElectricos;
        this.productosAutomotrices = productosAutomotrices;
        this.productosConstruccion = productosConstruccion;
    }
    
    //setters n getters

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getCedulaCliente() {
        return cedulaCliente;
    }

    public void setCedulaCliente(String cedulaCliente) {
        this.cedulaCliente = cedulaCliente;
    }

    public String getCodigoFactura() {
        return codigoFactura;
    }

    public void setCodigoFactura(String codigoFactura) {
        this.codigoFactura = codigoFactura;
    }

    public String getMontoFactura() {
        return montoFactura;
    }

    public void setMontoFactura(String montoFactura) {
        this.montoFactura = montoFactura;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public boolean isProductosElectricos() {
        return productosElectricos;
    }

    public void setProductosElectricos(boolean productosElectricos) {
        this.productosElectricos = productosElectricos;
    }

    public boolean isProductosAutomotrices() {
        return productosAutomotrices;
    }

    public void setProductosAutomotrices(boolean productosAutomotrices) {
        this.productosAutomotrices = productosAutomotrices;
    }

    public boolean isProductosConstruccion() {
        return productosConstruccion;
    }

    public void setProductosConstruccion(boolean productosConstruccion) {
        this.productosConstruccion = productosConstruccion;
    }
    
}
