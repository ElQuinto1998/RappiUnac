package dev.rappiUnac.producto.adapter;

import dev.rappiUnac.generic.ObjectMapperDomain;
import dev.rappiUnac.producto.data.ProductoData;
import dev.rappiUnac.producto.entity.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import reactive.mapper.ObjectMapper;

@Component
public class ConverterProducto implements ObjectMapperDomain {

    @Autowired
    private ObjectMapper mapper;

    public Producto toEntity(ProductoData productoData){
        return mapper.map(productoData, Producto.class);
    }

    public ProductoData toData(Producto producto){
        return mapper.map(producto, ProductoData.class);
    }

}