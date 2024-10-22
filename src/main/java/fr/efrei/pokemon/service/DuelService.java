package fr.efrei.pokemon.service;

import fr.efrei.pokemon.controller.DuelController;
import fr.efrei.pokemon.repositories.DuelRepository;
import fr.efrei.pokemon.models.Pokemon;
import fr.efrei.pokemon.repositories.PokemonRepository;
import fr.efrei.pokemon.service.PokemonService;
import fr.efrei.pokemon.service.TrainerService;
import fr.efrei.pokemon.models.Trainer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;


@Service
public class DuelService {

    private final DuelRepository duelRepository;

    @Autowired
    public DuelService(DuelRepository duelRepository) {
        this.duelRepository = duelRepository;
    }


}
