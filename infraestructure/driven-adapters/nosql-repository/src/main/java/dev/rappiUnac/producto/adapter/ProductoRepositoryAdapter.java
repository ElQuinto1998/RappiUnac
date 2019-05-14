package dev.rappiUnac.producto.adapter;

import dev.rappiUnac.producto.entity.Producto;
import dev.rappiUnac.producto.gateway.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
import dev.rappiUnac.producto.data.ProductoDataRepository;

@Repository
public class ProductoRepositoryAdapter implements ProductoRepository {

    @Autowired
    private ConverterProducto converterProducto;

    @Autowired
    private ProductoDataRepository productoDataRepository;

    @Override
    public Flux<Producto> consultarProductos() {
        return productoDataRepository.findAll().map(converterProducto::toEntity);
    }
}
