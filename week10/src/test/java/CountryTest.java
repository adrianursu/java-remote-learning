import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.Collections;

public class CountryTest {
    private final ArrayList<Country> countries = new ArrayList<>();
    private final ArrayList<String> countriesName = new ArrayList<>();
    private final ArrayList<String> countriesCapitalName = new ArrayList<>();

    @BeforeEach
    public void init() {
        countries.add(new Country("France", "Paris"));
        countries.add(new Country("Portugal", "Lisbon"));
        countries.add(new Country("Romania", "Bucharest"));
        countries.add(new Country("Ukraine", "Kiev"));
        countries.add(new Country("Albania","Tirana"));

        for (Country country : countries) {
            countriesName.add(country.getName());
            countriesCapitalName.add(country.getCapital());
        }
    }

    @Test
    @DisplayName("Sort countries by country name")
    public void test1() {
        CountryNameComparator nameCompare = new CountryNameComparator();
        Collections.sort(countriesName);
        countries.sort(nameCompare);

        ArrayList<String> sortedCountries = new ArrayList<>();
        for (Country country : countries) {
            sortedCountries.add(country.getName());
        }

        Assertions.assertEquals(sortedCountries, countriesName);
    }

    @Test
    @DisplayName("Sort countries by country's capital name")
    public void test2() {
        CapitalNameComparator capitalCompare = new CapitalNameComparator();
        Collections.sort(countriesCapitalName);
        countries.sort(capitalCompare);

        ArrayList<String> sortedCapitalNames = new ArrayList<>();
        for (Country country : countries) {
            sortedCapitalNames.add(country.getCapital());
        }

        Assertions.assertEquals(sortedCapitalNames, countriesCapitalName);
    }

    @Test
    @DisplayName("Binary Search Test")
    public void test3() {
        CapitalNameComparator capitalNameCompare = new CapitalNameComparator();
        countries.sort(capitalNameCompare);

        int indexOfCapital = Collections.binarySearch(countries, new Country(null, "Paris"), capitalNameCompare);
        Assertions.assertEquals("France", countries.get(indexOfCapital).getName());
    }
}
