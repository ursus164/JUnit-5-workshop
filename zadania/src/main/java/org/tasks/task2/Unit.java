package org.tasks.task2;

import java.util.ArrayList;
import java.util.List;

public class Unit {
    private List<Cargo> cargo;
    private int maxCargoWeight;
    private int currentCargoWeight;

    public Unit(int maxCargoWeight) {
        this.maxCargoWeight = maxCargoWeight;
        this.currentCargoWeight = 0;
        this.cargo = new ArrayList<>();
    }

    public void loadCargo(Cargo cargo) {
        if(this.currentCargoWeight + cargo.getWeight() > this.maxCargoWeight) {
            throw new IllegalStateException("Cargo weight exceeds maximum value for this vessel.");
        }
        this.cargo.add(cargo);
        this.currentCargoWeight += cargo.getWeight();
    }

    public void unloadCargo(Cargo cargo) {
        if(!this.cargo.contains(cargo)) {
            throw new IllegalStateException("Cargo not found in this vessel.");
        }
        this.cargo.remove(cargo);
        this.currentCargoWeight = calculateCurrentWeight();
    }

    public void unloadAllCargo() {
        this.cargo.clear();
        this.currentCargoWeight = 0;
    }
    public List<Cargo> getCargo() {
        return cargo;
    }

    public int calculateCurrentWeight() {
        return this.cargo.stream()
                .mapToInt(Cargo::getWeight).sum();
    }
}
