package projeto.spring.data.aula;



import java.util.Optional;

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
	private IntefaceSpringDataUser interfaceStpringDataUser;
	
	@Test
	public void testInsert() {
		
		UsuarioSpringData usuarioSpringData =  new UsuarioSpringData();
		
		usuarioSpringData.setEmail("asbc@email.com");
		usuarioSpringData.setNome("asbc def");
		usuarioSpringData.setLogin("asbc");
		usuarioSpringData.setSenha("1234");
		usuarioSpringData.setIdade(27);
		
		interfaceStpringDataUser.save(usuarioSpringData);
		System.out.println("Cadastrado com sucesso!");
	}

	@Test
	public void testConsulta() {

		Optional<UsuarioSpringData> usuarioSpringData = interfaceStpringDataUser.findById(1L);

		System.out.println(usuarioSpringData.get().getIdade());
		System.out.println(usuarioSpringData.get().getEmail());
		System.out.println(usuarioSpringData.get().getIdade());
		System.out.println(usuarioSpringData.get().getLogin());
		System.out.println(usuarioSpringData.get().getNome());
		System.out.println(usuarioSpringData.get().getSenha());
		System.out.println(usuarioSpringData.get().getId());
		
	}

	

}
