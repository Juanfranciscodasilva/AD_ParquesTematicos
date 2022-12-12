Proyecto Gestión de Espectáculos en Parques Temáticos
============================

Esta aplicación está pensada para realizar una tarea de gestión interna de espectáculos privados en parques temáticos.

La funcionalidad de la aplicación se basará en la gestión de los diferentes espectáculos registrados para cada uno de los parques junto a los empleados y encargados de los espectáculos y de las inscripciones de los clientes que soliciten entrar en los mismos.

#  Índice de Contenidos 
* [Información técnica](#información-técnica)
    * [Requerimientos](#requerimientos)
    * [Almacenamiento](#almacenamiento)
    * [A tener en cuenta](#a-tener-en-cuenta)
* [Aplicación](#aplicación)
    * [Selección de parque](#selección-de-parque)
    * [Ventana principal](#ventana-principal)
        * [Pestaña espectáculos](#pestaña-espectáculos)
            * [Nuevo espectáculo](#nuevo-espectáculo)
            * [Modificar espectáculo](#modificar-espectáculo)
            * [Baja de espectáculo](#baja-de-espectáculo)
            * [Ver clientes del espectáculo](#ver-clientes-del-espectáculo)
            * [Inscribir cliente en espectáculo](#inscribir-cliente-en-espectáculo)
            * [Retirar cliente de espectáculo](#retirar-cliente-de-espectáculo)
        * [Pestaña empleados](#pestaña-empleados)
            * [Alta de empleado](#alta-de-empleado)
            * [Modificar empleado](#modificar-empleado)
            * [Baja de empleado](#retirar-persona)
            * [Espectáculos en responsabilidad](#espectáculos-en-responsabilidad)
        * [Pestaña clientes](#pestaña-clientes)
            * [Alta de cliente](#alta-de-cliente)
            * [Modificar cliente](#modificar-cliente)
            * [Baja de cliente](#baja-de-cliente)
            * [Ver espectáculos del cliente](#ver-espectáculos-del-cliente)
            * [Inscribir en espectáculo](#inscribir-en-espectáculo)
            * [Retirar de espectáculo](#retirar-de-espectáculo)
        * [Pestaña parque](#pestaña-parque)
            * [Datos](#datos)
        * [Pestaña salir](#pestaña-salir)
            * [Cerrar sesión](#cerrar-sesión)
            * [salir](#salir)
---

# Información Técnica
---
## Requerimientos

* JDK 18
* JCalendar-1.14.jar
* db4o.jar
* sqlite-jdbc-3.39.3.0.jar
* mysql-connector-java-8.0.23.jar

Se encuentran dentro del repositorio en un directorio llamado "libs"

## Almacenamiento

Se lleva a cabo a través de diferentes motores de bases de datos para cada 1 de los parques.
* MySql
* SQLite
* DB4O (No SQL)

El modelo relacional base del proyecto es el siguiente:

![MER](https://drive.google.com/uc?export=view&id=1Wuk9UXAK5IwR9Snz64kfQ1rjtLGeQcUR)

## A tener en cuenta
* Las vistas están hechas basadas en JFrame desde Netbeans, es posible que para visualizar de manera acertada su diseñador se necesite dicho IDE.
* Las respectivas configuraciones para la conexión con las bases de datos se encuentran como variables estáticas en el fichero genérico de cada respectivo SGBD, es decir, para MySql por ejemplo se encontrará en el paquete del proyecto "BBDD.mysql.MYSQL_BD.java".
* En el repositorio se encontrará un directorio llamado "SQL" que contiene 2 scripts de creación de las tablas necesarias para la aplicación, estos scripts realmente no son necesarios ejecutarlos para poder hacer funcionar la aplicación ya que ella misma se encarga de crear dichas tablas en caso de no existir.

---
# Aplicación
---

## Selección de Parque
---
La ventana de selección de parque cumplirá la función de poder cambiar la gestión de un parque u otro sin tener que parar la aplicación.

![seleccion-parque](https://drive.google.com/uc?export=view&id=1Js0-z0un8pGLu63K-MYlZWXsDJB9EsmL)

## Ventana Principal
---
La ventana principal consta de: un menú con diferentes pestañas para navegar por la aplicación, de un título y de botones para cerrar sesión y volver a la selección de parque o salir definitivamente de la aplicación (parar su ejecución).

![principal](https://drive.google.com/uc?export=view&id=173tRTrIvnFfm-mNYUZJ5rwQX3lGzBqQD)

## Pestaña Espectáculos

![principal-espectaculos](https://drive.google.com/uc?export=view&id=1dUKSzcT6dfOq9TQFoSsjxBxMpHwJtffS)

### Nuevo Espectáculo
La ventana de nuevo espectáculo consta de un formulario que recogerá datos del espectáculo:
* Nombre
* Aforo
* Descripción
* Lugar
* Encargado (Empleado ya registrado en la aplicación)

Esta ventana validará que no haya datos vacíos y que el aforo sea un numero entero mayor a cero. Para ello consta de etiquetas rojas que se mostrarán en función de las validaciones que no pase el formulario a la hora de crear el campamento.

![nuevo-espectaculo](https://drive.google.com/uc?export=view&id=1uGISbGhjX-J5NtyUQ0QAlyiz4eMPP7yP)

### Modificar Espectáculo
Este enlace redirige a una ventana intermedia donde se seleccionará el espectáculo a modificar. Dicha ventana está compuesta por un desplegable con los distintos espectáculos donde se puede seleccionar uno y se mostrarán sus datos. Contiene también un checkbox para poder mostrar o no los espectáculos dados de baja.

![modificar-espectaculo1](https://drive.google.com/uc?export=view&id=1Kh1bIh94z9X_r_ldiLM7iO7OyQ91XWQc)

Una vez seleccionado un espectáculo se podrá dar a "Modificar" y llevará a la siguiente ventana.

La siguiente ventana, como la de "Nuevo Espectáculo" consta de los campos necesarios a rellenar para modificar el espectáculo.

Nuevamente se hacen las validaciones, con un añadido de que el aforo no sea menor al número de clientes ya inscritas en dicho espectáculo.

![modificar-espectaculo2](https://drive.google.com/uc?export=view&id=1UvGZr2fa1X8f5_z74qM90KKXni-2Up-U)

### Baja de espectáculo
Al igual que en "Modificar Espectáculo" este enlace redirige a una ventana intermedia donde se seleccionará el espectáculo a dar de baja o eliminar. Dicha ventana está compuesta por un desplegable con los distintos espectáculos donde se puede seleccionar uno y se mostrarán sus datos. Contiene también un checkbox para poder mostrar o no los espectáculos dados de baja.

![eliminar-espectaculo](https://drive.google.com/uc?export=view&id=1tqmc9AEcV2lK18cOiKmzVaN8w_FEJyB4)

Una vez seleccionado un espectáculo se podrá dar a "Dar de baja". Paso seguido aparecerá una ventana de confirmación que dará la opción de dar de baja y mantener los datos aún registrados en la aplicación, eliminar completamente el espectáculo o cancelar.

![confirmacion-eliminar-espectaculo](https://drive.google.com/uc?export=view&id=1zpwNT0oSJqLuTGk1mi87uaNImu4zmpvG)

### Ver Clientes del Espectáculo
Este enlace redirige a una ventana donde se seleccionará el espectáculo del que se quieren ver los datos y además los clientes inscritos en el mismo. Dicha ventana está compuesta por un desplegable con los distintos espectáculos y un checkbox para poder ver también los espectáculos dados de baja.

![ver-clientes-del-espectaculo](https://drive.google.com/uc?export=view&id=1adF_HVX7IXhZTLfJ0AjuEt1VXko8Sx3h)

### Inscribir Cliente en Espectáculo
Este enlace redirige a una ventada donde se puede seleccionar el espectáculo y el cliente que se quiere inscribir, se validará que el cliente no esté ya inscrito en el espectáculo seleccionado y que además el espectáculo tenga aforo suficiente. Consta de 2 desplegables para seleccionar los datos.

![inscribir-cliente-en-espectaculo](https://drive.google.com/uc?export=view&id=1Kae6GW1D-4AMArz3mXgO6zbIg58gwgGd)

### Retirar Cliente de Espectáculo
Este enlace redirige a una ventada donde se puede seleccionar el espectáculo y el cliente que se quiere retirar, consta de 2 desplegables para seleccionar los datos, el segundo (de clientes) se rellenará automaticamente con los clientes correspondientes al cambiar el espectáculo.

![retirar-cliente-de-espectaculo](https://drive.google.com/uc?export=view&id=1l7iEwAykX8RPdpjj4jI3Bvhg17UYwixj)

## Pestaña Empleados

![principal-empleados](https://drive.google.com/uc?export=view&id=1TF1KxF0WmsOsBaBTxzB96uS_thU_AzIq)

### Alta de empleado
La ventana de alta de empleados consta de un formulario que recogerá datos del empleado:
* DNI
* Nombre
* Apellido
* Fecha de nacimiento
* Nacionalidad
* Fecha de contratación
* Cargo

Esta ventana validará que no haya datos vacíos, que el DNI no esté ya registrado y sea real, y que la contratación no sea posterior al nacimiento. Para ello consta de etiquetas rojas que se mostrarán en función de las validaciones que no pase el formulario a la hora de crear al empleado.

![alta-empleado](https://drive.google.com/uc?export=view&id=1KH6x8Bh0UOctj73sM-r7oVE7vKuTH8F_)

### Modificar Empleado
Este enlace redirige a una ventana intermedia donde se seleccionará el empleado a modificar. Dicha ventana está compuesta por un desplegable con los distintos empleados donde se puede seleccionar uno y se mostrarán sus datos. Contiene también un checkbox para poder mostrar o no los empleados dados de baja.

![modificar-empleado1](https://drive.google.com/uc?export=view&id=1Wx9DDExpCstWC2a_KNfMqZ7o-QY8w6_r)

Una vez seleccionado un empleado se podrá dar a "Modificar" y llevará a la siguiente ventana.

La siguiente ventana, como la de "Alta de Empleado" consta de los campos necesarios a rellenar para modificar el empleado, salvo el DNI que será fijo.

Nuevamente se hacen las validaciones.

![modificar-empleado2](https://drive.google.com/uc?export=view&id=1YbyjUhYeaCyvwH7nGXYvo2xB_yzDVzVX)

### Baja de Empleado
Al igual que en "Modificar Empleado" este enlace redirige a una ventana intermedia donde se seleccionará el empleado a dar de baja o eliminar. Dicha ventana está compuesta por un desplegable con los distintos empleados donde se puede seleccionar uno y se mostrarán sus datos. Contiene también un checkbox para poder mostrar o no los empleados dados de baja. Esta ventana validará que el empleado no tiene espectáculos en responsabilidad para poder darlo de baja o eliminarlo.

![eliminar-empleado](https://drive.google.com/uc?export=view&id=1LgeINQmXDQGoZKQgdz9CLLIhw_lMb-wI)

Una vez seleccionado un empleado se podrá dar a "Dar de baja". Paso seguido aparecerá una ventana de confirmación que dará la opción de dar de baja y mantener los datos aún registrados en la aplicación, eliminar completamente el empleado o cancelar.

![confirmacion-eliminar-empleado](https://drive.google.com/uc?export=view&id=1QSX3SV3LmPzo8oMeqRAs5GcirUWyW7rO)

### Espectáculos en responsabilidad
Esta ventana, como ocurre con la de "Ver Clientes del Espectáculo" consta de un desplegable para seleccionar el empleado del que se quieren ver los datos con el añadido de ver todos los espectáculos (de baja o no) de los que es responsable. También consta de un checkbox para poder seleccionar empleados de baja.

![espectaculos-en-responsabilidad](https://drive.google.com/uc?export=view&id=1K83OzuDrcFNtrN-34jozTRrjM7hup27g)

## Pestaña Clientes

![principal-clientes](https://drive.google.com/uc?export=view&id=1cWoKJWoCfkMwVFrempnj8nHwGjKL1dH3)

### Alta de Cliente
La ventana de alta de cliente consta de un formulario que recogerá datos del cliente:
* DNI
* Nombre
* Apellido
* Nacimiento

Esta ventana validará que no haya datos vacíos, que la fecha de nacimiento no sea posterior a la actual y que el DNI no esté ya registrado. Para ello consta de etiquetas rojas que se mostrarán en función de las validaciones que no pase el formulario a la hora de crear a la persona.

![alta-cliente](https://drive.google.com/uc?export=view&id=1TgPReDq0h7VDjXvRY10gp5c3qCO9W13q)

### Modificar Cliente
Este enlace redirige a una ventana intermedia donde se seleccionará el cliente a modificar. Dicha ventana está compuesta por un desplegable con los distintos clientes donde se puede seleccionar uno y se mostrarán sus datos. Contiene también un checkbox para poder mostrar o no los clientes dados de baja.

![modificar-cliente1](https://drive.google.com/uc?export=view&id=1eN9exBy7PWIEi9BgHnTLM-T4dMIkH5AE)

Una vez seleccionado un cliente se podrá dar a "Modificar" y llevará a la siguiente ventana.

La siguiente ventana, como la de "Alta de Cliente" consta de los campos necesarios a rellenar para modificar el cliente, salvo el DNI que será fijo.

Nuevamente se hacen las validaciones.

![modificar-cliente2](https://drive.google.com/uc?export=view&id=1x3qsb8LYq17jidIjOvC5tW3b4gLFxzYV)

### Baja de Cliente
Al igual que en "Modificar Cliente" este enlace redirige a una ventana intermedia donde se seleccionará el cliente a dar de baja o eliminar. Dicha ventana está compuesta por un desplegable con los distintos clientes donde se puede seleccionar uno y se mostrarán sus datos. Contiene también un checkbox para poder mostrar o no los clientes dados de baja.

![eliminar-cliente](https://drive.google.com/uc?export=view&id=1iaeihLXSrtJJ_oiLCpMs7z_iLFIzFaer)

Una vez seleccionado un cliente se podrá dar a "Dar de baja". Paso seguido aparecerá una ventana de confirmación que dará la opción de dar de baja y mantener los datos aún registrados en la aplicación, eliminar completamente el cliente o cancelar.

![confirmacion-eliminar-cliente](https://drive.google.com/uc?export=view&id=1RlhQDtJGmmgeeEQXpTWsNtmSST5VOYdp)

### Ver Espectáculos del Cliente
Este enlace redirige a una ventana donde se seleccionará el cliente del que se quieren ver los datos y además los espectáculos en los que está inscrito. Dicha ventana está compuesta por un desplegable con los distintos clientes y un checkbox para poder ver también los clientes dados de baja.

![ver-espectaculos-del-cliente](https://drive.google.com/uc?export=view&id=1LtpA4ps6UPnrB0xYZqGpBdtmJ7pJcmHA)

### Inscribir en Espectáculo
Este enlace redirige directamente a la misma ventana a la que redirige [Inscribir cliente en espectáculo](#inscribir-cliente-en-espectáculo) del menú de espectáculos.

### Retirar de Espectáculo
Este enlace redirige directamente a la misma ventana a la que redirige [Retirar cliente de espectáculo](#retirar-cliente-de-espectáculo) del menú de espectáculos.

## Pestaña Parque

![principal-parque](https://drive.google.com/uc?export=view&id=1Ev54cF2XUEIYPIrobsoDA2Sc-dgTpqkn)

### Datos
Al hacer click en esta pestaña se abrirá una pestaña que contiene los datos del parque.

![datos](https://drive.google.com/uc?export=view&id=1xTRfhmAd7zdGzw-33Q0H3cqOOhnJxplf)

## Pestaña Salir

![principal-salir](https://drive.google.com/uc?export=view&id=1j4VVr_r6th0eBGRnFYI_rxJEHhbegCxN)

### Cerrar Sesión
Al hacer click en esta pestaña se cerrará la sesión y se volverá al login de la aplicación.

### Salir
Al hacer click en esta pestaña se cerrará la aplicación deteniendo su ejecución.
