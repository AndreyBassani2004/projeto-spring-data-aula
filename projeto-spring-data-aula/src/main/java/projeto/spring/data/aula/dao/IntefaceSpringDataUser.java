package projeto.spring.data.aula.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import projeto.spring.data.aula.model.UsuarioSpringData;

@Repository
public interface IntefaceSpringDataUser extends CrudRepository<UsuarioSpringData, Long>{

}
