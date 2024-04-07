package cibertec.edu.pe.Proyecto_Bancario.Repository;

import cibertec.edu.pe.Proyecto_Bancario.Model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente,Integer> {
}
