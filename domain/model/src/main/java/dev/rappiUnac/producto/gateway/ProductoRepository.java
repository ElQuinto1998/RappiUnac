package dev.rappiUnac.producto.gateway;

import dev.rappiUnac.producto.entity.Producto;
import reactor.core.publisher.Flux;

public interface ProductoRepository {

    Flux<Producto> consultarProductos();

}
