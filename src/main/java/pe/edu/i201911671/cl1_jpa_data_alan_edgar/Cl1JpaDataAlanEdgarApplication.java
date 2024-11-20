package pe.edu.i201911671.cl1_jpa_data_alan_edgar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import pe.edu.i201911671.cl1_jpa_data_alan_edgar.entity.Country;
import pe.edu.i201911671.cl1_jpa_data_alan_edgar.repository.CountryRepository;

import java.util.Arrays;
import java.util.Optional;

@SpringBootApplication
public class Cl1JpaDataAlanEdgarApplication implements CommandLineRunner {

	@Autowired
	CountryRepository countryRepository;

	public static void main(String[] args) {
		SpringApplication.run(Cl1JpaDataAlanEdgarApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Optional<Country> argentina = countryRepository.findById("ARG");

		/*argentina.ifPresentOrElse(
				country -> {
					country.getLanguages().forEach(language ->
							System.out.println(language.getId().getLanguage())
					);
				},
				() -> {
					Optional<Country> peru = countryRepository.findById("PER");
					peru.ifPresentOrElse(
							country -> {
								country.getLanguages().forEach(language ->
										System.out.println(language.getId().getLanguage())
								);
							},
							() -> System.out.println("No se encontró ni Argentina ni Perú.")
					);
				}
		);*/

			countryRepository.deleteAllById(Arrays.asList("COL", "ARG"));

			System.out.println("Los países COL y ARG han sido eliminados junto con sus ciudades y lenguajes.");


	}

}
