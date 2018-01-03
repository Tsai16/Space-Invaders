/*      */ import java.awt.Color;
/*      */ import java.awt.Font;
/*      */ import java.awt.Graphics2D;
/*      */ import java.awt.Rectangle;
/*      */ import java.awt.image.BufferedImage;
/*      */ import java.util.ArrayList;
/*      */ 
/*      */ public class Mission extends GameDriver
/*      */ {
/*      */   private Newbie brian;
/*      */   private SoundDriver sounds;
/*   12 */   private String[] cat = { "Nyan_Cat.wav" };
/*   13 */   private SoundDriver yikes = new SoundDriver(this.cat);
/*   14 */   private boolean dead = false;
/*      */   private ArrayList<Monsters> bonus;
/*      */   private ArrayList<bullets> monbul;
/*      */   private Rectangle endScreen;
/*      */   private Rectangle shield;
/*      */   private Rectangle Starts;
/*   20 */   private int lives = 5;
/*   21 */   private int dc = 50;
/*      */   private boolean t;
/*   23 */   public boolean cantd = false;
/*   24 */   public boolean rapid = false;
/*   25 */   private boolean press = false;
/*      */   private BufferedImage sky;
/*      */   private BufferedImage laser;
/*      */   private BufferedImage key;
/*      */   private BufferedImage ship;
/*      */   private BufferedImage monster1;
/*      */   private BufferedImage debris;
/*      */   private BufferedImage monster2;
/*      */   private BufferedImage monster3;
/*      */   private BufferedImage Red;
/*      */   private BufferedImage Baron;
/*      */   private BufferedImage fire;
/*      */   private BufferedImage b;
/*      */   private BufferedImage c;
/*      */   private BufferedImage d;
/*   40 */   private boolean quad = false;
/*      */   private ArrayList<Monsters> auto;
/*      */   private ArrayList<bullets> bull;
/*      */   private ArrayList<Monsters> mon;
/*      */   private ArrayList<Monsters> mon1;
/*      */   private ArrayList<Monsters> mon2;
/*      */   private ArrayList<Monsters> mon3;
/*      */   private ArrayList<Monsters> mon4;
/*      */   private ArrayList<Monsters> mon5;
/*      */   private ArrayList<Monsters> missiles;
/*      */   private ArrayList<Monsters> mini;
/*   51 */   private boolean idk = false;
/*      */   private boolean lol;
/*   53 */   private int tt = 0;
/*   54 */   private boolean go = false;
/*   55 */   private boolean invince = false;
/*   56 */   private boolean idk2 = false;
/*      */   private int china;
/*   58 */   private boolean split = false;
/*   59 */   private boolean omg = false;
/*   60 */   private boolean doubled = false;
/*   61 */   private boolean l1 = false; private boolean l2 = false; private boolean l3 = false; private boolean l4 = false; private boolean l5 = false; private boolean l6 = false; private boolean l7 = false;
/*   62 */   private int levelcount = 0;
/*   63 */   private int ll1 = 0; private int ll2 = 0;
/*   64 */   private int y = 0; private int l = 0;
/*   65 */   private boolean idk3 = false; private boolean idk6 = false; private boolean idk4 = false; private boolean idk5 = false;
/*   66 */   private int stop3 = 0; private int stop4 = 0; private int stop5 = 0; private int stop6 = 0; private int stop7 = 0; private int stop8 = 0; private int stop9 = 0; private int stop10 = 0; private int stop11 = 0; private int stop12 = 0;
/*   67 */   private int m3Timer = 0; private int m3Delay = 10; private int m4Timer = 0; private int m4Delay = 50; private int m5Timer = 0; private int m5Delay = 100; private int m6Timer = 0; private int m6Delay = 10; private int m7Timer = 0; private int m7Delay = 10;
/*   68 */   private int m2Timer = 0; private int m2Delay = 10; private int bTimer = 0; private int bDelay = 7; private int n = 1; private int mTimer = 0; private int mDelay = 17; private int rTimer = 0; private int rDelay = 450; private int pee = 0; private int stop = 0; private int stop1 = 0; private int stop2 = 0; private int kills = 0; private int zz = 0; private int xx = 0; private int cc = 0; private int vv = 0; private int bb = 0; private int nn = 0; private int mm = 0; private int ll3 = 0; private int ll4 = 0;
/*   69 */   private Rectangle bg = new Rectangle(0, 0, 1000, 600);
/*      */   private Monsters boss;
/*      */ 
/*      */   public Mission()
/*      */   {
/*   72 */     reset();
/*      */   }
/*      */   public void reset() {
/*   75 */     this.brian = new Newbie();
/*   76 */     this.bull = new ArrayList();
/*   77 */     this.bull.add(new bullets());
/*   78 */     ((bullets)this.bull.get(0)).setLocation(this.brian.x, this.brian.y);
/*   79 */     this.mon = new ArrayList();
/*   80 */     this.mon.add(new Monsters());
/*   81 */     ((Monsters)this.mon.get(0)).setLocation(100, 100);
/*   82 */     this.mon1 = new ArrayList();
/*   83 */     this.mon1.add(new Monsters());
/*   84 */     ((Monsters)this.mon1.get(0)).setLocation(100, 400);
/*   85 */     this.bonus = new ArrayList();
/*   86 */     this.bonus.add(new Monsters());
/*   87 */     ((Monsters)this.bonus.get(0)).setLocation(100, 60);
/*   88 */     ((Monsters)this.bonus.get(0)).setColor(Color.YELLOW);
/*   89 */     this.missiles = new ArrayList();
/*   90 */     this.missiles.add(new Monsters());
/*   91 */     ((Monsters)this.missiles.get(0)).setLocation(50, 50);
/*   92 */     this.mini = new ArrayList();
/*   93 */     this.endScreen = new Rectangle(0, 0, 1000, 600);
/*   94 */     this.mon2 = new ArrayList();
/*   95 */     this.mon3 = new ArrayList();
/*   96 */     this.mon4 = new ArrayList();
/*   97 */     this.mon5 = new ArrayList();
/*   98 */     this.auto = new ArrayList();
/*   99 */     this.monbul = new ArrayList();
/*  100 */     this.shield = new Rectangle(0, 0, 75, 75);
/*  101 */     this.Starts = new Rectangle(0, 0, 1000, 600);
/*  102 */     this.boss = new Monsters();
/*  103 */     this.yikes.stop(0);
/*  104 */     this.boss.sethealth(1000);
/*      */ 
/*  106 */     this.idk3 = false; this.idk6 = false; this.idk4 = false; this.idk5 = false;
/*  107 */     this.stop3 = 0; this.stop4 = 0; this.stop5 = 0; this.stop6 = 0; this.stop7 = 0; this.stop8 = 0; this.stop9 = 0; this.stop10 = 0; this.stop11 = 0; this.stop12 = 0;
/*  108 */     this.m3Timer = 0; this.m3Delay = 10; this.m4Timer = 0; this.m4Delay = 50; this.m5Timer = 0; this.m5Delay = 65; this.m6Timer = 0; this.m6Delay = 10; this.m7Timer = 0; this.m7Delay = 10;
/*  109 */     this.m2Timer = 0; this.m2Delay = 10; this.bTimer = 0; this.bDelay = 7; this.n = 1; this.mTimer = 0; this.mDelay = 17; this.rTimer = 0; this.rDelay = 450; this.pee = 0; this.stop = 0; this.stop1 = 0; this.stop2 = 0; this.kills = 0; this.zz = 0; this.xx = 0; this.cc = 0; this.vv = 0; this.bb = 0; this.nn = 0; this.mm = 0; this.ll3 = 0; this.ll4 = 0;
/*  110 */     this.idk = false; this.press = false; this.china = 0; this.t = false;
/*  111 */     this.tt = 0;
/*  112 */     this.go = false;
/*  113 */     this.invince = false;
/*  114 */     this.lol = false;
/*  115 */     this.idk2 = false;
/*  116 */     this.split = false;
/*  117 */     this.omg = false;
/*  118 */     this.doubled = false;
/*  119 */     this.l1 = false; this.l2 = false; this.l3 = false; this.l4 = false; this.l5 = false; this.l6 = false; this.l7 = false;
/*  120 */     this.levelcount = 0;
/*  121 */     this.ll1 = 0; this.ll2 = 0;
/*  122 */     this.y = 0; this.l = 0;
/*  123 */     this.quad = false;
/*  124 */     this.lives = 6;
/*  125 */     this.dc = 50;
/*  126 */     this.cantd = false;
/*  127 */     this.rapid = false;
/*  128 */     this.dead = false;
/*      */ 
/*  130 */     this.laser = addImage("imageedit_3_2154670365.png");
/*  131 */     this.ship = addImage("imageedit_1_7974259223.png");
/*  132 */     this.monster1 = addImage("imageedit_6_6319244660.png");
/*  133 */     this.debris = addImage("imageedit_4_6693124461.png");
/*  134 */     this.monster2 = addImage("imageedit_21_2553832370.png");
/*  135 */     this.monster3 = addImage("imageedit_23_3434513818.png");
/*  136 */     this.Red = addImage("imageedit_25_2394738994.png");
/*  137 */     this.b = addImage("imageedit_1_8011827595.jpg");
/*  138 */     this.c = addImage("imageedit_33_7732567485.png");
/*  139 */     this.d = addImage("maxresdefault.jpg");
/*  140 */     this.key = addImage("arrowKeys.png");
/*  141 */     this.Baron = addImage("imageedit_12_8027567762.png");
/*  142 */     this.fire = addImage("imageedit_2_8920044153.png");
/*  143 */     this.sky = addImage("imageedit_8_3470263238.jpg");
/*      */ 
/*  145 */     String[] locs = { "Star_Trek_2009_Original_Theme_720p.wav", "" };
/*  146 */     this.sounds = new SoundDriver(locs);
/*      */ 
/*  152 */     this.sounds.loop(0);
/*      */   }
/*      */ 
/*      */   public void draw(Graphics2D win)
/*      */   {
/*  157 */     if (this.lives == 0) {
/*  158 */       playCat();
/*      */ 
/*  164 */       this.press = true;
/*      */ 
/*  166 */       this.sounds.pause(0);
/*      */ 
/*  168 */       win.drawImage(this.d, null, -100, -50);
/*  169 */       win.setColor(Color.PINK);
/*  170 */       win.setFont(new Font("BerlinSans", 0, 35));
/*  171 */       win.drawString("Game Over", 250, 50);
/*  172 */       win.drawString("Welcome to Space Heaven!", 250, 120);
/*      */     }
/*      */ 
/*  177 */     if ((this.keys[11] == true) && (this.press)) {
/*  178 */       this.sounds.stop(0);
/*  179 */       reset();
/*      */     }
/*      */ 
/*  210 */     if (this.keys[10] ==true) {
/*  211 */       this.go = true;
/*      */     }
/*  213 */     if (!this.go)
/*      */     {
/*  217 */       win.drawImage(this.sky, null, -150, -100);
/*  218 */       win.setColor(Color.ORANGE);
/*  219 */       win.setFont(new Font("Monotype corsiva", 2, 39));
/*  220 */       win.drawString("Press Enter to play", 390, 550);
/*      */ 
/*  222 */       win.setFont(new Font("Monotype corsiva", 2, 50));
/*  223 */       win.drawString("*Star Galaxy*", 360, 50);
/*  224 */       win.drawString("Brian Tsai", 380, 100);
/*  225 */       win.drawString("How to Play", 100, 150);
/*  226 */       win.drawString("Controls: ", 650, 150);
/*  227 */       win.setFont(new Font("BerlinSans", 2, 20));
/*  228 */       win.drawString("Destroy the enemy ships", 100, 200);
/*  229 */       win.drawString("Enemies explode into debris after dying", 100, 250);
/*  230 */       win.drawString("Do not get hit by debris, enemies, or enemy bullets", 100, 300);
/*  231 */       win.drawString("You are invincible for 3 seconds after you die", 100, 350);
/*  232 */       win.drawString("Collect the NYAN CAT for powerups by running into it", 100, 400);
/*  233 */       win.drawImage(this.monster1, null, 100, 459);
/*  234 */       win.drawString("2 shots to kill", 150, 480);
/*  235 */       win.drawImage(this.monster2, null, 327, 454);
/*  236 */       win.drawString("4 shots to kill", 370, 480);
/*  237 */       win.drawImage(this.monster3, null, 554, 455);
/*  238 */       win.drawString("2 shots to kill", 605, 480);
/*  239 */       win.drawString("fires        back", 605, 510);
/*  240 */       win.drawImage(this.Red, null, 650, 490);
/*  241 */       win.drawImage(this.key, null, 600, 200);
/*      */     }
/*      */     else
/*      */     {
/*  255 */       win.drawImage(this.b, null, 0, 0);
/*  256 */       if ((this.keys[13] ==true) && (this.lives > 0)) {
/*  257 */         this.brian.setDy(13.0D);
/*      */       }
/*  259 */       else if ((this.keys[12] ==true) && (this.lives > 0))
/*  260 */         this.brian.setDy(-13.0D);
/*      */       else {
/*  262 */         this.brian.setDy(0.0D);
/*      */       }
/*  264 */       if ((this.keys[14] ==true) && (this.lives > 0))
/*  265 */         this.brian.setDx(-13.0D);
/*  266 */       else if ((this.keys[15] ==true) && (this.lives > 0))
/*  267 */         this.brian.setDx(13.0D);
/*      */       else {
/*  269 */         this.brian.setDx(0.0D);
/*      */       }
/*      */ 
/*  273 */       if (this.levelcount >= 0) {
/*  274 */         this.l1 = true;
/*      */       }
/*  276 */       if (this.kills >= 10) {
/*  277 */         this.l2 = true;
/*      */       }
/*  279 */       if (this.kills >= 44) {
/*  280 */         this.l3 = true;
/*      */       }
/*  282 */       if ((this.brian.x > 925) && (this.brian.getDx() > 0.0D)) {
/*  283 */         this.brian.setDx(0.0D);
/*  284 */         this.brian.x = 937;
/*      */       }
/*  286 */       if ((this.brian.x < 15) && (this.brian.getDx() < 0.0D)) {
/*  287 */         this.brian.setDx(0.0D);
/*  288 */         this.brian.x = 5;
/*      */       }
/*  290 */       if ((this.brian.y > 499) && (this.brian.getDy() > 0.0D)) {
/*  291 */         this.brian.setDy(0.0D);
/*  292 */         this.brian.y = 512;
/*      */       }
/*  294 */       if ((this.brian.y < 30) && (this.brian.getDy() < 0.0D)) {
/*  295 */         this.brian.setDy(0.0D);
/*  296 */         this.brian.y = 16;
/*      */       }
/*  298 */       if (this.bTimer > this.bDelay) {
/*  299 */         this.bull.add(new bullets());
/*  300 */         ((bullets)this.bull.get(this.n)).x = this.brian.x;
/*  301 */         ((bullets)this.bull.get(this.n)).y = (this.brian.y + 9);
/*  302 */         this.bTimer = 0;
/*  303 */         this.n += 1;
/*  304 */         if (this.doubled) {
/*  305 */           this.bull.add(new bullets());
/*  306 */           ((bullets)this.bull.get(this.n)).y = (this.brian.y + 41);
/*  307 */           ((bullets)this.bull.get(this.n)).x = this.brian.x;
/*  308 */           this.n += 1;
/*      */         }
/*  310 */         if (this.quad) {
/*  311 */           this.bull.add(new bullets());
/*  312 */           ((bullets)this.bull.get(this.n)).y = (this.brian.y + 53);
/*  313 */           ((bullets)this.bull.get(this.n)).x = this.brian.x;
/*  314 */           this.n += 1;
/*  315 */           this.bull.add(new bullets());
/*  316 */           ((bullets)this.bull.get(this.n)).y = (this.brian.y - 3);
/*  317 */           ((bullets)this.bull.get(this.n)).x = this.brian.x;
/*  318 */           this.n += 1;
/*      */         }
/*      */ 
/*      */       }
/*      */ 
/*  324 */       for (int i = 0; i < this.auto.size(); i++) {
/*  325 */         if ((((Monsters)this.auto.get(i)).intersects(this.brian)) && (!this.dead) && (this.lives > 0) && (!this.invince)) {
/*  326 */           this.dead = true;
/*  327 */           this.lives -= 1;
/*  328 */           this.auto.remove(i);
/*      */         }
/*      */       }
/*  331 */       for (int i = 0; i < this.mini.size(); i++) {
/*  332 */         if ((((Monsters)this.mini.get(i)).intersects(this.brian)) && (!this.dead) && (this.lives > 0) && (!this.invince)) {
/*  333 */           this.dead = true;
/*  334 */           this.lives -= 1;
/*      */         }
/*      */       }
/*      */ 
/*  338 */       for (int i = 0; i < this.mon.size(); i++) {
/*  339 */         if ((((Monsters)this.mon.get(i)).intersects(this.brian)) && (!this.dead) && (this.lives > 0) && (!this.invince)) {
/*  340 */           this.dead = true;
/*  341 */           this.lives -= 1;
/*      */         }
/*      */       }
/*  344 */       for (int i = 0; i < this.mon1.size(); i++) {
/*  345 */         if ((((Monsters)this.mon1.get(i)).intersects(this.brian)) && (!this.dead) && (this.lives > 0) && (!this.invince)) {
/*  346 */           this.dead = true;
/*  347 */           this.lives -= 1;
/*      */         }
/*      */       }
/*  350 */       for (int i = 0; i < this.mon2.size(); i++) {
/*  351 */         if ((((Monsters)this.mon2.get(i)).intersects(this.brian)) && (!this.dead) && (this.lives > 0) && (!this.invince)) {
/*  352 */           this.dead = true;
/*  353 */           this.lives -= 1;
/*      */         }
/*      */       }
/*  356 */       for (int i = 0; i < this.mon3.size(); i++) {
/*  357 */         if ((((Monsters)this.mon3.get(i)).intersects(this.brian)) && (!this.dead) && (this.lives > 0) && (!this.invince)) {
/*  358 */           this.dead = true;
/*  359 */           this.lives -= 1;
/*      */         }
/*      */       }
/*  362 */       for (int i = 0; i < this.monbul.size(); i++) {
/*  363 */         if ((((bullets)this.monbul.get(i)).intersects(this.brian)) && (!this.dead) && (this.lives > 0) && (!this.invince)) {
/*  364 */           this.dead = true;
/*  365 */           this.lives -= 1;
/*  366 */           this.monbul.remove(i);
/*      */         }
/*      */       }
/*      */ 
/*  370 */       if ((this.dead) && (this.dc < 50) && (this.lives > 0)) {
/*  371 */         Color myColor = new Color(255, 0, 0, 127);
/*  372 */         win.setColor(myColor);
/*  373 */         win.fill(this.endScreen);
/*  374 */         win.setColor(Color.WHITE);
/*  375 */         win.setFont(new Font("BerlinSans", 0, 50));
/*  376 */         win.drawString("-1", 390, 290);
/*  377 */         this.brian.y = 300;
/*  378 */         this.brian.x = 640;
/*  379 */         this.brian.setDx(0.0D);
/*  380 */         this.brian.setDy(0.0D);
/*  381 */         this.dc += 1;
/*  382 */         this.invince = true;
/*      */       } else {
/*  384 */         this.dead = false;
/*  385 */         this.dc = 0;
/*      */       }
/*      */ 
/*  388 */       if (this.rapid) {
/*  389 */         this.bDelay = 3;
/*      */       }
/*  391 */       if (this.omg) {
/*  392 */         if (this.y <= 50) {
/*  393 */           win.setColor(Color.WHITE);
/*  394 */           win.setFont(new Font("BerlinSans", 0, 50));
/*  395 */           win.drawString("+1 Life", 370, 290);
/*  396 */           if (this.l < 1) {
/*  397 */             this.lives += 1;
/*      */           }
/*      */         }
/*  400 */         this.y += 1;
/*  401 */         this.l += 1;
/*      */       }
/*      */ 
/*  410 */       for (int i = 0; i < this.bonus.size(); i++) {
/*  411 */         if (((Monsters)this.bonus.get(i)).intersects(this.brian)) {
/*  412 */           this.pee += 1;
/*  413 */           this.bonus.remove(i);
/*      */         } else {
/*  415 */           ((Monsters)this.bonus.get(i)).setDx(2.0D);
/*      */         }
/*  417 */         if (this.pee == 1) {
/*  418 */           this.doubled = true;
/*      */         }
/*  420 */         if (this.pee == 2)
/*      */         {
/*  422 */           this.omg = true;
/*      */         }
/*      */         else
/*      */         {
/*  426 */           this.omg = false;
/*      */         }
/*  428 */         if (this.pee == 3)
/*      */         {
/*  430 */           this.rapid = true;
/*      */         }
/*  432 */         if (this.pee == 4) {
/*  433 */           this.quad = true;
/*  434 */           this.t = true;
/*      */         }
/*      */ 
/*      */       }
/*      */ 
/*  441 */       if ((this.l1) && (this.ll1 < 70)) {
/*  442 */         win.setColor(Color.WHITE);
/*  443 */         win.setFont(new Font("BerlinSans", 0, 50));
/*  444 */         win.drawString("Level 1", 330, 250);
/*  445 */         win.setColor(Color.WHITE);
/*  446 */         win.setFont(new Font("BerlinSans", 0, 30));
/*  447 */         win.drawString("Kill 10 Monsters", 300, 300);
/*      */ 
/*  450 */         this.ll1 += 1;
/*      */       }
/*  452 */       if ((this.l2) && (this.ll2 < 70)) {
/*  453 */         win.setColor(Color.WHITE);
/*  454 */         win.setFont(new Font("BerlinSans", 0, 50));
/*  455 */         win.drawString("Level 2", 330, 250);
/*  456 */         win.setColor(Color.WHITE);
/*  457 */         win.setFont(new Font("BerlinSans", 0, 30));
/*  458 */         win.drawString("Kill 34 Monsters", 300, 300);
/*  459 */         this.ll2 += 1;
/*      */       }
/*  461 */       if ((this.l3) && (this.ll3 < 70)) {
/*  462 */         win.setColor(Color.WHITE);
/*  463 */         win.setFont(new Font("BerlinSans", 0, 50));
/*  464 */         win.drawString("Level 3", 330, 250);
/*  465 */         win.setColor(Color.WHITE);
/*  466 */         win.setFont(new Font("BerlinSans", 0, 30));
/*  467 */         win.drawString("Kill 56 Monsters", 300, 300);
/*  468 */         this.ll3 += 1;
/*  469 */       }if (this.kills >= 100) {
/*  470 */         this.l4 = true;
/*      */       }
/*  472 */       if ((this.l4) && (this.ll4 < 100)) {
/*  473 */         win.setColor(Color.WHITE);
/*  474 */         win.setFont(new Font("BerlinSans", 0, 50));
/*  475 */         win.drawString("FINAL BOSS", 430, 250);
/*  476 */         win.setColor(Color.WHITE);
/*  477 */         win.setFont(new Font("BerlinSans", 0, 30));
/*  478 */         win.drawString("Kill BARON NASHOR", 520, 300);
/*  479 */         this.ll4 += 1;
/*      */       }
/*  481 */       if ((this.l4) && (this.boss.gethealth() > 0))
/*      */       {
/*  485 */         win.drawImage(this.Baron, null, 0, 120);
/*  486 */         this.boss.setWidth(200);
/*  487 */         this.boss.setHeight(550);
/*      */ 
/*  489 */         this.boss.x = 100;
/*  490 */         this.boss.y = 120;
/*      */ 
/*  492 */         for (int i = 0; i < this.bull.size(); i++) {
/*  493 */           if ((((bullets)this.bull.get(i)).intersects(this.boss)) && (!this.dead)) {
/*  494 */             this.bull.remove(i);
/*  495 */             this.boss.sethealth(this.boss.gethealth() - 1);
/*  496 */             this.n -= 1;
/*      */           }
/*      */         }
/*  499 */         if (this.boss.gethealth() < 500) {
/*  500 */           this.m5Delay = 40;
/*      */         }
/*  502 */         win.setColor(Color.RED);
/*  503 */         win.setFont(new Font("BerlinSans", 0, 30));
/*  504 */         win.drawString(" Baron health: " + this.boss.gethealth(), 600, 60);
/*      */       }
/*      */ 
/*  508 */       this.bTimer += 1;
/*  509 */       MADbullets(win);
/*  510 */       this.brian.moveAndDraw(win);
/*  511 */       win.drawImage(this.ship, null, this.brian.x - 7, this.brian.y - 2);
/*  512 */       if ((this.invince) && (this.tt < 100)) {
/*  513 */         this.shield.x = (this.brian.x - 12);
/*  514 */         this.shield.y = (this.brian.y - 18);
/*  515 */         Color o = new Color((int)(Math.random() * 255.0D) + 1, (int)(Math.random() * 255.0D) + 1, (int)(Math.random() * 255.0D) + 1, (int)(Math.random() * 255.0D) + 1);
/*      */ 
/*  517 */         win.setColor(o);
/*  518 */         win.draw(this.shield);
/*  519 */         this.tt += 1;
/*      */       } else {
/*  521 */         this.tt = 0;
/*  522 */         this.invince = false;
/*      */       }
/*  524 */       SpawnMon();
/*  525 */       MADmon(win);
/*  526 */       spawnBon();
/*  527 */       MADBon(win);
/*  528 */       MADmis(win);
/*  529 */       MADsplit(win);
/*  530 */       spawnMB();
/*  531 */       MADmb(win);
/*  532 */       spawnAuto();
/*  533 */       MADauto(win);
/*      */ 
/*  535 */       win.setColor(Color.YELLOW);
/*  536 */       win.setFont(new Font("BerlinSans", 0, 31));
/*  537 */       win.drawString("Lives: " + this.lives, 30, 40);
/*  538 */       if ((this.l1) && (!this.l2) && (!this.l3)) {
/*  539 */         win.setColor(Color.YELLOW);
/*  540 */         win.setFont(new Font("BerlinSans", 0, 31));
/*  541 */         win.drawString("Monsters: " + (10 - this.kills), 180, 40);
/*      */       }
/*      */ 
/*  544 */       if ((this.l2) && (!this.l3)) {
/*  545 */         win.setColor(Color.YELLOW);
/*  546 */         win.setFont(new Font("BerlinSans", 0, 31));
/*  547 */         win.drawString("Monsters: " + (44 - this.kills), 180, 40);
/*      */       }
/*  549 */       if (this.l3) {
/*  550 */         win.setColor(Color.YELLOW);
/*  551 */         win.setFont(new Font("BerlinSans", 0, 31));
/*  552 */         win.drawString("Monsters: " + (100 - this.kills), 180, 40);
/*      */       }
/*  554 */       win.setColor(Color.YELLOW);
/*  555 */       win.setFont(new Font("BerlinSans", 0, 31));
/*  556 */       win.drawString("Total Kills: " + this.kills, 400, 40);
/*      */     }
/*      */ 
/*  559 */     if (this.lives == 0)
/*      */     {
/*  565 */       this.boss.sethealth(479);
/*  566 */       win.drawImage(this.d, null, -100, -50);
/*  567 */       win.setColor(Color.PINK);
/*  568 */       win.setFont(new Font("BerlinSans", 0, 35));
/*  569 */       win.drawString("Game Over", 250, 50);
/*  570 */       win.drawString("Welcome to Space Heaven!", 150, 100);
/*  571 */       win.drawString("Kills: " + this.kills, 150, 150);
/*  572 */       win.drawString("Press SPACE to play again!", 150, 250);
/*      */     }
/*      */ 
/*  576 */     if (this.boss.gethealth() <= 0) {
/*  577 */       win.setColor(new Color(0, 250, 150, 70));
/*  578 */       win.fill(this.bg);
/*  579 */       win.setColor(Color.WHITE);
/*  580 */       win.setFont(new Font("Monotype corsiva", 0, 37));
/*  581 */       win.drawString("You have successfully defended the Galaxy!", 250, 160);
/*  582 */       win.setFont(new Font("BerlinSans", 0, 30));
/*  583 */       win.drawString("Kills: " + this.kills, 350, 260);
/*  584 */       win.drawString("Baron Nashor is defeated!", 350, 360);
/*  585 */       win.drawString("Press SPACE to play again!", 355, 460);
/*  586 */       this.press = true;
/*  587 */       this.lol = true;
/*  588 */       for (int i = 0; i < this.auto.size(); i++)
/*  589 */         this.auto.remove(i);
/*      */     }
/*      */   }
/*      */ 
/*      */   public void MADbullets(Graphics2D win)
/*      */   {
/*  595 */     for (int i = 0; i < this.bull.size(); i++) {
/*  596 */       bullets bb = (bullets)this.bull.get(i);
/*  597 */       if (this.rapid)
/*  598 */         bb.setDx(-30.0D);
/*      */       else {
/*  600 */         bb.setDx(-15.0D);
/*      */       }
/*      */ 
/*  603 */       bb.moveAndDraw(win);
/*  604 */       win.drawImage(this.laser, null, bb.x - 10, bb.y - 19);
/*      */     }
/*      */   }
/*      */ 
/*  608 */   public void SpawnMon() { if ((this.l1) && (!this.l2) && (!this.l3)) {
/*  609 */       if ((this.mTimer > this.mDelay) && (!this.idk)) {
/*  610 */         this.mon.add(new Monsters());
/*  611 */         ((Monsters)this.mon.get(this.mon.size() - 1)).setLocation(100, (int)(Math.random() * 20.0D + 80.0D));
/*  612 */         ((Monsters)this.mon.get(this.mon.size() - 1)).setColor(new Color(255, 255, 255, 0));
/*  613 */         this.mon1.add(new Monsters());
/*  614 */         ((Monsters)this.mon1.get(this.mon1.size() - 1)).setLocation(100, (int)(Math.random() * 20.0D + 400.0D));
/*  615 */         ((Monsters)this.mon1.get(this.mon1.size() - 1)).setColor(new Color(255, 255, 255, 0));
/*  616 */         this.mTimer = 0;
/*  617 */         this.stop += 1;
/*      */       }
/*      */ 
/*  620 */       if ((this.stop == 2) && (this.zz <= 100)) {
/*  621 */         this.idk = true;
/*  622 */         this.zz += 1;
/*      */       } else {
/*  624 */         this.idk = false;
/*  625 */         this.zz = 0;
/*      */       }
/*  627 */       if ((this.stop >= 4) || (this.stop < 0)) {
/*  628 */         this.idk = true;
/*      */       }
/*      */ 
/*  631 */       this.mTimer += 1;
/*      */     }
/*      */ 
/*  639 */     if ((this.l2) && (!this.l3))
/*      */     {
/*  641 */       if ((this.mTimer > this.mDelay) && (!this.idk)) {
/*  642 */         this.mon.add(new Monsters());
/*  643 */         ((Monsters)this.mon.get(this.mon.size() - 1)).setLocation(100, (int)(Math.random() * 20.0D + 80.0D));
/*  644 */         ((Monsters)this.mon.get(this.mon.size() - 1)).setColor(new Color(255, 255, 255, 0));
/*  645 */         this.mon1.add(new Monsters());
/*  646 */         ((Monsters)this.mon1.get(this.mon1.size() - 1)).setLocation(100, (int)(Math.random() * 20.0D + 400.0D));
/*  647 */         ((Monsters)this.mon1.get(this.mon1.size() - 1)).setColor(new Color(255, 255, 255, 0));
/*  648 */         this.mTimer = 0;
/*  649 */         this.stop1 += 1;
/*      */       }
/*      */ 
/*  652 */       if ((this.stop1 == 2) && (this.xx <= 120)) {
/*  653 */         this.idk = true;
/*  654 */         this.xx += 1;
/*      */       } else {
/*  656 */         this.idk = false;
/*  657 */         this.xx = 0;
/*      */       }
/*  659 */       if (this.stop1 >= 4) {
/*  660 */         this.idk = true;
/*      */       }
/*  662 */       this.mTimer += 1;
/*  663 */       if ((this.m2Timer > this.m2Delay) && (!this.idk2)) {
/*  664 */         this.mon2.add(new Monsters());
/*  665 */         ((Monsters)this.mon2.get(this.mon2.size() - 1)).setLocation(100, (int)(Math.random() * 20.0D + 290.0D));
/*  666 */         ((Monsters)this.mon2.get(this.mon2.size() - 1)).setColor(new Color(255, 255, 255, 0));
/*  667 */         ((Monsters)this.mon2.get(this.mon2.size() - 1)).sethealth(4);
/*      */ 
/*  669 */         this.mon3.add(new Monsters());
/*  670 */         ((Monsters)this.mon3.get(this.mon3.size() - 1)).setLocation((int)(Math.random() * 20.0D + 290.0D), 500);
/*  671 */         ((Monsters)this.mon3.get(this.mon3.size() - 1)).setColor(new Color(255, 255, 255, 0));
/*  672 */         ((Monsters)this.mon3.get(this.mon3.size() - 1)).sethealth(4);
/*      */ 
/*  674 */         this.m2Timer = 0;
/*  675 */         this.stop2 += 1;
/*      */       }
/*  677 */       if ((this.stop2 == 5) && (this.cc >= 120)) {
/*  678 */         this.idk2 = true;
/*  679 */         this.cc += 1;
/*      */       } else {
/*  681 */         this.idk2 = false;
/*  682 */         this.cc = 0;
/*      */       }
/*  684 */       if (this.stop2 >= 10)
/*  685 */         this.idk2 = true;
/*      */       else {
/*  687 */         this.idk = false;
/*      */       }
/*  689 */       this.m2Timer += 1;
/*      */     }
/*  691 */     if (this.l3) {
/*  692 */       if ((this.mTimer > this.mDelay) && (!this.idk)) {
/*  693 */         this.mon.add(new Monsters());
/*  694 */         ((Monsters)this.mon.get(this.mon.size() - 1)).setLocation(100, (int)(Math.random() * 20.0D + 80.0D));
/*  695 */         ((Monsters)this.mon.get(this.mon.size() - 1)).setColor(new Color(255, 255, 255, 0));
/*  696 */         this.mon1.add(new Monsters());
/*  697 */         ((Monsters)this.mon1.get(this.mon1.size() - 1)).setLocation(100, (int)(Math.random() * 20.0D + 400.0D));
/*  698 */         ((Monsters)this.mon1.get(this.mon1.size() - 1)).setColor(new Color(255, 255, 255, 0));
/*  699 */         this.mTimer = 0;
/*  700 */         this.stop3 += 1;
/*      */       }
/*      */ 
/*  703 */       if ((this.stop3 == 2) && (this.xx <= 120)) {
/*  704 */         this.idk = true;
/*  705 */         this.xx += 1;
/*      */       } else {
/*  707 */         this.idk = false;
/*  708 */         this.xx = 0;
/*      */       }
/*  710 */       if (this.stop3 >= 4) {
/*  711 */         this.idk = true;
/*      */       }
/*  713 */       this.mTimer += 1;
/*  714 */       if ((this.m2Timer > this.m2Delay) && (!this.idk2)) {
/*  715 */         this.mon2.add(new Monsters());
/*  716 */         ((Monsters)this.mon2.get(this.mon2.size() - 1)).setLocation(100, (int)(Math.random() * 20.0D + 290.0D));
/*  717 */         ((Monsters)this.mon2.get(this.mon2.size() - 1)).setColor(new Color(255, 255, 255, 0));
/*  718 */         ((Monsters)this.mon2.get(this.mon2.size() - 1)).sethealth(4);
/*      */ 
/*  720 */         this.mon3.add(new Monsters());
/*  721 */         ((Monsters)this.mon3.get(this.mon3.size() - 1)).setLocation((int)(Math.random() * 20.0D + 290.0D), 500);
/*  722 */         ((Monsters)this.mon3.get(this.mon3.size() - 1)).setColor(new Color(255, 255, 255, 0));
/*  723 */         ((Monsters)this.mon3.get(this.mon3.size() - 1)).sethealth(4);
/*      */ 
/*  725 */         this.m2Timer = 0;
/*  726 */         this.stop4 += 1;
/*      */       }
/*  728 */       if ((this.stop4 == 5) && (this.cc >= 130)) {
/*  729 */         this.idk2 = true;
/*  730 */         this.cc += 1;
/*      */       } else {
/*  732 */         this.idk2 = false;
/*  733 */         this.cc = 0;
/*      */       }
/*  735 */       if (this.stop4 >= 10)
/*  736 */         this.idk2 = true;
/*      */       else {
/*  738 */         this.idk = false;
/*      */       }
/*  740 */       this.m2Timer += 1;
/*  741 */       if ((this.m3Timer > this.m3Delay) && (!this.idk3)) {
/*  742 */         this.mon4.add(new Monsters());
/*  743 */         ((Monsters)this.mon4.get(this.mon4.size() - 1)).setLocation(100, (int)(Math.random() * 400.0D + 50.0D));
/*  744 */         ((Monsters)this.mon4.get(this.mon4.size() - 1)).setColor(new Color(255, 255, 255, 0));
/*  745 */         ((Monsters)this.mon4.get(this.mon4.size() - 1)).sethealth(2);
/*      */ 
/*  747 */         this.mon5.add(new Monsters());
/*  748 */         ((Monsters)this.mon5.get(this.mon5.size() - 1)).setLocation(100, (int)(Math.random() * 400.0D + 50.0D));
/*  749 */         ((Monsters)this.mon5.get(this.mon5.size() - 1)).setColor(new Color(255, 255, 255, 0));
/*  750 */         ((Monsters)this.mon5.get(this.mon5.size() - 1)).sethealth(2);
/*      */ 
/*  752 */         this.m3Timer = 0;
/*  753 */         this.stop5 += 1;
/*      */       }
/*  755 */       if ((this.stop5 == 3) && (this.vv <= 130)) {
/*  756 */         this.idk3 = true;
/*  757 */         this.vv += 1;
/*      */       } else {
/*  759 */         this.idk3 = false;
/*  760 */         this.vv = 0;
/*      */       }
/*  762 */       if (this.stop5 >= 7)
/*  763 */         this.idk3 = true;
/*      */       else {
/*  765 */         this.idk = false;
/*      */       }
/*  767 */       this.m3Timer += 1;
/*      */     }
/*      */   }
/*      */ 
/*      */   public void MADmon(Graphics2D win)
/*      */   {
/*  780 */     for (int i = 0; i < this.mon.size(); i++) {
/*  781 */       Monsters mm = (Monsters)this.mon.get(i);
/*  782 */       for (int j = 0; j < this.bull.size(); j++) {
/*  783 */         if (mm.intersects((Rectangle)this.bull.get(j))) {
/*  784 */           mm.sethealth(mm.gethealth() - 1);
/*  785 */           this.bull.remove(j);
/*  786 */           this.n -= 1;
/*      */         }
/*      */       }
/*      */ 
/*  790 */       if ((mm.x > 350) && (mm.getDy() != -2.0D))
/*      */       {
/*  792 */         mm.setDy(4.0D);
/*  793 */         if (mm.x > 450) {
/*  794 */           mm.setDx(0.0D);
/*      */         }
/*      */ 
/*  797 */         if (mm.y > 400)
/*  798 */           mm.setDx(5.0D);
/*      */       }
/*  800 */       if ((mm.x > 700) && (mm.getDx() == 0.0D)) {
/*  801 */         mm.setDx(-2.0D);
/*      */       }
/*  803 */       if (mm.y > 600) {
/*  804 */         if (mm.getDx() == -2.0D) {
/*  805 */           mm.setDx(5.0D);
/*      */         }
/*  807 */         mm.y = 0;
/*      */       }
/*  809 */       if (mm.x > 980) {
/*  810 */         mm.x = 0;
/*      */       }
/*      */ 
/*  813 */       mm.moveAndDraw(win);
/*  814 */       win.drawImage(this.monster1, null, mm.x - 7, mm.y - 3);
/*  815 */       if ((mm.gethealth() <= 0) && (!this.dead) && (this.lives > 0)) {
/*  816 */         this.split = true;
/*      */       }
/*  818 */       if (this.split) {
/*  819 */         this.mini.add(new Monsters());
/*  820 */         ((Monsters)this.mini.get(this.mini.size() - 1)).setLocation(mm.x, mm.y);
/*      */ 
/*  822 */         ((Monsters)this.mini.get(this.mini.size() - 1)).setWidth(5);
/*  823 */         ((Monsters)this.mini.get(this.mini.size() - 1)).setHeight(5);
/*      */ 
/*  825 */         this.mini.add(new Monsters());
/*  826 */         ((Monsters)this.mini.get(this.mini.size() - 1)).setLocation(mm.x, mm.y);
/*      */ 
/*  828 */         ((Monsters)this.mini.get(this.mini.size() - 1)).setWidth(5);
/*  829 */         ((Monsters)this.mini.get(this.mini.size() - 1)).setHeight(6);
/*      */ 
/*  831 */         this.mini.add(new Monsters());
/*  832 */         ((Monsters)this.mini.get(this.mini.size() - 1)).setLocation(mm.x, mm.y);
/*      */ 
/*  834 */         ((Monsters)this.mini.get(this.mini.size() - 1)).setWidth(6);
/*  835 */         ((Monsters)this.mini.get(this.mini.size() - 1)).setHeight(5);
/*      */ 
/*  837 */         this.mon.remove(i);
/*  838 */         this.kills += 1;
/*  839 */         this.split = false;
/*      */       }
/*      */     }
/*      */ 
/*  843 */     for (int i = 0; i < this.mon1.size(); i++) {
/*  844 */       Monsters mmm = (Monsters)this.mon1.get(i);
/*  845 */       for (int j = 0; j < this.bull.size(); j++) {
/*  846 */         if (mmm.intersects((Rectangle)this.bull.get(j))) {
/*  847 */           mmm.sethealth(mmm.gethealth() - 1);
/*  848 */           this.bull.remove(j);
/*  849 */           this.n -= 1;
/*      */         }
/*      */ 
/*      */       }
/*      */ 
/*  855 */       if ((mmm.x > 350) && (mmm.getDy() != 2.0D)) {
/*  856 */         mmm.setDy(-4.0D);
/*  857 */         if (mmm.x > 450) {
/*  858 */           mmm.setDx(0.0D);
/*      */         }
/*      */ 
/*  861 */         if (mmm.y < 200) {
/*  862 */           mmm.setDx(-5.0D);
/*      */         }
/*      */ 
/*      */       }
/*      */ 
/*  867 */       if (mmm.y < 0) {
/*  868 */         mmm.y = 600;
/*      */       }
/*  870 */       if (mmm.x < 0) {
/*  871 */         mmm.x = 1000;
/*      */       }
/*  873 */       mmm.moveAndDraw(win);
/*  874 */       win.drawImage(this.monster1, null, mmm.x - 7, mmm.y - 3);
/*      */ 
/*  876 */       if ((mmm.gethealth() <= 0) && (!this.dead) && (this.lives > 0)) {
/*  877 */         this.split = true;
/*      */       }
/*  879 */       if (this.split) {
/*  880 */         this.mini.add(new Monsters());
/*  881 */         ((Monsters)this.mini.get(this.mini.size() - 1)).setLocation(mmm.x, mmm.y);
/*      */ 
/*  883 */         ((Monsters)this.mini.get(this.mini.size() - 1)).setWidth(5);
/*  884 */         ((Monsters)this.mini.get(this.mini.size() - 1)).setHeight(5);
/*      */ 
/*  886 */         this.mini.add(new Monsters());
/*  887 */         ((Monsters)this.mini.get(this.mini.size() - 1)).setLocation(mmm.x, mmm.y);
/*      */ 
/*  889 */         ((Monsters)this.mini.get(this.mini.size() - 1)).setWidth(5);
/*  890 */         ((Monsters)this.mini.get(this.mini.size() - 1)).setHeight(6);
/*      */ 
/*  892 */         this.mini.add(new Monsters());
/*  893 */         ((Monsters)this.mini.get(this.mini.size() - 1)).setLocation(mmm.x, mmm.y);
/*      */ 
/*  895 */         ((Monsters)this.mini.get(this.mini.size() - 1)).setWidth(6);
/*  896 */         ((Monsters)this.mini.get(this.mini.size() - 1)).setHeight(5);
/*      */ 
/*  898 */         this.mon1.remove(i);
/*  899 */         this.kills += 1;
/*  900 */         this.split = false;
/*      */       }
/*      */     }
/*      */ 
/*  904 */     for (int i = 0; i < this.mon2.size(); i++) {
/*  905 */       Monsters mmmm = (Monsters)this.mon2.get(i);
/*  906 */       for (int j = 0; j < this.bull.size(); j++) {
/*  907 */         if (mmmm.intersects((Rectangle)this.bull.get(j))) {
/*  908 */           mmmm.sethealth(mmmm.gethealth() - 1);
/*  909 */           this.bull.remove(j);
/*  910 */           this.n -= 1;
/*      */         }
/*      */ 
/*      */       }
/*      */ 
/*  916 */       if ((mmmm.x > 200) && (mmmm.getDy() != 3.0D)) {
/*  917 */         mmmm.setDy(-2.0D);
/*  918 */         if (mmmm.x > 500) {
/*  919 */           mmmm.setDx(0.0D);
/*  920 */           mmmm.setDy(4.0D);
/*      */         }
/*      */ 
/*      */       }
/*      */ 
/*  926 */       if (mmmm.y > 350) {
/*  927 */         mmmm.setDx(-5.0D);
/*      */       }
/*      */ 
/*  931 */       if (mmmm.y < 0) {
/*  932 */         mmmm.y = 600;
/*      */       }
/*  934 */       if (mmmm.y > 600) {
/*  935 */         mmmm.y = 0;
/*      */       }
/*  937 */       if (mmmm.x < 0) {
/*  938 */         mmmm.x = 1000;
/*      */       }
/*  940 */       if (mmmm.x > 990) {
/*  941 */         mmmm.x = 0;
/*      */       }
/*  943 */       mmmm.moveAndDraw(win);
/*  944 */       win.drawImage(this.monster2, null, mmmm.x - 1, mmmm.y - 6);
/*  945 */       if ((mmmm.gethealth() <= 0) && (!this.dead) && (this.lives > 0)) {
/*  946 */         this.split = true;
/*      */       }
/*  948 */       if (this.split) {
/*  949 */         this.mini.add(new Monsters());
/*  950 */         ((Monsters)this.mini.get(this.mini.size() - 1)).setLocation(mmmm.x, mmmm.y);
/*      */ 
/*  952 */         ((Monsters)this.mini.get(this.mini.size() - 1)).setWidth(5);
/*  953 */         ((Monsters)this.mini.get(this.mini.size() - 1)).setHeight(5);
/*      */ 
/*  955 */         this.mini.add(new Monsters());
/*  956 */         ((Monsters)this.mini.get(this.mini.size() - 1)).setLocation(mmmm.x, mmmm.y);
/*      */ 
/*  958 */         ((Monsters)this.mini.get(this.mini.size() - 1)).setWidth(5);
/*  959 */         ((Monsters)this.mini.get(this.mini.size() - 1)).setHeight(6);
/*      */ 
/*  961 */         this.mini.add(new Monsters());
/*  962 */         ((Monsters)this.mini.get(this.mini.size() - 1)).setLocation(mmmm.x, mmmm.y);
/*      */ 
/*  964 */         ((Monsters)this.mini.get(this.mini.size() - 1)).setWidth(6);
/*  965 */         ((Monsters)this.mini.get(this.mini.size() - 1)).setHeight(5);
/*      */ 
/*  967 */         this.mini.add(new Monsters());
/*  968 */         ((Monsters)this.mini.get(this.mini.size() - 1)).setLocation(mmmm.x, mmmm.y);
/*      */ 
/*  970 */         ((Monsters)this.mini.get(this.mini.size() - 1)).setWidth(4);
/*  971 */         ((Monsters)this.mini.get(this.mini.size() - 1)).setHeight(5);
/*      */ 
/*  973 */         this.mini.add(new Monsters());
/*  974 */         ((Monsters)this.mini.get(this.mini.size() - 1)).setLocation(mmmm.x, mmmm.y);
/*      */ 
/*  976 */         ((Monsters)this.mini.get(this.mini.size() - 1)).setWidth(5);
/*  977 */         ((Monsters)this.mini.get(this.mini.size() - 1)).setHeight(4);
/*      */ 
/*  979 */         this.mon2.remove(i);
/*  980 */         this.kills += 1;
/*  981 */         this.split = false;
/*      */       }
/*      */     }
/*  984 */     for (int i = 0; i < this.mon3.size(); i++) {
/*  985 */       Monsters mmmmm = (Monsters)this.mon3.get(i);
/*  986 */       for (int j = 0; j < this.bull.size(); j++) {
/*  987 */         if (mmmmm.intersects((Rectangle)this.bull.get(j))) {
/*  988 */           mmmmm.sethealth(mmmmm.gethealth() - 1);
/*  989 */           this.bull.remove(j);
/*  990 */           this.n -= 1;
/*      */         }
/*      */       }
/*      */ 
/*  994 */       if (mmmmm.x < 100)
/*  995 */         mmmmm.setDx(3.0D);
/*      */       else {
/*  997 */         mmmmm.setDx(0.0D);
/*      */       }
/*  999 */       mmmmm.setDy(-4.0D);
/*      */ 
/* 1001 */       if (mmmmm.y <= 370) {
/* 1002 */         mmmmm.setDx(-4.0D);
/* 1003 */         mmmmm.setDy(-3.0D);
/*      */       }
/* 1005 */       if (mmmmm.x <= 180) {
/* 1006 */         mmmmm.setDx(0.0D);
/* 1007 */         mmmmm.setDy(-3.0D);
/*      */       }
/*      */ 
/* 1013 */       if (mmmmm.y < 100) {
/* 1014 */         mmmmm.setDx(4.0D);
/* 1015 */         mmmmm.setDy(-2.0D);
/*      */       }
/*      */ 
/* 1022 */       if (mmmmm.y < 0) {
/* 1023 */         mmmmm.y = 600;
/*      */       }
/* 1025 */       if (mmmmm.x < 0) {
/* 1026 */         mmmmm.x = 1000;
/*      */       }
/* 1028 */       if (mmmmm.x > 990) {
/* 1029 */         mmmmm.x = 0;
/*      */       }
/* 1031 */       if (mmmmm.y > 600) {
/* 1032 */         mmmmm.y = 0;
/*      */       }
/* 1034 */       mmmmm.moveAndDraw(win);
/* 1035 */       win.drawImage(this.monster2, null, mmmmm.x - 1, mmmmm.y - 6);
/* 1036 */       if ((mmmmm.gethealth() <= 0) && (!this.dead) && (this.lives > 0)) {
/* 1037 */         this.split = true;
/*      */       }
/* 1039 */       if (this.split) {
/* 1040 */         this.mini.add(new Monsters());
/* 1041 */         ((Monsters)this.mini.get(this.mini.size() - 1)).setLocation(mmmmm.x, mmmmm.y);
/*      */ 
/* 1043 */         ((Monsters)this.mini.get(this.mini.size() - 1)).setWidth(5);
/* 1044 */         ((Monsters)this.mini.get(this.mini.size() - 1)).setHeight(5);
/*      */ 
/* 1046 */         this.mini.add(new Monsters());
/* 1047 */         ((Monsters)this.mini.get(this.mini.size() - 1)).setLocation(mmmmm.x, mmmmm.y);
/*      */ 
/* 1049 */         ((Monsters)this.mini.get(this.mini.size() - 1)).setWidth(5);
/* 1050 */         ((Monsters)this.mini.get(this.mini.size() - 1)).setHeight(6);
/*      */ 
/* 1052 */         this.mini.add(new Monsters());
/* 1053 */         ((Monsters)this.mini.get(this.mini.size() - 1)).setLocation(mmmmm.x, mmmmm.y);
/*      */ 
/* 1055 */         ((Monsters)this.mini.get(this.mini.size() - 1)).setWidth(6);
/* 1056 */         ((Monsters)this.mini.get(this.mini.size() - 1)).setHeight(5);
/*      */ 
/* 1058 */         this.mini.add(new Monsters());
/* 1059 */         ((Monsters)this.mini.get(this.mini.size() - 1)).setLocation(mmmmm.x, mmmmm.y);
/*      */ 
/* 1061 */         ((Monsters)this.mini.get(this.mini.size() - 1)).setWidth(4);
/* 1062 */         ((Monsters)this.mini.get(this.mini.size() - 1)).setHeight(5);
/*      */ 
/* 1064 */         this.mini.add(new Monsters());
/* 1065 */         ((Monsters)this.mini.get(this.mini.size() - 1)).setLocation(mmmmm.x, mmmmm.y);
/*      */ 
/* 1067 */         ((Monsters)this.mini.get(this.mini.size() - 1)).setWidth(4);
/* 1068 */         ((Monsters)this.mini.get(this.mini.size() - 1)).setHeight(4);
/*      */ 
/* 1070 */         this.mon3.remove(i);
/* 1071 */         this.kills += 1;
/* 1072 */         this.split = false;
/*      */       }
/*      */     }
/* 1075 */     for (int i = 0; i < this.mon4.size(); i++) {
/* 1076 */       Monsters mp = (Monsters)this.mon4.get(i);
/* 1077 */       for (int j = 0; j < this.bull.size(); j++) {
/* 1078 */         if (mp.intersects((Rectangle)this.bull.get(j))) {
/* 1079 */           mp.sethealth(mp.gethealth() - 1);
/* 1080 */           this.bull.remove(j);
/* 1081 */           this.n -= 1;
/*      */         }
/*      */       }
/*      */ 
/* 1085 */       mp.setDx(3.0D);
/* 1086 */       if (mp.x > 200) {
/* 1087 */         mp.setDy(3.0D);
/*      */       }
/* 1089 */       if (mp.x > 400) {
/* 1090 */         mp.setDy(-5.0D);
/*      */       }
/*      */ 
/* 1093 */       if (mp.x > 450) {
/* 1094 */         mp.setDy(5.0D);
/*      */       }
/* 1096 */       if (mp.x > 525) {
/* 1097 */         mp.setDy(-2.0D);
/*      */       }
/* 1099 */       if (mp.x > 700)
/*      */       {
/* 1101 */         mp.setDy(1.0D);
/*      */       }
/* 1103 */       if (mp.x > 800) {
/* 1104 */         if (mp.y > 300) {
/* 1105 */           mp.setDy(5.0D);
/* 1106 */           mp.setDx(0.0D);
/*      */         } else {
/* 1108 */           mp.setDy(-5.0D);
/* 1109 */           mp.setDx(0.0D);
/*      */         }
/*      */       }
/* 1112 */       if (mp.y <= 0) {
/* 1113 */         mp.x = 0;
/* 1114 */         mp.y = ((int)(Math.random() * 400.0D) + 100);
/*      */       }
/* 1116 */       if (mp.y >= 600) {
/* 1117 */         mp.x = 0;
/* 1118 */         mp.y = ((int)(Math.random() * 400.0D) + 100);
/*      */       }
/*      */ 
/* 1121 */       mp.moveAndDraw(win);
/* 1122 */       win.drawImage(this.monster3, null, mp.x - 4, mp.y - 5);
/* 1123 */       if ((mp.gethealth() <= 0) && (!this.dead) && (this.lives > 0)) {
/* 1124 */         this.split = true;
/*      */       }
/* 1126 */       if (this.split) {
/* 1127 */         this.mini.add(new Monsters());
/* 1128 */         ((Monsters)this.mini.get(this.mini.size() - 1)).setLocation(mp.x, mp.y);
/*      */ 
/* 1130 */         ((Monsters)this.mini.get(this.mini.size() - 1)).setWidth(5);
/* 1131 */         ((Monsters)this.mini.get(this.mini.size() - 1)).setHeight(5);
/*      */ 
/* 1133 */         this.mini.add(new Monsters());
/* 1134 */         ((Monsters)this.mini.get(this.mini.size() - 1)).setLocation(mp.x, mp.y);
/*      */ 
/* 1136 */         ((Monsters)this.mini.get(this.mini.size() - 1)).setWidth(5);
/* 1137 */         ((Monsters)this.mini.get(this.mini.size() - 1)).setHeight(6);
/*      */ 
/* 1139 */         this.mini.add(new Monsters());
/* 1140 */         ((Monsters)this.mini.get(this.mini.size() - 1)).setLocation(mp.x, mp.y);
/*      */ 
/* 1142 */         ((Monsters)this.mini.get(this.mini.size() - 1)).setWidth(6);
/* 1143 */         ((Monsters)this.mini.get(this.mini.size() - 1)).setHeight(5);
/*      */ 
/* 1145 */         this.mon4.remove(i);
/* 1146 */         this.kills += 1;
/* 1147 */         this.split = false;
/*      */       }
/*      */     }
/* 1150 */     for (int i = 0; i < this.mon5.size(); i++) {
/* 1151 */       Monsters mp = (Monsters)this.mon5.get(i);
/* 1152 */       for (int j = 0; j < this.bull.size(); j++) {
/* 1153 */         if (mp.intersects((Rectangle)this.bull.get(j))) {
/* 1154 */           mp.sethealth(mp.gethealth() - 1);
/* 1155 */           this.bull.remove(j);
/* 1156 */           this.n -= 1;
/*      */         }
/*      */       }
/*      */ 
/* 1160 */       mp.setDx(3.0D);
/* 1161 */       if (mp.x > 200) {
/* 1162 */         mp.setDy(3.0D);
/*      */       }
/* 1164 */       if (mp.x > 400) {
/* 1165 */         mp.setDy(-5.0D);
/*      */       }
/*      */ 
/* 1168 */       if (mp.x > 450) {
/* 1169 */         mp.setDy(5.0D);
/*      */       }
/* 1171 */       if (mp.x > 525) {
/* 1172 */         mp.setDy(-2.0D);
/*      */       }
/* 1174 */       if (mp.x > 700)
/*      */       {
/* 1176 */         mp.setDy(1.0D);
/*      */       }
/* 1178 */       if (mp.x > 800) {
/* 1179 */         if (mp.y > 300) {
/* 1180 */           mp.setDy(5.0D);
/* 1181 */           mp.setDx(0.0D);
/*      */         } else {
/* 1183 */           mp.setDy(-5.0D);
/* 1184 */           mp.setDx(0.0D);
/*      */         }
/*      */       }
/* 1187 */       if (mp.y <= 0) {
/* 1188 */         mp.x = 0;
/* 1189 */         mp.y = ((int)(Math.random() * 400.0D) + 100);
/*      */       }
/* 1191 */       if (mp.y >= 600) {
/* 1192 */         mp.x = 0;
/* 1193 */         mp.y = ((int)(Math.random() * 400.0D) + 100);
/*      */       }
/*      */ 
/* 1196 */       mp.moveAndDraw(win);
/* 1197 */       win.drawImage(this.monster3, null, mp.x - 4, mp.y - 5);
/* 1198 */       if ((mp.gethealth() <= 0) && (!this.dead) && (this.lives > 0)) {
/* 1199 */         this.split = true;
/*      */       }
/* 1201 */       if (this.split) {
/* 1202 */         this.mini.add(new Monsters());
/* 1203 */         ((Monsters)this.mini.get(this.mini.size() - 1)).setLocation(mp.x, mp.y);
/*      */ 
/* 1205 */         ((Monsters)this.mini.get(this.mini.size() - 1)).setWidth(5);
/* 1206 */         ((Monsters)this.mini.get(this.mini.size() - 1)).setHeight(5);
/*      */ 
/* 1208 */         this.mini.add(new Monsters());
/* 1209 */         ((Monsters)this.mini.get(this.mini.size() - 1)).setLocation(mp.x, mp.y);
/*      */ 
/* 1211 */         ((Monsters)this.mini.get(this.mini.size() - 1)).setWidth(5);
/* 1212 */         ((Monsters)this.mini.get(this.mini.size() - 1)).setHeight(6);
/*      */ 
/* 1214 */         this.mini.add(new Monsters());
/* 1215 */         ((Monsters)this.mini.get(this.mini.size() - 1)).setLocation(mp.x, mp.y);
/*      */ 
/* 1217 */         ((Monsters)this.mini.get(this.mini.size() - 1)).setWidth(6);
/* 1218 */         ((Monsters)this.mini.get(this.mini.size() - 1)).setHeight(5);
/*      */ 
/* 1220 */         this.mon5.remove(i);
/* 1221 */         this.kills += 1;
/* 1222 */         this.split = false;
/*      */       }
/*      */     }
/*      */   }
/*      */ 
/*      */   public void spawnBon()
/*      */   {
/* 1232 */     if ((this.rTimer > this.rDelay) && (!this.t)) {
/* 1233 */       this.bonus.add(new Monsters());
/* 1234 */       if (((Monsters)this.bonus.get(this.bonus.size() - 1)).y > 550) {
/* 1235 */         ((Monsters)this.bonus.get(this.bonus.size() - 1)).y = 500;
/*      */       }
/* 1237 */       this.rTimer = 0;
/*      */     }
/* 1239 */     this.rTimer += 1;
/*      */   }
/*      */   public void MADBon(Graphics2D win) {
/* 1242 */     for (int i = 0; i < this.bonus.size(); i++) {
/* 1243 */       ((Monsters)this.bonus.get(i)).setDx(2.0D);
/* 1244 */       ((Monsters)this.bonus.get(i)).setColor(new Color(255, 255, 255, 0));
/* 1245 */       ((Monsters)this.bonus.get(i)).moveAndDraw(win);
/* 1246 */       win.drawImage(this.c, null, ((Monsters)this.bonus.get(i)).x - 15, ((Monsters)this.bonus.get(i)).y);
/*      */     }
/*      */   }
/*      */ 
/* 1250 */   public void MADmis(Graphics2D win) { for (int i = 0; i < this.missiles.size(); i++) {
/* 1251 */       ((Monsters)this.missiles.get(i)).setDx(3.0D);
/* 1252 */       ((Monsters)this.missiles.get(i)).setDy(-2.0D);
/* 1253 */       ((Monsters)this.missiles.get(i)).moveAndDraw(win);
/*      */     } }
/*      */ 
/*      */   public void MADsplit(Graphics2D win) {
/* 1257 */     for (int i = 0; i < this.mini.size(); i++) {
/* 1258 */       ((Monsters)this.mini.get(i)).setDx(2.0D);
/*      */ 
/* 1265 */       if (((Monsters)this.mini.get(i)).getHeight() == 6.0D) {
/* 1266 */         ((Monsters)this.mini.get(i)).setDy(2.0D);
/*      */       }
/* 1268 */       if (((Monsters)this.mini.get(i)).getWidth() == 6.0D) {
/* 1269 */         ((Monsters)this.mini.get(i)).setDy(-2.0D);
/*      */       }
/* 1271 */       if ((((Monsters)this.mini.get(i)).getHeight() == 5.0D) && (((Monsters)this.mini.get(i)).getWidth() == 5.0D)) {
/* 1272 */         ((Monsters)this.mini.get(i)).setDy(0.0D);
/*      */       }
/* 1274 */       if (((Monsters)this.mini.get(i)).getWidth() == 4.0D) {
/* 1275 */         ((Monsters)this.mini.get(i)).setDy(-4.0D);
/*      */       }
/*      */ 
/* 1278 */       if (((Monsters)this.mini.get(i)).getHeight() == 4.0D) {
/* 1279 */         ((Monsters)this.mini.get(i)).setDy(4.0D);
/*      */       }
/* 1281 */       ((Monsters)this.mini.get(i)).moveAndDraw(win);
/* 1282 */       win.drawImage(this.debris, null, ((Monsters)this.mini.get(i)).x - 6, ((Monsters)this.mini.get(i)).y - 4);
/*      */     }
/*      */   }
/*      */ 
/*      */   public void spawnMB() {
/* 1287 */     if (this.l3) {
/* 1288 */       if (this.m4Timer > this.m4Delay) {
/* 1289 */         for (int i = 0; i < this.mon5.size(); i++) {
/* 1290 */           this.monbul.add(new bullets());
/* 1291 */           ((bullets)this.monbul.get(this.monbul.size() - 1)).x = ((Monsters)this.mon5.get(i)).x;
/* 1292 */           ((bullets)this.monbul.get(this.monbul.size() - 1)).y = ((Monsters)this.mon5.get(i)).y;
/*      */         }
/* 1294 */         for (int i = 0; i < this.mon4.size(); i++) {
/* 1295 */           this.monbul.add(new bullets());
/* 1296 */           ((bullets)this.monbul.get(this.monbul.size() - 1)).x = ((Monsters)this.mon4.get(i)).x;
/* 1297 */           ((bullets)this.monbul.get(this.monbul.size() - 1)).y = ((Monsters)this.mon4.get(i)).y;
/*      */         }
/* 1299 */         this.m4Timer = 0;
/*      */       }
/* 1301 */       this.m4Timer += 1;
/*      */     }
/*      */   }
/*      */ 
/* 1305 */   public void MADmb(Graphics2D win) { for (int i = 0; i < this.monbul.size(); i++) {
/* 1306 */       bullets g = (bullets)this.monbul.get(i);
/* 1307 */       g.setDx(5.0D);
/* 1308 */       g.moveAndDraw(win);
/* 1309 */       win.drawImage(this.Red, null, g.x - 10, g.y - 12);
/*      */     } }
/*      */ 
/*      */   public void playCat() {
/* 1313 */     if (this.china < 1) {
/* 1314 */       this.yikes.loop(0);
/* 1315 */       this.china += 1;
/*      */     }
/*      */   }
/*      */ 
/*      */   public void spawnAuto() {
/* 1320 */     if ((this.l4) && (!this.dead) && (!this.lol)) {
/* 1321 */       if (this.m5Timer >= this.m5Delay) {
/* 1322 */         this.auto.add(new Monsters());
/*      */ 
/* 1325 */         ((Monsters)this.auto.get(this.auto.size() - 1)).setLocation(this.boss.x + 100, this.boss.y + 150);
/* 1326 */         this.m5Timer = 0;
/*      */       }
/*      */ 
/* 1329 */       this.m5Timer += 1;
/*      */     }
/*      */   }
/*      */ 
/* 1333 */   public void MADauto(Graphics2D win) { for (int i = 0; i < this.auto.size(); i++) {
/* 1334 */       Monsters m = (Monsters)this.auto.get(i);
/* 1335 */       if (m.x < this.brian.x) {
/* 1336 */         if (this.brian.x - m.x > 200)
/* 1337 */           m.setDx(6.7D);
/*      */         else {
/* 1339 */           m.setDx(5.0D);
/*      */         }
/*      */       }
/* 1342 */       else if (m.x - this.brian.x > 200)
/* 1343 */         m.setDx(-6.7D);
/*      */       else {
/* 1345 */         m.setDx(-5.0D);
/*      */       }
/*      */ 
/* 1348 */       if (m.y < this.brian.y)
/* 1349 */         m.setDy(5.0D);
/* 1350 */       else if (Math.abs(m.y - this.brian.y) < 120) {
/* 1351 */         if (m.y < this.brian.y)
/* 1352 */           m.setDy(3.0D);
/*      */         else
/* 1354 */           m.setDy(-3.0D);
/*      */       }
/*      */       else {
/* 1357 */         m.setDy(-5.0D);
/*      */       }
/* 1359 */       m.moveAndDraw(win);
/* 1360 */       m.settimer(m.gettimer() + 1);
/* 1361 */       if (m.gettimer() >= 150) {
/* 1362 */         this.auto.remove(i);
/*      */       }
/* 1364 */       win.drawImage(this.fire, null, m.x - 38, m.y - 15);
/*      */     }
/*      */   }
/*      */ }

