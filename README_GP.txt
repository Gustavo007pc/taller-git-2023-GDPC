---------------------------------------------------------------------------------------------------------
					ORDEN DE CARGA DE REQUEST
---------------------------------------------------------------------------------------------------------
1-	CARGA DE PERSONA GUARDAMOS DATOS DE PERSONAS EN BD TABLA PERSONA
	POST	localhost:8080/persona/add
	
	{	"numDoc":333575,
    		"email":"mbs@mail.es",
    		"tipoDoc":"Pasaporte",
    		"nombre":"Maria Rocio",
    		"apellido":"Sanabria",
    		"paisOrigen":"PARAGUAY",
    		"password":"168" 
	}

	POST	localhost:8080/persona/add
	{
             "numDoc": 888555,
        "email": "romero01@hotmail.es",
        "tipoDoc": "CI",
        "nombre": "Luis",
        "apellido": "Romero",
        "paisOrigen": "PARAGUAY",
        "password": "147"
    	}

	POST	localhost:8080/persona/add
	{
        
        "numDoc": 333575,
        "email": "sole@mail.es",
        "tipoDoc": "Pasaporte",
        "nombre": "Soledad",
        "apellido": "Sanabria",
        "paisOrigen": "PARAGUAY",
        "password": "123"
    	}
	POST	localhost:8080/persona/add
	{
        
        "numDoc": 888666,
        "email": "epc@mail.es",
        "tipoDoc": "Pasaporte",
        "nombre": "Eduardo",
        "apellido": "Pereira",
        "paisOrigen": "Brasil",
        "password": "1234"
       
    }
	POST	localhost:8080/persona/add
	{
   
   	 "numDoc": 448778,
    	"email": "juan100@hotmail.com",
    	"tipoDoc": "CI",
   	 "nombre": "Juan Angel",
   	 "apellido": "Sanabria Chavez",
   	 "paisOrigen": "PARAGUAY",
   	 "password": "0014"
	}

---------------------------------------------------------------------------------------------------------
2-	CARGA DE CLIENTE - GUARDAMOS DATOS DE CLIENTES EN BD
	POST	localhost:8080/cliente/add
	{
        	"numDoc": 888666,
        	"email": "epc100@mail.es",
        	"tipoDoc": "Pasaporte",
        	"nombre": "Eduardo",
        	"apellido": "Perez Cardozo",
        	"paisOrigen": "Brasil",
        	"password": "123",
        	"ruc": "888666-0"
    	}

	POST localhost:8080/cliente/add
	{
        	"numDoc": 9999666,
        	"email": "epc@mail.es",
        	"tipoDoc": "Pasaporte",
        	"nombre": "Enrique",
        	"apellido": "Perez Gavilan",
        	"paisOrigen": "Paraguay",
        	"password": "321",
        	"ruc": "9999666-0"
    	}

---------------------------------------------------------------------------------------------------------	

3-	CARGA DE ROLES - GUARDAMOS 6 ROLES EN TABLA ROLES DE LA BD
	POST localhost:8080/roles/add


	POST localhost:8080/roles/add
	{
    		"descripcion":"Profesor"
	}

	POST localhost:8080/roles/add
	{
    		"descripcion":"Director"
	}

	POST localhost:8080/roles/add
	{
    		"descripcion":"Alumno"
	}

	POST localhost:8080/roles/add
	{
    		"descripcion":"Empresario"
	}

	POST localhost:8080/roles/add
	{
    		"descripcion":"Auditor"
	}

	POST localhost:8080/roles/add
	{
    		"descripcion":"Artista"
	}

---------------------------------------------------------------------------------------------------------
4- CARGA DE ROLES_PERSONA en TABLA ROLES_PERSONA DE LA BD
	POST 	localhost:8080/rolespersona/add
	(La persona con id =1 tiene el id rol =1)
	{
    		"persona":{"id":1},
    		"rol"    :{"id":1} 
	}

	(La persona con id =1 tiene el id de rol =2)
	POST 	localhost:8080/rolespersona/add
	{
    		"persona":{"id":7},
    		"rol"	 :{"id":1} 
	}

	POST 	localhost:8080/rolespersona/add
	{
 	   "persona"	:{"id":1},
 	   "rol"	:{"id":3} 
	}

	{
    	    "persona":{"id":33},
    	    "rol":{"id":34} 
	}
---------------------------------------------------------------------------------------------------------
5-	VALIDACION DEL LOGIN
	POST	localhost:8080/login
	{
   	 	"email":"mrs@mail.es",
  	  	"password":"168"
	}

	RESPUESTA 
{
	"persona": {
		"id": 1,
		"numDoc": 448888,
		"email": "mrs@mail.es",
		"tipoDoc": "Pasaporte",
		"nombre": "Maria Rocio",
		"apellido": "Sanabria",
		"paisOrigen": "PARAGUAY",
		"password": "168"
	},
	"listRolesPersona": [
		{
			"id": 3,
			"persona": {
				"id": 1,
				"numDoc": 448888,
				"email": "mrs@mail.es",
				"tipoDoc": "Pasaporte",
				"nombre": "Maria Rocio",
				"apellido": "Sanabria",
				"paisOrigen": "PARAGUAY",
				"password": "168"
			},
			"rol": {
				"id": 3,
				"descripcion": "Alumno"
			}
		}
	]
}

---------------------------------------------------------------------------------------------------------
6- Un  request que me permita listar los clientes filtrado por sus apellidos. 

	Segun tengo en la base de datos 
	GET localhost:8080/cliente/buscarConteniendo/er

	Ejemplo 1: Respuesta Lista de Clientes cuyo apellido contiene la cadena "er"
	[
		{
		"id": 6,
		"numDoc": 888666,
		"email": "epc100@mail.es",
		"tipoDoc": "Pasaporte",
		"nombre": "Eduardo",
		"apellido": "Perez Cardozo",
		"paisOrigen": "Brasil",
		"password": "123",
		"ruc": "888666-0"
		},
		{
		"id": 7,
		"numDoc": 9999666,
		"email": "epc@mail.es",
		"tipoDoc": "Pasaporte",
		"nombre": "Enrique",
		"apellido": "Perez Gavilan",
		"paisOrigen": "Paraguay",
		"password": "321",
		"ruc": "9999666-0"
		}
	]

	GET localhost:8080/cliente/buscarConteniendo/Ga

	Ejemplo 2: Respuesta Lista de Clientes cuyo apellido contiene la cadena "Ga"
	[
		{
			"id": 7,
			"numDoc": 9999666,
			"email": "epc@mail.es",
			"tipoDoc": "Pasaporte",
			"nombre": "Enrique",
			"apellido": "Perez Gavilan",
			"paisOrigen": "Paraguay",
			"password": "321",
			"ruc": "9999666-0"
		},
		{
			"id": 8,
			"numDoc": 5554447,
			"email": "rodri@hotmail.com",
			"tipoDoc": "Pasaporte",
			"nombre": "Rodrigo",
			"apellido": "Garcia",
			"paisOrigen": "Paraguay",
			"password": "258",
			"ruc": "5554447-2"
		}
	]
