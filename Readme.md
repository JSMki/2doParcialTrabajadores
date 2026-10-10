# Sistema de Registro y Nómina de Trabajadores

Un sistema de consola desarrollado en Java que permite administrar el registro y salario de empleados mediante la implementación de una lista ligada sencilla.

## Descripción

Este proyecto es una aplicación práctica de los conceptos de listas ligadas y Programación Orientada a Objetos (POO) en Java. Permite almacenar, consultar, agregar y eliminar objetos de tipo `Trabajador` dentro de una lista ligada implementada completamente desde cero.
- **El problema que resuelve:** Ayuda a llevar un control local del personal de una empresa y automatiza el cálculo del total a pagar en la nómina.
- **Los objetivos principales:** Demostrar la creación de clases propias para gestionar objetos dinámicamente sin la limitante de tamaño estricto de un arreglo tradicional.
- **El contexto o motivación:** Proyecto de evaluación para el Segundo Parcial de la materia.

## Tecnologías Utilizadas

- Java

## Requisitos Previos

- Java Development Kit (JDK) instalado.
- Editor de código o IDE (recomendamos IntelliJ IDEA).

## Instalación

1. Clona este repositorio o descarga los archivos fuente.

2. Asegúrate de que los archivos `Main.java`, `SinglyLinkedList.java`, `Node.java` y `Trabajador.java` se encuentren en la misma carpeta (Sources Root) de tu proyecto.
3. Abre el proyecto en tu entorno de desarrollo (IDE).

## Uso

1. Ejecuta el archivo `Main.java` para iniciar el sistema.
2. Interactúa con el menú principal escribiendo el número de la opción que deseas utilizar:
    - **1. Agregar trabajador:** El sistema creará un nuevo vagón o nodo (`Node`) al final de la lista y te pedirá ingresar el nombre y salario del empleado para guardarlo.
    - **2. Eliminar trabajador:** Escribe el nombre exacto del empleado que deseas despedir; el sistema buscará el nodo a lo largo de la lista y lo desconectará de forma segura.
    - **3. Mostrar todos los trabajadores:** Visualiza la lista completa de empleados activos recorriendo los enlaces desde el inicio (`head`) hasta el final[cite: 4].
    - **4. Calcular nómina total:** (Operación extra) Recorre la lista ligada sumando el salario de todos los trabajadores para entregar el gasto general de la empresa.
    - **5. Salir:** Termina la ejecución del programa.

## Características

- **Almacenamiento dinámico:** Capacidad para gestionar trabajadores de forma ilimitada usando una lista ligada (`SinglyLinkedList`)[cite: 4].
- **Nodos genéricos:** Uso de una clase `Node<T>` con un tipo genérico que permite transportar y almacenar cualquier clase de objeto en su variable `data`[cite: 3].
- **Eliminación inteligente:** Borrado de empleados conectando el nodo anterior directamente con el siguiente (`previous.setNext(current.getNext())`), eliminando el elemento del medio sin romper el resto de la lista[cite: 4].
- **Prevención de errores:** Validación de entradas numéricas (`sc.hasNextInt()`) para evitar que el programa colapse si el usuario ingresa texto por error al navegar por el menú[cite: 7].

## Autores

**Jaime Ivan Sanchez Romero**[cite: 5]
- Email: sanchezrjaimei@gmail.com[cite: 5]
- Teléfono: +52 222 292 0037[cite: 5]