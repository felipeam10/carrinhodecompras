package br.com.carrinhodecompras.loja.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	/*teste*/
	@RequestMapping("/")
	public String index() {
		System.out.println("Entrando na home do carrinho de compras");
		return "home";
	}
}
