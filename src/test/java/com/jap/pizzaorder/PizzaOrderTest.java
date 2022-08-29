package com.jap.pizzaorder;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PizzaOrderTest {
    PizzaOrder pizzaOrder = null;

    @BeforeEach
    public void setUp() {
        //Initialize the object of class PizzaOrder
        pizzaOrder = new PizzaOrder();
    }

    @AfterEach
    public void tearDown() {
        // Assign object of PizzaOrder to null
        pizzaOrder = null;
    }

    // Write th logic inside the test case methods
    @Test
    public void givenNoOfPizzaAndPriceOfPizzaCalculateTotalPriceSuccess() {
        int noOfPizza = 5;
        float priceOfPizza = 12.99f;
        float expectedResult = 64.95f;
        float actualResult = pizzaOrder.calculatePriceOfPizza(noOfPizza, priceOfPizza);
        Assertions.assertEquals(expectedResult, actualResult);

    }
    @Test
    public void givenNoOfGarlicBreadAndPriceOfGarlicBreadCalculateTotalPriceSuccess() {
        int noOfGarlicBread = 3;
        float priceOfGarlicBread = 5.99f;
        float expectedResult = 17.97f;
        float actualResult = pizzaOrder.calculatePriceOfGarlicBread(noOfGarlicBread, priceOfGarlicBread);
        Assertions.assertEquals(expectedResult, actualResult);

    }
    @Test
    public void givenNoOfBeveragesAndPriceOfBeverageCalculateTotalPriceSuccess() {
        int noOfBeverages = 3;
        float priceOfBeverage = 1.99f;
        float ExpectedResult = 5.9700003f;
        float actualResult = pizzaOrder.calculatePriceOfBeverage(noOfBeverages, priceOfBeverage);
        Assertions.assertEquals(ExpectedResult, actualResult);


    }
    @Test
    public void givenNoOfPizzaAndPriceOfPizzaCalculateTotalPriceFailure() {
        int noOfPizza = 5;
        float priceOfPizza = 12.99f;
        float UnExpectedResult = 64.85f;
        float actualResult = pizzaOrder.calculatePriceOfPizza(noOfPizza, priceOfPizza);
        Assertions.assertNotEquals(UnExpectedResult, actualResult);

    }
    @Test
    public void givenNoOfGarlicBreadAndPriceOfGarlicBreadCalculateTotalPriceFailure() {
        int noOfGarlicBread = 3;
        float priceOfGarlicBread = 5.99f;
        float expectedResult = 17.97f;
        float actualResult = pizzaOrder.calculatePriceOfGarlicBread(noOfGarlicBread, priceOfGarlicBread);
        Assertions.assertEquals(expectedResult, actualResult);

    }
    @Test
    public void givenNoOfBeveragesAndPriceOfBeverageCalculateTotalPriceFailure() {
        int noOfBeverages = 3;
        float priceOfBeverage = 1.99f;
        float ExpectedResult = 5.9700003f;
        float actualResult = pizzaOrder.calculatePriceOfBeverage(noOfBeverages, priceOfBeverage);
        Assertions.assertEquals(ExpectedResult, actualResult);
    }
    @Test
    public void givenSizeofPizzaReturnPrice() {

        int size1 = 1;
        float expectedprice = 9.99f;
        int size2 = 2;
        float expected = 11.99f;
        int size3 = 3;
        float expectedResult = 13.99f;
        int size4 = 0;
        float expectedR = 0;
        int size5 = 6;
        float actalResult1 = pizzaOrder.getPriceOfPizzaBasedOnSize(1);
        float actalResult2 = pizzaOrder.getPriceOfPizzaBasedOnSize(2);
        float actalResult3 = pizzaOrder.getPriceOfPizzaBasedOnSize(3);
        float actalResult4 = pizzaOrder.getPriceOfPizzaBasedOnSize(0);
        assertEquals(expectedprice, actalResult1);
        assertEquals(expected, actalResult2);
        assertEquals(expectedResult, actalResult3);
        assertEquals(expectedR, actalResult4);

    }
    @Test
    public void givenPriceOfItemsCalculateTotalBillAmount() {
        float totalPizzaPrice = 64.95f;
        float totalGarlicBreadPrice = 17.97f;
        float totalBeveragePrice = 5.9700003f;
        float expectedBill = 88.890003f;
        float actualResult = pizzaOrder.calculateTotalBill(totalPizzaPrice, totalGarlicBreadPrice, totalBeveragePrice);
        Assertions.assertEquals(expectedBill, actualResult);
    }

    @Test
    public void givenTotalBillAmountGreaterThan50CalculateDiscount() {
        float totalBill = 88.890003f;
        float expectedResult = 80.001f;
        float actualResult = pizzaOrder.calculateDiscountAndReturnBillAmount(totalBill);
        Assertions.assertEquals(expectedResult, actualResult);


    }
    @Test
    public void givenTotalBillLessThan50AmountCalculateDiscount() {
        float totalBill = 88.890003f;
        float expectedResult = 80.001f;
        float actualResult = pizzaOrder.calculateDiscountAndReturnBillAmount(totalBill);
        Assertions.assertEquals(expectedResult, actualResult);
    }
}