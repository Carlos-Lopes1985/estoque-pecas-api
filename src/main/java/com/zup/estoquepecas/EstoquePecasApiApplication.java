package com.zup.estoquepecas;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.zup.estoquepecas.entity.Produto;
import com.zup.estoquepecas.repository.ProdutoRepository;

@SpringBootApplication
public class EstoquePecasApiApplication implements CommandLineRunner {

	@Autowired
	private ProdutoRepository produtoRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(EstoquePecasApiApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Produto prod = new Produto(null, new Long(111222333), "Vassoura", 10., 15., 100, "Assolan", "Vassoura de pelo");
		Produto prod1 = new Produto(null, new Long(111222333), "Rodo", 9., 12., 100, "Assolan", "Rodo para tirar agua");
		Produto prod2 = new Produto(null, new Long(111222333), "Cera", 17., 25., 40, "Brilhol", "Cera automotiva");
		
		produtoRepository.saveAll(Arrays.asList(prod,prod1,prod2));
		
	}

}
