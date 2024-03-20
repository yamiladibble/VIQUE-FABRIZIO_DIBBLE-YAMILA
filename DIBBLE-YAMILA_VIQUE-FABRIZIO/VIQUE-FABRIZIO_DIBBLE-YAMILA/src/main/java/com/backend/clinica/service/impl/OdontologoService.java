package com.backend.clinica.service.impl;

import com.backend.clinica.entity.Odontologo;
import com.backend.clinica.repository.OdontologoRepository;
import com.backend.clinica.service.IOdontologoService;
import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class OdontologoService implements IOdontologoService {
    private final Logger LOGGER = LoggerFactory.getLogger(OdontologoService.class);
    private OdontologoRepository odontologoRepository;


    private ModelMapper modelMapper;

    public OdontologoService(OdontologoRepository odontologoRepository, ModelMapper modelMapper) {
        this.odontologoRepository = odontologoRepository;
        this.modelMapper = modelMapper;
    }

    public Odontologo registrarOdontologo(Odontologo odontologo) {
        return odontologoRepository.save(odontologo);
    }

    public Odontologo buscarOdontologoPorId(Long id) {
        return odontologoRepository.findById(id).orElse(null);
    }

    @Override
    public void eliminarOdontologo(Long id) {

    }

    public List<Odontologo> listarOdontologos() {
        return odontologoRepository.findAll();
    }

    @Override
    public Odontologo actualizarOdontologo(Odontologo odontologo) {
        return null;
    }


}