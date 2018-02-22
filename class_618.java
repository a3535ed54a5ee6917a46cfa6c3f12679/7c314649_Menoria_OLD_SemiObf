import org.lwjgl.opengl.GL11;

// $FF: renamed from: n_
public class class_618 extends class_614 {

   // $FF: renamed from: a blm
   private blm field_2676;
   // $FF: renamed from: c java.lang.String
   private static final String field_2677 = "CL_00000969";


   // $FF: renamed from: <init> () void
   public void method_3391() {
      super.method_3391();
   }

   // $FF: renamed from: b (gB, double, double, double, float) void
   public void method_3405(class_598 var1, double var2, double var4, double var6, float var8) {
      String[] var10000 = class_752.method_4253();
      aji var10 = var1.method_3187();
      String[] var9 = var10000;
      if(var10.method_2424() != awt.field_4170 && var1.method_3191(var8) < 1.0F) {
         bmh var11;
         label56: {
            var11 = bmh.instance;
            this.method_3393(bpz.field_7757);
            bam.method_5212();
            GL11.glBlendFunc(770, 771);
            GL11.glEnable(3042);
            GL11.glDisable(2884);
            short var12 = bao.method_5270();
            if(var9 != null) {
               if(var12 != 0) {
                  GL11.glShadeModel(7425);
                  if(var9 != null) {
                     break label56;
                  }
               }

               var12 = 7424;
            }

            GL11.glShadeModel(var12);
         }

         label62: {
            int var13;
            label48: {
               var11.setVisible2();
               var11.method_7467((double)((float)var2 - (float)var1.field_2465 + var1.method_3192(var8)), (double)((float)var4 - (float)var1.field_2466 + var1.method_3193(var8)), (double)((float)var6 - (float)var1.field_2467 + var1.method_3194(var8)));
               var11.setVisible6(1.0F, 1.0F, 1.0F);
               if(var10 == class_1192.field_6061) {
                  float var15;
                  var13 = (var15 = var1.method_3191(var8) - 0.5F) == 0.0F?0:(var15 < 0.0F?-1:1);
                  if(var9 == null) {
                     break label48;
                  }

                  if(var13 < 0) {
                     this.field_2676.setCursorPosition5(var10, var1.field_2465, var1.field_2466, var1.field_2467, false);
                     if(var9 != null) {
                        break label62;
                     }
                  }
               }

               var13 = var1.method_3190();
            }

            label39: {
               if(var9 != null) {
                  if(var13 == 0) {
                     break label39;
                  }

                  var13 = var1.method_3188();
               }

               if(var13 == 0) {
                  class_1192.field_6061.method_2676(((class_420)var10).method_2681());
                  blm var14 = this.field_2676;
                  class_418 var10001 = class_1192.field_6061;
                  int var10002 = var1.field_2465;
                  int var10003 = var1.field_2466;
                  int var10004 = var1.field_2467;
                  float var16;
                  int var10005 = (var16 = var1.method_3191(var8) - 0.5F) == 0.0F?0:(var16 < 0.0F?-1:1);
                  if(var9 != null) {
                     var10005 = var10005 < 0?1:0;
                  }

                  var14.setCursorPosition5(var10001, var10002, var10003, var10004, (boolean)var10005);
                  class_1192.field_6061.method_2677();
                  var11.method_7467((double)((float)var2 - (float)var1.field_2465), (double)((float)var4 - (float)var1.field_2466), (double)((float)var6 - (float)var1.field_2467));
                  this.field_2676.setCursorPosition0(var10, var1.field_2465, var1.field_2466, var1.field_2467);
                  if(var9 != null) {
                     break label62;
                  }
               }
            }

            this.field_2676.method_7214(var10, var1.field_2465, var1.field_2466, var1.field_2467);
         }

         var11.method_7467(0.0D, 0.0D, 0.0D);
         var11.getVisible8();
         bam.method_5213();
      }

   }

   // $FF: renamed from: b (ahb) void
   public void method_3395(ahb var1) {
      blm var10001 = new blm;
      var10001.method_7202(var1);
      this.field_2676 = var10001;
   }

   // $FF: renamed from: b (gi, double, double, double, float) void
   public void method_3392(class_580 var1, double var2, double var4, double var6, float var8) {
      this.method_3405((class_598)var1, var2, var4, var6, var8);
   }

   // $FF: renamed from: <clinit> () void
   static void method_3406() {
      boolean var10000 = true;
      char[] var10003 = "Q-Y\nû$DP".toCharArray();
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
            field_2677 = (new String((char[])var4)).intern();
            String var2 = field_2677;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 21;
            break;
         case 1:
            var10009 = 195;
            break;
         case 2:
            var10009 = 172;
            break;
         case 3:
            var10009 = 183;
            break;
         case 4:
            var10009 = 249;
            break;
         case 5:
            var10009 = 228;
            break;
         default:
            var10009 = 107;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}
