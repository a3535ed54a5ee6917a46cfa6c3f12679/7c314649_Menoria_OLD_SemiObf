import java.util.Iterator;
import java.util.List;

// $FF: renamed from: b4
public class class_554 extends adb {

   // $FF: renamed from: n java.lang.String
   private static final String field_2418 = "CL_00000045";


   // $FF: renamed from: <init> () void
   public void method_2917() {
      super.method_2917();
      this.method_2974(class_872.fontRendererInstance1);
   }

   // $FF: renamed from: a (add, yz, ahb, int, int, int, int, float, float, float) boolean
   public boolean method_2926(add var1, class_792 var2, ahb var3, int var4, int var5, int var6, int var7, float var8, float var9, float var10) {
      String[] var10000 = class_752.method_4253();
      aji var12 = var3.getBlock(var4, var5, var6);
      String[] var11 = var10000;
      int var13 = var12.method_2436();
      if(var11 != null) {
         if(var13 == 11) {
            boolean var14 = var3.field_1832;
            if(var11 != null) {
               if(var3.field_1832) {
                  return true;
               }

               getBlock35(var2, var3, var4, var5, var6);
               var14 = true;
            }

            return var14;
         }

         var13 = 0;
      }

      return (boolean)var13;
   }

   // $FF: renamed from: b (yz, ahb, int, int, int) boolean
   public static boolean getBlock35(class_792 var0, ahb var1, int var2, int var3, int var4) {
      boolean var7;
      boolean var14;
      label51: {
         class_750 var6 = class_750.method_4150(var1, var2, var3, var4);
         String[] var5 = class_752.method_4253();
         var7 = false;
         double var8 = 7.0D;
         List var10 = var1.method_2157(class_753.class, class_1343.method_7093((double)var2 - var8, (double)var3 - var8, (double)var4 - var8, (double)var2 + var8, (double)var3 + var8, (double)var4 + var8));
         List var10000 = var10;
         if(var5 != null) {
            if(var10 == null) {
               break label51;
            }

            var10000 = var10;
         }

         Iterator var11 = var10000.iterator();

         while(var11.hasNext()) {
            label39: {
               class_753 var12 = (class_753)var11.next();
               Object var13 = var12;
               if(var5 != null) {
                  var14 = var12.method_4299();
                  if(var5 == null) {
                     return var14;
                  }

                  if(!var14) {
                     break label39;
                  }

                  var13 = var12.method_4300();
               }

               if(var13 == var0) {
                  label26: {
                     class_750 var15 = var6;
                     if(var5 != null) {
                        if(var6 != null) {
                           break label26;
                        }

                        var15 = class_750.method_4149(var1, var2, var3, var4);
                     }

                     var6 = var15;
                  }

                  var12.method_4301(var6, true);
                  var7 = true;
               }
            }

            if(var5 == null) {
               break;
            }
         }
      }

      var14 = var7;
      return var14;
   }

   // $FF: renamed from: <clinit> () void
   static void method_2981() {
      boolean var10000 = true;
      char[] var10003 = "Ð)Ö2QD£wBÓ".toCharArray();
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
            field_2418 = (new String((char[])var4)).intern();
            String var2 = field_2418;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 23;
            break;
         case 1:
            var10009 = 195;
            break;
         case 2:
            var10009 = 242;
            break;
         case 3:
            var10009 = 98;
            break;
         case 4:
            var10009 = 134;
            break;
         case 5:
            var10009 = 229;
            break;
         default:
            var10009 = 240;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}
