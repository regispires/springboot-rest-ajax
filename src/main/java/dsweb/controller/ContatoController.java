package dsweb.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dsweb.model.Contato;

@RestController
public class ContatoController {

	@RequestMapping("/contatos")
	public List<Contato> listaContatos() {
		List<Contato> lista = new ArrayList<Contato>();
		Contato c = new Contato(1, "João", "joao@gmail.com", "Rua J 1");
		lista.add(c);
		c = new Contato(2, "Maria", "maria@gmail.com", "Rua M 2");
		lista.add(c);
		c = new Contato(3, "José", "jose@gmail.com", "Rua J 3");
		lista.add(c);
		return lista;
	}
	
}
