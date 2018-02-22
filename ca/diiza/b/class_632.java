package ca.diiza.b;

import ca.diiza.b.class_633;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import javax.imageio.ImageIO;
import org.apache.logging.log4j.Logger;

// $FF: renamed from: ca.diiza.b.c
public class class_632 {

   // $FF: renamed from: a boolean
   static boolean field_2755;
   // $FF: renamed from: b java.util.List
   static List<String> field_2756;
   // $FF: renamed from: c org.apache.logging.log4j.Logger
   private static final Logger field_2757;
   // $FF: renamed from: h java.lang.String[]
   private static final String[] field_2758;


   // $FF: renamed from: <init> () void
   public void method_3492() {
      super();
   }

   // $FF: renamed from: a () void
   static void method_3493() {
      boolean var0 = class_633.method_3502();
      if(var0 && field_2756.size() == 0) {
         String[] var1 = field_2758;
         field_2756.add("textures/blocks/gravel.png");
         field_2756.add("textures/blocks/sand.png");
         field_2756.add("textures/blocks/leaves_jungle_opaque.png");
         field_2756.add("textures/blocks/leaves_oak_opaque.png");
         field_2756.add("textures/blocks/cobblestone.png");
         field_2756.add("textures/blocks/stone.png");
         field_2756.add("textures/blocks/obsidian.png");
         field_2756.add("textures/blocks/grass_top.png");
         field_2756.add("textures/blocks/lava.png");
      }

   }

   // $FF: renamed from: a (java.io.InputStream) java.awt.image.BufferedImage
   private static BufferedImage method_3494(InputStream var0) {
      BufferedImage var1 = ImageIO.read(var0);
      var0.close();
      return var1;
   }

   // $FF: renamed from: b () boolean
   public static boolean method_3495() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: a (java.awt.image.BufferedImage) int
   private static int method_3496(BufferedImage var0) {
      int var2 = 0;
      boolean var10000 = class_633.method_3503();
      int var3 = var0.getWidth();
      boolean var1 = var10000;
      int var4 = var0.getHeight();
      int var5 = 0;

      label42:
      while(true) {
         int var9 = var5;
         int var10001 = var3;

         label39:
         while(var9 < var10001) {
            var9 = 0;
            if(var1) {
               return var9;
            }

            int var6 = 0;

            while(var6 < var4) {
               int var7 = var0.getRGB(var5, var6);
               int var8 = var7 >> 24 & 255;
               if(!var1) {
                  var9 = var8;
                  var10001 = 255;
                  if(var1) {
                     continue label39;
                  }

                  if(var8 != 255) {
                     ++var2;
                  }

                  ++var6;
               }

               if(var1) {
                  break;
               }
            }

            ++var5;
            if(!var1) {
               continue label42;
            }
            break;
         }

         var9 = var2;
         return var9;
      }
   }

   // $FF: renamed from: <clinit> () void
   static void method_3497() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (java.io.IOException) java.io.IOException
   private static IOException method_3498(IOException var0) {
      return var0;
   }
}
