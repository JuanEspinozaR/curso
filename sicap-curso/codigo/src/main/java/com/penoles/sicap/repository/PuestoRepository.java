package com.penoles.sicap.repository;

import com.penoles.sicap.entity.Puesto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface PuestoRepository extends JpaRepository<Puesto, Long> {

    /**En caso de no tener secuencia, para oracle generar id con la sig. consulta
     * @return
     */
    @Query(value="SELECT COALESCE(MAX(pue.pue_id),0)+1 FROM puesto pue", nativeQuery=true)
    Long generarId();

}
