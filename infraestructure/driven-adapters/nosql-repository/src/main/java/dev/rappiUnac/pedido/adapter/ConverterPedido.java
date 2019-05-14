package dev.rappiUnac.pedido.adapter;

import dev.rappiUnac.generic.ObjectMapperDomain;
import dev.rappiUnac.pedido.data.PedidoData;
import dev.rappiUnac.pedido.entity.Pedido;
import dev.rappiUnac.pedido.entity.ProductoCantidad;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import reactive.mapper.ObjectMapper;

import java.util.List;

@Component
public class ConverterPedido implements ObjectMapperDomain {

    @Autowired
    private ObjectMapper mapper;

    double total = 0;

    public Pedido toEntity(PedidoData pedidoData){

        return Pedido.builder()
                .id(pedidoData.getId())
                .productos(pedidoData.getProductos())
                .total(resultado(pedidoData.getProductos()))
                .comprador(pedidoData.getComprador())
                .fecha(pedidoData.getFecha())
                .build();

    }

    public PedidoData toData(Pedido pedido){
        return mapper.map(pedido, PedidoData.class);
    }

    public double resultado(List<ProductoCantidad> productoCantidads){

        double total = 0;

        for (int i = 0; i < productoCantidads.size(); i++) {
            total += productoCantidads.get(i).getProducto().getPrecio() * productoCantidads.get(i).getCantidad();
        }

        return total;

        //Debo hacerlo reactivo

    }
}
