package hn.unah.lenguajes1900.datos.demo.controllers;

import org.springframework.web.bind.annotation.RestController;

import hn.unah.lenguajes1900.datos.demo.entities.TipoStreaming;
import hn.unah.lenguajes1900.datos.demo.services.impl.TipoStreamingServiceImpl;

import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;




@RestController 
@RequestMapping("/api")
public class TipoStreamingController {
    
    @Autowired
    private TipoStreamingServiceImpl tipoStreamingServiceImpl;


     @PostMapping("/streaming/crear")
     public TipoStreaming crearTipoStreaming(@RequestBody TipoStreaming tipoStreaming) {
         return this.tipoStreamingServiceImpl.crearStreaming(tipoStreaming);         
     }
     
     @GetMapping("/streaming/obtener/todos")
     public List<TipoStreaming> obtenerTiposStreaming() {
         return this.tipoStreamingServiceImpl.obtenerStreaming();
     }
     

}
