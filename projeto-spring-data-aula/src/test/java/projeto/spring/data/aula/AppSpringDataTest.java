package projeto.spring.data.aula;



import java.util.List;
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
		
		usuarioSpringData.setEmail("asbeegggc@email.com");
		usuarioSpringData.setNome("deletar");
		usuarioSpringData.setLogin("asbeec");
		usuarioSpringData.setSenha("12344");
		usuarioSpringData.setIdade(223);
		
		interfaceStpringDataUser.save(usuarioSpringData);
		System.out.println("|| Cadastrado com sucesso! ||");
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
		
		System.out.println("|| Consultado com sucesso! ||");

	}
	
	@Test
	public void consultarTodos() {
		
		Iterable<UsuarioSpringData> lista = interfaceStpringDataUser.findAll();
		
		for(UsuarioSpringData usuarioSpringData:lista) {
			
			System.out.println(usuarioSpringData.getId());
			System.out.println(usuarioSpringData.getIdade());
			System.out.println(usuarioSpringData.getEmail());
			System.out.println(usuarioSpringData.getIdade());
			System.out.println(usuarioSpringData.getLogin());
			System.out.println(usuarioSpringData.getNome());
			System.out.println(usuarioSpringData.getSenha());
			System.out.println("----------------");
			
			System.out.println("|| Consultado todos com sucesso! ||");

		}
		
	}

	@Test
	public void testeupdate() {
		
		Optional<UsuarioSpringData> usuarioSpringData = interfaceStpringDataUser.findById(1L);
		
		UsuarioSpringData data = usuarioSpringData.get();
		
		data.setNome("ebc");
		interfaceStpringDataUser.save(data);
		
		System.out.println("|| Update cadastro com sucesso! ||");
	}
	
	@Test
	public void testeDelete() {
		Optional<UsuarioSpringData> usuarioSpringData = interfaceStpringDataUser.findById(3L);
		
		interfaceStpringDataUser.delete(usuarioSpringData.get());
		System.out.println("|| Deletado com sucesso! ||");
	}
	
	@Test
	public void testeConsultaNome() {

		List<UsuarioSpringData> list = interfaceStpringDataUser.buscaPorNome("ebc");

		for (UsuarioSpringData usuarioSpringData : list) {

			System.out.println(usuarioSpringData.getEmail());
			System.out.println(usuarioSpringData.getIdade());
			System.out.println(usuarioSpringData.getLogin());
			System.out.println(usuarioSpringData.getNome());
			System.out.println(usuarioSpringData.getSenha());
			System.out.println(usuarioSpringData.getId());
			System.out.println("---------------------------------------------------");
			System.out.println("|| Consulta Nome Sucesso! ||");

		}
	}
	
	@Test
	public void testeConsultaNomeParam() {

		UsuarioSpringData usuarioSpringData = interfaceStpringDataUser.buscaPorNomeParam("ebc");

		System.out.println(usuarioSpringData.getEmail());
		System.out.println(usuarioSpringData.getIdade());
		System.out.println(usuarioSpringData.getLogin());
		System.out.println(usuarioSpringData.getNome());
		System.out.println(usuarioSpringData.getSenha());
		System.out.println(usuarioSpringData.getId());
		System.out.println("---------------------------------------------------");
		
		System.out.println("|| Consulta Nome Param Sucesso! ||");

	}

	@Test
	public void testeDeletePorNome() {
		interfaceStpringDataUser.deletePorNome("deletar");
		System.out.println("|| Deletado com sucesso! ||");
	}
}
