# cucumberCalculadora
Se ha creado un feature para cada método, donde los escenarios van a ser las distintas pruebas para estos métodos.

Feature suma

El primer escenario es para pobar el funcianamiento correcto de la suma. Se utliza la opción outline para usar los parámetros para poder probar este funcionamiento. En este escenario se usa la calculadora para sumar dos números (a y b), la calulcadora tiene que devolver el resultado  de esta suma (result). Además se tiene que cumplir que result - a = b y que result - b = a.

En el segundo escenario la precondicion es que se va asuar la calucladora para sumar dos números, que al ser sumados dan un resultado mayor a Double.MAX_VALUE. Entonces, se debería devolver ArithmeticException.


Feature resta

El primer escenario es outline  y es donde se pruebe el correcto funcionameinto de la resta usando los parámetros.  Además, se comprueba que result + b = a

El segundo escenario es si el usuario intertnar restar dos números cuyo resultado es mayor a  Double.MAX_VALUE. Entonces, se debería elevar una ArithmeticException.


Feaure multiplicacion

En el primer escenario, que es outline, comprobamos el correcto funcionamiento de la multiplicacion gracias a los parámetros. En el segundo escenario miramos que se lanze la excepcion ArithmeticException si se intenta multipicar dos numeros que como resultado den un valor mayor que Double.MAX_VALUE. 


Feature division

En el primer escenario se compruba si se lanza un ArithmeticException si se intenta dividir entre 0. En el siguiente escenario outline mediante parámetros se comprueba el correcto funcionamiento de la division.


Feature factorial

En los dos primeros escenarios se prueba si se lanza un IllegalArgumentException si se intenta hacer el factorial de un número negativo o de un número mayor a quince. El último escenario es outline para comprobar por parámetros el funcinamiento del factorial.


Feature esPrimo

Se utiliza un solo escenario outline para comprobar que esPrimo hace su función
