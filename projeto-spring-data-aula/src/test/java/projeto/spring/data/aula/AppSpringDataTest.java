package projeto.spring.data.aula;



import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import projeto.spring.data.aula.dao.IntefaceSpringDataUser;
import projeto.spring.data.aula.model.UsuarioSpringData;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:META-INF/spring-config.xml" })
public class AppSpringDataTest {

	@Autowired
	private IntefaceSpringDataUser interfaceStprinDataUser;
	
	@Test
	public void testInsert() {
		
		UsuarioSpringData usuarioSpringData =  new UsuarioSpringData();
		
		usuarioSpringData.setEmail("asbc@email.com");
		usuarioSpringData.setNome("asbc def");
		usuarioSpringData.setLogin("asbc");
		usuarioSpringData.setSenha("1234");
		usuarioSpringData.setIdade(27);
		
		interfaceStprinDataUser.save(usuarioSpringData);
		System.out.println("Cadastrado com sucesso!");
	}

	@Test
	public void testConsulta() {
		System.out.println("Conectado com Spring! ");
	}

	

}
