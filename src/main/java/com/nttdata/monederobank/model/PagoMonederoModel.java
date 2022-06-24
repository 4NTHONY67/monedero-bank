package com.nttdata.monederobank.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "monederos")
public class PagoMonederoModel {

    @Id
    private String id;
    private String tipoDocumento;
    private String nroDocumento;
    private int celular;
    private String imei;
    private String correo;
    private double pago;
    private Date fechaPago;
    private String tipoPago;
    private String numCuenta;
    private String numTarjeta;

}
