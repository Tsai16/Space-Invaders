/*    */ import java.awt.Color;
/*    */ import java.awt.Graphics2D;
/*    */ import java.awt.Rectangle;
/*    */ 
/*    */ public class GameObject extends Rectangle
/*    */ {
/*    */   double dx;
/*    */   double dy;
/*  8 */   int identity = 0;
/*    */   Color c1;
/* 10 */   public static double gravity = 1.0D;
/*    */ 
/* 12 */   public static double uppy = 100.0D;
/*    */ 
/* 14 */   public GameObject() { super(0, 0, 0, 0); this.dx = 0.0D; this.dy = 0.0D; this.c1 = Color.CYAN; }
/*    */ 
/*    */   public GameObject(double dx, double dy) {
/* 17 */     this(); this.dx = dx; this.dy = dy;
/*    */   }
/*    */   public GameObject(int x, int y, int width, int height, double dx, double dy) {
/* 20 */     super(x, y, width, height); this.dx = dx; this.dy = dy;
/*    */   }
/* 22 */   public Color getColor() { return this.c1; } 
/* 23 */   public void setColor(Color col) { this.c1 = col; } 
/* 24 */   public double getDx() { return this.dx; } 
/* 25 */   public void setDx(double value) { this.dx = value; } 
/* 26 */   public double getDy() { return this.dy; } 
/* 27 */   public void setDy(double value) { this.dy = value; } 
/*    */   public void moveAndDraw(Graphics2D win) {
/* 29 */     translate((int)this.dx, (int)this.dy);
/* 30 */     win.setColor(this.c1);
/* 31 */     win.fill(this);
/*    */   }
/*    */ 
/*    */   public void setWidth(int result) {
/* 35 */     this.width = result;
/*    */   }
/*    */   public void setHeight(int result) {
/* 38 */     this.height = result;
/*    */   }
/*    */   public double getHeight() {
/* 41 */     return this.height;
/*    */   }
/*    */ }


