package hello;

import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Component
public class CountryRepository {
    private static final List<Country> countries = new ArrayList<Country>();

    @PostConstruct
    public void initData() {
        Country ukraine = new Country();
        ukraine.setName("Ukraine");
        ukraine.setCapital("Kyiv");
        ukraine.setCurrency(Currency.UAH);
        ukraine.setPopulation(45362970);

        countries.add(ukraine);

        Country usa = new Country();
        usa.setName("United States of America");
        usa.setCapital("Washington");
        usa.setCurrency(Currency.USD);
        usa.setPopulation(324271190);

        countries.add(usa);

        Country spain = new Country();
        spain.setName("Spain");
        spain.setCapital("Madrid");
        spain.setCurrency(Currency.EUR);
        spain.setPopulation(47661310);

        countries.add(spain);
    }

    public Country findCountry(String name) {
        Assert.notNull(name);

        Country result = null;

        for (Country country : countries) {
            if (name.equals(country.getName())) {
                result = country;
            }
        }

        return result;
    }
}
