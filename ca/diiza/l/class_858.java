package ca.diiza.l;

import ca.diiza.l.class_862;
import ca.diiza.l.class_864;
import ca.diiza.l.i;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.Iterator;
import org.lwjgl.opengl.GL11;

// $FF: renamed from: ca.diiza.l.i
public class class_858 {

   // $FF: renamed from: a java.lang.String
   private static String field_3956;
   // $FF: renamed from: b java.lang.String
   private static String field_3957;
   // $FF: renamed from: c java.util.ArrayList
   private static ArrayList<i> field_3958;
   // $FF: renamed from: d ca.diiza.l.i
   private static class_858 field_3959;
   // $FF: renamed from: e ca.diiza.l.i
   protected static final class_858 field_3960;
   // $FF: renamed from: f ca.diiza.l.i
   protected static final class_858 field_3961;
   // $FF: renamed from: g ca.diiza.l.i
   protected static final class_858 field_3962;
   // $FF: renamed from: h ca.diiza.l.i
   protected static final class_858 field_3963;
   // $FF: renamed from: i ca.diiza.l.i
   protected static final class_858 field_3964;
   // $FF: renamed from: j ca.diiza.l.i
   protected static final class_858 field_3965;
   // $FF: renamed from: k ca.diiza.l.i
   protected static final class_858 field_3966;
   // $FF: renamed from: l ca.diiza.l.i
   protected static final class_858 field_3967;
   // $FF: renamed from: m ca.diiza.l.i
   protected static final class_858 field_3968;
   // $FF: renamed from: n ca.diiza.l.i
   protected static final class_858 field_3969;
   // $FF: renamed from: o ca.diiza.l.i
   protected static final class_858 field_3970;
   // $FF: renamed from: p ca.diiza.l.i
   protected static final class_858 field_3971;
   // $FF: renamed from: q ca.diiza.l.i
   protected static final class_858 field_3972;
   // $FF: renamed from: r ca.diiza.l.i
   protected static final class_858 field_3973;
   // $FF: renamed from: s ca.diiza.l.i
   protected static final class_858 field_3974;
   // $FF: renamed from: t ca.diiza.l.i
   protected static final class_858 field_3975;
   // $FF: renamed from: u ca.diiza.l.i
   protected static final class_858 field_3976;
   // $FF: renamed from: v ca.diiza.l.i
   protected static final class_858 field_3977;
   // $FF: renamed from: w java.lang.String
   private final String field_3978;
   // $FF: renamed from: x boolean
   private final boolean field_3979;
   // $FF: renamed from: y boolean
   private final boolean field_3980;
   // $FF: renamed from: z int
   private int field_3981;


   // $FF: renamed from: a (java.lang.String) void
   protected static void method_4953(String var0) {
      int var1 = class_862.method_5030();
      if(!var0.equals(field_3957)) {
         Iterator var2 = field_3958.iterator();

         while(true) {
            if(var2.hasNext()) {
               class_858 var3 = (class_858)var2.next();
               var3.method_4957();
               if(var1 == 0) {
                  break;
               }

               if(var1 != 0) {
                  continue;
               }
            }

            field_3957 = var0;
            break;
         }
      }

   }

   // $FF: renamed from: <init> (java.lang.String, boolean, boolean) void
   private void method_4954(String var1, boolean var2, boolean var3) {
      super();
      this.field_3978 = var1;
      this.field_3979 = var2;
      this.field_3980 = var3;
      field_3958.add(this);
   }

   // $FF: renamed from: a () int[]
   protected int[] method_4955() {
      BufferedImage var1 = method_4958(this.field_3978);
      int var2 = var1.getWidth();
      int var3 = var1.getHeight();
      int[] var4 = new int[var2 * var3];
      var1.getRGB(0, 0, var2, var3, var4, 0, var2);
      return var4;
   }

   // $FF: renamed from: b () void
   protected void method_4956() {
      int var1 = class_862.method_5031();
      int var10000 = this.field_3981;
      if(var1 == 0) {
         if(this.field_3981 == 0) {
            label43: {
               BufferedImage var2 = method_4958(this.field_3978);
               BufferedImage var6 = var2;
               if(var1 == 0) {
                  if(var2 == null) {
                     this.field_3981 = this == field_3959?-2:-1;
                     if(var1 == 0) {
                        break label43;
                     }
                  }

                  this.field_3981 = GL11.glGenTextures();
                  var6 = var2;
               }

               int var3 = var6.getWidth();
               int var4 = var2.getHeight();
               int[] var5 = new int[var3 * var4];
               var2.getRGB(0, 0, var3, var4, var5, 0, var3);
               class_864.method_5051(var5, var3, var4, this.field_3981, this.field_3979, this.field_3980);
            }
         }

         var10000 = this.field_3981;
      }

      int var10001 = -2;
      if(var1 == 0) {
         if(var10000 == -2) {
            GL11.glBindTexture(3553, 0);
            if(var1 == 0) {
               return;
            }
         }

         var10000 = this.field_3981;
         var10001 = -1;
      }

      if(var1 == 0) {
         if(var10000 == var10001) {
            field_3959.method_4956();
         }

         var10000 = 3553;
         var10001 = this.field_3981;
      }

      GL11.glBindTexture(var10000, var10001);
   }

   // $FF: renamed from: c () void
   protected void method_4957() {
      int var1 = class_862.method_5031();
      class_858 var10000 = this;
      if(var1 == 0) {
         if(this.field_3981 > 0) {
            GL11.glDeleteTextures(this.field_3981);
         }

         var10000 = this;
      }

      var10000.field_3981 = 0;
   }

   // $FF: renamed from: b (java.lang.String) java.awt.image.BufferedImage
   private static BufferedImage method_4958(String var0) {
      int var10000 = class_862.method_5031();
      BufferedImage var2 = method_4959(field_3957 + var0);
      int var1 = var10000;
      BufferedImage var3 = var2;
      if(var1 == 0) {
         var3 = var2 == null?method_4959(field_3956 + var0):var2;
      }

      return var3;
   }

   // $FF: renamed from: c (java.lang.String) java.awt.image.BufferedImage
   private static BufferedImage method_4959(String param0) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: <clinit> () void
   static void method_4960() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (java.lang.Exception) java.lang.Exception
   private static Exception method_4961(Exception var0) {
      return var0;
   }
}
