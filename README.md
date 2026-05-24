# Calculadora de Notas de Estudiante 🎓

Una aplicación de línea de comandos interactiva y sencilla construida con **Java 21** que solicita el nombre de un estudiante y tres calificaciones, calcula su promedio y proporciona un mensaje motivacional personalizado basado en su rendimiento académico.

Este proyecto demuestra conceptos fundamentales de Java, incluyendo el manejo de entrada/salida (I/O) en consola, validación de datos, códigos de estado de salida del sistema y formateo de cadenas de texto.

---

## 🚀 Características

- **Entrada Interactiva por Consola:** Captura el nombre del estudiante y las calificaciones numéricas de forma dinámica utilizando `Scanner`.
- **Validación de Entrada Robusta:**
  - Evita que los nombres vacíos o en blanco bloqueen el programa o sean procesados.
  - Rechaza las calificaciones iguales o menores a cero, activando estados de error precisos en la terminal.
- **Cálculo Preciso:** Calcula el promedio aritmético utilizando variables `float` y formatea la salida final para mostrar exactamente dos decimales.
- **Sistema de Retroalimentación Dinámica:** Evalúa el promedio para mostrar mensajes de estado personalizados y adaptados a la puntuación final del estudiante.
- **Integración con el Sistema Operativo:** Utiliza los códigos adecuados de `System.exit()` (`0` para éxito, `1` para estados de error) para comunicarse de manera limpia con la terminal anfitriona (como Linux/Ubuntu).

---

## 🛠️ Requisitos y Entorno

- **Sistema Operativo:** Linux (Probado en Ubuntu v26) / Windows / macOS
- **Java SDK:** Java 21 (o superior)

---

## 📁 Estructura del Paquete

El proyecto sigue las convenciones estándar de nomenclatura de Java y está estructurado dentro del siguiente paquete:
```text
net.cracknight.student_grade_calculator
  └── Main.java
