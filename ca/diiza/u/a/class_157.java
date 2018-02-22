package ca.diiza.u.a;

import ca.diiza.u.a.class_207;
import java.text.DecimalFormat;
import org.lwjgl.opengl.GL11;

// $FF: renamed from: ca.diiza.u.a.a
public class class_157 extends bcb {

   // $FF: renamed from: b java.lang.String
   public String field_538;
   // $FF: renamed from: o float
   public float field_539;
   // $FF: renamed from: p float
   public float field_540;
   // $FF: renamed from: q float
   public float field_541;
   // $FF: renamed from: r boolean
   public boolean field_542;
   // $FF: renamed from: s boolean
   public boolean field_543;
   // $FF: renamed from: t java.text.DecimalFormat
   private static DecimalFormat field_544;


   // $FF: renamed from: <init> (int, int, int, int, int, java.lang.String, float, float, float, boolean) void
   public void method_833(int var1, int var2, int var3, int var4, int var5, String var6, float var7, float var8, float var9, boolean var10) {
      super.method_748(var1, var2, var3, var4, var5, var10?var6 + (int)var9:var6 + field_544.format((double)var9));
      this.field_538 = var6;
      this.field_540 = var7;
      this.field_541 = var8;
      this.field_539 = (var9 - var7) / (var8 - var7);
      this.field_543 = var10;
   }

   // $FF: renamed from: d () float
   public float method_834() {
      return (this.field_541 - this.field_540) * this.field_539 + this.field_540;
   }

   // $FF: renamed from: e () int
   public int method_835() {
      return (int)((this.field_541 - this.field_540) * this.field_539 + this.field_540);
   }

   // $FF: renamed from: a (float) float
   protected float method_836(float var1) {
      var1 = 0.01F * (float)Math.round(var1 / 0.01F);
      return var1;
   }

   // $FF: renamed from: f () java.lang.String
   public String method_837() {
      return this.field_543?this.field_538 + this.method_835():this.field_538 + field_544.format((double)this.method_834());
   }

   // $FF: renamed from: g () void
   protected void method_838() {
      this.field_449 = this.method_837();
   }

   // $FF: renamed from: a (boolean) int
   public int method_749(boolean var1) {
      return 0;
   }

   // $FF: renamed from: b (bao, int, int) void
   protected void method_751(bao var1, int var2, int var3) {
      class_157 var5;
      label43: {
         boolean var4 = class_207.method_1147();
         boolean var10000 = this.field_452;
         if(var4) {
            if(!this.field_452) {
               return;
            }

            var5 = this;
            if(!var4) {
               break label43;
            }

            var10000 = this.field_542;
         }

         if(var10000) {
            label45: {
               this.field_539 = this.method_836((float)(var2 - (this.field_447 + 4)) / (float)(this.field_445 - 8));
               float var7;
               int var6 = (var7 = this.field_539 - 0.0F) == 0.0F?0:(var7 < 0.0F?-1:1);
               if(var4) {
                  if(var6 < 0) {
                     this.field_539 = 0.0F;
                  }

                  var5 = this;
                  if(!var4) {
                     break label45;
                  }

                  float var8;
                  var6 = (var8 = this.field_539 - 1.0F) == 0.0F?0:(var8 < 0.0F?-1:1);
               }

               if(var6 > 0) {
                  this.field_539 = 1.0F;
               }

               var5 = this;
            }

            var5.method_838();
         }

         GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
         this.method_658(this.field_447 + (int)(this.field_539 * (float)(this.field_445 - 8)), this.field_448, 0, 66, 4, 20);
         var5 = this;
      }

      var5.method_658(this.field_447 + (int)(this.field_539 * (float)(this.field_445 - 8)) + 4, this.field_448, 196, 66, 4, 20);
   }

   // $FF: renamed from: c (bao, int, int) boolean
   public boolean method_753(bao var1, int var2, int var3) {
      boolean var4 = class_207.method_1146();
      boolean var10000 = super.method_753(var1, var2, var3);
      if(!var4) {
         if(var10000) {
            this.field_539 = this.method_836((float)(var2 - (this.field_447 + 4)) / (float)(this.field_445 - 8));
            float var6;
            int var5 = (var6 = this.field_539 - 0.0F) == 0.0F?0:(var6 < 0.0F?-1:1);
            if(!var4) {
               if(var5 < 0) {
                  this.field_539 = 0.0F;
               }

               float var7;
               var5 = (var7 = this.field_539 - 1.0F) == 0.0F?0:(var7 < 0.0F?-1:1);
            }

            if(!var4) {
               if(var5 > 0) {
                  this.field_539 = 1.0F;
               }

               this.method_838();
               this.field_542 = true;
               var5 = 1;
            }

            return (boolean)var5;
         }

         var10000 = false;
      }

      return var10000;
   }

   // $FF: renamed from: a (int, int) void
   public void method_752(int var1, int var2) {
      this.field_542 = false;
   }

   // $FF: renamed from: <clinit> () void
   static void method_759() {
      boolean var10000 = true;
      char[] var10003 = "_4Ò".toCharArray();
      Object var10004 = var10003.length;
      Object var4 = true;
      char[] var10002 = var10003;
      char[] var10001 = (char[])var10004;
      int var1 = 0;

      while(true) {
         var10003 = var10002;
         var10002 = var10001;
         var10001 = var10003;
         char[] var5 = var10002;
         var10002 = var10003;
         if(var10003 <= var1) {
            String var0 = (new String((char[])var4)).intern();
            field_544 = new DecimalFormat(var0);
            return;
         }

         char var10007 = (char)((Object[])var4)[var1];
         short var10009;
         switch(var1 % 7) {
         case 0:
            var10009 = 176;
            break;
         case 1:
            var10009 = 102;
            break;
         case 2:
            var10009 = 200;
            break;
         case 3:
            var10009 = 46;
            break;
         case 4:
            var10009 = 200;
            break;
         case 5:
            var10009 = 231;
            break;
         default:
            var10009 = 215;
         }

         ((Object[])var4)[var1] = (char)(var10007 ^ var5 ^ var10009);
         ++var1;
      }
   }
}
