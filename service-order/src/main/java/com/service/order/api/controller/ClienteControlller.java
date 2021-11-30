package com.service.order.api.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.service.order.domain.model.*;
@RestController
public class ClienteControlller {
	
	@GetMapping("/clientes")
	public List<Cliente> listar() {
		var cliente1 = new Cliente();
		cliente1.setId(1L);
		cliente1.setNome("Vitor");
		cliente1.setEmail("viadinho@gmail.com");
		cliente1.setTelefone("707070");
		
		var cliente2 = new Cliente();
		cliente2.setId(2L);
		cliente2.setNome("Thyago");
		cliente2.setEmail("viadao@gmail.com");
		cliente2.setTelefone("717171");
		
		return Arrays.asList(cliente1, cliente2);
	}
	
}
