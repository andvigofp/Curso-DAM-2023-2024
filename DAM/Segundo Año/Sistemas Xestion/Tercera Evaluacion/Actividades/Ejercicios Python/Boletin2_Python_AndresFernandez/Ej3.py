# Vamos a crear una clase llamada Persona. Sus atributos son: nombre, edad y DNI. Construye los
# siguientes métodos para la clase:
#  Un constructor, donde los datos pueden estar vacíos.
#  Los setters y getters para cada uno de los atributos. Hay que validar las entradas de datos.
#  mostrar(): Muestra los datos de la persona.
#  esMayorDeEdad(): Devuelve un valor lógico indicando si es mayor de edad.

class Persona:
    def __init__(self, nombre="", edad=0, dni=""):
        self.__nombre = nombre
        self.__edad = edad
        self.__dni = dni

    @classmethod
    def crear_persona_vacia(cls):
        return cls()

    def get_nombre(self):
        return self.__nombre

    def set_nombre(self, nombre):
        self.__nombre = nombre

    def get_edad(self):
        return self.__edad

    def set_edad(self, edad):
        if edad >= 0:
            self.__edad = edad
        else:
            print("La edad no puede ser negativa")

    def get_dni(self):
        return self.__dni

    def set_dni(self, dni):
        if len(dni) == 9:
            self.__dni = dni
        else:
            print("El DNI debe tener 9 caracteres")

    def mostrar(self):
        print(f"Nombre: {self.__nombre}")
        print(f"Edad: {self.__edad}")
        print(f"DNI: {self.__dni}")

    def es_mayor_de_edad(self):
        return self.__edad >= 18  

# Mostrar Resultados

persona1 = Persona("Juan", 25, "12345678A")
persona1.mostrar()
print("Es mayor de edad:", persona1.es_mayor_de_edad())
print("------------------------------------------------")

persona2 = Persona.crear_persona_vacia()
persona2.set_nombre("Ana")
persona2.set_edad(30)
persona2.set_dni("87654321B")
persona2.mostrar()
print("Es mayor de edad:", persona2.es_mayor_de_edad())
print("------------------------------------------------")

persona3 = Persona("Hector", 17, "36147672J")
persona3.mostrar()
print("Es mayor de edad:", persona3.es_mayor_de_edad())