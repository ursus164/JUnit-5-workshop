package org.tasks.task2;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.assertThrows;

class UnitTest {


    @Test
    void testIfUnitLoadAfterCreationIsEqualToZeroAndUnitWeightAfterLoadingIsCorrect() {
        Unit unit = new Unit(100);
        unit.loadCargo(new Cargo("Cargo1", 45));

        assertThat(unit.calculateCurrentWeight(), equalTo(0));
        assertThat(unit.calculateCurrentWeight(), equalTo(45));
    }

    @Test
    void unitWeightAfterUnloadingCargoAndUnloadingAllShouldBeCorrect() {
        Unit unit = new Unit( 100);

        Cargo cargo = new Cargo("Cargo", 45);
        Cargo cargo2 = new Cargo("Cargo2", 15);

        unit.loadCargo(cargo);
        unit.loadCargo(cargo2);

        unit.unloadCargo(cargo);

        unit.unloadAllCargo();

        assertThat(unit.calculateCurrentWeight(), equalTo(15));
        assertThat(unit.calculateCurrentWeight(), equalTo(0));
        assertThat(unit.getCargo().size(), equalTo(0));

    }
    @Test
    void exceptionShouldBeThrownWhenCargoWeightExceedsMaxWeightAndCheckIfCorrectCargoIsOnVessel() {
        Unit unit = new Unit( 100);

        Cargo overSizeCargo = new Cargo("Cargo", 101);
        Cargo normalSizeCargo = new Cargo("Wood", 20);

        Executable executableOversize = () -> unit.loadCargo(overSizeCargo);    // loading

        assertThat(unit.getCargo().get(0), equalTo(normalSizeCargo));
        assertThrows(IllegalStateException.class, executableOversize);
    }
}