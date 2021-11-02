package br.fatec.taroTI.repositorios;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import br.fatec.taroTI.modelos.Carta;

public interface CartaRepo extends MongoRepository<Carta, String> {

    @Query("{nome:'?0'}")
    Carta findCartaByNome(String nome);

    @Query("{valor:'?0', naipe:'?1'}")
    Carta findCartaByValorENaipe(String valor, String naipe);

    @Query(value = "{naipe:'?0'}", fields = "{'nome': 1, 'valor': 1, 'descricaoCerta': 1, 'descricaoTorta': 1}")
    List<Carta> findTudo(String naipe);

}
