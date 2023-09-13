package br.com.eduardospring.todolist.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.eduardospring.todolist.entity.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long>{
    
}
