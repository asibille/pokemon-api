package fr.efrei.pokemon.models;

import fr.efrei.pokemon.constants.Type;
import jakarta.persistence.*;

@Entity
public class Pokemon {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID) // AUTO INCREMENT
    private String id;

    private String name;

    private int level;

    private int hp;

    private int attack;


    @Enumerated(EnumType.STRING)
    private Type type; // SI mon pokemon est type feu -> Type == "FEU"

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

}