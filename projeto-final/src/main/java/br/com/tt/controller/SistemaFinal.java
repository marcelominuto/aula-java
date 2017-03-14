package br.com.tt.controller;

import static spark.Spark.get;
import static spark.Spark.post;
import static spark.Spark.staticFileLocation;

import java.util.HashMap;
import java.util.Map;

import br.com.tt.controller.spark.template.velocity.VelocityTemplateEngine;
import br.com.tt.model.Cliente;
import br.com.tt.model.Funcionario;
import spark.ModelAndView;

public class SistemaFinal {
	public static void main(String[] args) {
		staticFileLocation("/public");
		String layout = "templates/layout.vtl";
		get("/", (request, response) -> {
			Map model = new HashMap();
			model.put("template", "templates/index.vtl");
			return new ModelAndView(model, layout);
		}, new VelocityTemplateEngine());
		get("/cliente", (request, response) -> {
			Map model = new HashMap();

			model.put("clientes", Cliente.consultar());
			model.put("template", "templates/cliente.vtl");

			return new ModelAndView(model, layout);
		}, new VelocityTemplateEngine());
		get("/funcionario", (request, response) -> {
			Map model = new HashMap();
			model.put("template", "templates/funcionario.vtl");
			return new ModelAndView(model, layout);
		}, new VelocityTemplateEngine());

		post("/cliente-cadatro", (request, response) -> {

			String nome = "";
			String cpf = "";
			try {
				nome = request.queryParams("nome");
				cpf = request.queryParams("cpf");
			} catch (Exception e) {
				e.printStackTrace();
			}
			Cliente cliente = new Cliente();
			cliente.setNome(nome);
			cliente.setCnpjCpf(cpf);
			cliente.salvar();
			Map model = new HashMap();
			model.put("clientes", Cliente.consultar());
			model.put("template", "templates/cliente.vtl");
			return new ModelAndView(model, layout);
		}, new VelocityTemplateEngine());

		post("/funcionario-cadastro", (request, response) -> {

			String nome = "";
			String cpf = "";
			try {
				nome = request.queryParams("nome");
				cpf = request.queryParams("cpf");
			} catch (Exception e) {
				e.printStackTrace();
			}
			Funcionario funcionario = new Funcionario();
			funcionario.setNome(nome);
			funcionario.setCnpjCpf(cpf);
			funcionario.salvar();
			Map model = new HashMap();
			model.put("template", "templates/cliente.vtl");
			return new ModelAndView(model, layout);
		}, new VelocityTemplateEngine());

	}
}
