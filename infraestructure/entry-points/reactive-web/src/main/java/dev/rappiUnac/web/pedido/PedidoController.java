package dev.rappiUnac.web.pedido;

import dev.rappiUnac.pedido.PedidoUseCase;
import dev.rappiUnac.pedido.entity.Pedido;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/rappiUnac")
@AllArgsConstructor
public class PedidoController {

    @Autowired
    private PedidoUseCase pedidoUseCase;

    @GetMapping("/pedidos")
    public Flux<Pedido> verPedidos(){
        return pedidoUseCase.consultarPedidos();
    }

    @PostMapping("/pedidos/agregar")
    public Mono<Pedido> hacerPedido(@RequestBody Pedido pedido){
        return pedidoUseCase.hacerPedido(pedido);
    }

}
