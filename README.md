# TareaS6_POO_Interfaces

## Propósito
Este repositorio contiene la implementación de tres sistemas utilizando Programación Orientada a Objetos en Java, enfocándose en el uso de **Interfaces como contratos de comportamiento**, polimorfismo y buenas prácticas.

## Estructura del Proyecto
El proyecto está dividido en 3 tareas principales:
1. **Sistema Académico de Documentos:** Implementación de la interfaz `Imprimible` en clases `Certificado`, `ActaNotas` y `HorarioAcademico`.
2. **Sistema Bancario de Pagos:** Implementación de la interfaz `Pagable` con lógica de validación de montos y cálculo de comisiones.
3. **Sistema de Roles Empresariales:** Separación de responsabilidades mediante interfaces múltiples (`Autenticable`, `Reportable`, `Gestionable`) aplicadas a `Cajero`, `Administrador` y `Supervisor`.

## Buenas Prácticas Aplicadas
- **Nombres Claros:** Interfaces con sufijos de capacidad (ej. `Imprimible`, `Pagable`).
- **Encapsulamiento:** Todos los atributos de clase son `private`.
- **Uso de `@Override`:** Para garantizar la correcta implementación de contratos.
- **Validaciones:** Se controla que los montos de pago no sean negativos.

## Video Explicativo
[ENLACE:](https://www.youtube.com/watch?v=6MeE--8m6x4)
