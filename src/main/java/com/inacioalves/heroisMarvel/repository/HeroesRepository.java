package com.inacioalves.heroisMarvel.repository;




import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.CrudRepository;

import com.inacioalves.heroisMarvel.document.Heroes;

@EnableScan
public interface HeroesRepository extends CrudRepository<Heroes, String>{
}
