🧮 Calculadora Tópicos B

Bienvenido al repositorio de CalculadoraTopicosB, una aplicación de escritorio desarrollada en Java que implementa una calculadora funcional. Este proyecto fue creado utilizando el entorno de desarrollo NetBeans.

🚀 Descripción

Este proyecto es una aplicación Java que permite realizar operaciones matemáticas. Está estructurada en módulos para separar la ejecución principal de la lógica administrativa de la calculadora.

El sistema se compone principalmente de dos clases clave:

MainCalculadora: El punto de entrada de la aplicación.

AdmonCalculadora: La clase encargada de la gestión lógica de las operaciones.

🛠️ Tecnologías Utilizadas

Lenguaje: Java (JDK Compatible con la versión definida en project.properties).

Build System: Apache Ant (basado en build.xml).

IDE Recomendado: NetBeans (el proyecto incluye la carpeta nbproject).

📂 Estructura del Proyecto

La estructura de directorios es la estándar de un proyecto NetBeans:

CalculadoraTopicosB/
├── src/
│   └── src/
│       ├── MainCalculadora.java   # Clase Principal (Main)
│       └── AdmonCalculadora.java  # Lógica de la calculadora
├── nbproject/                     # Configuraciones del proyecto NetBeans
├── build.xml                      # Script de compilación Ant
└── manifest.mf                    # Manifiesto de la aplicación


⚙️ Instalación y Ejecución

Opción 1: Usando NetBeans IDE (Recomendado)

Descarga o clona este repositorio.

Abre NetBeans IDE.

Ve a File > Open Project.

Selecciona la carpeta CalculadoraTopicosB.

Haz clic derecho en el proyecto y selecciona Run (o presiona F6).

Opción 2: Compilación Manual (Ant)

Si tienes Apache Ant instalado en tu sistema, puedes compilar y ejecutar desde la terminal:

# Navega a la carpeta del proyecto
cd CalculadoraTopicosB

# Compila el proyecto
ant compile

# Ejecuta el proyecto
ant run


Opción 3: Compilación con Javac

Si prefieres no usar Ant ni NetBeans, puedes compilar manualmente:

# Desde la raíz del proyecto
javac -d build src/src/*.java
java -cp build src.MainCalculadora


(Nota: Ajusta el nombre del paquete src.MainCalculadora si el paquete declarado dentro del archivo es diferente).

👥 Contribución

Si deseas contribuir a este proyecto de Tópicos:

Haz un Fork.

Crea una rama (git checkout -b feature/nueva-operacion).

Haz tus cambios y realiza un commit.

Abre un Pull Request.

Desarrollado para la materia de Tópicos Avanzados de Programación (B).
