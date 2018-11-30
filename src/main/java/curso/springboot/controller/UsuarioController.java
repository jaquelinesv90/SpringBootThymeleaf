package curso.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public class UsuarioController {
	

	@RequestMapping("/voltar")
	public String voltar() {
		return "index";
	}
	
	@RequestMapping(method = RequestMethod.GET, value="/recuperarsenha")
	public String recuperarSenha() {
		return "recuperarsenha";
	}
	
	@RequestMapping(method = RequestMethod.GET, value="/configuracoes")
	public String configuracao() {
		return "cadastro/configuracoes";
	}
}
