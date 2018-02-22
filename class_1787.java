import java.util.Random;

// $FF: renamed from: y9
public class class_1787 {

   // $FF: renamed from: a java.lang.String
   private static final String field_9317 = "CL_00001629";
   // $FF: renamed from: b azw
   private static azw field_9318;


   // $FF: renamed from: <init> () void
   public void method_9817() {
      super();
   }

   // $FF: renamed from: b (wI, int, int) azw
   public static azw method_9818(class_761 var0, int var1, int var2) {
      return method_9821(var0, var1, var2, (azw)null);
   }

   // $FF: renamed from: b (wI, int, int, azw) azw
   public static azw method_9819(class_761 var0, int var1, int var2, azw var3) {
      field_9318.field_4220 = var3.field_4220 - var0.field_2994;
      field_9318.field_4221 = var3.field_4221 - var0.field_2995;
      field_9318.field_4222 = var3.field_4222 - var0.field_2996;
      return method_9821(var0, var1, var2, field_9318);
   }

   // $FF: renamed from: c (wI, int, int, azw) azw
   public static azw method_9820(class_761 var0, int var1, int var2, azw var3) {
      field_9318.field_4220 = var0.field_2994 - var3.field_4220;
      field_9318.field_4221 = var0.field_2995 - var3.field_4221;
      field_9318.field_4222 = var0.field_2996 - var3.field_4222;
      return method_9821(var0, var1, var2, field_9318);
   }

   // $FF: renamed from: d (wI, int, int, azw) azw
   private static azw method_9821(class_761 var0, int var1, int var2, azw var3) {
      String[] var4;
      Random var5;
      byte var6;
      int var7;
      int var8;
      int var9;
      float var10;
      int var11;
      int var19;
      label89: {
         var5 = var0.method_4165();
         var6 = 0;
         var7 = 0;
         var8 = 0;
         var9 = 0;
         var4 = class_752.method_4253();
         var10 = -99999.0F;
         byte var10000 = var0.method_4343();
         if(var4 != null) {
            if(var10000 != 0) {
               double var12 = (double)(var0.method_4340().method_9155(class_1715.method_9561(var0.field_2994), class_1715.method_9561(var0.field_2995), class_1715.method_9561(var0.field_2996)) + 4.0F);
               double var14 = (double)(var0.method_4341() + (float)var1);
               double var22;
               var19 = (var22 = var12 - var14 * var14) == 0.0D?0:(var22 < 0.0D?-1:1);
               if(var4 != null) {
                  var19 = var19 < 0?1:0;
               }

               var11 = var19;
               if(var4 != null) {
                  break label89;
               }
            }

            var10000 = 0;
         }

         var11 = var10000;
      }

      int var17 = 0;

      azw var20;
      while(true) {
         if(var17 < 10) {
            label76: {
               label93: {
                  int var13;
                  int var15;
                  int var18;
                  label74: {
                     var13 = var5.nextInt(2 * var1) - var1;
                     var18 = var5.nextInt(2 * var2) - var2;
                     var15 = var5.nextInt(2 * var1) - var1;
                     if(var4 != null) {
                        var20 = var3;
                        if(var4 == null) {
                           break;
                        }

                        if(var3 != null) {
                           double var23;
                           var19 = (var23 = (double)var13 * var3.field_4220 + (double)var15 * var3.field_4222 - 0.0D) == 0.0D?0:(var23 < 0.0D?-1:1);
                           if(var4 == null) {
                              break label74;
                           }

                           if(var19 < 0) {
                              break label93;
                           }
                        }

                        var13 += class_1715.method_9561(var0.field_2994);
                        var18 += class_1715.method_9561(var0.field_2995);
                        var15 += class_1715.method_9561(var0.field_2996);
                     }

                     var19 = var11;
                  }

                  int var10001;
                  int var10002;
                  int var10003;
                  class_761 var21;
                  label63: {
                     label62: {
                        if(var4 != null) {
                           if(var19 == 0) {
                              break label62;
                           }

                           var21 = var0;
                           var10001 = var13;
                           var10002 = var18;
                           var10003 = var15;
                           if(var4 == null) {
                              break label63;
                           }

                           var19 = var0.method_4338(var13, var18, var15);
                        }

                        if(var19 == 0) {
                           break label93;
                        }
                     }

                     var21 = var0;
                     var10001 = var13;
                     var10002 = var18;
                     var10003 = var15;
                  }

                  float var16 = var21.method_4331(var10001, var10002, var10003);
                  if(var4 == null) {
                     break label76;
                  }

                  if(var16 > var10) {
                     var10 = var16;
                     var7 = var13;
                     var8 = var18;
                     var9 = var15;
                     var6 = 1;
                  }
               }

               ++var17;
            }

            if(var4 != null) {
               continue;
            }
         }

         var19 = var6;
         if(var4 != null) {
            if(var6 == 0) {
               return null;
            }

            var19 = var7;
         }

         var20 = azw.method_5086((double)var19, (double)var8, (double)var9);
         break;
      }

      return var20;
   }

   // $FF: renamed from: <clinit> () void
   static void method_9822() {
      boolean var10000 = true;
      char[] var10003 = "w9ºçCc".toCharArray();
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
            field_9317 = (new String((char[])var4)).intern();
            String var2 = field_9317;
            field_9318 = azw.method_5086(0.0D, 0.0D, 0.0D);
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 181;
            break;
         case 1:
            var10009 = 244;
            break;
         case 2:
            var10009 = 208;
            break;
         case 3:
            var10009 = 52;
            break;
         case 4:
            var10009 = 63;
            break;
         case 5:
            var10009 = 11;
            break;
         default:
            var10009 = 86;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}
