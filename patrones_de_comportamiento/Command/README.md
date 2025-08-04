Una empresa maneja varios servidores y cada uno de ellos deben correr diversos procesos, como
apagarse, prenderse, etc. Cada uno de estos procesos, a su vez, implica pequeños pasos como, por
ejemplo, realizar una conexión a dicho servidor, guardar los datos en un log, etc.
Apagar un servidor implica: conectar, verificar la conexión, guardar un log, apagar y cerrar la
conexión.
Prender un servidor implica: conectar, verificar la conexión, prender, guardar un log y cerrar la
conexión.
Cada servidor debe implementar cada una de las acciones (las llamables apagar y prender, pero
también todos los pasos intermedios como verificar la conexión, guardar el log, cerrar la conexión,
etc.). Cada servidor realiza cada uno de estos pasos de forma diferente, por lo cual se realiza una
clase para cada servidor donde se implementa cómo realizar cada paso.
Además debemos armar los Command concretos, o sea, las acciones concretas que son
invocables. En nuestro ejemplo son prender y apagar (las restantes acciones son sólo pasos de
estas acciones invocables). Las clases del Command tendrán una referencia al Server concreto al
momento de crearse, de esta forma se indicará sobre cuál server realizar las acciones.
