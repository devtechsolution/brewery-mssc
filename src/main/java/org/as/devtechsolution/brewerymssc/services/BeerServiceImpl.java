package org.as.devtechsolution.brewerymssc.services;

import lombok.extern.slf4j.Slf4j;
import org.as.devtechsolution.brewerymssc.web.model.BeerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;
@Service
@Slf4j
public class BeerServiceImpl implements BeerService {
    @Override
    public BeerDto getBeerById (UUID beerId) {
        return BeerDto.builder().id(UUID.randomUUID())
                .beerName("Kingfisher")
                .beerStyle("Mild")
                .build();
    }
    @Override
    public BeerDto saveNewBeer(BeerDto beerDto) {
        return BeerDto.builder()
                .id(UUID.randomUUID())
                .build();
    }

    @Override
    public void updateBeer(UUID beerId, BeerDto beerDto) {
        //todo impl - would add a real impl to update beer
    }

    @Override
    public void deleteById(UUID beerId) {
        log.debug("Deleting a beer...");
    }
}
