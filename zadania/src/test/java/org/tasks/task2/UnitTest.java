package org.tasks.task2;

import org.junit.jupiter.api.Test;

import static net.bytebuddy.matcher.ElementMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.*;

class UnitTest {


    @Test
    void testIfUnitLoadAfterCreationIsEqualToZeroAndIsEqualToMaxLoad() {
        Unit unit = new Unit(100, 100);
        unit.loadCargo(new Cargo("Cargo1", 100));

        assertEquals(0, unit.calculateCurrentWeight());
        assertEquals(100, unit.calculateCurrentWeight());
    }

    @Test
    void unitWeightAfterUnloadingCargoShouldBeCorrectAndUnloadingAllCargoAndUnloadNotExisting() {
        Unit unit = new Unit(100, 100);

        Cargo cargo = new Cargo("Cargo", 45);
        Cargo cargo2 = new Cargo("Cargo2", 15);

        unit.loadCargo(cargo);
        unit.unloadAllCargo();
        unit.loadCargo(cargo2);
        unit.unloadCargo(cargo);

        assertThat(unit.calculateCurrentWeight(), equalTo(15));
        assertThat(unit.calculateCurrentWeight(), equalTo(60));
        assertThat(unit.calculateCurrentWeight(), equalTo(0));

    }
    @Test
    void unitShouldThrowExceptionWhenCargoWeightExceedsMaxWeightAndCheckIfCorrectCargoIsOnVessel() {
        Unit unit = new Unit(100, 100);

        assertThat(unit.calculateCurrentWeight(), equalTo(101));

        Cargo cargo = new Cargo("Cargo", 101);

        unit.loadCargo(cargo);
        assertThat(unit.getCargo().get(0), equalTo(cargo));

        assertThrows(IllegalStateException.class, () -> unit.loadCargo(cargo));
    }
}