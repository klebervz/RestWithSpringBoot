package br.com.kvaz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.kvaz.model.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long>{

}