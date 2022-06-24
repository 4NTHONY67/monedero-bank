package com.nttdata.monederobank.service;

import com.nttdata.monederobank.model.PagoMonederoModel;
import com.nttdata.monederobank.repository.PagoMonederoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PagoMonederoServiceImpl implements PagoMonederoService {

  private PagoMonederoRepository pagoMonederoRepository;

  @Override
  public List<PagoMonederoModel> findMonederoPagos() {
    return pagoMonederoRepository.findAll();
  }

  @Override
  public PagoMonederoModel create(PagoMonederoModel pago) {
    return pagoMonederoRepository.save(pago);
  }

  @Override
  public PagoMonederoModel update(PagoMonederoModel pago) {
    return pagoMonederoRepository.save(pago);
  }

  @Override
  public void delete(String id) {
    pagoMonederoRepository.findById(id);
  }
}
