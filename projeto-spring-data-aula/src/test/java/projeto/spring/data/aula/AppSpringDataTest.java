package projeto.spring.data.aula;

import java.util.List;
import java.util.Optional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

//import projeto.spring.data.aula.dao.InterfaceSpringDataUser;
//import projeto.spring.data.aula.dao.InterfaceTelefone;
//import projeto.spring.data.aula.model.Telefone;
//import projeto.spring.data.aula.model.UsuarioSpringData;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:META-INF/spring-config.xml" })
public class AppSpringDataTest {

	
	

	@Test
	public void testeInsert() {

		System.out.println("conectado! ");

	}

	

}
