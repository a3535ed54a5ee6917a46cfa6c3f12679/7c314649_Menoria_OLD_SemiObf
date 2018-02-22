import java.util.Iterator;
import java.util.List;

// $FF: renamed from: em
public class class_402 extends class_400 {

   // $FF: renamed from: N L
   private class_97 field_2103;
   // $FF: renamed from: O java.lang.String
   private static final String field_2104 = "CL_00000289";


   // $FF: renamed from: <init> (java.lang.String, awt, L) void
   protected void method_2641(String var1, awt var2, class_97 var3) {
      super.method_2632(var1, var2);
      this.field_2103 = var3;
   }

   // $FF: renamed from: k (int) int
   protected int method_2639(int var1) {
      String[] var2 = class_752.method_4253();
      int var10000 = var1;
      if(var2 != null) {
         var10000 = var1 > 0?1:0;
      }

      return var10000;
   }

   // $FF: renamed from: d (int) int
   protected int method_2638(int var1) {
      String[] var2 = class_752.method_4253();
      int var10000 = var1;
      if(var2 != null) {
         var10000 = var1 == 1?15:0;
      }

      return var10000;
   }

   // $FF: renamed from: h (ahb, int, int, int) int
   protected int method_2637(ahb var1, int var2, int var3, int var4) {
      String[] var10000 = class_752.method_4253();
      List var6 = null;
      String[] var5 = var10000;
      if(this.field_2103 == class_97.field_65) {
         var6 = var1.method_2155((class_689)null, this.method_2635(var2, var3, var4));
      }

      class_97 var9 = this.field_2103;
      class_97 var10001 = class_97.field_66;
      if(var5 != null) {
         if(this.field_2103 == class_97.field_66) {
            var6 = var1.method_2157(class_752.class, this.method_2635(var2, var3, var4));
         }

         var9 = this.field_2103;
         var10001 = class_97.field_67;
      }

      if(var9 == var10001) {
         var6 = var1.method_2157(class_792.class, this.method_2635(var2, var3, var4));
      }

      byte var11;
      label62: {
         List var10 = var6;
         if(var5 != null) {
            if(var6 == null) {
               break label62;
            }

            var10 = var6;
         }

         var11 = var10.isEmpty();
         if(var5 == null) {
            return var11;
         }

         if(var11 == 0) {
            Iterator var7 = var6.iterator();

            while(var7.hasNext()) {
               class_689 var8 = (class_689)var7.next();
               var11 = var8.method_3969();
               if(var5 == null) {
                  return var11;
               }

               if(var5 != null) {
                  if(var11 != 0) {
                     if(var5 == null) {
                        break;
                     }
                     continue;
                  }

                  var11 = 15;
               }

               return var11;
            }
         }
      }

      var11 = 0;
      return var11;
   }

   // $FF: renamed from: <clinit> () void
   static void method_2537() {
      boolean var10000 = true;
      char[] var10003 = "Û¼©5ô¨gÛ".toCharArray();
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
            field_2104 = (new String((char[])var4)).intern();
            String var2 = field_2104;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 203;
            break;
         case 1:
            var10009 = 6;
            break;
         case 2:
            var10009 = 176;
            break;
         case 3:
            var10009 = 109;
            break;
         case 4:
            var10009 = 202;
            break;
         case 5:
            var10009 = 86;
            break;
         default:
            var10009 = 151;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}
