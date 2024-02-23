package com.backend.parcial.test;

import com.backend.parcial.dao.impl.OdontólogoDaoH2;
import com.backend.parcial.entity.Odontologo;
import com.backend.parcial.service.OdontologoService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.List;


class OdontologoServiceTest {

    private OdontologoService odontologoService;
    @Test
    void deberíaGuardarUnOdontólogoYRetornarUnIdEnH2() {

       odontologoService = new OdontologoService(new OdontólogoDaoH2());
       Odontologo odontologo = new Odontologo(1,"Juan", "Perez", 2457);

       Odontologo odontologoRegistrado = odontologoService.registrarOdontologo(odontologo);
       Assertions.assertTrue(odontologoRegistrado.getId() != 0);

    }


    @Test
    void deberíaRetornarLaListaDeOdontologosEnH2() {
        odontologoService = new OdontologoService(new OdontólogoDaoH2());
        List<Odontologo> odontologos = odontologoService.listarOdontologos();

    }
}



