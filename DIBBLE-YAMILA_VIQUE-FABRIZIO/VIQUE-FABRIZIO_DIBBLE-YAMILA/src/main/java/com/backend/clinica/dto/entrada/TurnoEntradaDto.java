package com.backend.clinica.dto.entrada;
import com.backend.clinica.entity.Odontologo;
import com.backend.clinica.entity.Paciente;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.time.LocalDate;

public class TurnoEntradaDto {
    @NotNull(message = "El odontologo no puede ser nulo")
    @NotBlank(message = "Debe especificarse el nombre del odontologo")
    private Odontologo odontologo;

    @NotNull(message = "El paciente no puede ser nulo")
    @NotBlank(message = "Debe especificarse el nombre del paciente")
    private Paciente paciente;

    @FutureOrPresent(message = "La fecha no puede ser anterior al día de hoy")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private LocalDate fechaYHora;

    public TurnoEntradaDto () {
    }

    public TurnoEntradaDto(Odontologo odontologo, Paciente paciente, LocalDate fechaYHora) {
        this.odontologo = odontologo;
        this.paciente = paciente;
        this.fechaYHora = fechaYHora;
    }

    public Odontologo getOdontologo() {
        return odontologo;
    }

    public void setOdontologo(Odontologo odontologo) {
        this.odontologo = odontologo;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public LocalDate getFechaYHora() {
        return fechaYHora;
    }

    public void setFechaYHora(LocalDate fechaYHora) {
        this.fechaYHora = fechaYHora;
    }
}
