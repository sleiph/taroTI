package br.fatec.taroTI.repositorios;

import br.fatec.taroTI.modelos.Carta;
import br.fatec.taroTI.modelos.Naipe;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartaRepo extends JpaRepository<Carta, Long> {

    Carta findByValorAndNaipe(Long valor, Naipe naipe);

}
