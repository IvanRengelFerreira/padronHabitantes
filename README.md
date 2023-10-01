# padronHabitantes
Por Ivan Rengel
El proyecto esta divivido en paquetes, que ayuda a estructurar mejor nuestro codigo.Son cuatro Dominio,comprobacion,presentacion y comprobaciones.

      Dominio
Creamos una forma para registrar habitantes de un padron. Se empieza creando la clase habitante en el que crearemos los metodos(set y get) y atributos que seran una string donde seran reemplazados mas adelante por los parametros que le demos.
De ahi hay otra clase llamada OficinaPadron.En esta clase es donde se va a crear un array y sera donde se administrara la lista de habitantes. Tiene métodos para agregar habitantes, obtener la lista de habitantes, calcular el número total de habitantes y guardar habitantes hacia un archivo CSV.

      Presentacion
Aca tenemos una clase llamada InterfazUsuario. En esta clase nos permite interectuar con el sistema. Se crea un metodo privado llamado ejecutar en donde se crea un array de instrucciones y dependiendo de si se cumplen las condiciones ejecutara una otra cosa como puede ser permitir que se añada un habitante o solo mostrarlos.

      comprobaciones
Aca tenemos una clase que se llama Comprobacion. Aca es donde se probara el codigo, nos dara la lista de habitantes y donde nos indicara cuando habitantes hay en el padron.

      Aplicacion
En este paquete es donde se va a ejecutar el codigo con la clase Principal. Esta clase ejecuta la clase InterfazUsuario donde se crean los habitantes.
        
