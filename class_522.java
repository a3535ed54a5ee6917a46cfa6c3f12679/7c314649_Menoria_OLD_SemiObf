import java.util.List;

// $FF: renamed from: bx
public class class_522 extends adb {

   // $FF: renamed from: n java.lang.String
   private static final String field_2359 = "CL_00001774";


   // $FF: renamed from: <init> () void
   public void method_2917() {
      super.method_2917();
      this.field_2333 = 1;
      this.method_2974(class_872.field_4247);
   }

   // $FF: renamed from: a (add, ahb, yz) add
   public add method_2928(add var1, ahb var2, class_792 var3) {
      float var5 = 1.0F;
      String[] var10000 = class_752.method_4253();
      float var6 = var3.field_3003 + (var3.field_3001 - var3.field_3003) * var5;
      float var7 = var3.field_3002 + (var3.field_3000 - var3.field_3002) * var5;
      double var8 = var3.field_2991 + (var3.field_2994 - var3.field_2991) * (double)var5;
      double var10 = var3.field_2992 + (var3.field_2995 - var3.field_2992) * (double)var5 + 1.62D - (double)var3.field_3013;
      String[] var4 = var10000;
      double var12 = var3.field_2993 + (var3.field_2996 - var3.field_2993) * (double)var5;
      azw var14 = azw.method_5086(var8, var10, var12);
      float var15 = class_1715.method_9556(-var7 * 0.017453292F - 3.1415927F);
      float var16 = class_1715.method_9555(-var7 * 0.017453292F - 3.1415927F);
      float var17 = -class_1715.method_9556(-var6 * 0.017453292F);
      float var18 = class_1715.method_9555(-var6 * 0.017453292F);
      float var19 = var16 * var17;
      float var20 = var15 * var17;
      double var21 = 5.0D;
      azw var23 = var14.method_5093((double)var19 * var21, (double)var18 * var21, (double)var20 * var21);
      azu var24 = var2.method_2080(var14, var23, true);
      if(var24 == null) {
         return var1;
      } else {
         azw var25 = var3.method_4240(var5);
         boolean var26 = false;
         float var27 = 1.0F;
         List var28 = var2.method_2155(var3, var3.field_3004.method_7096(var25.field_4220 * var21, var25.field_4221 * var21, var25.field_4222 * var21).method_7097((double)var27, (double)var27, (double)var27));
         int var29 = 0;

         boolean var33;
         while(true) {
            if(var29 < var28.size()) {
               class_689 var30 = (class_689)var28.get(var29);
               if(var4 != null) {
                  label74: {
                     var33 = var30.method_3897();
                     if(var4 == null) {
                        break;
                     }

                     if(var33) {
                        float var31 = var30.method_3927();
                        class_1343 var32 = var30.field_3004.method_7097((double)var31, (double)var31, (double)var31);
                        if(var4 == null) {
                           break label74;
                        }

                        if(var32.method_7105(var14)) {
                           var26 = true;
                        }
                     }

                     ++var29;
                  }
               }

               if(var4 != null) {
                  continue;
               }
            }

            var33 = var26;
            break;
         }

         if(var33) {
            return var1;
         } else {
            azu var34 = var24;
            if(var4 != null) {
               if(var24.field_4212 != class_100.field_85) {
                  return var1;
               }

               var29 = var24.field_4213;
               var34 = var24;
            }

            int var36 = var34.field_4214;
            int var37 = var24.field_4215;
            if(var2.getBlock(var29, var36, var37) == class_1192.field_6104) {
               --var36;
            }

            class_701 var35 = new class_701;
            var35.method_4043(var2, (double)((float)var29 + 0.5F), (double)((float)var36 + 1.0F), (double)((float)var37 + 0.5F));
            class_701 var38 = var35;
            var38.field_3000 = (float)(((class_1715.method_9561((double)(var3.field_3000 * 4.0F / 360.0F) + 0.5D) & 3) - 1) * 90);
            var33 = var2.method_2096(var38, var38.field_3004.method_7097(-0.1D, -0.1D, -0.1D)).isEmpty();
            if(var4 != null) {
               if(!var33) {
                  return var1;
               }

               var33 = var2.field_1832;
            }

            if(var4 != null) {
               if(!var33) {
                  var2.method_2089(var38);
               }

               var33 = var3.field_3640.field_2839;
            }

            if(!var33) {
               --var1.field_2958;
            }

            return var1;
         }
      }
   }

   // $FF: renamed from: <clinit> () void
   static void method_2981() {
      boolean var10000 = true;
      char[] var10003 = "/æÙÓfT".toCharArray();
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
            field_2359 = (new String((char[])var4)).intern();
            String var2 = field_2359;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 152;
            break;
         case 1:
            var10009 = 172;
            break;
         case 2:
            var10009 = 118;
            break;
         case 3:
            var10009 = 114;
            break;
         case 4:
            var10009 = 38;
            break;
         case 5:
            var10009 = 44;
            break;
         default:
            var10009 = 238;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}
