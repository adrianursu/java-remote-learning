import java.util.Comparator;

public class CapitalNameComparator implements Comparator<Country> {
    @Override
    public int compare(Country country1, Country country2) {
        return country1.getCapital().compareTo(country2.getCapital());
    }
}
