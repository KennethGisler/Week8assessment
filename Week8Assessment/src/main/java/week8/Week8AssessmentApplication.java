package week8;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import week8.repository.ContactRepository;
import week8.beans.Player;
import week8.controller.BeanConfig;

@SpringBootApplication
public class Week8AssessmentApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(Week8AssessmentApplication.class, args);
	}
	
	@Autowired
	ContactRepository repo;

	@Override
	public void run(String... args) throws Exception {
		ApplicationContext appContext = new AnnotationConfigApplicationContext(BeanConfig.class);
		
		Player p = appContext.getBean("player",Player.class);
		p.getArmy().setName("Cadian Shock Troops");
		p.getArmy().setFaction("Imperial Guard");
		p.getArmy().setCost(2000);
		p.setName("Kenneth Gisler");
		p.setPhone("(515)664-0350");
		
		System.out.println(p.toString());
		repo.save(p);

		List<Player> allPlayers = repo.findAll();
		
		for(Player players:allPlayers){
			System.out.println(players.toString());
		((AbstractApplicationContext) appContext).close();
		}
	}

}
