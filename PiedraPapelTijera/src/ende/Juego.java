package ende;

/**
 * Simula el juego de Piedra, Papel o tijera
 */

public class Juego
{
    public static void main(String args[])
    {
    	final String piedra = "piedra";
    	final String tijeras = "tijeras";
    	final String papel = "papel";
    	final String j1gana = "Jugador 1 GANA";
    	final String j2gana = "Jugador 2 GANA";
    	
        Jugador p1 = new Jugador();
        Jugador p2 = new Jugador();
        boolean findejuego = false;  
        int Rondasjugadas = 0;    // Numero de rondas jugadas
        int exitosjugador1 = p1.getExitos();
        int exitojugador2 = p2.getExitos();
        int EmPaTeS = 0;
        String opcionjugador1;
        String opcionjugador2;
        
        // Bucle de juego
        do
        {
            System.out.println("***** Ronda: " + Rondasjugadas+" *********************\n");
            System.out.println("Numero de empates: "+ EmPaTeS + "\n");
            opcionjugador1 = p1.opcion_al_azar();
            System.out.println("Jugador 1: " + opcionjugador1+"\t Jugador 1 - Partidas ganadas: " + exitosjugador1);
            opcionjugador2 = p2.opcion_al_azar();
            System.out.println("Jugador 2: " + opcionjugador2+"\t Jugador 2 - Partidas ganadas: " + exitojugador2);
            
            if((opcionjugador1.equals(piedra))&&(opcionjugador2.equals(papel)))
            {
            	p2.setExitos();
                System.out.println("Jugador 2 GANA");
                exitojugador2 += p2.getExitos();
                
            }
            else if((opcionjugador1.equals(papel))&&(opcionjugador2.equals(piedra)))
            {
            	p1.setExitos();
            	exitosjugador1 += p1.getExitos();
                System.out.println(j1gana);
            }
            else if((opcionjugador1.equals(piedra))&&(opcionjugador2.equals(tijeras)))
            {
            	p1.setExitos();
            	exitosjugador1 += p1.getExitos();
                System.out.println(j1gana);
            }
            else if((opcionjugador1.equals(tijeras))&&(opcionjugador2.equals(piedra)))
            {
            	p2.setExitos();
            	exitojugador2 += p2.getExitos();
                System.out.println(j2gana);
            }
            else if((opcionjugador1.equals(tijeras))&&(opcionjugador2.equals(papel)))
            {
            	p1.setExitos();
            	exitosjugador1 += p1.getExitos();
                System.out.println(j1gana);
            }
            else if((opcionjugador1.equals(papel))&&(opcionjugador2.equals(tijeras)))
            {
            	p2.setExitos();
            	exitojugador2 += p2.getExitos();
                System.out.println(j2gana);
            }
            if(opcionjugador1 == opcionjugador2)
            {
            	EmPaTeS++;
                System.out.println("\n\t\t\t Empate \n");
            }
            Rondasjugadas++;
            if((p1.getExitos() >= 3)||(p2.getExitos() >= 3))
            {
            	findejuego = true;
                System.out.println("FIN DEL JUEGO!!");
            }
            System.out.println();
        } while(findejuego != true);
    }
}
/**
 *
 */
class Jugador{  
	
    int exitos;      // numero de partidas ganadas
    /**
     * Escoge piedra, papel o tijera al azar
     */
    public String opcion_al_azar()
    {
        String opcion = "";
        Integer c = (int)(Math.random()*3);
        switch(c){
            case 0:
            	opcion = ("piedra");
                break;
            case 1:
            	opcion = ("papel");
                break;
            case 2:
            	opcion = ("tijeras");
        } 
        return opcion;
    }
    public void setExitos() 
    {
        exitos++;
    }
    public int getExitos() 
    {
        return(exitos);
    }

}
