package com.nttdata.monederobank.repository;

import com.nttdata.monederobank.model.PagoMonederoModel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface PagoMonederoRepository extends MongoRepository<PagoMonederoModel, String> {
  @Query("{id: ?0}")
  public List<PagoMonederoModel> findByID(String id);
}
