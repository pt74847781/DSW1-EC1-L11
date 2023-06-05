package pe.edu.idat.DSW1EC1L11;

import jakarta.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

import io.spring.guides.gs_producing_web_service.Country;
import io.spring.guides.gs_producing_web_service.Currency;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;
import org.w3c.dom.css.Counter;

@Component
public class CountryRepository {
	private static final Map<String, Country> dias = new HashMap<>();

	@PostConstruct
	public void initData() {
		Country spain = new Country();
		spain.setName("Spain");
		
		dias.put(spain.getName(), spain);

		Country pe = new Country();
	    pe.setName("peru");
		

		dias.put(pe.getName(), pe);

		Country poland = new Country();
		poland.setName("Poland");
		

		countries.put(poland.getName(), poland);

		Country uk = new Country();
		uk.setName("United Kingdom");
		

		dias.put(uk.getName(), uk);
	}

	public Country findCountry(String name) {
		Assert.notNull(name, "The country's name must not be null");
		return dias.get(name);
	}
}
