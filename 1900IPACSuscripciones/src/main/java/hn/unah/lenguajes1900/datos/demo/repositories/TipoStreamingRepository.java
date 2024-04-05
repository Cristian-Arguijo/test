package hn.unah.lenguajes1900.datos.demo.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import hn.unah.lenguajes1900.datos.demo.entities.TipoStreaming;

@Repository
public interface TipoStreamingRepository extends CrudRepository<TipoStreaming, Long>{
    
}
