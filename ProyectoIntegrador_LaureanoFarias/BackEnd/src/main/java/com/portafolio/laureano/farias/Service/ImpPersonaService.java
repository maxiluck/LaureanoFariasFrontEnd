package com.portafolio.laureano.farias.Service;

import com.portafolio.laureano.farias.Entity.Persona;
import com.portafolio.laureano.farias.Interface.IPersonaService;
import com.portafolio.laureano.farias.Repository.IPersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImpPersonaService implements IPersonaService{
@Autowired IPersonaRepository ipersonaRepository;
    @Override
    public List<Persona> getPersona() {
      List<Persona> persona = ipersonaRepository.findAll();
              return persona;
    }

    @Override
    public void saverPersona(Persona persona) {
       ipersonaRepository.save(persona);
       
    }

    @Override
    public void deletepersona(Long id) {
        ipersonaRepository.deleteById(id);
    }

    @Override
    public Persona findPersona(Long id) {
        Persona persona = ipersonaRepository.findById(id).orElse(null);
        return persona;
    }

    @Override
    public void savePersona(Persona persona) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
