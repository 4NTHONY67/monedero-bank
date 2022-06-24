package com.nttdata.monederobank.repository;

import com.nttdata.monederobank.model.PagoMonederoModel;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PagoMonederoRepository extends MongoRepository<PagoMonederoModel, String> {
}
