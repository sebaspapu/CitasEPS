/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eps;

import javax.swing.JOptionPane;

/**
 *
 * @author Estudiante
 */
public class ServicioEPS extends EPS {
 
    
    
    public void consultaMedicinaGeneral (){
        
        int vacia[][] = new int [10][7];
        
        
        JOptionPane.showMessageDialog(null,"BIENVENIDO A CONSULTA MEDICINA GENERAL","CONSULTA MEDICINA GENERAL",JOptionPane.INFORMATION_MESSAGE);
        
            System.out.println("TRUNOS DISPONIBLES EN ÉSTA SEMANA!\n");     
            
            for(int turnos = 0;turnos<10; turnos++){
            
            for(int dias=0; dias<7;dias++){
                
                System.out.print(" [ "+vacia[turnos][dias]+" ] ");
                
            }System.out.println("");
            
        }
            
           int filaAlea = (int) (Math.random() * 8)+1;
           int columAlea =(int) (Math.random() * 6)+1;
                   
        for(int turno=0; turno<10;turno++){

            for(int dias=0; dias<7; dias++){
                
                vacia[filaAlea][columAlea] = 6174;
                
            }            
        }
        
        JOptionPane.showMessageDialog(null,"SU CITA FUE ASIGNADA CON EXITO! \n"
                + "DEACUERDO A NUESTRO SISTEMA DE SELECION");
        
        System.out.println("\nDIA DE LA CITA ASIGNADA!\n");
        for(int filas=0;filas<10; filas++){
            
            for(int columnas=0; columnas<7;columnas++){
                
                System.out.print(" [ "+vacia[filas][columnas]+" ] "+filas+"AM. Dia"+(columnas+1));
                
            }System.out.println("");
            
        }
                  
    } 
    
    public void consultaMedicinaEspecializada(){
        int vacia[][] = new int [10][7];
        
        
        JOptionPane.showMessageDialog(null,"BIENVENIDO A CONSULTA MEDICINA ESPECIALIZADA","CONSULTA MEDICINA GENERAL",JOptionPane.INFORMATION_MESSAGE);
        
            System.out.println("TRUNOS DISPONIBLES EN ÉSTA SEMANA!\n");     
            
            for(int turnos = 0;turnos<10; turnos++){
            
            for(int dias=0; dias<7;dias++){
                
                System.out.print(" [ "+vacia[turnos][dias]+" ] ");
                
            }System.out.println("");
            
        }
            
           int filaAlea = (int) (Math.random() * 8)+1;
           int columAlea =(int) (Math.random() * 6)+1;
                   
        for(int turno=0; turno<10;turno++){

            for(int dias=0; dias<7; dias++){
                
                vacia[filaAlea][columAlea] = 6174;
                
            }            
        }
        
        JOptionPane.showMessageDialog(null,"SU CITA FUE ASIGNADA CON EXITO! \n"
                + "DEACUERDO A NUESTRO SISTEMA DE SELECION");
        
        System.out.println("\nDIA DE LA CITA ASIGNADA!\n");
        for(int filas=0;filas<10; filas++){
            
            for(int columnas=0; columnas<7;columnas++){
                
                System.out.print(" [ "+vacia[filas][columnas]+" ] "+filas+"AM. Dia"+(columnas+1));
                
            }System.out.println("");
            
        }
        
    }
    
    public void Fisioterapia(){
        int vacia[][] = new int [10][7];
        
        
        JOptionPane.showMessageDialog(null,"BIENVENIDO A FISIOTERAPIA","CONSULTA MEDICINA GENERAL",JOptionPane.INFORMATION_MESSAGE);
        
            System.out.println("TRUNOS DISPONIBLES EN ÉSTA SEMANA!\n");     
            
            for(int turnos = 0;turnos<10; turnos++){
            
            for(int dias=0; dias<7;dias++){
                
                System.out.print(" [ "+vacia[turnos][dias]+" ] ");
                
            }System.out.println("");
            
        }
            
           int filaAlea = (int) (Math.random() * 8)+1;
           int columAlea =(int) (Math.random() * 6)+1;
                   
        for(int turno=0; turno<10;turno++){

            for(int dias=0; dias<7; dias++){
                
                vacia[filaAlea][columAlea] = 6174;
                
            }            
        }
        
        JOptionPane.showMessageDialog(null,"SU CITA FUE ASIGNADA CON EXITO! \n"
                + "DEACUERDO A NUESTRO SISTEMA DE SELECION");
        
        System.out.println("\nDIA DE LA CITA ASIGNADA!\n");
        for(int filas=0;filas<10; filas++){
            
            for(int columnas=0; columnas<7;columnas++){
                
                System.out.print(" [ "+vacia[filas][columnas]+" ] "+filas+"AM. Dia"+(columnas+1));
                
            }System.out.println("");
            
        }
                  
           
        
    }
    
    public void Radiografias(){
        
        int vacia[][] = new int [10][7];
        
        
        JOptionPane.showMessageDialog(null,"BIENVENIDO A RADIOGRAFIAS","CONSULTA MEDICINA GENERAL",JOptionPane.INFORMATION_MESSAGE);
        
            System.out.println("TRUNOS DISPONIBLES EN ÉSTA SEMANA!\n");     
            
            for(int turnos = 0;turnos<10; turnos++){
            
            for(int dias=0; dias<7;dias++){
                
                System.out.print(" [ "+vacia[turnos][dias]+" ] ");
                
            }System.out.println("");
            
        }
            
           int filaAlea = (int) (Math.random() * 8)+1;
           int columAlea =(int) (Math.random() * 6)+1;
                   
        for(int turno=0; turno<10;turno++){

            for(int dias=0; dias<7; dias++){
                
                vacia[filaAlea][columAlea] = 6174;
                
            }            
        }
        
        JOptionPane.showMessageDialog(null,"SU CITA FUE ASIGNADA CON EXITO! \n"
                + "DEACUERDO A NUESTRO SISTEMA DE SELECION");
        
        System.out.println("\nDIA DE LA CITA ASIGNADA!\n");
        for(int filas=0;filas<10; filas++){
            
            for(int columnas=0; columnas<7;columnas++){
                
                System.out.print(" [ "+vacia[filas][columnas]+" ] "+filas+"AM. Dia"+(columnas+1));
                
            }System.out.println("");
            
        }
                  
           
    }
    
    public void LaboratorioClinico(){
        
        int vacia[][] = new int [10][7];
        
        
        JOptionPane.showMessageDialog(null,"BIENVENIDO A LABORATORIO CLINICO","CONSULTA MEDICINA GENERAL",JOptionPane.INFORMATION_MESSAGE);
        
            System.out.println("TRUNOS DISPONIBLES EN ÉSTA SEMANA!\n");     
            
            for(int turnos = 0;turnos<10; turnos++){
            
            for(int dias=0; dias<7;dias++){
                
                System.out.print(" [ "+vacia[turnos][dias]+" ] ");
                
            }System.out.println("");
            
        }
            
           int filaAlea = (int) (Math.random() * 8)+1;
           int columAlea =(int) (Math.random() * 6)+1;
                   
        for(int turno=0; turno<10;turno++){

            for(int dias=0; dias<7; dias++){
                
                vacia[filaAlea][columAlea] = 6174;
                
            }            
        }
        
        JOptionPane.showMessageDialog(null,"SU CITA FUE ASIGNADA CON EXITO! \n"
                + "DEACUERDO A NUESTRO SISTEMA DE SELECION");
        
        System.out.println("\nDIA DE LA CITA ASIGNADA!\n");
        for(int filas=0;filas<10; filas++){
            
            for(int columnas=0; columnas<7;columnas++){
                
                System.out.print(" [ "+vacia[filas][columnas]+" ] "+filas+"AM. Dia"+(columnas+1));
                
            }System.out.println("");
            
        }
                  
           
    }
    
    
    
    
}
