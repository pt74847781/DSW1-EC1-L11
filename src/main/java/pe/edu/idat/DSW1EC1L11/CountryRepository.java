package pe.edu.idat.DSW1EC1L11;

import jakarta.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

import io.spring.guides.gs_producing_web_service.dias;
import io.spring.guides.gs_producing_web_service.Currency;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

@Component
public class CountryRepository {
	private static final Map<String, dias> countries = new HashMap<>();

	@PostConstruct
	public void initData() {
		dias spain = new dias();
		spain.setName("Spain");
		
		dias.put(spain.getName(), spain);

		
	}

	public dias findCountry(String name) {
		Assert.notNull(name, "The country's name must not be null");
		return dias.get(name);
	}
}