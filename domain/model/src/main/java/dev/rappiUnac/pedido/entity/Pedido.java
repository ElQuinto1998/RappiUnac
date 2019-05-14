package dev.rappiUnac.pedido.entity;

import dev.rappiUnac.comprador.Comprador;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class Pedido {

    private String id;
    private List<ProductoCantidad> productos;
    private double total;
    private Comprador comprador;
    private Date fecha;

}
