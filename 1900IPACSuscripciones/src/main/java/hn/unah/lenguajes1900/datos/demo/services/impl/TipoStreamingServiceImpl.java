package hn.unah.lenguajes1900.datos.demo.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.lenguajes1900.datos.demo.entities.Planes;
import hn.unah.lenguajes1900.datos.demo.entities.TipoStreaming;
import hn.unah.lenguajes1900.datos.demo.repositories.PlanRepository;
import hn.unah.lenguajes1900.datos.demo.repositories.TipoStreamingRepository;
import hn.unah.lenguajes1900.datos.demo.services.TipoStreamingService;

@Service
public class TipoStreamingServiceImpl implements TipoStreamingService{

    @Autowired
    private TipoStreamingRepository tipoStreamingRepository;

    @Autowired
    private PlanRepository planRepository;

    @Override
    public TipoStreaming crearStreaming(TipoStreaming tipoStreaming) { 
        TipoStreaming tipoStreaming2 = this.tipoStreamingRepository.save(tipoStreaming);
        if(null!= tipoStreaming.getPlanes()){
            for (Planes plan : tipoStreaming.getPlanes()) {
                plan.setTipoStreaming(tipoStreaming2);
                this.planRepository.save(plan);
            }
        }
        return tipoStreaming2;
    }

    @Override
    public List<TipoStreaming> obtenerStreaming() {
        return (List<TipoStreaming>) this.tipoStreamingRepository.findAll();
    }
    
}
