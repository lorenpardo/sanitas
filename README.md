# sanitas
prueba tecnica


# Generar .jar
Hay dos posibilidades:
1. Desde el propio IDE, por ejemplo Eclipse, 
    run/run configuration
      Maven Build --> Boton derecho new configuration
        Base directory --> ruta donde esta el proyecto
        Goal --> clean install
        Opcional: Si teneis en repositorio maven local la dependencias, necesarias, marcar offline, para no conectarse al repositorio remoto de maven y utilice el repositorio local directamente
2. Desde linea de comandos median mvn clean install
