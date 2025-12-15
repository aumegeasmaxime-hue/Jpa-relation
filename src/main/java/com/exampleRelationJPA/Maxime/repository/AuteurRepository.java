package com.exampleRelationJPA.Maxime.repository;

import com.exampleRelationJPA.Maxime.model.Auteur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuteurRepository extends JpaRepository<Auteur,Long> {

}
