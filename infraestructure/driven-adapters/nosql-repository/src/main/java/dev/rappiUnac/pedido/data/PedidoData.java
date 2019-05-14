package dev.rappiUnac.pedido.data;

import dev.rappiUnac.comprador.Comprador;
import dev.rappiUnac.pedido.entity.ProductoCantidad;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "Pedido")
public class PedidoData {

    @Id
    private String id;
    private List<ProductoCantidad> productos;
    private Comprador comprador;
    private Date fecha;

}
