package week8.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import week8.beans.Army;
import week8.beans.Player;

/**
 * Kenneth Gisler - kgisler@dmacc.edu
 * CIS171 22149
 * Oct 24, 2022
 */
@Configuration
public class BeanConfig {

	@Bean
	public Player player() {
		Player bean = new Player("Player","Phone");
		return  bean;
	}
	
	@Bean
	public Army army() {
		Army bean = new Army("N/A","N/A",1000);
		return bean;
	}
}
