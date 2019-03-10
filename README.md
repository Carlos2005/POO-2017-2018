# POO-2017-2018
Practica POO curso 2017-2018
1 – Análisis de la aplicación realizada
1-1. Diseño de la Aplicación.
La aplicación consta de 26 clases.
La clase Persona define la mayoría de los atributos de sus subclases, clientes y empleados.
Clientes y empleados son sus subclases. Las subclases de empleado definen la características de los mismos y las claves de accesos para los menus restringidos.
La clase electrodoméstico es la superclase de todos los tipos de electrodomésticos. Cada electrodoméstico lleva una variable estática para controlar el stock. Para los objetos del tipo hogar he utilizado un tipo enum para simplificar las clases
La clase compras contiene la lista de las compras de los clientes, su clave de acceso es el DNI.
La clase listas es la que contiene todas las listas estáticas a las que todas las otras clases puedan acceder, de forma que sólo exista una copia de éstas. Lista de empledos, clientes, electrodomésticos y compras.
Las clases de gestión se dedican a gestionar, los clientes, electrodomesticos, compras, devoluciones y financiación. Realizan todas las operaciones de altas, bajas, actualizaciones. Y también los cálculos necesarios para la financiación y también los cálculos entre fechas tanto para las devoluciones como para las reparacionse.
Los menus se encuentrar todos aislados en una sola clase menú de forma que separamos la presentación del contenido.
La clase tienda actúa de lanzadora, creando una instancia del menú.
Para fines didácticos hay un conjunto de objetos que se cargan automáticamente para rellenar las listas.
