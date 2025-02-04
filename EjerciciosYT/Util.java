package EjerciciosYT;

import java.io.BufferedReader;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
/*
 * import java.io.;
 *public class Categoria implements Serializable {
	public void setDatos(int x){
		codigoCat=x;
		System.out.println("El codigo de categoria asignado es: "+codigoCat);}
	public void getDatos(){System.out.println("C�digo: "+codigoCat+" es "+descripcion+" Sueldo: "+sueldo);}
	
	private static void modificacion(File fichEmple, File fichCate) throws IOException, ClassNotFoundException {
		
		int opc=0,rsp=0,hay=0;
		int nemple=0,nuevaCate=0;
		String nuevoDepar="";
		
		String nomAux="auxiliar.obj";
		File fichAux=new File(nomAux);
		FileOutputStream faux=new FileOutputStream(fichAux);
		ObjectOutputStream oaux=new ObjectOutputStream(faux);
		
		if(fichEmple.exists()){
			System.out.println("\n Introduce el numero de empleado a buscar (minimo 100) : ");
			nemple=Utilidades.leerInt(100, 9999);
			
			FileInputStream fis=new FileInputStream(fichEmple);
			ObjectInputStream ois=new ObjectInputStream(fis);
			
			try{
				Object aux=ois.readObject();
				
				while(aux!=null){
						if(aux instanceof Empleado){
							
							if(((Empleado) aux).getCodigo()==nemple){
								hay=1;
								((Persona) aux).getDatos();
								System.out.println("\nEs es el empleado al que se le quiere modificar el departam.?\n(1).-Si\n(2).-No");
								opc=Utilidades.leerInt(1, 2);
								
								if (opc==1){
									hay=2;
									System.out.println("\n Introduce el nuevo departamento : ");
									nuevoDepar=Utilidades.introducirCadena();
									((Empleado) aux).setDepartamento(nuevoDepar);
									
									System.out.println("\n Desea cambiar la categoria del empleado ?\n(1).-Si\n(2).-No");
									rsp=Utilidades.leerInt(1, 2);
									
										if(rsp==1){
											System.out.println("\n Introduce la nueva categoria del empleado : ");
											nuevaCate=Utilidades.leerInt();
											((Empleado) aux).setCategoria(nuevaCate);
											//Si escribes aqui dentro no guardas departamento si no cambia categoria
											
										}	
								//Vamos al fichero de Categorias a buscar los datos		
								Categoria categoria=buscoCategoria(fichCate, ((Empleado) aux).getCategoria());
								
								System.out.println("\n El codigo del empleado es : "+((Empleado)aux).getCodigo());
								System.out.println("\n El nombre del empleado es : "+((Empleado)aux).getNombre());
								System.out.println("\n El apellido del empleado es : "+((Empleado)aux).getApellido());
								System.out.println("\n El DNI del empleado es : "+((Empleado)aux).getDni());
								System.out.println("\n El departamento del empleado es :"+((Empleado)aux).getDepartamento());
								System.out.println("\n El codigo de categoria del empleado es : "+categoria.getCodigoCat());
								System.out.println("\n La descripcion de la categoria es : "+categoria.getDescripcion());
								System.out.println("\n El sueldo del empleado es :"+ categoria.getSueldo());		
								}//fin del if de los cambios
							}//fin del if del empleado encontrado
							
							oaux.writeObject(aux);
								//Escribes tanto si no es el buscado, si lo es y lo ha modificado, si lo es y no lo ha modificado...
					}
				  aux=ois.readObject();
				}//repetitiva de lectura
			if(hay==0){
				System.out.println("\n No hay ningun empleado con ese codigo.");
			}
				
			}catch(EOFException e1){
				System.out.println();
			}catch(Exception e2){
				e2.printStackTrace();
			}
			fis.close();
			ois.close();
			faux.close();
			oaux.close();
			
		if (hay==2){ //Ha habido cambios en el fichero
				fichEmple.delete();
				 fichAux.renameTo(fichEmple);
		}
		else{
		System.out.println("\n No existen datos en el fichero empleados.");
		}
	}

	 catch (FileNotFoundException e1) {
System.out.println("Error, ha ocurrido un problema con el fichero");
 catch (IOException e3) {
System.out.println("Error de entrada/salida de datos, consulta a tu programador");
}catch (ClassNotFoundException e4) {
System.out.println("Error, en la lectura de objetos");




 * 
 * */
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Util {

	static String introducirCadena(){
		String cadena="";
		InputStreamReader entrada=new InputStreamReader(System.in);
		BufferedReader teclado=new BufferedReader(entrada);
		
		try{
			cadena=teclado.readLine(); 
		}
		
		catch(IOException er){
			System.out.println("error al introducir datos");
		}
		
		return cadena;
	}
	
	static String introducirCadena(String mensaje){
		String cadena="";
		InputStreamReader entrada=new InputStreamReader(System.in);
		BufferedReader teclado=new BufferedReader(entrada);
		System.out.println(mensaje);
		try{
			cadena=teclado.readLine(); 
		}
		
		catch(IOException er){
			System.out.println("error al introducir datos");
		}
		
		return cadena;
	}
	
	public static int leerint(){
		int num=0;
		boolean cat;
		do{
			cat=true;
			try{
				num=Integer.parseInt(introducirCadena()); 
			}
			
			catch(NumberFormatException e){
				System.out.println("Error, solo numeros: ");
				cat=false;
			}
		}while(!cat);
		return num;
	}
	
	
	public static int leerint(int x,int y){
		int num=0;
		boolean cat;
		do{
			cat=true;
			try{
				num=Integer.parseInt(introducirCadena()); 
			}
			
			catch(NumberFormatException e){
				System.out.println("Error, solo numeros: ");
				num=x;
				cat=false;
			}
			if(num<x||num>y){
		         cat=false;
		         System.out.println("\n\nDato fuera de rango\n\nVuelve a introducir: ");
		    }
		}while(!cat);
		return num;
	}
	
	
	
	public static float leerfloat(){
		float num=0;
		boolean cat;
		do{
			cat=true;
			try{
				num=Float.parseFloat(introducirCadena()); 
			}
			
			catch(NumberFormatException e){
				System.out.println("Error, solo numeros(deci): ");
				cat=false;
			}
		}while(!cat);
		return num;
	}
	
	
	public static boolean leerafirm(){
		boolean comparar=true, bolfinal=false;
		String elec;
		

		
		do{
			if(!comparar){
				System.out.println("Introduce 's-si' o 'n-no': "); 	//En caso de que se repita el Do con un false
			}
			comparar=false;
			elec=Util.introducirCadena();							//necesario que el principal pregunte con un syso si se esta seguro
			
			if(elec.compareTo("s")==0 || elec.compareTo("si")==0 || elec.compareTo("n")==0 || elec.compareTo("no")==0){
				comparar=true;
			}
			
			else{
				comparar=false;
			}
			
		}while(!comparar);
		
		if(elec.compareTo("s")==0 || elec.compareTo("si")==0){
			bolfinal=true;
		}
		else{
			bolfinal=false;
		}
		
		return bolfinal;
		
	}
	
	
	
	public static float leerfloat(int x,int y){
		float num=0;
		boolean cat;
		do{
			cat=true;
			try{
				num=Float.parseFloat(introducirCadena()); 
			}
			
			catch(NumberFormatException e){
				System.out.println("Error, solo numeros(deci): ");
				num=x;
				cat=false;
			}
			if(num<x||num>y){
		         cat=false;
		         System.out.println("\n\nDato fuera de rango\n\nVuelve a introducir: ");
		    }
		}while(!cat);
		return num;
	}
	
	
	
	
	public static double leerdoble(){
		double num=0;
		boolean cat;
		do{
			cat=true;
			try{
				num=Double.parseDouble(introducirCadena()); 
			}
			
			catch(NumberFormatException e){
				System.out.println("Error, solo numeros(deci): ");
				cat=false;
			}
		}while(!cat);
		return num;
	}
	
	public static double leerdoble(int x,int y){
		double num=0;
		boolean cat;
		do{
			cat=true;
			try{
				num=Double.parseDouble(introducirCadena()); 
			}
			
			catch(NumberFormatException e){
				System.out.println("Error, solo numeros(deci): ");
				num=x;
				cat=false;
			}
			if(num<x||num>y){
		         cat=false;
		         System.out.println("\n\nDato fuera de rango\n\nVuelve a introducir: ");
		    }
		}while(!cat);
		return num;
	}
	
	static char leerCarac(){
		boolean error=false;
		String caracter;
		do{
			error=false;
			caracter=introducirCadena();
			if(caracter.length()!=1){
				System.out.println("Introduce un solo caracter.");
				error=true;
			}
		}while(error);
		return caracter.charAt(0);
	}
	
	
	public static char leerCharArray(char caracteres[]) {
		int i=0;
		boolean error = false;
		String letra;
		char aux = 0;
		do {
			error = false;
			letra = introducirCadena();
			if (letra.length() != 1) {
				System.out.println("Error, introduce un caracter: ");
				error = true;
			} else {
				aux = letra.charAt(0);
				for (i=0; i<caracteres.length; i++) {
					if (Character.toUpperCase(caracteres[i]) == Character.toUpperCase(aux)) {
						break;
					}
				}
				if (i == caracteres.length) {
					error = true;
					System.out.println("Error, el caracter introducido no es valido/ Introduce de nuevo: ");
				}
			}
		} while (error);
		return aux;
	}
	
	
	public static char eleccion( char letra1, char letra2) {
		char respuesta;
		do{	
			respuesta=leerCarac();
			respuesta=Character.toUpperCase(respuesta);
			if(respuesta!=letra1 && respuesta!=letra1){
					System.out.print("Elige entre" + letra1 + "o" + letra2 + ": ");
			}
		}while(respuesta!=letra1 && respuesta!=letra2);
		return respuesta;
	}
	
	
	public static LocalDate leerFecha(){
		boolean estaMal;
		String fecha;
		DateTimeFormatter formateador= DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate auxfecha=null;
		do{
			estaMal=false;
			fecha=Util.introducirCadena();
			try{
				auxfecha=LocalDate.parse(fecha, formateador);
			}catch(DateTimeException e){
				System.out.println("Introduce una fecha v�lida.(DD/MM/AAAA)");
				estaMal=true;
			}
		}while(estaMal);
		return auxfecha;
	}	
	
	
	//Devuelve la cantidad de objetos de un fichero
	 public static int calculoFichero(File fichero){
	 	int x=0;
	 	FileInputStream fis=null;
	 	ObjectInputStream ois=null;
	 	if(fichero.exists()) {
		 	try{
		 		fis=new FileInputStream(fichero);
		 		ois=new ObjectInputStream(fis);
		 		Object aux=ois.readObject();
		 		while (aux!=null){
		 			x++;
		 			aux=ois.readObject();
		 		}
		 	}catch(EOFException e1){
				System.out.println();
		 	}catch (Exception e2){
				 e2.printStackTrace();
		 	}
		 	try {
				ois.close();
				fis.close();
			} catch (IOException e) {
				System.out.println("Error al cerrar los flujos.");
			}
	 	}
	 	else
	 		System.out.println("No hay datos existentes.");
	 	return x;
	 }
	
}

