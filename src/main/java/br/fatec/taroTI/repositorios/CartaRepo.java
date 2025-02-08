package br.fatec.taroTI.repositorios;

import br.fatec.taroTI.modelos.Carta;
import br.fatec.taroTI.modelos.NaipeType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartaRepo extends JpaRepository<Carta, Long> {

    Carta findByValorAndNaipe(Integer valor, NaipeType naipe);

}
