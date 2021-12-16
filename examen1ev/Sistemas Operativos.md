# Sistemas Operativos
El sistema operativo **administra los recursos del sistema, controla la ejecución de los programas y actúa como intermediario entre el usuario y el hardware*

## Objetivos del SO
- Transformar el hardware de una computadora en una máquina accesible al usuario
- Ejecutar programas y facilitar la solución de problemas al usuario
- Usar el computador de forma eficiente
- Proporcionar unos servicios

El sistema operativo busca:
1. Eficacia
2. Robustez y estabilidad
3. Escalabilidad
4. Portabilidad
5. Seguridad
6. Seguridad
7. Protección
8. Interactividad
9. Comodidad
10. Auditabilidad
11. Transparencia

## Estructura del SO
![estructura](imagenes/Estructura.png)

## Funciones del SO
- Como gestor de recursos
    - Asignador de recursos: sabe que recursos están disponibles y los asigna a los procesos que lo soliciten
    - Protección: protección entre usuarios del sistema y entre procesos
    - Monitorización y contabilidad de los recursos
- Como máqui extendida
    - Ejecución de programas
    - Órdenes de entrada y salida
    - Operaciones sobre archivos (escritura, lectura, borrado etc)
    - Detección y tratamiento de errores
- Como interfaz de usuario
A través de una **shell* el usuario puede comunicarse con el SO. Puede ser *gráfica, modo texto, o scripts*

## Componentes del SO
1. Gestión de procesos
    - Crear y eliminar procesos, suspenderlos y reanudarlos, así como proporcionar mecanismos de sincronización
2. Gestión de la memoria principal
    - Controla las zonad de memoria utilizada y quien las utiliza
    - Decidir que procesos se cargan en memoria
    - Asignar y reclamar espacio en la ram
3. Gestión de Etrada/Salida
    - Sitema de almacenamiento temporal (caché)
    - El SO debe gestionar el almacenamiento demporal de E/S y servir las interrupciones de los dispositivos
4. Gestión de archivos
    - Gestion del espacio del dissco
    - Gestión de ficheros
    - Gestión de directorios
    - Gestión de copias de seguirdad
    - Existen diferentes sistemas de archivos, como **FAT32** o **ext3** 
5. Seguridad y protección
    - Controlar el acceso a los recursos así como los permisos a los usuarios
6. Sistema de comunicación y sinconización
    - Controlar el envío y recibo de información
    - Crear puntos de comunicación para las aplicaciones
    - Acceso a recursos compartidos
7. Programas del sistema
    - Aplicaciones de utilidad que ofrecen un entorno útil para el desarrollo y ejecución de programas, así como la realización de tareas como:
        - Manipular y modificar archivos
        - Información del estado del ssitema
        - Soporte a lenguajes de programación
        - Comunicaciones
8. Gestor de recursos
    - Unidad Central de Procesamiento (donde está el microprocesador)
    - Dispositivos de E/S
    - La memoria principal
    - Los discos
    - Los procesos
    - Todos los recursos del sistema

## El kernel 
Es el corazón del SO. Gestiona los recursos del hardware y suministra funcionalidades básicas del SO.

## Arranque del computador
1. Toma el control el iniciador ROM
2. Luego toma el Bootloader
3. Toma el control el sistema operativo

## Clasificaciones de SO
- **Monousuario** o **multiusuario**
- **Monotarea** o **Multitarea**
- **Uniproceso** o **Multiproceso**

## Tipos de Sistemas operativos
1. Monolíticos
    - Sin estructura clara y definida
    - Todo se ejecuta en el mismo espacio de direcciones
    - Ej: MS-DOS
2. Estructurados
    1. Por capas o niveles
        - El nivel más bajo tiene contacto directo con el hardware y el más alto con el usuario
    2. Cliente-servidor
    3. Híbridos
         - Mezlan un poco de microkernel y monolítico
         - Ej: Windows, Linux
    4. Máquinas Virtuales
3. Híbridos

Una **distribución**, como en Linux es una suma del kernel+drivers+shell+programas de utilidad. <br>
Algunas distribuciones populares de Linux son:
    - Linux mint
    - Ubuntu
    - Arch Linux
    - Pop!_OS
 <br>
 