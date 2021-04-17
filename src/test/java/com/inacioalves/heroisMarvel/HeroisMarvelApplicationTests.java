package com.inacioalves.heroisMarvel;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.web.reactive.server.WebTestClient;

import com.inacioalves.heroisMarvel.repository.HeroesRepository;
import static com.inacioalves.heroisMarvel.constans.HeroesConstant.HEROES_ENDPOINT_LOCAL;



@SpringBootTest
class HeroisMarvelApplicationTests {

	 @Autowired
	  WebTestClient webTestClient;

	  @Autowired
	  HeroesRepository heroesRepository;


	  @Test
	  public void getOneHeroeById(){
	    webTestClient.get().uri(HEROES_ENDPOINT_LOCAL.concat("/{id}"),"10")
	      .exchange()
	      .expectStatus().isOk()
	      .expectBody();

	  }

	  @Test
	  public void getOneHeronotFound(){

	    webTestClient.get().uri(HEROES_ENDPOINT_LOCAL.concat("/{id}"),"10")
	      .exchange()
	      .expectStatus().isNotFound();

	  }


	  @Test
	  public void deleteHero(){

	    webTestClient.delete().uri(HEROES_ENDPOINT_LOCAL.concat("/{id}"),"1")
	      .accept(MediaType.APPLICATION_JSON)
	      .exchange()
	      .expectStatus().isNotFound()
	      .expectBody(Void.class);

	  }

}
