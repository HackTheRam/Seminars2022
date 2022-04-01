import java.awt.Color;

import kareltherobot.Robot;

public class Bot extends Robot
{

	private boolean isOff;
	private int x;
	private int y;
	public Bot(int street, int avenue, Direction direction, int beepers)
	{
		super(street, avenue, direction, beepers);
		x=street;
		y=avenue;
		isOff=false;
	}

	public Bot(int street, int avenue, Direction direction, int beepers, Color badge)
	{
		super(street, avenue, direction, beepers, badge);
		x=street;
		y=avenue;
		isOff=false;
	}

	@Override
	public void move()
	{
		if(super.facingEast())
		{
			y++;
		}
		if(super.facingWest())
		{
			y--;
		}
		if(super.facingNorth())
		{
			x++;
		}
		if(super.facingSouth())
		{
			x--;
		}
		super.move();
	}
	
	public int getX()
	{
		return x;
	}
	
	public int getY()
	{
		return y;
	}
	
	public void turnTo(Direction direction)
	{
		if(direction==North)
		{
			while(!facingNorth())
			{
				turnLeft();
			}
		}
		if(direction==South)
		{
			while(!facingSouth())
			{
				turnLeft();
			}
		}
		if(direction==West)
		{
			while(!facingWest())
			{
				turnLeft();
			}
		}
		if(direction==East)
		{
			while(!facingEast())
			{
				turnLeft();
			}
		}
	}
	
	@Override
	public void turnOff()
	{
		super.turnOff();
		isOff = true;
	}

	public boolean isOff()
	{
		return isOff;
	}
}