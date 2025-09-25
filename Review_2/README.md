Actividad 1 – Interfaz básica
Crea una interfaz Operable con los métodos void start() y void stop().
Implementa Operable en las clases Engine y Fan.
En el método main, almacena ambas clases en un ArrayList<Operable> y recorre la lista llamando a los métodos start() y stop().

Actividad 2 – Interfaz con valor de retorno
Crea una interfaz Calculable con el método double calculate(double a, double b).
Implementa las clases Addition y Multiplication.
En el método main, usa un ArrayList<Calculable> y ejecuta calculate(3,4) para cada implementación.

Actividad 3 – Clase abstracta y polimorfismo
Crea la clase abstracta Shape con el método abstracto double area().
Crea las clases Square(lado) y Circle(radio) que extienden Shape.
En el método main, añade 3-4 objetos Shape a un ArrayList<Shape> y muestra el área de cada uno.

Actividad 4 – Clase abstracta con plantilla
Crea la clase abstracta Process con el método final void execute() que llama a prepare(), process() y finish().
Declara los métodos abstractos void prepare() y process(), y el método concreto finish() que muestra "OK".
Implementa las clases CsvProcess y JsonProcess. Prueba el método execute() para ambas.

Actividad 5 – Catálogo con ArrayList
Crea la clase Product(id:String, nombre:String, precio:double).
En el método main, usa un ArrayList<Product>: añade 5 productos, elimina uno por índice y actualiza el nombre del primero.
Recorre la lista y muestra id, nombre y precio.

Actividad 6 – Índice con HashMap
Dado un ArrayList<String> words, crea un HashMap<String,Integer> con las frecuencias de las palabras.
Muestra las claves y sus frecuencias.
Si una palabra aparece más de 2 veces, márcala con "*" al mostrarla.

Actividad 7 – Interfaz y HashMap
Crea la interfaz Storable { String key(); }.
Crea la clase User(id:String, nombre:String) que implementa Storable (key = id).
En el método main, almacena los usuarios en un HashMap<String, User> usando u.key().
Busca, actualiza el nombre por id y elimina un usuario.

Actividad 8 – Clase abstracta y filtro con ArrayList
Clase abstracta Document { String título; int páginas(); }
Clases Book(título, páginas) y Magazine(título, páginasPorEdición).
En el método main, usa un ArrayList<Document> y muestra solo los documentos con páginas() ≥ 100.

Actividad 9 – Estrategias (interfaz)
Interfaz Formatter { String format(String s); } Implementar funciones para convertir a mayúsculas, minúsculas y título (primera letra en mayúscula).
En el método principal, usar un ArrayList<Formatter> y aplicar cada estrategia a la misma cadena.

Actividad 10 – Router simple con HashMap
HashMap<String, Runnable> que asocia "/home", "/about" y "/contact" a Runnables que muestran mensajes.
En el método principal, simular 3 "solicitudes" buscando la clave y ejecutando el Runnable.
Si la ruta no existe, mostrar "404".

Actividad 11 – Taller mixto (clase abstracta + interfaz + colecciones)
Clase abstracta Employee { String id; String name; double monthlySalary() (abstracta); }
Interfaz Bonusable { double bonus(); }
Crear FullTimeEmployee(baseSalary) que implemente Bonusable (bono del 10%).
Crear HourlyEmployee(hours, rate) sin bono.
En el método principal, ArrayList<Employee> con varios empleados; calcular salarios totales y añadir el bono si corresponde.
Mostrar el total.

Actividad 12 – Diccionario bilingüe (HashMap<String, ArrayList>)
HashMap<String, ArrayList<String>> diccionario (clave = palabra en español, valor = lista de traducciones).

Añadir 3 palabras con 2-3 traducciones cada una.
Añadir una nueva traducción a una palabra existente.
Mostrar todas las palabras y sus traducciones en formato palabra: t1, t2, t3.

Actividad 13 – Repositorio en memoria (interfaz + HashMap)
Interfaz Repo<T> { void save(T t); T findById(String id); void delete(String id); }
Clase Student { String id; String name; }
Clase StudentRepo que implementa Repo<Student> usando HashMap<String, Student>.
En el método principal, guardar 3 estudiantes, obtener 1 por ID, eliminar 1 y listar los restantes.

Actividad 14 – Filtrado y ordenación básicos con ArrayList
Crear Task(id, title, priority:int).
En el método principal, ArrayList<Task> con 6 tareas (prioridades diferentes).
Filtrar las tareas con prioridad ≥ 3 en una nueva lista.
Ordenar la nueva lista por prioridad ascendente y mostrarla.

Actividad 15 – Clase abstracta con validación
Clase abstracta Account { String number; double balance; boolean withdraw(double amount) (abstracta); }
SavingsAccount (no puede tener saldo negativo). Cuenta de crédito (puede tener un saldo negativo de hasta -1000).
En el programa principal, utilizar ArrayList<Account> y probar los retiros válidos e inválidos.