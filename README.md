# Practica4 "Chavalines" 
Hector Castro Cazares Héctor Alonso 118002682
Gúzman Ramírez Diego Arturo 321182324
Marcial Ahedo Andrick Lorel 321304074





# Se compila y ejecuta con:  javac main.java factory/ProductFactory.java model/*.java , java main#
                  




Argumentación sobre la elección del patrón de diseño

En esta práctica, se implementó el patrón de diseño Factory debido a sus ventajas en la creación de objetos de manera flexible y desacoplada. Dado que trabajamos con diferentes tipos de productos (Celular, Laptop, Tablet), el patrón Factory nos permitió centralizar la lógica de creación en una sola clase, facilitando la extensibilidad del sistema. Además, al utilizar una fábrica, evitamos la proliferación de instancias innecesarias y aseguramos un mejor control sobre el tipo de objeto devuelto.

Este patrón también nos ayudó a mantener el principio de "abierto/cerrado" del SOLID, ya que podemos agregar nuevas subclases de Product sin modificar código existente, solo extendiendo la funcionalidad de la fábrica.

Notas sobre la implementación

La fábrica ProductFactory está implementada de forma básica, pero podría mejorarse utilizando un enum en lugar de String para identificar los productos.

Se sobrescribió el método toString() en las clases de productos para una mejor visualización de la información.

Los atributos de los productos están encapsulados y algunos están marcados como final para garantizar inmutabilidad cuando sea posible.

