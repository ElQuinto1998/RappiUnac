package dev.rappiUnac.pedido.adapter;

import dev.rappiUnac.pedido.data.PedidoDataRepository;
import dev.rappiUnac.pedido.entity.Pedido;
import dev.rappiUnac.pedido.gateway.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Repository
public class PedidoRepositoyAdapter implements PedidoRepository {

    @Autowired
    private ConverterPedido converterPedido;

    @Autowired
    private PedidoDataRepository pedidoDataRepository;

    @Override
    public Flux<Pedido> consultarPedidos() {
        return pedidoDataRepository.findAll().map(converterPedido::toEntity);
    }

    @Override
    public Mono<Pedido> hacerPedido(Pedido pedido) {
        return Mono.just(pedido)
                .map(converterPedido::toData)
                .flatMap(pedidoDataRepository::save)
                .map(converterPedido::toEntity);
    }
}
