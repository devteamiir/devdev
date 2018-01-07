package com.devteam.locvoiture.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.devteam.locvoiture.model.Client;
import com.devteam.locvoiture.model.Secretaire;

@Repository("secretaireRepository")
public interface SecretaireRepository extends JpaRepository<Secretaire, Integer> {

}