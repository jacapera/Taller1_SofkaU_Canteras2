# Taller1_SofkaU_Canteras2

En este primer taller ser crean las clases ("Bank", "SavingAccount", "Cliente", "Programador", "Main").

La clase "Bank" es una super clase y se ha puesto como clase abstracta con un metodo abstracto "consignacion()", se crean
sus metodos get y set para los atributos que estan como privados en su modo de acceso, con los atributos ("nameBank",
"city", "branch").

La clase "CuentaBancaria" con sus atributos ("costumer", "balance", accountNumber", "activated"), es la clase padre y dentro
de ella se le ha implementado la clase "Builder" donde se hizo el patron Builder el cual me permite poder crear un objeto con
los atributos que yo requiera sin tener que crear varios metodos contructores o hacer recarga de constructores como se le suele llamar(el objeto de este patron es muy util cuanto tengo una clase con muchos atributos y que la sobrecarga de constructores podria llegar a generarme muchas lineas de codigo que me podria ahorrar). Esta clase "CuentaBancaria" al heredar de la super clase que es un clase abstracta se implementa obligatoriamente sus metodos ("consignacion()"). Tambien se crea un metodo que instancia un objeto del tipo de la clase Builder, esto con el fin de implementarlo en las clase que hereden de "CuentaBancaria". Tambien se crean los metodos get y set, "depositMoner()", "withdrawMoney()" y "balance()".

La clase "SavingAccount" es la clase hija que hereda de la clase "CuentaBancaria", ahora podre tener acceso a todos los
atributos y metodos de la super clase "Bank" y la clase padre "CuentaBancaria". En esta clase se crea un constructor con
los atributos que heredo de la super clase y se le suma un atributo mas propio llamado "interest".

La clase "Main" es mi clase principal donde arrancara mi programa, en esta clase se instancia un objeto del tipo de la
clase "SavingAccount", donde le paso como parametros los atributos que hereda de la super clase, luego se crea una estructura
de datos de tipo ArrayList la cual me permitira guardar el objeto de tipo "CuentaBancaria" atraves del metodo heredado de la
clase padre ("crearBuilder()"), por medio del un metodo get inicializo el atributo "balace" con el valor del saldo inicial de
mi cuenta bancaria, luego confirmo todos los conceptos aplicados imprimiendo por pantalla cada uno de los atributos y metodos
propios y heredados, demostrando los conceptos de herencia, polimorfismo, encapsulamiento y abstraccion. Tambien se instancia dos objetos de tipo "CuentaBancaria" para probar el funcionamiento del patron Builder donde en uno inicializo todos los atributos y en el otro solamente un par de ellos, tomando en cuenta que solamente implemente un solo constructor en la clase "Builder".

La clase "Fruta" es interesante el tema de utilizar un ArrayList para almacenar multiples valores de un atributo de la clase, se crea un constructor para esta clase, se crea un metodo set para enviarle valores atraves de otro ArrayList, se crea un método para instanciar un objeto de tipo ArrayList y pasarle valores, igualmente podemos hacer uso de los metodos de un ArrayList "nombreObjetoFruta.colors.add("nombreColor")", tenemos varias opciones para pasarle valores a esta atributo dependiendo de como lo requiera implementar.

La clase "Persona" lo que tiene de especial es el atributo de tipo objeto de la clase Date, creamos el contructor y agregamos un método o comportamiento, esta seria la clase padre.

La clase "Programador" es la clase hija que hereda de la clase "Persona", se crea el constructor incluyendo los atributos de la clase que hereda.
