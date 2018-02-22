import org.lwjgl.opengl.GL11;

// $FF: renamed from: k0
public class class_152 extends bcb {

   // $FF: renamed from: b float
   private float field_485;
   // $FF: renamed from: p boolean
   public boolean field_486;
   // $FF: renamed from: r P
   private class_101 field_487;
   // $FF: renamed from: s float
   private final float field_488;
   // $FF: renamed from: t float
   private final float field_489;
   // $FF: renamed from: u java.lang.String
   private static final String field_490 = "CL_00000680";


   // $FF: renamed from: <init> (int, int, int, P) void
   public void method_782(int var1, int var2, int var3, class_101 var4) {
      this.method_783(var1, var2, var3, var4, 0.0F, 1.0F);
   }

   // $FF: renamed from: <init> (int, int, int, P, float, float) void
   public void method_783(int var1, int var2, int var3, class_101 var4, float var5, float var6) {
      super.method_748(var1, var2, var3, 150, 20, "");
      this.field_485 = 1.0F;
      this.field_487 = var4;
      this.field_488 = var5;
      this.field_489 = var6;
      bao var7 = bao.method_5273();
      this.field_485 = var4.method_473(var7.canLoseFocus7.method_5352(var4));
      this.field_449 = var7.canLoseFocus7.method_5355(var4);
   }

   // $FF: renamed from: <init> (int, int, int, int, P) void
   public void method_784(int var1, int var2, int var3, int var4, class_101 var5) {
      super.method_748(var2, var3, var4, var1, 20, "");
      this.field_485 = 1.0F;
      this.field_487 = var5;
      this.field_488 = 0.0F;
      this.field_489 = 1.0F;
      bao var6 = bao.method_5273();
      this.field_485 = var5.method_473(var6.canLoseFocus7.method_5352(var5));
      this.field_449 = var6.canLoseFocus7.method_5355(var5);
   }

   // $FF: renamed from: a (boolean) int
   public int method_749(boolean var1) {
      return 0;
   }

   // $FF: renamed from: b (bao, int, int) void
   protected void method_751(bao var1, int var2, int var3) {
      class_152 var6;
      label43: {
         String[] var4 = class_752.method_4253();
         boolean var10000 = this.field_452;
         if(var4 != null) {
            if(!this.field_452) {
               return;
            }

            var6 = this;
            if(var4 == null) {
               break label43;
            }

            var10000 = this.field_486;
         }

         if(var10000) {
            float var8;
            label45: {
               this.field_485 = (float)(var2 - (this.field_447 + 4)) / (float)(this.field_445 - 8);
               float var9;
               int var7 = (var9 = this.field_485 - 0.0F) == 0.0F?0:(var9 < 0.0F?-1:1);
               if(var4 != null) {
                  if(var7 < 0) {
                     this.field_485 = 0.0F;
                  }

                  var8 = this.field_485;
                  if(var4 == null) {
                     break label45;
                  }

                  float var10;
                  var7 = (var10 = this.field_485 - 1.0F) == 0.0F?0:(var10 < 0.0F?-1:1);
               }

               if(var7 > 0) {
                  this.field_485 = 1.0F;
               }

               var8 = this.field_487.method_474(this.field_485);
            }

            float var5 = var8;
            var1.canLoseFocus7.method_5350(this.field_487, var5);
            this.field_485 = this.field_487.method_473(var5);
            this.field_449 = var1.canLoseFocus7.method_5355(this.field_487);
         }

         GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
         this.method_658(this.field_447 + (int)(this.field_485 * (float)(this.field_445 - 8)), this.field_448, 0, 66, 4, 20);
         var6 = this;
      }

      var6.method_658(this.field_447 + (int)(this.field_485 * (float)(this.field_445 - 8)) + 4, this.field_448, 196, 66, 4, 20);
   }

   // $FF: renamed from: c (bao, int, int) boolean
   public boolean method_753(bao var1, int var2, int var3) {
      String[] var4 = class_752.method_4253();
      boolean var10000 = super.method_753(var1, var2, var3);
      if(var4 != null) {
         if(var10000) {
            this.field_485 = (float)(var2 - (this.field_447 + 4)) / (float)(this.field_445 - 8);
            float var6;
            int var5 = (var6 = this.field_485 - 0.0F) == 0.0F?0:(var6 < 0.0F?-1:1);
            if(var4 != null) {
               if(var5 < 0) {
                  this.field_485 = 0.0F;
               }

               float var7;
               var5 = (var7 = this.field_485 - 1.0F) == 0.0F?0:(var7 < 0.0F?-1:1);
            }

            if(var4 != null) {
               if(var5 > 0) {
                  this.field_485 = 1.0F;
               }

               var1.canLoseFocus7.method_5350(this.field_487, this.field_487.method_474(this.field_485));
               this.field_449 = var1.canLoseFocus7.method_5355(this.field_487);
               this.field_486 = true;
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
      this.field_486 = false;
   }

   // $FF: renamed from: <clinit> () void
   static void method_759() {
      boolean var10000 = true;
      char[] var10003 = "ÌÚ Zÿ*y¿ ÇZ".toCharArray();
      Object var10004 = var10003.length;
      Object var4 = true;
      char[] var10002 = var10003;
      char[] var10001 = (char[])var10004;
      int var0 = 0;

      while(true) {
         var10003 = var10002;
         var10002 = var10001;
         var10001 = var10003;
         char[] var5 = var10002;
         var10002 = var10003;
         if(var10003 <= var0) {
            field_490 = (new String((char[])var4)).intern();
            String var2 = field_490;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 49;
            break;
         case 1:
            var10009 = 40;
            break;
         case 2:
            var10009 = 65;
            break;
         case 3:
            var10009 = 212;
            break;
         case 4:
            var10009 = 113;
            break;
         case 5:
            var10009 = 164;
            break;
         default:
            var10009 = 247;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}
