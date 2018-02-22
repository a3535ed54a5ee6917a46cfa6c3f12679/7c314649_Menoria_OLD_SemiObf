package ca.diiza.l;

import ca.diiza.l.a;
import ca.diiza.l.class_862;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.color.ColorSpace;
import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;
import java.awt.image.ComponentColorModel;
import java.awt.image.DataBufferByte;
import java.awt.image.ImageObserver;
import java.awt.image.Raster;
import java.awt.image.WritableRaster;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.lwjgl.opengl.GL11;

// $FF: renamed from: ca.diiza.l.a
public class class_864 extends BufferedImage {

   // $FF: renamed from: a java.nio.ByteBuffer
   private static final ByteBuffer field_4161;
   // $FF: renamed from: b java.util.HashMap
   private static final HashMap<Integer, a> field_4162;
   // $FF: renamed from: c java.util.concurrent.locks.Lock
   private static final Lock field_4163;
   // $FF: renamed from: d byte[]
   public byte[] field_4164;
   // $FF: renamed from: e int
   private int field_4165;
   // $FF: renamed from: f boolean
   private boolean field_4166;
   // $FF: renamed from: g boolean
   private boolean field_4167;
   // $FF: renamed from: h boolean
   private boolean field_4168;


   // $FF: renamed from: <init> (java.awt.image.ColorModel, java.awt.image.WritableRaster, boolean, java.util.Hashtable) void
   private void method_5035(ColorModel var1, WritableRaster var2, boolean var3, Hashtable<?, ?> var4) {
      super(var1, var2, var3, var4);
      this.field_4164 = ((DataBufferByte)var2.getDataBuffer()).getData();
   }

   // $FF: renamed from: a (int, int) ca.diiza.l.a
   public static class_864 method_5036(int var0, int var1) {
      ColorSpace var2 = ColorSpace.getInstance(1000);
      int[] var3 = new int[]{8, 8, 8, 8};
      int[] var4 = new int[]{0, 1, 2, 3};
      ComponentColorModel var5 = new ComponentColorModel(var2, var3, true, false, 3, 0);
      WritableRaster var6 = Raster.createInterleavedRaster(0, var0, var1, var0 * 4, 4, var4, (Point)null);
      class_864 var10000 = new class_864;
      var10000.method_5035(var5, var6, false, (Hashtable)null);
      return var10000;
   }

   // $FF: renamed from: a (java.awt.image.BufferedImage) ca.diiza.l.a
   public static class_864 method_5037(BufferedImage var0) {
      class_864 var1 = method_5036(var0.getWidth(), var0.getHeight());
      Graphics var2 = var1.getGraphics();
      var2.drawImage(var0, 0, 0, (ImageObserver)null);
      var2.dispose();
      return var1;
   }

   // $FF: renamed from: a () int
   public int method_5038() {
      int var10000 = class_862.method_5031();
      field_4163.lock();
      int var1 = var10000;

      int var5;
      try {
         int var3;
         int var4;
         label168: {
            var10000 = this.field_4165;
            int var10002;
            if(var1 == 0) {
               if(this.field_4165 != 0) {
                  GL11.glBindTexture(3553, this.field_4165);
                  var10002 = this.field_4167;
                  if(var1 == 0) {
                     var10002 = this.field_4167?9729:9728;
                  }

                  GL11.glTexParameteri(3553, 10241, var10002);
                  var10002 = this.field_4166;
                  if(var1 == 0) {
                     var10002 = this.field_4166?9729:9728;
                  }

                  GL11.glTexParameteri(3553, 10240, var10002);
                  var10000 = this.field_4168;
                  if(var1 == 0) {
                     var10000 = this.field_4168?10496:10497;
                  }
                  break label168;
               }

               this.field_4165 = GL11.glGenTextures();
               GL11.glBindTexture(3553, this.field_4165);
               var10000 = 3553;
            }

            var10002 = this.field_4167;
            if(var1 == 0) {
               var10002 = this.field_4167?9729:9728;
            }

            GL11.glTexParameteri(var10000, 10241, var10002);
            var10002 = this.field_4166;
            if(var1 == 0) {
               var10002 = this.field_4166?9729:9728;
            }

            GL11.glTexParameteri(3553, 10240, var10002);
            var10000 = this.field_4168;
            if(var1 == 0) {
               var10000 = this.field_4168?10496:10497;
            }

            var4 = var10000;
            GL11.glTexParameteri(3553, 10242, var4);
            GL11.glTexParameteri(3553, 10243, var4);
            field_4161.clear();
            field_4161.put(this.field_4164);
            field_4161.flip();
            GL11.glTexImage2D(3553, 0, 6408, this.getWidth(), this.getHeight(), 0, 6408, 5121, field_4161);
            field_4162.put(Integer.valueOf(this.field_4165), this);
            var3 = this.field_4165;
            int var2 = var3;
            return var2;
         }

         var4 = var10000;
         GL11.glTexParameteri(3553, 10242, var4);
         GL11.glTexParameteri(3553, 10243, var4);
         field_4161.clear();
         field_4161.put(this.field_4164);
         field_4161.flip();
         GL11.glTexSubImage2D(3553, 0, 0, 0, this.getWidth(), this.getHeight(), 6408, 5121, field_4161);
         var3 = this.field_4165;
         var5 = var3;
      } finally {
         field_4163.unlock();
      }

      return var5;
   }

   // $FF: renamed from: b () boolean
   public boolean method_5039() {
      int var10000 = class_862.method_5030();
      field_4163.lock();
      int var1 = var10000;

      int var2;
      try {
         var10000 = this.field_4165;
         if(var1 != 0) {
            if(this.field_4165 != 0) {
               GL11.glBindTexture(3553, this.field_4165);
               boolean var8 = true;
               boolean var4 = var8;
               return var4;
            }

            var10000 = 0;
         }

         var2 = var10000;
      } finally {
         field_4163.unlock();
      }

      return (boolean)var2;
   }

   // $FF: renamed from: c () void
   public void method_5040() {
      int var10000 = class_862.method_5030();
      field_4163.lock();
      int var1 = var10000;
      boolean var4 = false;

      label61: {
         try {
            var4 = true;
            if(var1 == 0) {
               var4 = false;
               return;
            }

            if(this.field_4165 != 0) {
               GL11.glDeleteTextures(this.field_4165);
               this.field_4165 = 0;
               field_4162.remove(Integer.valueOf(this.field_4165));
               var4 = false;
               break label61;
            }

            var4 = false;
         } finally {
            if(var4) {
               field_4163.unlock();
            }
         }

         field_4163.unlock();
         return;
      }

      field_4163.unlock();
   }

   // $FF: renamed from: a (int) void
   public static void method_5041(int var0) {
      int var10000 = class_862.method_5030();
      field_4163.lock();
      int var1 = var10000;
      boolean var5 = false;

      try {
         var5 = true;
         class_864 var2 = (class_864)field_4162.get(Integer.valueOf(var0));
         if(var1 == 0) {
            var5 = false;
            return;
         }

         if(var2 != null) {
            var2.method_5040();
            var5 = false;
         } else {
            var5 = false;
         }
      } finally {
         if(var5) {
            field_4163.unlock();
         }
      }

      field_4163.unlock();
   }

   // $FF: renamed from: a (boolean) void
   public void method_5042(boolean var1) {
      this.field_4166 = var1;
   }

   // $FF: renamed from: b (boolean) void
   public void method_5043(boolean var1) {
      this.field_4167 = var1;
   }

   // $FF: renamed from: d () int
   public int method_5044() {
      return this.field_4165;
   }

   // $FF: renamed from: e () boolean
   public boolean method_5045() {
      return this.field_4166;
   }

   // $FF: renamed from: f () boolean
   public boolean method_5046() {
      return this.field_4167;
   }

   // $FF: renamed from: c (boolean) void
   public void method_5047(boolean var1) {
      this.field_4168 = var1;
   }

   // $FF: renamed from: g () boolean
   public boolean method_5048() {
      return this.field_4168;
   }

   // $FF: renamed from: a (int, int, byte, byte, byte, byte) void
   public void method_5049(int var1, int var2, byte var3, byte var4, byte var5, byte var6) {
      int var7 = (var2 * this.getWidth() + var1) * 4;
      this.field_4164[var7++] = var3;
      this.field_4164[var7++] = var4;
      this.field_4164[var7++] = var5;
      this.field_4164[var7] = var6;
   }

   // $FF: renamed from: a (int, int, byte, byte, byte) void
   public void method_5050(int var1, int var2, byte var3, byte var4, byte var5) {
      int var6 = (var2 * this.getWidth() + var1) * 4;
      this.field_4164[var6++] = var3;
      this.field_4164[var6++] = var4;
      this.field_4164[var6++] = var5;
      this.field_4164[var6] = -1;
   }

   public void setRGB(int var1, int var2, int var3) {
      int var4 = (var2 * this.getWidth() + var1) * 4;
      this.field_4164[var4++] = (byte)(var3 >> 16);
      this.field_4164[var4++] = (byte)(var3 >> 8);
      this.field_4164[var4++] = (byte)(var3 >> 0);
      this.field_4164[var4] = (byte)(var3 >> 24);
   }

   // $FF: renamed from: a (int[], int, int, int, boolean, boolean) void
   public static void method_5051(int[] var0, int var1, int var2, int var3, boolean var4, boolean var5) {
      int var10000 = class_862.method_5030();
      byte[] var7 = new byte[var1 * var2 * 4];
      int var8 = 0;
      int var6 = var10000;
      int var9 = var0.length;
      int var10 = 0;

      while(true) {
         if(var8 < var9) {
            int var11 = var0[var8];
            var7[var10++] = (byte)(var11 >> 16);
            var7[var10++] = (byte)(var11 >> 8);
            var7[var10++] = (byte)(var11 >> 0);
            var7[var10++] = (byte)(var11 >> 24);
            ++var8;
            if(var6 == 0) {
               break;
            }

            if(var6 != 0) {
               continue;
            }
         }

         method_5052(var7, var1, var2, var3, var4, var5);
         break;
      }

   }

   // $FF: renamed from: a (byte[], int, int, int, boolean, boolean) void
   public static void method_5052(byte[] var0, int var1, int var2, int var3, boolean var4, boolean var5) {
      int var10000 = class_862.method_5031();
      GL11.glBindTexture(3553, var3);
      int var6 = var10000;
      int var10002 = var4;
      if(var6 == 0) {
         var10002 = var4 != 0?9729:9728;
      }

      GL11.glTexParameteri(3553, 10241, var10002);
      var10002 = var4;
      if(var6 == 0) {
         var10002 = var4 != 0?9729:9728;
      }

      GL11.glTexParameteri(3553, 10240, var10002);
      var10002 = var5;
      if(var6 == 0) {
         var10002 = var5 != 0?10496:10497;
      }

      GL11.glTexParameteri(3553, 10242, var10002);
      var10002 = var5;
      if(var6 == 0) {
         var10002 = var5 != 0?10496:10497;
      }

      GL11.glTexParameteri(3553, 10243, var10002);
      field_4161.clear();
      field_4161.put(var0);
      field_4161.flip();
      GL11.glTexImage2D(3553, 0, 6408, var1, var2, 0, 6408, 5121, field_4161);
   }

   // $FF: renamed from: <clinit> () void
   static void method_5053() {
      field_4161 = ban.method_5198(262144);
      field_4162 = new HashMap();
      field_4163 = new ReentrantLock();
   }
}
