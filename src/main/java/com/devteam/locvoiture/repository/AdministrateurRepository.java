package com.devteam.locvoiture.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devteam.locvoiture.model.Administrateur;
import com.devteam.locvoiture.model.Client;

@Repository("administrateurRepository")
public interface AdministrateurRepository extends JpaRepository<Administrateur, Integer> {

}