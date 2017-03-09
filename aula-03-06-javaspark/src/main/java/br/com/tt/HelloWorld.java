package br.com.tt;

import static spark.Spark.get;

import java.util.Date;

public class HelloWorld {

	public static void main(String[] args) {
		String page1 = "<h1><center>Minha page";
		page1 += "</h1></center>";
		page1 += "Data: " + new Date();
		final String htmlPage = page1;
		get("/hello", (req, res) -> htmlPage);
	}

}
