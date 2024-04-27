package com.mirla.agenda.agenda;

import java.util.ArrayList;
import java.util.List;

public class AgendaImpl {
    private List<String> horarios;

    // Construtor
    public AgendaImpl() {
        this.horarios = new ArrayList<>();
    }

    // Método para adicionar horário
    public void adicionarHorario(String horario) {
        this.horarios.add(horario);
    }

    // Método para remover horário
    public void removerHorario(String horario) {
        this.horarios.remove(horario);
    }

    // Método para listar os horários
    public void listarHorarios() {
        if (this.horarios.isEmpty()) {
            System.out.println("A agenda está vazia.");
        } else {
            System.out.println("Horários na agenda:");
            for (String horario : this.horarios) {
                System.out.println(horario);
            }
        }
    }

    // Getters e Setters para o atributo horarios
    public List<String> getHorarios() {
        return this.horarios;
    }

    public void setHorarios(List<String> horarios) {
        this.horarios = horarios;
    }
}
