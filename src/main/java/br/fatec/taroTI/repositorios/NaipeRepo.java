package br.fatec.taroTI.repositorios;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import br.fatec.taroTI.modelos.Naipe;

public interface NaipeRepo extends  MongoRepository<Naipe, String>  {

    @Query("{indice:'?0'}")
    Naipe findNaipeByIndice(String indice);

}
