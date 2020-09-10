/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package games;


import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JPanel;
import javax.swing.Timer;
/**
 *
 * @author PAULRAJ
 */
public class gameplay extends JPanel implements KeyListener, ActionListener
{
            private boolean play=false;
            private int score=0;
            
            private int Totalbricks=21;
            
            private Timer timer;
            private int delay=2;
            
            private int playerX=310;
            
            private int ballposX=120;
            private int ballposY=350;
            private int ballXdir=-1;
            private int ballYdir=-2;
            
            private MapGenerator map;
            
                        public gameplay()
                        {
                            map=new MapGenerator(3,7);
                            addKeyListener(this);
                            setFocusable(true);
                            setFocusTraversalKeysEnabled(false);
                            timer =new Timer(delay,this);
                            timer.start();
                        }
                public void paint(Graphics g)
                {
                    //background
                    g.setColor(Color.black);
                    g.fillRect(1,1,692,592);
                    //draw map
                    map.draw((Graphics2D) g);
                    //borders
                    g.setColor(Color.yellow);
                    g.fillRect(0,0,3,592);
                    g.fillRect(0,0,692,3);
                    g.fillRect(691,0,3,592);
                    //scores
                    g.setColor(Color.pink);
                    g.setFont(new Font("serif",Font.BOLD,30));
                    g.drawString(""+score,590,30);
                    
                    //the peddle
                    g.setColor(Color.green);
                    g.fillRect(playerX,550,100,8);
                    //the ball
                    g.setColor(Color.blue);
                    g.fillOval(ballposX,ballposY,20,20);
                    if(Totalbricks <= 0)
                    {
                         play=false;
                        ballXdir=0;
                        ballYdir=0;
                        g.setColor(Color.RED);
                        g.setFont(new Font("serif",Font.BOLD,30));
                        g.drawString("YOU WON:",260,300);
                        
                        g.setFont(new Font("serif",Font.BOLD,50));
                        g.drawString("press Enter to restart:",230,350);
                    }
                    
                    if(ballposY > 570)
                    {
                        play=false;
                        ballXdir=0;
                        ballYdir=0;
                        g.setColor(Color.RED);
                        g.setFont(new Font("serif",Font.BOLD,30));
                        g.drawString("GAME OVER:",190,300);
                        
                        g.setFont(new Font("serif",Font.BOLD,50));
                        g.drawString("press Enter to restart:",100,150);

                    }
                    g.dispose();

                }
                         @Override
                        public void actionPerformed(ActionEvent ae) {
                            timer.start();
                            if(play)
                            {
                                if(new Rectangle(ballposX, ballposY,20,20).intersects(new Rectangle(playerX,550,100,8)))
                                    ballYdir = -ballYdir;
                                
                                A:  for(int i =0;i<map.map.length; i++)
                                {
                                    for(int j=0;j<map.map[0].length; j++)
                                        if(map.map[i][j]>0)
                                        {
                                            int brickX =j*map.brickwidth+80;
                                            int brickY =i*map.brickheight+50;
                                            int brickwidth=map.brickwidth;
                                            int brickheight=map.brickheight;
                                            
                                            Rectangle rect=new Rectangle(brickX,brickY,brickwidth,brickheight);
                                            Rectangle ballRect =new Rectangle(ballposX,ballposY,20,20);
                                            Rectangle brickRect = rect;
                                            
                                            if(ballRect.intersects(brickRect))
                                            {
                                                map.setBrickValue(0,i,j);
                                                Totalbricks--;
                                                score+=5;
                                                
                                                if(ballposX+19 <=brickRect.x || ballposX + 1>= brickRect.x + brickRect.width)
                                                    ballXdir = -ballXdir;
                                                else
                                                    ballYdir = -ballYdir;
                                                break A;
                                            }
                                            
                                        }
                                }
                                
                                ballposX += ballXdir;
                                ballposY += ballYdir;
                                if(ballposX<0) ballXdir = -ballXdir;
                                if(ballposY<0) ballYdir = - ballYdir;
                                if(ballposX > 670) ballXdir = -ballXdir;
                                    
                            }
                            repaint();
                            
                             
                        }    

                        @Override
                        public void keyTyped(KeyEvent ke) {
                            
                        }

                        @Override
                        public void keyReleased(KeyEvent ke) {
                             
                        }

                         @Override
                        public void keyPressed(KeyEvent ke) {
                            if(ke.getKeyCode()== KeyEvent.VK_RIGHT)
                            {
                                if(playerX>=600)
                                {
                                    playerX=600;
                                }
                                else
                                {
                                    moveRight();
                                }
                            }
                             if(ke.getKeyCode()== KeyEvent.VK_LEFT)
                            {
                               if(playerX < 10)
                                {
                                    playerX=10;
                                }
                                else
                                {
                                    moveLeft();
                                }  
                            }
                             
                           if(ke.getKeyCode()== KeyEvent.VK_ENTER)
                           {
                                   if(!play)
                                   {
                                       play=true;
                                       ballposX=120;
                                       ballposY=350;
                                       ballYdir=-2;
                                       ballXdir=-1;
                                       playerX= 310;
                                       score = 0;
                                       Totalbricks=21;
                                       map=new MapGenerator(3,7);
                                       repaint();
                                   }    
                           }
                        }
               
                        public void moveRight()
                        {
                          play = true;
                          playerX+=20;
                        }
                        public void moveLeft()
                        {
                             play = true;
                          playerX-=20;
                        }


   
}
