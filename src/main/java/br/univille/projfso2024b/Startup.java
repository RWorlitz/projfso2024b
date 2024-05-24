package br.univille.projfso2024b;

import java.util.Date;

import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import br.univille.projfso2024b.entity.Cliente;

@Component
public class Startup {
    
    @EventListener
    public void  onApplicationEvent(ContextRefreshedEvent event) {
        var cliente1 = new Cliente();
        cliente1.setNome("Bob Esponja");
        cliente1.setEndereco("Rua do Abacaxi");
        cliente1.setDataNascimento(new Date());
    }
}
