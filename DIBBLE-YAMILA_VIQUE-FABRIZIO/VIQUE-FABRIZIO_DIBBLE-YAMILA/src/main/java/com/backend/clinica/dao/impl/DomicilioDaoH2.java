package com.backend.clinica.dao.impl;

import com.backend.clinica.dao.IDao;
import com.backend.clinica.entity.Domicilio;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DomicilioDaoH2 implements IDao<Domicilio> {

    @Override
    public Domicilio registrar(Domicilio domicilio) {
        return null;
    }

    @Override
    public List<Domicilio> buscarTodos() {
        return null;
    }

    @Override
    public List<Domicilio> listarTodos() {
        return null;
    }

    @Override
    public Domicilio obtenerPorId(int id) {
        return null;
    }

    @Override
    public Domicilio actualizar(Domicilio domicilio) {
        return null;
    }

    @Override
    public void eliminar(int id) {

    }
}
