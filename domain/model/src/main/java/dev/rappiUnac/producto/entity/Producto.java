package dev.rappiUnac.producto.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class Producto {

    private String id;
    private String nombre;
    private String descripcion;
    private double precio;
    private String imagen;
    private String categoria;

}
