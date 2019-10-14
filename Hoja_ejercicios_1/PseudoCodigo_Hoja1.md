# Algoritmos Bloque 1

## Ejercicios

#### 1. Elaborar un algoritmo para leer 3 números y determinar sí uno es la suma de los otros dos.

```CALCULA SUMA```

**VARIABLES DE ENTRADA**  

&emsp;&emsp;_num1_ ENTERO  
&emsp;&emsp;_num2_ ENTERO  
&emsp;&emsp;_num3_ ENTERO

**VARIABLES DE SALIDA**

**VARIABLES LOCALES**  

&emsp;&emsp;_suma_ ENTERO

**INICIO**

&emsp;LEER _num1_;  
&emsp;LEER _num2_;  
&emsp;LEER _num3_;

&emsp;edad = _num1_ + _num2_ + _num3_;

&emsp;SI (_edad_ == _num1_ * 2) ENTONCES  
&emsp;&emsp;&emsp;MOSTRAR(" _El primer número es la suma de los otros dos._ ");

&emsp;SINO SI (_edad_ == _num2_ * 2) ENTONCES  
&emsp;&emsp;&emsp;MOSTRAR("_El segundo número es la suma de los otros dos._");

&emsp;SINO SI (_edad_ == _num3_ * 2) ENTONCES  
&emsp;&emsp;&emsp;MOSTRAR("_El tercer número es la suma de los otros dos._");

&emsp;SINO  
&emsp;&emsp;&emsp;MOSTRAR ("_Ningún número es la suma de los otros dos._");

&emsp;FIN SI

**FIN**

---

#### 2. Solicitar un entero y determinar sí es múltiplo de 3 y además que se encuentre en el rango (100-200).

```MULTIPLO DE TRES```

**VARIABLES DE ENTRADA**  

&emsp;&emsp;_numero_ ENTERO

**VARIABLES DE SALIDA**  

**VARIABLES LOCALES**

**INICIO**

&emsp;LEER _numero_;  

&emsp;SI ((_numero % 3 == 0_) && (_numero >= 100 && numero <= 200_)) ENTONCES  

&emsp;&emsp;&emsp;MOSTRAR ("_El número es multiplo de 3_");

&emsp;SINO 

&emsp;&emsp;&emsp;MOSTRAR ("_El número no es divisible entre 3 o no esta en el rango admitido_");

&emsp;FIN SI

**FIN**

---

#### 3. Elaborar un algoritmo para leer la fecha de nacimiento de una persona y muestre su signo zodiacal.

```HOROSCOPO```

**VARIABLE ENTRADA**  

&emsp;_dia_ ENTERO  
&emsp;_mes_ ENTERO  

**VARIABLES DE SALIDA**  

**VARIABLES LOCALES**  

**INICIO**  

&emsp;LEER _dia_;  
&emsp;LEER _mes_;

&emsp;SI (((dia >= 21 && dia <= 29) && (mes == 3)) || (dia >= 1 && dia <= 20) && (mes == 4)) ENTONCES  
&emsp;&emsp;&emsp;MOSTRAR("Tu signo es Aries");  

&emsp;SINO SI (((dia >= 21 && dia <= 30) && (mes == 4)) || (dia >= 1 && dia <= 20) && (mes == 5)) ENTONCES  
&emsp;&emsp;&emsp;MOSTRAR("Tu signo es Tauro");  

&emsp;SINO SI (((dia >= 21 && dia <= 31) && (mes == 5)) || (dia >= 1 && dia <= 21) && (mes == 6)) ENTONCES  
&emsp;&emsp;&emsp;MOSTRAR("Tu signo es Geminis");  

&emsp;SINO SI (((dia >= 22 && dia <= 28) && (mes == 6)) || (dia >= 1 && dia <= 22) && (mes == 7)) ENTONCES  
&emsp;&emsp;&emsp;MOSTRAR("Tu signo es Cancer");  

&emsp;SINO SI (((dia >= 23 && dia <= 31) && (mes == 7)) || (dia >= 1 && dia <= 22) && (mes == 8)) ENTONCES  
&emsp;&emsp;&emsp;MOSTRAR("Tu signo es Leo");  

&emsp;SINO SI (((dia >= 23 && dia <= 30) && (mes == 8)) || (dia >= 1 && dia <= 23) && (mes == 9)) ENTONCES  
&emsp;&emsp;&emsp;MOSTRAR("Tu signo es Virgo");  

&emsp;SINO SI (((dia >= 24 && dia <= 30) && (mes == 9)) || (dia >= 1 && dia <= 22) && (mes == 10)) ENTONCES  
&emsp;&emsp;&emsp;MOSTRAR("Tu signo es Libra");  

&emsp;SINO SI (((dia >= 23 && dia <= 31) && (mes == 10)) || (dia >= 1 && dia <= 22) && (mes == 11)) ENTONCES  
&emsp;&emsp;&emsp;MOSTRAR("Tu signo es Escorpio");  

&emsp;SINO SI (((dia >= 22 && dia <= 29) && (mes == 11)) || (dia >= 1 && dia <= 20) && (mes == 12)) ENTONCES  
&emsp;&emsp;&emsp;MOSTRAR("Tu signo es Sagitario");  

&emsp;SINO SI (((dia >= 21 && dia <= 31) && (mes == 12)) || (dia >= 1 && dia <= 20) && (mes == 1)) ENTONCES  
&emsp;&emsp;&emsp;MOSTRAR("Tu signo es Capricornio");  

&emsp;SINO SI (((dia >= 21 && dia <= 31) && (mes == 1)) || (dia >= 1 && dia <= 18) && (mes == 2)) ENTONCES  
&emsp;&emsp;&emsp;MOSTRAR("Tu signo es Acuario");  

&emsp;SINO  
&emsp;&emsp;&emsp;MOSTRAR("Tu signo es Piscis");  

&emsp;FIN SI

**FIN**

---
#### 4. MOSTRAR LOS NÚMEROS DEL 1 AL 100 (CONTADOR)  

```CONTADOR```

**VARIABLES DE ENTRADA**  

**VARIABLES DE SALIDA** 

&emsp; _numero_ ENTERO

**VARIABLES LOCALES**  

**INICIO**  

&emsp;_numero_ = 1;  

&emsp;MIENTRAS (_numero_ <= _100_)&emsp; HACER  

&emsp;&emsp;MOSTRAR (_numero_);

&emsp;&emsp; _numero_ = _numero_ + 1;

&emsp;FIN MIENTRAS


**FIN**



---
#### 5. SUMAR LOS NÚMEROS DEL 1 AL 100 (ACUMULADOR)  

```ACUMULADOR```

**VARIABLE ENTRADA** 

**VARIABLES DE SALIDA**

**VARIABLES LOCALES**  

&emsp;_suma_ ENTERO  

&emsp;_contrador_ ENTERO

**VARIABLES LOCALES**  

**INICIO**  

&emsp;_suma_ = 0;  

&emsp;_cont_ = 1;

&emsp;MIENTRAS (_cont_ <= _100_) &emsp;HACER  

&emsp;&emsp;_suma_ = _suma_ + _cont_;  

&emsp;&emsp;MOSTRAR (_suma_);

&emsp;&emsp;_cont_ = _cont_ + _1_;

&emsp;FIN MIENTRAS

**FIN**

---

#### 6. DAR EL PROMEDIO DE LOS NÚMEROS DEL 1 AL 100 (PROMEDIO)  

```PROMEDIO```

**VARIABLE ENTRADA**  

**VARIABLES DE SALIDA**  


**VARIABLES LOCALES**  

&emsp;_suma_ ENTERO  

&emsp;_contrador_ ENTERO

**INICIO**  

&emsp;_suma_ = _0_;  

&emsp;_cont_ = _1_;

&emsp;MIENTRAS (_cont_ <= _100_) &emsp;HACER  

&emsp;&emsp;_suma_ = _suma_ + _cont_;  



&emsp;&emsp;_cont_ = _cont_ + 1;

&emsp;FIN MIENTRAS

&emsp;MOSTRAR (_suma_ / _100_);


**FIN**

---

#### 7. CONTAR, SUMAR Y CALCULAR LOS NÚMEROS QUE NOS DAN POR TECLADO HASTA QUE EL NÚMERO SEA 0.

`SUMADOR`

**VARIABLE ENTRADA**

&emsp;num ENTERO

**VARIABLES DE SALIDA**

**VARIABLES LOCALES**  

&emsp;flag BOOLEANO  

&emsp;suma ENTERO

&emsp;cont ENTERO

**INICIO**  

&emsp;flag = false;  
&emsp;suma = 0;  
&emsp;cont = 1;  

  

&emsp;MIENTRAS( !flag )&emsp; HACER  

&emsp;&emsp;LEER num;

&emsp;&emsp;SI (num == 0) &emsp;ENTONCES  
&emsp;&emsp;&emsp;flag = true;  
  
&emsp;&emsp;SINO  


&emsp;&emsp;&emsp;suma = suma + num;

&emsp;&emsp;&emsp;cont = cont + 1;  

&emsp;&emsp;FIN SI  

&emsp;FIN MIENTRAS  

&emsp;MOSTRAR (" La suma es: " + suma );  
&emsp;MOSTRAR (" Y el conteo es: " + cont);

**FIN**


---

#### 8. CONTAR, SUMAR Y CALCULAR EL PROMEDIO DE LOS NÚMEROS QUE NOS DAN POR TECLADO HASTA UN TOTAL DE 3 NÚMEROS.

`SUMADOR_2`

**VARIABLE ENTRADA**  

**VARIABLES DE SALIDA** 

**VARIABLES LOCALES**  

**INICIO**  



**FIN**


---

#### 9. DADO EL IMPORTE DE LA COMPRA, CALCULAR EL IMPORTE TOTAL CON DESCUENTO. 
>Sabiendo que con una compra a partir de 100 euros te hacen un 20% de descuento, y a partir 300 euros un 40% de descuento.

`IMPORTE`

**VARIABLE ENTRADA**  

**VARIABLES DE SALIDA**  

**VARIABLES LOCALES**  

**INICIO**  



**FIN**

---

#### 10. CALCULAR EL SUMATORIO DE UN NÚMERO DADO (SUMAR TODOS LOS NÚMEROS DESDE ESE NÚMERO HASTA EL 1)

`SUMADOR_3`

**VARIABLE ENTRADA**  

**VARIABLES DE SALIDA** 

**VARIABLES LOCALES**  

**INICIO**  



**FIN**

---

 #### 11. SE DESEA ENCONTRAR DE MANERA INDEPENDIENTE LA SUMA DE LOS NÚMEROS PARES E IMPARES COMPRENDIDOS ENTRE EL 1 Y EL 100. 
 
 >vamos a utilizar **función modulo** para saber si es par o impar.

 `SUMA_PARES`

 **VARIABLE ENTRADA**  

**VARIABLES DE SALIDA** 

**VARIABLES LOCALES**  

**INICIO**  



**FIN**

 ---

 #### 12. DADOS TRES NUMEROS ENTEROS, INDICAR CUÁL DE LOS TRES ES MAYOR.

 `MAYOR`

 **VARIABLE ENTRADA**  

**VARIABLES DE SALIDA** 

**VARIABLES LOCALES**  

**INICIO**  



**FIN**

 ---

 #### 13. CALCULAR EL FACTORIAL DE UN NÚMERO

 `FACTORIAL`

 **VARIABLE ENTRADA**  

**VARIABLES DE SALIDA** 

**VARIABLES LOCALES**  

**INICIO**  



**FIN**

 ---

 #### 14. DADAS DOS FECHAS DE NACIMIENTO INDICAR CUANTOS AÑOS MESES Y DÍAS DE DIFERENCIA TIENEN.

 `NACIMIENTO`

 **VARIABLE ENTRADA**  

**VARIABLES DE SALIDA** 

**VARIABLES LOCALES**  

**INICIO**  



**FIN**

 ---

 #### 15. DADAS LAS NOTA DE TEORÍA, PRÁCTICA Y LOS POSITIVOS, INCIAR CUÁL SERÁ LA NOTA FINAL

>Sabiendo que, solo pueden aprobar los que tienen la teoría y la práctica aprobada.
Si la nota media está aprobada y alguna de las partes suspensa la nota final será un 4.
En otro caso será la nota media de TEORÍA/PRÁCTICA.
Una vez tengas la nota final, hay que subir un 1% la nota de los positivos.

`CALC_NOTA`

**VARIABLE ENTRADA**  

**VARIABLES DE SALIDA**  

**VARIABLES LOCALES**  

**INICIO**  



**FIN**

---

#### 16. ALGORITMO ADIVINA UN NÚMERO, SE SOLICITARÁ UN NÚMERO Y SE IRÁN DANDO PISTAS DE SI ES MAYOR O MENOR HASTA ENCONTRARLOEL NÚMERO DE INTENTOS SERÁ INFINITO.

`ADVINA`

**VARIABLE ENTRADA**  

**VARIABLES DE SALIDA** 

**VARIABLES LOCALES**  

**INICIO**  



**FIN**

---

#### 17. LÍMITAR EL NÚMERO DE INTENTOS AL ALGORITMO ANTERIOR.

`ADIVINA_2`

**VARIABLE ENTRADA**  

**VARIABLES DE SALIDA**

**VARIABLES LOCALES**  

**INICIO**  



**FIN**

---

#### 18. DADAS DOS FECHAS DE NACIMIENTO: A Y B en AÑO/MES/DÍA INDICAR QUIÉN ES MAYOR

`FECH_MAYOR`

**VARIABLE ENTRADA**  

**VARIABLES DE SALIDA**

**VARIABLES LOCALES**  

**INICIO**  



**FIN**