package dev.rappiUnac.configuration;

import dev.rappiUnac.pedido.PedidoUseCase;
import dev.rappiUnac.pedido.gateway.PedidoRepository;
import dev.rappiUnac.producto.ProductoUseCase;
import dev.rappiUnac.producto.gateway.ProductoRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UseCasesConfiguration {

    @Bean
    public ProductoUseCase productoUseCase(ProductoRepository productoRepository){
        return new ProductoUseCase(productoRepository);
    }

    @Bean
    public PedidoUseCase pedidoUseCase(PedidoRepository pedidoRepository){
        return new PedidoUseCase(pedidoRepository);
    }

}
