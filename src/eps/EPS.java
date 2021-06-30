/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eps;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author SEBASTIAN BOLAÑOS MORALES
 * 201767957
 */
public class EPS {

        static int doc, edad,opcion, opcion2;
        static String nom, ape, genero ="";
        static String Prioridad = "";
    
    
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        
        boolean discapacidad= false;
        
        Scanner valores = new Scanner(System.in);
        Paciente datosPaciente = new Paciente();
        ServicioEPS s = new ServicioEPS();
        
//        String datos
//        
        int cantidadPersonas = Integer.parseInt(JOptionPane.showInputDialog("INGRESE LA CANTIDAD DE PERSONAS EN LA FILA DE LA EPS"));
        System.out.println("En la Fila Hay "+cantidadPersonas +" Personas\n");
                
        
        for(int i=0; i<cantidadPersonas; i++){
            
            
                doc=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de Identiodad"));
                System.out.println("\nEl docuemnto de identidad es: "+doc);
                datosPaciente.setDocumentoIdentidad(cantidadPersonas);
                
                nom=JOptionPane.showInputDialog("Ingrese el Nombre\n");
                System.out.println("El nombre de la persona es: "+nom);
                datosPaciente.setNombrePaciente(nom);
                
                ape=JOptionPane.showInputDialog("Ingrese el Apellido\n");     
                System.out.println("El apellido de la persona es: "+ape);
                datosPaciente.setApellidos(ape);
                
                do{
                    opcion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el genero\n"
                        + "Puede ser : \n "
                            + "1.Masculino"
                            + "2.Femenino"
                    )); 
            
            switch(opcion){
                
                case 1: genero = "Masculino";
                break;
                case 2: genero = "Femenino";
                break;
                                
            }                   
            
                    }while(opcion != 1 && opcion!= 2);
                
                System.out.println("El genero es: "+genero);
                datosPaciente.setGenero(genero);
                
                do{
                    opcion = Integer.parseInt(JOptionPane.showInputDialog("La persona cuenta con alguna discapacidad\n"
                        + "Puede ser: \n "
                            + "1.Si\n"
                            + "2.No\n"
                    )); 
            
            switch(opcion){
                
                case 1: discapacidad = true;
                break;
                case 2: discapacidad = false;
                break;
                                
            }                   
            
                    }while(opcion != 1 && opcion!= 2);
                
                System.out.println("La persona tiene discapacidad : "+discapacidad);
                datosPaciente.setDiscapacidad(discapacidad);
                
//                while(!"Masculino".equals(genero)){
//                 
//                    JOptionPane.showMessageDialog(null,"El genero no es VALIDO\n");
//                    genero=JOptionPane.showInputDialog(null,"Ingrese un NUEVO GENERO");
//                }
                
                                
//                while(!"masculino".equals(genero) ||!"femenino".equals(genero)){
//                    
//                    JOptionPane.showMessageDialog(null,"Ingrese un genero VALIDO!");
//                    genero = valores.next();
//                }                
                
                edad=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad"));        
                 
                //PRIORIDADES
                
            if (edad <= 2){
                
                Prioridad = "B";
                
            }else if(edad > 2 && edad<12){
                
                Prioridad = "N";                
            }
            else if("Masculino".equals(genero) || "Femenino".equals(genero)){
                
                Prioridad = "M";
                
            }else if (edad >= 60){
                
                Prioridad = "A";
            }else Prioridad = "O";
                                
            do{
            
            opcion2 = Integer.parseInt(JOptionPane.showInputDialog(null, "BIENVENIDO!\n"
                    + "CUAL DE LOS SERVICIOS (QUE A CONTINUACIÓN SE MOSTRARÁN) NECESITA \n"
                    + "1.Consulta Medicina General\n"
                    + "2.Consulta Medicina Especializada\n"
                    + "3.Fisioterapia\n "
                    + "4.Radiografias\n"
                    + "5.Laboratorio Clinico\n"
                    + "6.Ninguno!\n"));
            
            switch(opcion2){
                
                case 1: s.consultaMedicinaGeneral();
                
                JOptionPane.showMessageDialog(null,"\nEl nombre del PACIENTE"+(i+1)+" es: "+nom
                            +"\nEl Apellido es: "+ape
                            +"\nEl numero de documento es: "+doc
                            +"\nLa Edad es: "+edad
                            +"\nEl servicio al cual accedio es CONSULTA MEDICINA GENERAL"
                            +"\n El tipo de prioridad  es: "+Prioridad
                            +"\n"
                            ); 
                
                    break;
                case 2:
                    s.consultaMedicinaEspecializada();
                    
                    JOptionPane.showMessageDialog(null,"\nEl nombre del PACIENTE"+(i+1)+" es: "+nom
                            +"\nEl Apellido es: "+ape
                            +"\nEl numero de documento es: "+doc
                            +"\nLa Edad es: "+edad
                            +"\nEl servicio al cual accedio es CONSULTA MEDICINA ESPECIALIZADA"
                            +"\n El tipo de prioridad  es: "+Prioridad
                            +"\n"
                            ); 
                    break;
                case 3:s.Fisioterapia();
                
                JOptionPane.showMessageDialog(null,"\nEl nombre del PACIENTE"+(i+1)+" es: "+nom
                            +"\nEl Apellido es: "+ape
                            +"\nEl numero de documento es: "+doc
                            +"\nLa Edad es: "+edad
                            +"\nEl servicio al cual accedio es FISIOTERAPIA"
                            +"\n El tipo de prioridad  es: "+Prioridad
                            +"\n"
                            ); 
                
                    break;
                case 4:s.Radiografias();
                
                JOptionPane.showMessageDialog(null,"\nEl nombre del PACIENTE"+(i+1)+" es: "+nom
                            +"\nEl Apellido es: "+ape
                            +"\nEl numero de documento es: "+doc
                            +"\nLa Edad es: "+edad
                            +"\nEl servicio al cual accedio es RADIOGRAFIAS"
                            +"\n El tipo de prioridad  es: "+Prioridad
                            +"\n"
                            ); 
                
                    break;
                case 5:s.LaboratorioClinico();
                
                JOptionPane.showMessageDialog(null,"\nEl nombre del PACIENTE"+(i+1)+" es: "+nom
                            +"\nEl Apellido es: "+ape
                            +"\nEl numero de documento es: "+doc
                            +"\nLa Edad es: "+edad
                            +"\nEl servicio al cual accedio es LABORATORIO CLINICO"
                            +"\n El tipo de prioridad  es: "+Prioridad
                            +"\n"
                            ); 
                    break;
                case 6:
                    break;
                  
            }            
            
        
        opcion2 = 6;
        break;
        
            
        }while(opcion2 !=6);            
                                                           
        }
            
    }
    
}
