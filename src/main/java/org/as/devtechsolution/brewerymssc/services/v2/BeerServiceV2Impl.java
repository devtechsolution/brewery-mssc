package org.as.devtechsolution.brewerymssc.services.v2;

import lombok.extern.slf4j.Slf4j;
import org.as.devtechsolution.brewerymssc.web.model.v2.BeerDtoV2;
import org.as.devtechsolution.brewerymssc.web.model.v2.BeerStyleEnum;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@Slf4j
public class BeerServiceV2Impl implements BeerServiceV2 {
    @Override
    public BeerDtoV2 getBeerById (UUID beerId) {
        return BeerDtoV2.builder().id(UUID.randomUUID())
                .beerName("Kingfisher")
                .beerStyle(BeerStyleEnum.GOSE)
                .build();
    }
    @Override
    public BeerDtoV2 saveNewBeer(BeerDtoV2 beerDto) {
        return BeerDtoV2.builder()
                .id(UUID.randomUUID())
                .build();
    }

    @Override
    public void updateBeer(UUID beerId, BeerDtoV2 beerDto) {
        //todo impl - would add a real impl to update beer
    }

    @Override
    public void deleteById(UUID beerId) {
        log.debug("Deleting a beer...");
    }
}
