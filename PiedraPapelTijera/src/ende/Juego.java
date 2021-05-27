package ende;

/**
 * Simula el juego de Piedra, Papel o tijera
 */

public class Juego
{
    public static void main(String args[])
    {
        Jugador p1 = new Jugador();
        Jugador p2 = new Jugador();
        boolean fin_de_juego = false;  
        int Rondasjugadas = 0;    // Numero de rondas jugadas
        int exitosjugador1 = p1.getExitos();
        int exitojugador2 = p2.getExitos();
        int EmPaTeS = 0;
        String opcion_jugador1;
        String opcion_jugador2;
        
        // Bucle de juego
        do
        {
            System.out.println("***** Ronda: " + Rondasjugadas+" *********************\n");
            System.out.println("Numero de empates: "+ EmPaTeS + "\n");
            opcion_jugador1 = p1.opcion_al_azar();
            System.out.println("Jugador 1: " + opcion_jugador1+"\t Jugador 1 - Partidas ganadas: " + exitosjugador1);
            opcion_jugador2 = p2.opcion_al_azar();
            System.out.println("Jugador 2: " + opcion_jugador2+"\t Jugador 2 - Partidas ganadas: " + exitojugador2);
            
            if((opcion_jugador1.equals("piedra"))&&(opcion_jugador2.equals("papel")))
            {
                System.out.println("Jugador 2 GANA");
                exitojugador2 += p2.getExitos();
                
            }
            else if((opcion_jugador1.equals("papel"))&&(opcion_jugador2.equals("piedra")))
            {
            	exitosjugador1 += p1.getExitos();
                System.out.println("Jugador 1 GANA");
            }
            else if((opcion_jugador1.equals("piedra"))&&(opcion_jugador2.equals("tijeras")))
            {
            	exitosjugador1 += p1.getExitos();
                System.out.println("Jugador 1 GANA");
            }
            else if((opcion_jugador1.equals("tijeras"))&&(opcion_jugador2.equals("piedra")))
            {
            	exitojugador2 += p2.getExitos();
                System.out.println("Jugador 2 GANA");
            }
            else if((opcion_jugador1.equals("tijeras"))&&(opcion_jugador2.equals("papel")))
            {
            	exitosjugador1 += p1.getExitos();
                System.out.println("Jugador 1 GANA");
            }
            else if((opcion_jugador1.equals("papel"))&&(opcion_jugador2.equals("tijeras")))
            {
            	exitojugador2 += p2.getExitos();
                System.out.println("Jugador 2 GANA");
            }
            if(opcion_jugador1 == opcion_jugador2)
            {
            	EmPaTeS++;
                System.out.println("\n\t\t\t Empate \n");
            }
            Rondasjugadas++;
            if((p1.getExitos() >= 3)||(p2.getExitos() >= 3))
            {
            	fin_de_juego = true;
                System.out.println("FIN DEL JUEGO!!");
            }
            System.out.println();
        } while(fin_de_juego != true);
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
