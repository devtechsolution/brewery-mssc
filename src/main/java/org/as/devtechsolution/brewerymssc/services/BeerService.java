package org.as.devtechsolution.brewerymssc.services;

import org.as.devtechsolution.brewerymssc.web.model.BeerDto;

import java.util.UUID;

public interface BeerService {

    BeerDto getBeerById (UUID beerId);

    BeerDto saveNewBeer(BeerDto beerDto);

    void updateBeer(UUID beerId, BeerDto beerDto);

    void deleteById(UUID beerId);
}
