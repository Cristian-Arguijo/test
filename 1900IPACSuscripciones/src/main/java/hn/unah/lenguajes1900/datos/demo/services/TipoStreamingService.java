package hn.unah.lenguajes1900.datos.demo.services;

import java.util.List;

import hn.unah.lenguajes1900.datos.demo.entities.TipoStreaming;

public interface TipoStreamingService {
    
    public TipoStreaming crearStreaming(TipoStreaming tipoStreaming);

    public List<TipoStreaming> obtenerStreaming();

}
