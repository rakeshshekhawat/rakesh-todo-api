package com.rakesh.repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Function;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;
import org.springframework.stereotype.Repository;

import com.rakesh.model.ToDo;
@Repository
public class ToDoRepo implements JpaRepository<ToDo, UUID>{

	@Override
	public <S extends ToDo> List<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return saveAll(entities);
	}

	@Override
	public List<ToDo> findAll() {
		// TODO Auto-generated method stub
		return findAll();
	}

	@Override
	public List<ToDo> findAllById(Iterable<UUID> ids) {
		// TODO Auto-generated method stub
		return findAllById(ids);
	}

	@Override
	public <S extends ToDo> S save(S entity) {
		// TODO Auto-generated method stub
		return save(entity);
	}

	@Override
	public Optional<ToDo> findById(UUID id) {
		// TODO Auto-generated method stub
		return findById(id);
	}

	@Override
	public boolean existsById(UUID id) {
		// TODO Auto-generated method stub
		return existsById(id);
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void deleteById(UUID id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(ToDo entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAllById(Iterable<? extends UUID> ids) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll(Iterable<? extends ToDo> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<ToDo> findAll(Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<ToDo> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends ToDo> Optional<S> findOne(Example<S> example) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public <S extends ToDo> Page<S> findAll(Example<S> example, Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends ToDo> long count(Example<S> example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public <S extends ToDo> boolean exists(Example<S> example) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public <S extends ToDo, R> R findBy(Example<S> example, Function<FetchableFluentQuery<S>, R> queryFunction) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void flush() {
		// TODO Auto-generated method stub
		flush();
		
	}

	@Override
	public <S extends ToDo> S saveAndFlush(S entity) {
		// TODO Auto-generated method stub
		return saveAndFlush(entity);
	}

	@Override
	public <S extends ToDo> List<S> saveAllAndFlush(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return saveAllAndFlush(entities);
	}

	@Override
	public void deleteAllInBatch(Iterable<ToDo> entities) {
		// TODO Auto-generated method stub
		deleteAllInBatch(entities);
	}

	@Override
	public void deleteAllByIdInBatch(Iterable<UUID> ids) {
		// TODO Auto-generated method stub
		deleteAllById(ids);
	}

	@Override
	public void deleteAllInBatch() {
		// TODO Auto-generated method stub
		deleteAllInBatch();
		
	}

	@Override
	public ToDo getOne(UUID id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ToDo getById(UUID id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ToDo getReferenceById(UUID id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends ToDo> List<S> findAll(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends ToDo> List<S> findAll(Example<S> example, Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

}
