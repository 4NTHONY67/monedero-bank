package com.nttdata.monederobank.service;

import com.nttdata.monederobank.model.PagoMonederoModel;

import java.util.List;

public interface PagoMonederoService {

  List<PagoMonederoModel> findMonederoPagos();
  PagoMonederoModel create(PagoMonederoModel pago);
  PagoMonederoModel update(PagoMonederoModel pago);
  void delete(String id);
}
