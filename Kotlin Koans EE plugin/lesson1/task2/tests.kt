package task2.tests

import task2.*
import org.junit.Test
import org.junit.Assert

class TestFunctions() {
    @Test fun collection() {
        Assert.assertEquals(errorMessage("toJSON"), "[1, 2, 3, 42, 555]", toJSON(listOf(1, 2, 3, 42, 555)))
    }
}