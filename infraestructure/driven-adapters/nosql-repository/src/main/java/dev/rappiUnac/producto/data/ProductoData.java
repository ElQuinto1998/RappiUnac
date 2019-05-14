package dev.rappiUnac.producto.data;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "Producto")
public class ProductoData {

    @Id
    private String id;
    private String nombre;
    private String descripcion;
    private double precio;
    private String imagen;
    private String categoria;

}
