package pe.edu.i201911671.cl1_jpa_data_alan_edgar.repository;

import org.springframework.data.repository.CrudRepository;
import pe.edu.i201911671.cl1_jpa_data_alan_edgar.entity.Country;

public interface CountryRepository extends CrudRepository<Country, String> {
}
