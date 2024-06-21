
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author usuario
 */
public class GestionColegio {
    public static ArrayList<Estudiante> listaEstudiantes = new ArrayList<>();
    public static ArrayList<Profesor> listaProfesores = new ArrayList<>();
    public static ArrayList<Curso> listaCursos = new ArrayList<>();
    public static ArrayList<Matricula> listaMatriculas = new ArrayList<>();
    
    public static void agregarEstudiante(Estudiante estudiante){
        listaEstudiantes.add(estudiante);
    }
   
    public static void agregarProfesor(Profesor profesor){
        listaProfesores.add(profesor);
    }
    
    public static void agregarCurso(Curso curso){
        listaCursos.add(curso);
    }
    
    public static void agregarMatricula(Matricula matricula){
        listaMatriculas.add(matricula);
    }
    
     public static Estudiante obtenerEstudiantePorIdentificacion(String id){
        Estudiante estudiante=null;
        for (int i=0;i<listaEstudiantes.size();i++){
            if (listaEstudiantes.get(i).getId().equals(id)){
               estudiante=listaEstudiantes.get(i);
               break;
            }
        }
        return estudiante;
    }
     
     public static boolean existeEstudiante(String id){
        boolean existe=false;
        for (int i=0;i<listaEstudiantes.size();i++){
            if (listaEstudiantes.get(i).getId().equals(id)){
                existe=true;
                break;
            }
        }
        return existe;
    }
    
 
    public static boolean existeProfesor(String id){
        boolean existe=false;
        for (int i=0;i<listaProfesores.size();i++){
            if (listaProfesores.get(i).getId().equals(id)){
                existe=true;
                break;
            }
        }
        return existe;
    }
    
      public static boolean existeCurso(String nombre){
         boolean existe=false;
         for(int i=0;i<listaCursos.size();i++){
             if(listaCursos.get(i).getNombre().equals(nombre)){
                 existe=true;
                 break;
             }
         }
         return existe;
     }
     
    
     public static boolean estaMatriculado(Matricula matricula){
         boolean existe=false;
         String id = matricula.getEstudiante().getId();
         String nombreCurso = matricula.getCurso().getNombre();
         for(int i=0;i<listaMatriculas.size();i++){
             if(listaMatriculas.get(i).getEstudiante().getId().equals(id)
                     && listaMatriculas.get(i).getCurso().getNombre().equals(nombreCurso)){
                 existe=true;
                 break;
             }
         }
         return existe;
     }
     
   
     public static void actualizarProfesor(Profesor profesor){
         int posicion=0;
         String id= profesor.getId();
         for(int i=0;i<listaProfesores.size();i++){
             if(listaProfesores.get(i).getId().equals(id)){
                 posicion = i;
                 break;
             }
         }        
         listaProfesores.set(posicion, profesor);
     }
    
     
     
     
    
    
    
}
