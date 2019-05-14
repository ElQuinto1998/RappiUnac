package dev.rappiUnac.pedido.gateway;

import dev.rappiUnac.pedido.entity.Pedido;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface PedidoRepository {

    Flux<Pedido> consultarPedidos();

    Mono<Pedido> hacerPedido(Pedido pedido);

}
