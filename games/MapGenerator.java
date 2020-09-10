/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package games;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;


public class MapGenerator
{
    public int map[][];
    public int brickwidth=100;
    public int brickheight=60;
    public MapGenerator(int row, int col)
    {
        map=new int[row][col];
       // System.out.println("map length is:"+map.length);
       // System.out.println("map[0] length is"+map[0].length);
        for ( int i=0;i < map.length; i++) {
            for (int j = 0; j<map[0].length; j++) {
                map[i][j] = 1;
            }
        }
        brickwidth=740/col;
        brickwidth=200/row; 
    }
    
    public void draw(Graphics2D g)
    {
        for(int i=0;i<map.length;i++)
        {
            for(int j=0;j<map[0].length;j++)
            {
                if(map[i][j]>0){
                    g.setColor(Color.pink);
                    g.fillRect(j*brickwidth+80,i*brickheight+50,brickwidth,brickheight);
               //     System.out.println(j*brickwidth+80);
                    g.setStroke(new BasicStroke(3));
                    g.setColor(Color.black);
                    g.drawRect(j*brickwidth+80,i*brickheight+50,brickwidth,brickheight);
                }
            }
        }
    }
    public void setBrickValue(int value,int row,int col)
    {
        map[row][col]=value;
    }
}
