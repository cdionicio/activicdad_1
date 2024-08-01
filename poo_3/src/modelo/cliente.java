/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author CARLOS
 */
public class cliente extends persona {
    private String  Nit;

    public String getNit() {
        return Nit;
    }

    public void setNit(String Nit) {
        this.Nit = Nit;   
    }
     
    @Override
       public void agregar (){
           System.out.println("Nit"+ getNit());
           System.out.println("Nombres"+ getNombres());
           System.out.println("Apellidos"+ this.getApellidos());
           System.out.println("Diereccion"+ this.getDireccion());
           System.out.println("Telefono"+this.getTelefono());
           System.out.println("Fecha Nacimiento"+  this.getFecha_Nacimiento());





       }

         
    
         }
   

