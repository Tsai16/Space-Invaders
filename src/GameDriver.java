/*     */ import java.awt.Canvas;
/*     */ import java.awt.Color;
/*     */ import java.awt.Graphics;
/*     */ import java.awt.Graphics2D;
/*     */ import java.awt.event.KeyEvent;
/*     */ import java.awt.event.KeyListener;
/*     */ import java.awt.image.BufferedImage;
/*     */ import java.io.IOException;
/*     */ import java.io.PrintStream;
/*     */ import java.util.Timer;
/*     */ import java.util.TimerTask;
/*     */ import javax.imageio.ImageIO;
/*     */ 
/*     */ public abstract class GameDriver extends Canvas
/*     */   implements KeyListener
/*     */ {
/*     */   protected boolean[] keys;
/*     */   protected BufferedImage back;
/*  24 */   protected int FramesPerSecond = 30;
/*  25 */   protected long timer = 1000 / this.FramesPerSecond;
/*  26 */   protected Timer t1 = new Timer();
/*     */ 
/*     */   public GameDriver()
/*     */   {
/*  32 */     this.keys = new boolean[16];
/*     */ 
/*  34 */     setBackground(Color.WHITE);
/*  35 */     setVisible(true);
/*  36 */     this.t1.scheduleAtFixedRate(new GameDriver.ThreadTimer(this), 0L, this.timer);
/*  37 */     addKeyListener(this);
/*  38 */     setFocusable(true);
/*     */   }
/*     */ 
/*     */   public void update(Graphics window) {
/*  42 */     paint(window);
/*     */   }
/*     */ 
/*     */   public void setTimer(int value) {
/*  46 */     this.timer = value;
/*     */   }
/*     */ 
/*     */   public void paint(Graphics window) {
/*  50 */     if (this.back == null)
/*  51 */       this.back = ((BufferedImage)createImage(getWidth(), getHeight()));
/*  52 */     Graphics2D graphToBack = this.back.createGraphics();
/*     */ 
/*  54 */     draw(graphToBack);
/*     */ 
/*  56 */     Graphics2D win2D = (Graphics2D)window;
/*  57 */     win2D.drawImage(this.back, null, 0, 0);
/*     */   }
/*     */ 
/*     */   public abstract void draw(Graphics2D paramGraphics2D);
/*     */ 
/*     */   public void keyPressed(KeyEvent e)
/*     */   {
/*  64 */     switch (e.getKeyCode()) {
/*     */     case 87:
/*  66 */       this.keys[0] = true;
/*  67 */       break;
/*     */     case 83:
/*  69 */       this.keys[1] = true;
/*  70 */       break;
/*     */     case 65:
/*  72 */       this.keys[2] = true;
/*  73 */       break;
/*     */     case 68:
/*  75 */       this.keys[3] = true;
/*  76 */       break;
/*     */     case 70:
/*  78 */       this.keys[4] = true;
/*  79 */       break;
/*     */     case 56:
/*  82 */       this.keys[5] = true;
/*  83 */       break;
/*     */     case 53:
/*  85 */       this.keys[6] = true;
/*  86 */       break;
/*     */     case 52:
/*  88 */       this.keys[7] = true;
/*  89 */       break;
/*     */     case 54:
/*  91 */       this.keys[8] = true;
/*  92 */       break;
/*     */     case 521:
/*  94 */       this.keys[9] = true;
/*  95 */       break;
/*     */     case 10:
/*  97 */       this.keys[10] = true;
/*  98 */       break;
/*     */     case 32:
/* 100 */       this.keys[11] = true;
/* 101 */       break;
/*     */     case 38:
/* 103 */       this.keys[12] = true;
/* 104 */       break;
/*     */     case 40:
/* 106 */       this.keys[13] = true;
/* 107 */       break;
/*     */     case 37:
/* 109 */       this.keys[14] = true;
/* 110 */       break;
/*     */     case 39:
/* 112 */       this.keys[15] = true;
/*     */     }
/*     */   }
/*     */ 
/*     */   public void keyReleased(KeyEvent e)
/*     */   {
/* 119 */     switch (e.getKeyCode()) {
/*     */     case 87:
/* 121 */       this.keys[0] = false;
/* 122 */       break;
/*     */     case 83:
/* 124 */       this.keys[1] = false;
/* 125 */       break;
/*     */     case 65:
/* 127 */       this.keys[2] = false;
/* 128 */       break;
/*     */     case 68:
/* 130 */       this.keys[3] = false;
/* 131 */       break;
/*     */     case 70:
/* 133 */       this.keys[4] = false;
/* 134 */       break;
/*     */     case 56:
/* 137 */       this.keys[5] = false;
/* 138 */       break;
/*     */     case 53:
/* 140 */       this.keys[6] = false;
/* 141 */       break;
/*     */     case 52:
/* 143 */       this.keys[7] = false;
/* 144 */       break;
/*     */     case 54:
/* 146 */       this.keys[8] = false;
/* 147 */       break;
/*     */     case 521:
/* 149 */       this.keys[9] = false;
/* 150 */       break;
/*     */     case 10:
/* 152 */       this.keys[10] = false;
/* 153 */       break;
/*     */     case 32:
/* 155 */       this.keys[11] = false;
/* 156 */       break;
/*     */     case 38:
/* 158 */       this.keys[12] = false;
/* 159 */       break;
/*     */     case 40:
/* 161 */       this.keys[13] = false;
/* 162 */       break;
/*     */     case 37:
/* 164 */       this.keys[14] = false;
/* 165 */       break;
/*     */     case 39:
/* 167 */       this.keys[15] = false;
/*     */     }
/*     */   }
/*     */ 
/*     */   public void keyTyped(KeyEvent e)
/*     */   {
/*     */   }
/*     */ 
/*     */   public BufferedImage addImage(String name)
/*     */   {
/* 203 */     BufferedImage img = null;
/*     */     try
/*     */     {
/* 206 */       img = ImageIO.read(getClass().getResource(name));
/*     */     }
/*     */     catch (IOException e) {
/* 209 */       System.out.println(e);
/*     */     }
/*     */ 
/* 212 */     return img;
/*     */   }
/*     */ 
/*     */   private class ThreadTimer extends TimerTask
/*     */   {
/*     */     GameDriver driver;
/*     */ 
/*     */     public ThreadTimer(GameDriver gameDrive)
/*     */     {
/* 179 */       this.driver = gameDrive;
/*     */     }
/*     */ 
/*     */     public void run()
/*     */     {
/* 184 */       this.driver.repaint();
/* 185 */       System.gc();
/*     */     }
/*     */   }
/*     */   public class timerDriver extends Thread {
/*     */     int delay;
/*     */ 
/* 191 */     public timerDriver(int _delayInMiliseconds) { this.delay = _delayInMiliseconds; }
/*     */ 
/*     */ 
/*     */     public void run()
/*     */     {
/*     */     }
/*     */   }
/*     */ }

