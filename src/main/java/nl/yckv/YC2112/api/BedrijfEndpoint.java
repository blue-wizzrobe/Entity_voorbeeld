package nl.yckv.YC2112.api;

import nl.yckv.YC2112.controller.BedrijfService;
import nl.yckv.YC2112.model.Bedrijf;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class BedrijfEndpoint {

    @Autowired
    BedrijfService bs;

    @PostMapping("derde")
    public Bedrijf myMethod4(@RequestBody Bedrijf data) {
        bs.save(data);
        return data;
    }

    @GetMapping("vierde/{data}")
    public Bedrijf myMethod4(@PathVariable String data) {
        Bedrijf b = new Bedrijf();
        b.setNaam(data);
        System.out.println(data);
        bs.save(b);
        return b;
    }
}
