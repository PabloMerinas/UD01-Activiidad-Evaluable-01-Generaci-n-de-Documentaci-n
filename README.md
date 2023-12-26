# Sistema de Gestión de Reservas de Libros

> ## Curso Escolar 2023-2024
>
>## Autor: [Pablo Merinas Soto](https://github.com/PabloMerinas)
>
>## Tutor: [Antonio Grabiel Gonzales Casado](https://github.com/antonio-gabriel-gonzalez-casado)
>
>## Fecha de Inicio: 26-12-2023
>
>## Fecha de Finalización: 26-12-2024

## Descripción del Proyecto
> Este proyecto es una aplicacion elaborada en java como en javascript que permite la gestion de libros y reservas.

## Estructura de directorios en formato árbol
```bash
/BibliotecaReservasLibros
├── CHANGELOG.md
├── README.md
├── css
│ └── styles.css
├── docs
│ ├── javadoc
│ └── jsdoc
├── javaApp
│ ├── Libro.java
│ ├── Main.java
│ ├── Reserva.java
│ └── Usuario.java
└── js
├── Libro.js
├── main.js
├── Reserva.js
└── Usuario.js
```

## Instrucciones de Clonación, Configuración y Ejecución

### Clonar el Repositorio
Para obtener una copia del proyecto, clona el repositorio en tu máquina local usando el siguiente comando en tu terminal:

https://github.com/PabloMerinas/UD01-Activiidad-Evaluable-01-Generaci-n-de-Documentaci-n

Git clone https://github.com/PabloMerinas/UD01-Activiidad-Evaluable-01-Generaci-n-de-Documentaci-n

### Configuración en el IDE

#### Para Java
1. Abre tu IDE preferido (como IntelliJ IDEA o Eclipse).
2. Selecciona 'Importar Proyecto' y navega hasta la carpeta `javaApp`.
3. Sigue las instrucciones del IDE para importar el proyecto (puede ser necesario configurar el JDK).

#### Para JavaScript
1. Abre tu IDE preferido (como Visual Studio Code).
2. Abre la carpeta del proyecto (`BibliotecaReservasLibros`).
3. Asegúrate de tener Node.js instalado en tu sistema para ejecutar el proyecto JavaScript.

### Ejecución en Local

#### Para Java
1. Navega a la carpeta `javaApp`.
2. Compila y ejecuta `Main.java` desde tu IDE.

#### Para JavaScript
1. Abre una terminal en la carpeta `js`.
2. Ejecuta el comando `node main.js` para iniciar el programa.

## Documentación

Este proyecto incluye documentación completa para sus componentes en Java y JavaScript. Puedes acceder a la documentación en los siguientes enlaces:

### Documentación de Java (Javadoc)

La documentación de Javadoc para los componentes de Java se puede encontrar aquí:

- [Javadoc para BibliotecaReservasLibros (Java)](src/docs/javadoc/index.html)

### Documentación de JavaScript (JSDoc)

La documentación de JSDoc para los componentes de JavaScript está disponible aquí:

- [JSDoc para BibliotecaReservasLibros (JavaScript)](src/docs/jsdoc/index.html)

## Comandos para Generar la Documentación

Para generar la documentación de este proyecto, se utilizaron los siguientes comandos:

### Documentación de Java (Javadoc)

Para generar la documentación de Javadoc para los componentes de Java, se utilizó el siguiente comando en la terminal:

javadoc -d .src/docs/javadoc -sourcepath .src/javaApp -subpackages .

### Documentación de JavaScript (Jsdoc)

Para generar la documentación de JavaScript para los componentes de JavaScript, se utilizó el siguiente comando en la terminal:


jsdoc -d .src/docs/jsdoc .src/js/*.js


