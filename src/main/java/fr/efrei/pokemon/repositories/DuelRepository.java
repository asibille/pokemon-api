package fr.efrei.pokemon.repositories;

import fr.efrei.pokemon.models.Duel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DuelRepository extends JpaRepository<Duel, String> { }