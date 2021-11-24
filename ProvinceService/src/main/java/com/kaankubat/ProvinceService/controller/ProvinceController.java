package com.kaankubat.ProvinceService.controller;

import com.kaankubat.ProvinceService.model.Province;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/province")
public class ProvinceController {

    private final List<Province> provinces = new ArrayList<>();

    public ProvinceController() {

        if (provinces.isEmpty()) {
            Province province1 = new Province("01", "Adana");
            Province province2 = new Province("02", "Adıyaman");
            Province province3 = new Province("03", "Afyon");

            provinces.add(province1);
            provinces.add(province2);
            provinces.add(province3);

        }

    }

    @GetMapping
    public ResponseEntity<List<Province>> getProvinces() {

        return new ResponseEntity<>(provinces, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Province> getProvince(@PathVariable String id) {
        Province result = getProvideById(id);

        return new ResponseEntity<>(result, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Province> createProvince(@RequestBody Province newProvince) {
        provinces.add(newProvince);

        return new ResponseEntity<>(newProvince, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> getProvince(@PathVariable String id, @RequestBody Province newProvince) {
        Province oldProvide = getProvideById(id);
        oldProvide.setName(newProvince.getName());

        return new ResponseEntity<>(HttpStatus.OK);

    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteProvince(@PathVariable String id) {
        Province province = getProvideById(id);
        provinces.remove(province);

        return new ResponseEntity<>(HttpStatus.OK);
    }

    private Province getProvideById(String id) {
        return provinces.stream()
                .filter(province -> province.getId().equals(id))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Province not found"));
    }

}



