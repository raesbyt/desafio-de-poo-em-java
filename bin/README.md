# 📱 Projeto iPhone - Desafio de POO em Java

Este repositório contém a implementação de um modelo simplificado de um iPhone em Java, como parte do **Desafio de Programação Orientada a Objetos (POO)** da [Digital Innovation One (DIO)](https://github.com/digitalinnovationone/trilha-java-basico/tree/main/desafios/poo), proposto na **Trilha Java Básico**.

A proposta do desafio consiste em modelar, a partir das principais funcionalidades do aparelho por meio de classes e interfaces em Java. Este exercício visa consolidar os conceitos de orientação a objetos como *encapsulamento*, *polimorfismo*, *modularização* e *separação de responsabilidades*.

---

## 📺 Inspiração

O CEO da Apple, Steve Jobs, descreve o iPhone como uma combinação de:

1. Um reprodutor de música revolucionário  
2. Um telefone móvel inovador  
3. Um navegador de internet avançado

---

## ✅ Funcionalidades Implementadas

Cada uma das três funcionalidades foi abstraída por meio de uma interface e implementada por uma classe de serviço:

| Funcionalidade         | Interface                  | Classe de Serviço                 | Métodos                                  |
|------------------------|----------------------------|-----------------------------------|-------------------------------------------|
| 🎵 Reprodutor Musical  | `ReprodutorMusical`        | `ReprodutorMusicalService`       | `tocar()`, `pausar()`, `selecionarMusica(String)` |
| 📞 Aparelho Telefônico | `AparelhoTelefonico`       | `AparelhoTelefonicoService`      | `ligar(String)`, `atender()`, `iniciarCorreioVoz()` |
| 🌐 Navegador Web       | `NavegadorInternet`        | `NavegadorInternetService`       | `exibirPagina(String)`, `adicionarNovaAba()`, `atualizarPagina()` |

---

## 🧩 Diagrama UML

Abaixo, o diagrama de classes representando a estrutura do projeto:

<img src="../img/uml-iphone-(1).png" width="500" alt="Oracle">

---

## 🧩 Estrutura do Projeto

```
src/
└── iphone/ 
    ├─ ─ app/ 
    │   └── Main.java 
    ├── entities/ 
    │   └── iPhone.java 
    ├── interfaces/ 
    │   ├── ReprodutorMusical.java 
    │   ├── AparelhoTelefonico.java 
    │   └── NavegadorInternet.java 
    └── services/ 
        ├── ReprodutorMusicalService.java 
        ├── AparelhoTelefonicoService.java 
        └── NavegadorInternetService.java

```

---

## 🛠️ Como Executar

1. Clone o repositório:
```bash
git clone https://github.com/seu-usuario/iphone-poo.git
```

2. Compile e execute:
```bash
cd iphone-poo/src/app
javac dispositivo/Iphone.java Main.java
java Main
```

## 📌 Requisitos Atendidos (DIO)

[x] Criação das interfaces e seus métodos

[x] Implementações completas em classes de serviço

[x] Aplicação com menus interativos via terminal

[x] Projeto organizado em pacotes

[x] Diagrama UML incluso no repositório ✅

📚 Fonte Oficial
Repositório do desafio na DIO

## 🎨 Diagrama UML (Mermaid)
mermaid
classDiagram
    class ReprodutorMusical {
        +tocar()
        +pausar()
        +selecionarMusica(String)
    }

    class AparelhoTelefonico {
        +ligar(String)
        +atender()
        +iniciarCorreioVoz()
    }

    class NavegadorInternet {
        +exibirPagina(String)
        +adicionarNovaAba()
        +atualizarPagina()
    }

    class ReprodutorMusicalService
    class AparelhoTelefonicoService
    class NavegadorInternetService
    class iPhone
    class Main

    ReprodutorMusicalService --> ReprodutorMusical
    AparelhoTelefonicoService --> AparelhoTelefonico
    NavegadorInternetService --> NavegadorInternet

    iPhone --> ReprodutorMusical
    iPhone --> AparelhoTelefonico
    iPhone --> NavegadorInternet

    Main --> iPhone

## 🛠️ Tecnologias

- Java 21
- Spring Tools Eclipse
- Paradigma de Programação Orientada a Objetos
- Diagramação com Mermaid Markdown

## 👤 Autor

Desenvolvido por **raesbyt**, com apoio educacional da [DIO](https://dio.me).  
Se quiser me acompanhar ou contribuir, fique à vontade para visitar meu GitHub!

📄 Licença
Este projeto está licenciado sob a MIT License.

---