package dev.rappiUnac.web.producto;

import dev.rappiUnac.producto.ProductoUseCase;
import dev.rappiUnac.producto.entity.Producto;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;


@RestController
@RequestMapping("/rappiUnac")
@AllArgsConstructor
public class ProductoController {

    @Autowired
    private ProductoUseCase productoUseCase;

    @GetMapping("/productos")
    public Flux<Producto> verProductos(){
        return productoUseCase.consultarProductos();
    }

}
