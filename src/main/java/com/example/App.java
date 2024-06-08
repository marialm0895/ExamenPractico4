package com.example;

import lombok.EqualsAndHashCode;

public class App 
{
    public static void main( String[] args )
    {
       Empleado[] arrayEmpleado = {
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
    		   .build()
   
       };
    		   
       System.out.println("El array Empleado");
       for (Empleado empleado : arrayEmpleado)
    	   System.out.println(empleado);
       
    double sumatoriaSalarioHombre = 0.0;
    double sumatoriaSalarioMujer = 0.0;
    double sumatoriaSalarioSinGenero = 0.0;
    
    int totalGeneroHombre = 0;
    int totalGeneroMujer = 0;
    int totalGeneroSinGenero = 0;
    
    double salarioPromedioHombres = 0.0;
    double salarioPromedioMujeres = 0.0;
    double salarioPromedioSinGenero = 0.0;
    
    for(Empleado e : arrayEmpleado)  {

    if(e.getGenero().equals(Genero.HOMBRE)) {
    	sumatoriaSalarioHombre += e.getSalario();
    	totalGeneroHombre++;
    } else if(e.getGenero().equals(Genero.MUJER)) {
    		sumatoriaSalarioMujer += e.getSalario();
    		totalGeneroMujer++;
    	} else {
    		sumatoriaSalarioSinGenero += e.getSalario();
    		totalGeneroSinGenero++;
    	}
    }
    
    salarioPromedioHombres = sumatoriaSalarioHombre/ totalGeneroHombre;
    salarioPromedioMujeres = sumatoriaSalarioMujer/ totalGeneroMujer;
    salarioPromedioSinGenero = sumatoriaSalarioSinGenero / totalGeneroSinGenero;
    
    System.out.println("Salario promedio Hombres: " + salarioPromedioHombres);
    System.out.println("Salario promedio Mujeres:" + salarioPromedioMujeres);
    System.out.println("Salario promedio Sin Genero:" + salarioPromedioSinGenero);
    
    
   	  
    	
    }
        
    
}
