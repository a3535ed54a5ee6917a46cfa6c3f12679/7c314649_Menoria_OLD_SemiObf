package ca.diiza.f;

import ca.diiza.f.class_209;
import org.lwjgl.opengl.GL11;

// $FF: renamed from: ca.diiza.f.k
public class class_159 extends bcb {

   // $FF: renamed from: b boolean
   private final boolean field_545;
   // $FF: renamed from: o java.lang.String
   private static final String field_546;
   // $FF: renamed from: p bqx
   private bqx field_547;
   // $FF: renamed from: q java.lang.String[]
   private static final String[] field_548;


   // $FF: renamed from: <init> (int, int, int, boolean) void
   public void method_842(int var1, int var2, int var3, boolean var4) {
      super.method_748(var1, var2, var3, 10, 15, "");
      bqx var10001 = new bqx;
      String[] var10003 = field_548;
      var10001.method_8227("textures/gui/container/villager.png");
      this.field_547 = var10001;
      this.field_545 = var4;
   }

   // $FF: renamed from: a (bao, int, int) void
   public void method_750(bao var1, int var2, int var3) {
      int var10000;
      int var4;
      int var5;
      int var6;
      label68: {
         label71: {
            var1.method_5288().bindTexture(this.field_547);
            var10000 = class_209.method_1160();
            GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
            var5 = 2;
            var4 = var10000;
            var6 = 177;
            var10000 = var2;
            int var10001 = this.field_447;
            if(var4 == 0) {
               if(var2 < this.field_447) {
                  break label71;
               }

               var10000 = var3;
               var10001 = this.field_448;
            }

            if(var4 == 0) {
               if(var10000 < var10001) {
                  break label71;
               }

               var10000 = var2;
               var10001 = this.field_447 + this.field_445;
            }

            if(var4 == 0) {
               if(var10000 >= var10001) {
                  break label71;
               }

               var10000 = var3;
               if(var4 != 0) {
                  break label68;
               }

               var10001 = this.field_448 + this.field_446;
            }

            if(var10000 < var10001) {
               var10000 = 1;
               break label68;
            }
         }

         var10000 = 0;
      }

      class_159 var8;
      label73: {
         label74: {
            label75: {
               int var7 = var10000;
               var10000 = this.field_451;
               if(var4 == 0) {
                  if(!this.field_451) {
                     var6 += this.field_445 * 2 + 4;
                     if(var4 == 0) {
                        break label75;
                     }
                  }

                  var10000 = var7;
               }

               if(var4 != 0) {
                  break label74;
               }

               if(var10000 != 0) {
                  var6 += this.field_445 + 2;
               }
            }

            var8 = this;
            if(var4 != 0) {
               break label73;
            }

            var10000 = this.field_545;
         }

         if(var10000 == 0) {
            var5 += this.field_446 + 4;
         }

         var8 = this;
      }

      var8.method_658(this.field_447, this.field_448, var6, var5, 10, 15);
   }

   // $FF: renamed from: e () int
   public int method_843() {
      return this.field_447;
   }

   // $FF: renamed from: f () int
   public int method_844() {
      return this.field_448;
   }

   // $FF: renamed from: g () int
   public int method_845() {
      return this.field_445;
   }

   // $FF: renamed from: h () int
   public int method_846() {
      return this.field_446;
   }

   // $FF: renamed from: <clinit> () void
   static void method_759() {
      String[] var5 = new String[2];
      int var3 = 0;
      String var2 = "QãBºýV©\f^çûJè^¦ýW©\n[¤ùBãMG¦ÿfÊ4Sø©µ^[";
      int var4 = "QãBºýV©\f^çûJè^¦ýW©\n[¤ùBãMG¦ÿfÊ4Sø©µ^[".length();
      char var1 = 35;
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
            char[] var11 = var8;
            var8 = var10003;
            if(var10003 <= var6) {
               var5[var3++] = (new String((char[])var9)).intern();
               if((var0 += var1) >= var4) {
                  field_548 = var5;
                  String[] var10 = field_548;
                  field_546 = "CL_00017358";
                  return;
               }

               var1 = var2.charAt(var0);
               break;
            }

            char var10007 = (char)((Object[])var9)[var6];
            short var10009;
            switch(var6 % 7) {
            case 0:
               var10009 = 7;
               break;
            case 1:
               var10009 = 164;
               break;
            case 2:
               var10009 = 73;
               break;
            case 3:
               var10009 = 65;
               break;
            case 4:
               var10009 = 21;
               break;
            case 5:
               var10009 = 234;
               break;
            default:
               var10009 = 186;
            }

            ((Object[])var9)[var6] = (char)(var10007 ^ var11 ^ var10009);
            ++var6;
         }
      }
   }
}
