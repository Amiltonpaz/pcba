package pcba.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import pcba.model.OcorrenciaModel;

public interface IocorrenciaRepository extends JpaRepository<OcorrenciaModel, Integer> {

}
