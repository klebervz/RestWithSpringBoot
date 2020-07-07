package br.com.kvaz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.kvaz.data.model.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long>{

}