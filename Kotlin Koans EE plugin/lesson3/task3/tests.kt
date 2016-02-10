package task3.tests

import task3.*
import org.junit.Assert
import org.junit.Test

class TestAllAnyAndOtherPredicates {

    @Test fun testAllCustomersAreFromCity() {
        Assert.assertFalse(errorMessage("checkAllCustomersAreFrom"), shop.checkAllCustomersAreFrom(Canberra))
    }

    @Test fun testAnyCustomerIsFromCity() {
        Assert.assertTrue(errorMessage("hasCustomerFrom"), shop.hasCustomerFrom(Canberra))
    }

    @Test fun testCountCustomersFromCity() {
        Assert.assertTrue(errorMessage("countCustomersFrom"), 2 == shop.countCustomersFrom(Canberra))
    }

    @Test fun testAnyCustomerFromCity() {
        Assert.assertTrue(errorMessage("findAnyCustomerFrom"), customers[lucas] == shop.findAnyCustomerFrom(Canberra))
    }
}
