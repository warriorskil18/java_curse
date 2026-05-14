/*
Categorize the Main Database Objects

Los objetos de base de datos son la base de cualquier aplicacion de base de datos.
Estos albergan y dan soporte a todo lo que una aplicacion de base de datos necesita para su correcto funcionamiento
En esta seccion veremos lo que los objetos de base de datosd pueden crear en un sistema de gestion de bases de datos relacionales
(RDBMS) de oracle.
Se clasificaran los objetos de base de datos por categorias y se analiza la relacion entre los objetos y los esquemas

Que son los objetos de base de datos?

Se pueden crear muchos tipos diferentes de objetos de base de datos en oracle

The Complete List

Una base de datos consiste en uno o mas objetos de base de datos. En la lista se muestra  objetos que un desarrollador
de bases de datos puede crear en el sistema de gestion de bases de datos relacionales:

-------------------------------------------------------------------------------
Clusters                        Object tables
Constraints*                    Object types
Contexts                        Object views
Database links                  Operators
Database triggers               Packages
Dimensions                      Restore points
Directories                     Roles*
Editions                        Rollback segments
External                        procedure
libraries                       Sequences*
Indexes*                        Stored functions/procedures
Index-organized tables          Private synonyms*
Indextypes                      Public synonyms*
Java classes, etc.              Tables*
Materialized view logs          Tablespaces
Materialized views              Users*
Mining models                   Views*
-------------------------------------------------------------------------------
Ejemplos:
------------------------------------
Tablas:
Las tablas almacenan los datos.
CREATE TABLE empleados (
    id NUMBER,
    nombre VARCHAR2(50),
    salario NUMBER
);
-------------------------------------
Views:
Una vista es una consulta guardada.
CREATE VIEW vista_empleados AS
SELECT nombre, salario
FROM empleados;
--------------------------------------
Indexes:
Los índices aceleran búsquedas.
CREATE INDEX idx_nombre
ON empleados(nombre);
--------------------------------------
Constraints:
Reglas para proteger la integridad de los datos.
Tipos comunes:
PRIMARY KEY
FOREIGN KEY
UNIQUE
NOT NULL
CHECK.
id NUMBER PRIMARY KEY
--------------------------------------
Sequences:
Generan números automáticos.
CREATE SEQUENCE seq_empleados
START WITH 1
INCREMENT BY 1;
--------------------------------------
Users:
Usuarios dentro de Oracle.
CREATE USER eric IDENTIFIED BY password;
--------------------------------------
Roles:
Agrupan permisos.
CREATE ROLE desarrollador;
--------------------------------------
Synonyms:
Alias para objetos.
Hay dos tipos:
Private synonyms
Public synonyms
CREATE SYNONYM emp FOR empleados;
Ahora puedes usar:
SELECT * FROM emp;
---------------------------------------

Uno de los usos mas frecuentes del comando SQL CREATE es crear una tabla, al crear una tabla tambien se encuentran columnas
y opcionalmente algunos objetos asociados 
A continuacion se muestra un ejemplo de la creacion de una tabla basica

*/

CREATE TABLE work_schedule
(work_schedule_id NUMBER,
start_date        DATE,
end_date          DATE);

/*
Analizando la sintaxis del anterior ejemplo

-La palabra reservada CREATE
-La palabra reservada TABLE
-El nombre de la tabla 
-Un par de parentesis donde se encuentran las declaraciones de columna, separadas por comas
-Las declaraciones de columna constan de lo siguiente:
-El nombre de la columna que se elige por uno, el tipo de dato de la columna y un punto y coma final para terminar la instruccion
*/