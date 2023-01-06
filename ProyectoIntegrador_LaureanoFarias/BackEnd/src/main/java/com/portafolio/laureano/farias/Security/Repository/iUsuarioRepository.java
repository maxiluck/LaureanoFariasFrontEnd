/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portafolio.laureano.farias.Security.Repository;

import com.portafolio.laureano.farias.Security.Entity.Usuario;
import java.util.Optional;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.stereotype.Repository;

@Repository
public interface iUsuarioRepository extends JpaRepositoryImplementation<Usuario, Integer>{
    
    Optional<Usuario> findByNombreUsuario(String nombreUsuario);
    
    boolean existsByNombreUsuario(String nombreUsuario);
    boolean existsByEmail(String Email);

}
