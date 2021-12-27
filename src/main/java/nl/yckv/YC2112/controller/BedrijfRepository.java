package nl.yckv.YC2112.controller;

import nl.yckv.YC2112.model.Bedrijf;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public interface BedrijfRepository extends CrudRepository<Bedrijf, Long> {


}
