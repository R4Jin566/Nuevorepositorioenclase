public class operadores {

    public static void main(String[] args) {
        /* Tipos de operadores
         * 
         //Operadores Aritméticos
            + Suma, - Resta, * Multiplicación, / División, % Módulo

        //Operadores de asignación
        */
        int edadPadre = 35;
        int edadHijo = 5; 

        int sumaedades = 0;

        // suma +
        // edadPadre + edadHijo // necesita el operador de asignación 
        sumaedades = edadPadre + edadHijo;
        System.out.println("La suma de las edades es: " + sumaedades);

        //Dentro de Java están disponibles todas las operaciones básicas
        // Suma +
        // Resta -
        // Multiplicación *
        // División /
        // Módulo %
    int restaedades = edadPadre - edadHijo;

    System.out.println("La resta de las edades es: " + restaedades);

    // Operador  División
    int media = edadHijo + edadPadre / 2; 
    // Está mal ya que hay precedencia de operadores
    // Al igual que en matemáticas, las operaciones entre paréntesis se realizan primero, la división es lo último que se realiza

    media = (edadHijo + edadPadre) / 2; 
    // Ahora sí está bien

    media = sumaedades / 2;
    // Es lo mismo que la línea anterior, pero es mas eficiente
    // Me ahorro una operación de suma

    // Producto de edades 

    int dobleHijo = edadHijo * 2;

   // Operador Módulo
   // El operador módulo devuelve el resto de una división entera
   int resto = 35 % 2;

   System.out.println("El resto de dividir 35 entre 2 es: " + resto);


   edadHijo = edadHijo +10;
   //Una forma mas facil de hacerlo ahorrandonos una suma
   edadHijo += 10;
   edadHijo -= 10;
   edadHijo *= 2;
   edadHijo /= 2;
   System.out.println("La edad del hijo es: " + edadHijo);

   edadHijo = edadHijo +1;
   edadHijo += 1; 
   //Lo segundo es lo mismo que lo primero

   edadHijo++; // Operador de incremento
   System.out.println("1.La edad del hijo es: " + edadHijo);
   
   edadHijo = 10;
   ++edadHijo;
   System.out.println("2.La edad del hijo es: " + edadHijo);//Primero usa el valor y

   System.out.println("3. Despues de la línea anterior, la edad del hijo es: " + edadHijo); //




    }
}
