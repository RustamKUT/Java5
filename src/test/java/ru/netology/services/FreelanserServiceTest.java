package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.*;

class FreelanserServiceTest {
    @Test
    public void testCalculateRestMonth1() {
        // Arrange
        FreelanserService service = new FreelanserService();
        int income = 10_000;
        int expenses = 3_000;
        int threshold = 20_000;
        // Act
        int actual = service.calculate(income, expenses, threshold);

        // Assert
        int expected = 3;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testCalculateRestMonth2() {
        // Arrange
        FreelanserService service = new FreelanserService();
        int income = 100_000;
        int expenses = 60_000;
        int threshold = 150_000;
        // Act
        int actual = service.calculate(income, expenses, threshold);

        // Assert
        int expected = 2;
        Assertions.assertEquals(expected, actual);

    }

    @ParameterizedTest
    @CsvFileSource(resources = "test_data.csv")
    public void TestWithParams(int income, int expenses, int threshold, int expected) {
        // Arrange
        FreelanserService service = new FreelanserService();

        // Act
        int actual = service.calculate(income, expenses, threshold);

        // Assert

        Assertions.assertEquals(expected, actual);
    }

}