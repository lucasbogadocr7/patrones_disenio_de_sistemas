En Argentina todos los productos pagan IVA. Algunos productos poseen tasa reducida.
Supongamos 21% de IVA para productos normales y 10% para tasa reducida.
 El objetivo es calcular el precio de determinado producto incluyendo su IVA y desacoplar
el cálculo del IVA de la propia clase (armando clases específicas que realicen el cálculo)
 El método accept del producto será el responsable de ejecutar al visit (realizar la ejecución
del algoritmo que ha sido desacoplado)
 La clase que implementa el visitor lo hace para todas las clases visitables
 Cuando se modifiquen las reglas del IVA sólo cambio 1 clase y no tengo que modificar cada
clase que requiere el cálculo de IVA
