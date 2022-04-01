import java.awt.Color;
import kareltherobot.*;

public class Driver implements Directions
{
	public static void main(String args[])  
	{
		makeWorld();
	} 

	public static void makeWorld()
	{
		World.reset(); 
		World.readWorld("world.kwld"); 
		World.setBeeperColor(Color.magenta);
		World.setStreetColor(Color.blue);
		World.setNeutroniumColor(Color.green.darker());
		World.setDelay(30);  
		World.setVisible(true);
	}
}
