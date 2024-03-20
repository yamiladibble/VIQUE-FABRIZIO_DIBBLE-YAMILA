package com.backend.clinica.controller;


import com.backend.clinica.dto.entrada.OdontologoEntradaDto;
import com.backend.clinica.dto.salida.OdontologoSalidaDto;
import com.backend.clinica.service.IOdontologoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/odontologos")
    public class OdontologoController {
        private IOdontologoService odontologoService;

        public OdontologoController(IOdontologoService odontologoService) {
            this.odontologoService = odontologoService;
        }

    @GetMapping("/{id}") // Buscar odontólogo por ID
    public ResponseEntity<OdontologoSalidaDto> buscarOdontologoPorId(@PathVariable Long id) {
        return new ResponseEntity<>(odontologoService.buscarOdontologoPorId(id), HttpStatus.OK);
    }

    @PostMapping("/registrar")//registrar odontologo
        public ResponseEntity<OdontologoSalidaDto> registrarOdontologo(@RequestBody OdontologoEntradaDto odontologo){
            return new ResponseEntity<>(odontologoService.registrarOdontologo(odontologo), HttpStatus.CREATED);
        }
        @PutMapping("/actualizar/{id}")//actualizar registro de odontologo
        public ResponseEntity<OdontologoSalidaDto> actualizarOdontologo(@RequestBody OdontologoEntradaDto odontologo){
            return new ResponseEntity<>(odontologoService.actualizarOdontologo(odontologo), HttpStatus.OK);
        }
        @DeleteMapping("/eliminar")//aliminar registro e odontologo
        public ResponseEntity<?> eliminarOdontologo(@RequestParam Long id){odontologoService.eliminarOdontologo(id);
            return new ResponseEntity<>("Odontologo eliminado correctamente", HttpStatus.NO_CONTENT);
        }
}
