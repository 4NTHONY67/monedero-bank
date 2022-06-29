package com.nttdata.monederobank.controller;

import com.nttdata.monederobank.model.PagoMonederoModel;
import com.nttdata.monederobank.service.PagoMonederoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@Controller
@RestController
@RequestMapping(value = "monederos")
public class PagoMonederoController {

  @Autowired
  private PagoMonederoService pagoMonederoService;

  @GetMapping
  public List<PagoMonederoModel> findAllMonederoPagos(){
    return pagoMonederoService.findMonederoPagos();
  }

  @PostMapping
  public ResponseEntity<PagoMonederoModel> create(@Valid @RequestBody PagoMonederoModel pago) {
    PagoMonederoModel response = pagoMonederoService.create(pago);
    return new ResponseEntity<PagoMonederoModel>(response, HttpStatus.CREATED);
  }

  @PutMapping
  public ResponseEntity<PagoMonederoModel> update(@Valid @RequestBody PagoMonederoModel pago) {
    PagoMonederoModel response = pagoMonederoService.update(pago);
    return  ResponseEntity.ok(response);
  }

  @DeleteMapping("/{id}")
  public ResponseEntity<Void> delete(@PathVariable("id") String id) {
    pagoMonederoService.delete(id);
    return new ResponseEntity<>(HttpStatus.NO_CONTENT);
  }

  @GetMapping("/{id}")
  public List<PagoMonederoModel> findById(@PathVariable("id") String id) {
    return pagoMonederoService.findById(id);
  }
}
