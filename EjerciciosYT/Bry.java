package EjerciciosYT;
public class Bry {
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
}
