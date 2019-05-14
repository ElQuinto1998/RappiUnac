package dev.rappiUnac.producto;

import dev.rappiUnac.producto.entity.Producto;
import dev.rappiUnac.producto.gateway.ProductoRepository;
import reactor.core.publisher.Flux;

public class ProductoUseCase {

    private ProductoRepository productoRepository;

    public ProductoUseCase(ProductoRepository productoRepository) {
        this.productoRepository = productoRepository;
    }

    public Flux<Producto> consultarProductos(){
        return productoRepository.consultarProductos();
    }

}
