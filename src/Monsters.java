/*    */ import java.awt.Color;
/*    */ 
/*    */ public class Monsters extends GameObject
/*    */ {
/*  4 */   private int health = 2;
/*  5 */   private int time = 0;
/*    */ 
/*    */   public Monsters() {
/*  8 */     super(100, (int)(Math.random() * 570.0D), 25, 25, (int)(Math.random() * 1.0D + 3.0D), 0.0D);
/*  9 */     setColor(new Color(255, 255, 255, 0));
/*    */   }
/*    */   public int gethealth() {
/* 12 */     return this.health;
/*    */   }
/*    */   public void sethealth(int result) {
/* 15 */     this.health = result;
/*    */   }
/*    */   public int gettimer() {
/* 18 */     return this.time;
/*    */   }
/*    */   public void settimer(int result) {
/* 21 */     this.time = result;
/*    */   }
/*    */ }

