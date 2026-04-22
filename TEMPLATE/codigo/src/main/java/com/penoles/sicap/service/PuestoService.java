package com.penoles.sicap.service;

import com.penoles.sicap.entity.Puesto;
import com.penoles.sicap.repository.PuestoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PuestoService {

    @Autowired
    PuestoRepository puestoRepository;

    public List<Puesto> consultar() {
        return puestoRepository.findAll();
    }

    public Puesto consultaDetalle(long id) {
        Optional<Puesto> puesto = puestoRepository.findById(id);
        return puesto.isPresent() ? puesto.get() : null;
    }

    /**
     * Método para guardar información de puesto
     *
     * @param puesto
     * @return
     */
    public Puesto guardar(Puesto puesto) {
        long id = puestoRepository.generarId();
        puesto.setId(id);
        return puestoRepository.save(puesto);
    }

    /**
     * Mètodo para modificar la informaciòn del puesto enviado
     *
     * @param puesto
     * @return
     */
    public Puesto modificar(Puesto puesto) {
        return puestoRepository.save(puesto);
    }

    /**
     * Mètodo para eliminar la informaciòn del puesto enviado
     *
     * @param id
     * @return
     */
    public boolean eliminar(long id) {
        puestoRepository.deleteById(id);
        if (puestoRepository.existsById(id)) {
            return false;
        }
        return true;
    }


}
