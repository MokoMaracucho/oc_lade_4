package com.oc.moko.oc_lade.dao;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.oc.moko.oc_lade.model.Utilisateur;

public interface UtilisateurRepository extends CrudRepository<Utilisateur, UUID> {

	@Override
	default <S extends Utilisateur> S save(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	default <S extends Utilisateur> Iterable<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	default Optional<Utilisateur> findById(UUID id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	default boolean existsById(UUID id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	default Iterable<Utilisateur> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	default Iterable<Utilisateur> findAllById(Iterable<UUID> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	default long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	default void deleteById(UUID id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	default void delete(Utilisateur entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	default void deleteAll(Iterable<? extends Utilisateur> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	default void deleteAll() {
		// TODO Auto-generated method stub
		
	}

}
