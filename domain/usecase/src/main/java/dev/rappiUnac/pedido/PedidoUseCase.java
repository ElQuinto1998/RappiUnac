package dev.rappiUnac.pedido;

import dev.rappiUnac.pedido.entity.Pedido;
import dev.rappiUnac.pedido.gateway.PedidoRepository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class PedidoUseCase {

    private PedidoRepository pedidoRepository;

    public PedidoUseCase(PedidoRepository pedidoRepository) {
        this.pedidoRepository = pedidoRepository;
    }

    public Flux<Pedido> consultarPedidos(){
        return pedidoRepository.consultarPedidos();
    }

    public Mono<Pedido> hacerPedido(Pedido pedido){
        return pedidoRepository.hacerPedido(pedido);
    }
}
