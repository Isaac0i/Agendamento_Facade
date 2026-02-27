# 🏥 Sistema de Agendamento Médico

![Java](https://img.shields.io/badge/Java-21-blue)
![Status](https://img.shields.io/badge/Status-Em%20Desenvolvimento-yellow)
![Architecture](https://img.shields.io/badge/Architecture-Clean%20Layers-green)
![Pattern](https://img.shields.io/badge/Design%20Pattern-Facade-purple)

Projeto desenvolvido para praticar **Programação Orientada a Objetos**, **Arquitetura em Camadas** e aplicação do padrão de projeto **Facade**.

---

## 📌 Objetivo

Construir um sistema simples de agendamento de consultas médicas utilizando Java puro, aplicando boas práticas de organização de código e separação de responsabilidades.

O sistema simula:

- Cadastro de médicos
- Cadastro de pacientes
- Agendamento de consultas
- Cancelamento de consultas
- Validação de conflitos de horário
- Controle de status da consulta

---

## 🏗️ Arquitetura do Projeto

O projeto segue uma estrutura em camadas:

```text
agenda/
├── main/
│   └── Main.java
│
├── facade/
│   └── AgendaFacade.java
│
├── service/
│   └── AgendamentoService.java
│
├── repository/
│   ├── ConsultaRepository.java
│   ├── MedicoRepository.java
│   └── PacienteRepository.java
│
└── model/
    ├── Consulta.java
    ├── Medico.java
    ├── Paciente.java
    └── StatusConsulta.java
