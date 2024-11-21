package com.example.InternetCatalog;//Задание:
//		Сделать проект "Интернет-каталог товаров"
//		Главная страница - таблица со списком всех товаров
//		каждый товар в списке это название, на которое можно нажать,
//		что приведет на страницу конкретного товара. У товара должен быть уникальный id, который подставляется в ссылку в общей таблице
//		<a href="/product?id=123456>Микроволновка "Победа"</a>
//package com.example.InternetCatalog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class InternetCatalogApplication {

	public static void main(String[] args) {
		SpringApplication.run(InternetCatalogApplication.class, args);
	}

}
