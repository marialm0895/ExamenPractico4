package com.example;


public class App 
{
    public static void main( String[] args )
    {
      Object[] arrayempleadosYestudiantes = {
    		Empleado.builder()
   		   .nombre("Maria")
   		   .primerApellido("Lopez")
   		   .segundoApellido("Martin")
   		   .departamento(Departamento.FINANZAS)
   		   .salario(3000.00)
   		   .genero(Genero.MUJER)
   		   .build(),  
   		   Empleado.builder()
   		   .nombre("Tamara")
   		   .primerApellido("Diaz")
   		   .segundoApellido("Martinez")
   		   .departamento(Departamento.INFORMATICA)
   		   .salario(5000.00)
   		   .genero(Genero.MUJER)
   		   .build(),
   		   Empleado.builder()
   		   .nombre("Ivan")
   		   .primerApellido("Garcia")
   		   .segundoApellido("Martin")
   		   .departamento(Departamento.INFORMATICA)
   		   .salario(4000.00)
   		   .genero(Genero.HOMBRE)
   		   .build(),
   		   Estudiantes.builder()
   		   .nombre("Marly")
   		   .facultad(Facultad.CIENCIAS)
   		   .totalAsignaturasMatriculadas("5")
   		   .build(),
   		   Estudiantes.builder()
		   .nombre("Carlos")
		   .facultad(Facultad.INFORMATICA)
		   .totalAsignaturasMatriculadas("8")
		   .build(),
		   Estudiantes.builder()
   		   .nombre("Sergio")
   		   .facultad(Facultad.ECONOMIA)
   		   .totalAsignaturasMatriculadas("9")
   		   .build()
     };
       
      for(Object object: arrayempleadosYestudiantes) {
    	  if(object instanceof Empleado) {
    		  Empleado em = (Empleado) object;
    		  System.out.println("Nombre del empleado:" + em.getNombre());
    	  } else if(object instanceof Estudiantes) {
    		  Estudiantes es = (Estudiantes) object;
    		  System.out.println("Nombre del Estudiante:" + es.getNombre());
    		  
    	  }
    	  Estudiantes[] arrayDeMujeres = new Estudiantes[6];
    	  
      }
    }
        
    
}