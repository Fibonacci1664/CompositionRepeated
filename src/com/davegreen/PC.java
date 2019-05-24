package com.davegreen;

/**
 * Created by daveg on 22/06/2017.
 */
public class PC
{
    private Case theCase;
    private Monitor monitor;
    private MotherBoard motherBoard;

    public PC(Case theCase, Monitor monitor, MotherBoard motherBoard)
    {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherBoard = motherBoard;
    }

    public void powerUp()
    {
        getTheCase().pressPowerButton();
        drawLogo();
    }

    public void drawLogo()
    {
        getMonitor().drawPixelAt(1200, 50, "Yellow");  // This accesses the getter which in turn returns the field monitor.
        monitor.drawPixelAt(1200, 50, "Blue");         // This accesses the field monitor directly.
    }

    private Case getTheCase()
    {
        return theCase;
    }

    private Monitor getMonitor()
    {
        return monitor;
    }

    private MotherBoard getMotherBoard()
    {
        return motherBoard;
    }
}
