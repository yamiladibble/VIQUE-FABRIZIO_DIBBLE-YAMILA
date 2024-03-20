package com.backend.clinica.service;

import com.backend.clinica.dto.entrada.OdontologoEntradaDto;
import com.backend.clinica.dto.salida.OdontologoSalidaDto;

import java.util.List;

public interface IOdontologoService {
    OdontologoSalidaDto registrarOdontologo(OdontologoEntradaDto odontologo);
    List<OdontologoSalidaDto> listarOdontologos();

    OdontologoSalidaDto obtenerOdontologoPorId(int id);
    OdontologoSalidaDto actualizarOdontologo(OdontologoEntradaDto odontologo);


    Object buscarOdontologoPorId(int id);

    void eliminarOdontologo(int id);
}
