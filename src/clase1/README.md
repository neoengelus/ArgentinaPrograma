### Clase 1 - “Desarrollador Java inicial”

# Introducción a Algoritmos y Java

**1.** Vamos a practicar operaciones básicas con números
    **a.** Utilizandolasentencia **while** ,imprimatodoslosnúmerosentre 2 variables“a”
       y “b”. Su código puede arrancar (por ejemplo):

```java
 int numeroInicio = 5;
 int numeroFin = 14;
 // Se deberían mostrar los números:
5,6,7,8,9,10,11,12,13, 
```


**b**. A lo anterior, solo muestre los números pares
**c**. Aloanterior,conunavariableextra,elijasisedebenmostrarlosnúmeros
pares o impares
**d**. Utilizando la sentencia for , hacer lo mismo que en(b) pero invirtiendo el orden

**2.** Dadoelsiguientetexto,vamosaatacarelsiguienteproblema:“determinarsiuna
    personapertenecealsegmentodeingresosaltos”.Delialiii,laideaeshacerloen
    papel y lápiz y sólo implementar el cuarto.
    “Sonhogaresquedeclaranreuniralgunadelassiguientescondiciones,considerandoa
    todas y todos los convivientes:
       _●_ Ingresosmensualestotalesdelhogarequivalentesosuperioresa$ 489. 083
          ( 3 , 5 canastas básicas para un hogar tipo 2 según el INDEC).
       _●_ Tener 3 o más vehículos con una antigüedad menor a 5 años.
       _●_ Tener 3 o más inmuebles.
       _●_ Poseer una embarcación, una aeronave de lujo o ser titular de activos
          societarios que demuestren capacidad económica plena.”
             **Tomado dehttps://www.argentina.gob.ar/subsidiosel 07 / 12 / 2022**
       **a.** Leaatentamenteeltexto,primeroquenadapiensecuálessonlasvariablesde
          entrada.
       **b.** OrdenelasentradasysalidascomovimosenlatabladelejemploMonotributo
          en clase, también puede consultar estelink
       **c.** Pienseenunarboldedecision,tambiencomosevioenclasesipuederesolver
          el problema, dadas las entradas

**d**. Finalmente, vea sipuede resolver el problemautilizando códigoJava.Por
ejemplo si estuviésemos intentando resolver el ejemplo de monotributo
tendríamos el código que se muestra más abajo, y cambiando las variables

```java
/*pueden cambiar estas variables para ir probando*/

 float ingresos = 299000;

 int superficie = 20;

 int energia = 900;

 /*********************************************/

 if ( (ingresos <= 748382.07) && ( superficie <= 30) && (energia <= 3330) ) {

System. out .println("Categoría A");

} else if ((ingresos <= 1112459.83) && (superficie <= 45) && (energia <= 5000) ) {

System. out .println("Categoría B");

}


```