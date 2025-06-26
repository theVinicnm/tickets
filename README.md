# 🎟️ Sistema de Ingressos de Cinema (Cinema Ticket System)

Este projeto em Java implementa uma hierarquia de classes para representar diferentes tipos de ingressos comercializados em um cinema. A estrutura permite calcular o valor real de ingressos com base em suas regras específicas, como meia-entrada e ingresso família.

## 🌐 English Version

This Java project implements a class hierarchy to represent different types of cinema tickets. The structure calculates the real value of tickets based on specific rules such as half-price and family discount tickets.

---

## 📦 Funcionalidades / Features

- 🎬 Representação de ingresso com:
    - Preço base
    - Nome do filme
    - Indicação se é legendado
- 💰 Tipos de ingresso:
    - **Meia-entrada**: 50% de desconto
    - **Ingresso família**: valor multiplicado pelo número de pessoas e 5% de desconto se houver mais de 3 pessoas

---

## 🧱 Estrutura de Classes / Class Structure

- `Ticket` (classe abstrata selada)
    - `HalfPrice`
    - `Family`

Usa recursos modernos do Java como **sealed classes** e **polimorfismo**.

---

## ▶️ Como Executar / How to Run

```bash
javac Ticket.java HalfPrice.java Family.java Main.java
java Main

