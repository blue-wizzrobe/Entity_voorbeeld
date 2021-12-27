package nl.yckv.YC2112.controller;

import nl.yckv.YC2112.model.Bedrijf;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BedrijfService {
    @Autowired
    BedrijfRepository br;

    public Bedrijf save(Bedrijf bedrijf) {
        return br.save(bedrijf);
    }

    public Iterable <Bedrijf> findAll(){
        Iterable <Bedrijf> result = br.findAll();
        return result;
    }


}
