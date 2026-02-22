import static org.junit.jupiter.api.Assertions.*;

class TemperatureConverterTest {
    TemperatureConverter converter = new TemperatureConverter();

    @org.junit.jupiter.api.Test
    void fahrenheitToCelsius() {
        assertEquals(0, converter.fahrenheitToCelsius(32));
        assertEquals(80, converter.fahrenheitToCelsius(176));
        assertEquals(-40, converter.fahrenheitToCelsius(-40));


    }

    @org.junit.jupiter.api.Test
    void celsiusToFahrenheit() {
        assertEquals(32, converter.celsiusToFahrenheit(0));
        assertEquals(176, converter.celsiusToFahrenheit(80));
        assertEquals(-40, converter.celsiusToFahrenheit(-40));
    }

    @org.junit.jupiter.api.Test
    void isExtremeTemperature() {
        assertTrue(converter.isExtremeTemperature(-41));
        assertTrue(converter.isExtremeTemperature(-51));
        assertTrue(converter.isExtremeTemperature(51));
        assertTrue(converter.isExtremeTemperature(101));
        assertFalse(converter.isExtremeTemperature(-40));
        assertFalse(converter.isExtremeTemperature(50));
    }

    @org.junit.jupiter.api.Test
    void kelvinToCelsius() {
        assertEquals(26.85, converter.kelvinToCelsius(300), 0.0001);
        assertEquals(0.0, converter.kelvinToCelsius(273.15), 0.0001);
        assertEquals(-273.15, converter.kelvinToCelsius(0), 0.0001);
    }


}