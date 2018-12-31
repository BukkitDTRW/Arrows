package net.scrayos.arrows;

import org.junit.jupiter.api.Assertions;

public class ArrowUnitTestExampleTest {

    private static final Integer INCREMENTATION_BASE_1 = 5;
    private static final Integer INCREMENTATION_BASE_2 = 0;
    private static final Integer INCREMENTATION_BASE_3 = -5;

    @org.junit.Test
    public void checkIncrementedCorrectly() {
        ArrowUnitTestExample arrows = new ArrowUnitTestExample();

        Assertions.assertTrue(arrows.getIncremented(INCREMENTATION_BASE_1) > INCREMENTATION_BASE_1);
        Assertions.assertTrue(arrows.getIncremented(INCREMENTATION_BASE_2) > INCREMENTATION_BASE_2);
        Assertions.assertTrue(arrows.getIncremented(INCREMENTATION_BASE_3) > INCREMENTATION_BASE_3);
    }

    @org.junit.Test
    public void checkIncrementedNotNullParameter() {
        ArrowUnitTestExample arrows = new ArrowUnitTestExample();

        Assertions.assertThrows(NullPointerException.class, () -> arrows.getIncremented(null));
    }
}
