package ca.diiza.f;

import ca.diiza.f.class_209;
import org.lwjgl.opengl.GL11;

// $FF: renamed from: ca.diiza.f.h
public class class_162 extends bcb {

   // $FF: renamed from: b bqx
   bqx field_549;
   // $FF: renamed from: o bqx
   bqx field_550;
   // $FF: renamed from: p int
   int field_551;
   // $FF: renamed from: q int
   int field_552;
   // $FF: renamed from: r int
   int field_553;
   // $FF: renamed from: s int
   int field_554;
   // $FF: renamed from: t java.lang.String[]
   private static final String[] field_555;


   // $FF: renamed from: <init> (int, int, int, int, int, java.lang.String, java.lang.String, java.lang.String) void
   public void method_849(int var1, int var2, int var3, int var4, int var5, String var6, String var7, String var8) {
      super.method_748(var1, var2, var3, var4, var5, var6);
      this.field_551 = this.field_445;
      this.field_552 = this.field_446;
      this.field_553 = this.field_447;
      this.field_554 = this.field_448;
      bqx var10001 = new bqx;
      String[] var9 = field_555;
      var10001.method_8226("minecraft", "textures/gui/menoria/" + var7);
      this.field_549 = var10001;
      var10001 = new bqx;
      var10001.method_8226("minecraft", "textures/gui/menoria/" + var8);
      this.field_550 = var10001;
   }

   // $FF: renamed from: a (bao, int, int) void
   public void method_750(bao var1, int var2, int var3) {
      int var10000;
      int var4;
      label50: {
         label53: {
            var4 = class_209.method_1160();
            var10000 = var2;
            int var10001 = this.field_553;
            if(var4 == 0) {
               if(var2 < this.field_553) {
                  break label53;
               }

               var10000 = var3;
               var10001 = this.field_554;
            }

            if(var4 == 0) {
               if(var10000 < var10001) {
                  break label53;
               }

               var10000 = var2;
               var10001 = this.field_553 + this.field_551;
            }

            if(var4 == 0) {
               if(var10000 >= var10001) {
                  break label53;
               }

               var10000 = var3;
               if(var4 != 0) {
                  break label50;
               }

               var10001 = this.field_554 + this.field_552;
            }

            if(var10000 < var10001) {
               var10000 = 1;
               break label50;
            }
         }

         var10000 = 0;
      }

      label29: {
         int var5 = var10000;
         GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
         GL11.glEnable(3042);
         if(var4 == 0) {
            if(var5 != 0) {
               var1.method_5288().bindTexture(this.field_550);
               this.method_850(this.field_553, this.field_554, 0, 0, this.field_551, this.field_552);
               GL11.glDisable(2896);
               if(var4 == 0) {
                  break label29;
               }
            }

            var1.method_5288().bindTexture(this.field_549);
         }

         this.method_850(this.field_553, this.field_554, 0, 0, this.field_551, this.field_552);
      }

      GL11.glDisable(3042);
   }

   // $FF: renamed from: a (int, int, int, int, int, int) void
   public void method_850(int var1, int var2, int var3, int var4, int var5, int var6) {
      float var7 = 1.0F / (float)var5;
      float var8 = 1.0F / (float)var6;
      bmh var9 = bmh.instance;
      var9.setVisible2();
      var9.addVertexWithUV((double)(var1 + 0), (double)(var2 + var6), (double)this.field_372, (double)((float)(var3 + 0) * var7), (double)((float)(var4 + var6) * var8));
      var9.addVertexWithUV((double)(var1 + var5), (double)(var2 + var6), (double)this.field_372, (double)((float)(var3 + var5) * var7), (double)((float)(var4 + var6) * var8));
      var9.addVertexWithUV((double)(var1 + var5), (double)(var2 + 0), (double)this.field_372, (double)((float)(var3 + var5) * var7), (double)((float)(var4 + 0) * var8));
      var9.addVertexWithUV((double)(var1 + 0), (double)(var2 + 0), (double)this.field_372, (double)((float)(var3 + 0) * var7), (double)((float)(var4 + 0) * var8));
      var9.getVisible8();
   }

   // $FF: renamed from: <clinit> () void
   static void method_759() {
      String[] var5 = new String[2];
      int var3 = 0;
      String var2 = "ì< u)ñà*±u-ª5°(%ë=·fg";
      int var4 = "ì< u)ñà*±u-ª5°(%ë=·fg".length();
      char var1 = 9;
      int var0 = -1;

      while(true) {
         ++var0;
         String var10002 = var2.substring(var0, var0 + var1);
         boolean var10000 = true;
         char[] var10003 = var10002.toCharArray();
         Object var10004 = var10003.length;
         Object var9 = true;
         char[] var8 = var10003;
         char[] var10001 = (char[])var10004;
         int var6 = 0;

         while(true) {
            var10003 = var8;
            var8 = var10001;
            var10001 = var10003;
            char[] var10 = var8;
            var8 = var10003;
            if(var10003 <= var6) {
               var5[var3++] = (new String((char[])var9)).intern();
               if((var0 += var1) >= var4) {
                  field_555 = var5;
                  return;
               }

               var1 = var2.charAt(var0);
               break;
            }

            char var10007 = (char)((Object[])var9)[var6];
            short var10009;
            switch(var6 % 7) {
            case 0:
               var10009 = 211;
               break;
            case 1:
               var10009 = 184;
               break;
            case 2:
               var10009 = 111;
               break;
            case 3:
               var10009 = 248;
               break;
            case 4:
               var10009 = 67;
               break;
            case 5:
               var10009 = 58;
               break;
            default:
               var10009 = 117;
            }

            ((Object[])var9)[var6] = (char)(var10007 ^ var10 ^ var10009);
            ++var6;
         }
      }
   }
}
