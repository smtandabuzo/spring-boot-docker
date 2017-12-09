package converter;


import converter.TempConverterService;

public class TempConverterServiceImpl implements TempConverterService {
    private double TO_CELSIUS = .5556;
    private double TO_FAHRENHEIT = 1.8;
 @Override
    public double toCelsius(int fahrenheit){
     return (fahrenheit - 32)* TO_CELSIUS;
    }

    @Override
    public double toFahrenheit(int celsius){
     return (celsius * TO_FAHRENHEIT) + 32;
    }
}
