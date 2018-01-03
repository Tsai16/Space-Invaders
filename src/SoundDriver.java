/*    */ import java.io.IOException;
/*    */ import java.io.PrintStream;

/*    */ import javax.sound.sampled.AudioFormat;
/*    */ import javax.sound.sampled.AudioFormat.Encoding;
/*    */ import javax.sound.sampled.AudioInputStream;
/*    */ import javax.sound.sampled.AudioSystem;
/*    */ import javax.sound.sampled.Clip;
import javax.sound.sampled.DataLine;
/*    */ import javax.sound.sampled.DataLine.Info;
/*    */ import javax.sound.sampled.FloatControl;
/*    */ import javax.sound.sampled.FloatControl.Type;
/*    */ import javax.sound.sampled.LineUnavailableException;
/*    */ import javax.sound.sampled.UnsupportedAudioFileException;
/*    */ 
/*    */ public class SoundDriver
/*    */ {
/*    */   private Clip[] clips;
/*    */   private int[] framePosition;
/*    */   private FloatControl gainControl;
/*    */ 
/*    */   public SoundDriver(String[] aClips)
/*    */   {
/* 24 */     this.clips = new Clip[aClips.length];
/* 25 */     this.framePosition = new int[aClips.length];
/*    */     try {
/* 27 */       AudioFormat format = new AudioFormat(AudioFormat.Encoding.PCM_SIGNED, 
/* 28 */         -1.0F, 
/* 29 */         16, 2, 4, 
/* 30 */         -1.0F, true);
/* 31 */       DataLine.Info info = new DataLine.Info(Clip.class, format);
/* 32 */       for (int i = 0; i < this.clips.length; i++)
/*    */       {
/* 36 */         AudioInputStream soundIn = AudioSystem.getAudioInputStream(getClass().getResource(aClips[i]));
/* 37 */         this.clips[i] = ((Clip)AudioSystem.getLine(info));
/*    */ 
/* 39 */         this.clips[i].open(soundIn);
/* 40 */         this.gainControl = ((FloatControl)this.clips[i].getControl(FloatControl.Type.MASTER_GAIN));
/*    */       }
/*    */     }
/*    */     catch (UnsupportedAudioFileException ex) {
/* 44 */       System.out.println("Unsupported Audio File");
/*    */     } catch (LineUnavailableException ex) {
/* 46 */       System.out.println("Line Unavailable");
/*    */     } catch (IOException ex) {
/* 48 */       System.out.println("IO Error" + ex);
/*    */     }
/*    */   }
/*    */ 
/*    */   public void play(int value) {
/* 53 */     this.clips[value].stop();
/* 54 */     this.clips[value].setFramePosition(0);
/* 55 */     this.clips[value].start();
/*    */   }
/*    */ 
/*    */   public void loop(int value) {
/* 59 */     this.clips[value].stop();
/* 60 */     this.clips[value].setFramePosition(0);
/* 61 */     this.clips[value].loop(-1);
/*    */   }
/*    */ 
/*    */   public void stop(int value) {
/* 65 */     this.clips[value].stop();
/*    */   }
/*    */ 
/*    */   public void pause(int value) {
/* 69 */     this.framePosition[value] = this.clips[value].getFramePosition();
/* 70 */     this.clips[value].stop();
/*    */   }
/*    */ 
/*    */   public void resume(int value) {
/* 74 */     this.clips[value].setFramePosition(this.framePosition[value]);
/* 75 */     this.clips[value].start();
/*    */   }
/*    */ 
/*    */   public boolean isPlaying(int value) {
/* 79 */     return this.clips[value].isRunning();
/*    */   }
/*    */ 
/*    */   public void setVolume(float volume)
/*    */   {
/*    */   }
/*    */ }

