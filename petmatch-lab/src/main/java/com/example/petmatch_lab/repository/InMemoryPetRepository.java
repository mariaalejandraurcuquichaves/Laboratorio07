package com.example.petmatch_lab.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.example.petmatch_lab.model.Pet;

@Repository
public class InMemoryPetRepository {

    private final List<Pet> pets = List.of(
        new Pet(1L, "Luna", "Perro", 3, "Disfruta los paseos y los juegos.", "Mediano"),
        new Pet(2L, "Milo", "Gato", 2, "Prefiere lugares tranquilos.", "Grande"),
        new Pet(3L, "Nube", "Conejo", 1, "le gusta explorar y comer lechuga.", "Pequeño"),
        new Pet(4L, "Tomi", "Gato", 2, "Le gusta dormir Y jugar.", "Mediano"),
        new Pet(5L, "Kira", "Perro", 4, "Es leal y le encanta correr en el parque.", "Grande")
    );

    public List<Pet> findAll() {
        return pets;
    }

    public Optional<Pet> findById(long id) {
        for (Pet pet : pets) {
            if (pet.getId() == id) {
                return Optional.of(pet);
            }
        }

        return Optional.empty();
    }
}