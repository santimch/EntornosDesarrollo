# TAREA 1. 

Dado el proyecto IntelliJ adjunto, comprobad mediante depuración del sistema: 

# *1. En la función1… ¿Qué hacen estas líneas de código?*

>String string2 = "string2";  

Da un valor a string2 en este caso es el texto string2  

>string2= string2.substring(0, string2.length()-1); 

Aquí dice que string2 es igual al número de letras de “string2” menos 1. Lo que vendría a ser 6. como tenemos substring nos daria el valor desde el 0 hasta el 6. Por lo cual string2 pasa a ser string 

>string2=string2+"1"; 

Aqui dice que string2 es igual a string2 (en nuestro caso string) +1. Por lo cual, string2 pasa a ser string1 

# 2. ¿Cuánto valen las variables string1 y string2 antes de ejecutar el siguiente código de comprobación?  
Se supone que valen igual ya que string1= string1 y string2=string1.  

>if(string1 == string2 ) { 
System.out.println("SÓN IGUALS " + a );. 
} else { 
System.out.println("SÓN DIFERENTS"); 
} 

# 3. ¿Por qué no funciona el operador == ? ¿Qué operador se debe usar en lugar de este?
Para que funcionara correctamente se debería usar equals() ya que estamos comparando dos objetos no dos valores numéricos  

# 4. La función2() está declarada de la siguiente manera: 

>public void funcion2() { 
System.out.println("Esta es la funcion 1"); 
System.out.println("Esta es la funcion 2"); 
System.out.println("como hago la llamada para que funcione????"); 
} 

**¿Cómo debo llamar a esta función desde el método MAIN para que funcione? Existen 2 posibilidades. Explícalas.** 
* Método estático: public static void funcion2() 

* Con objetos: public void funcion2() 











