import java.util.Collection;
import java.util.Iterator;
import java.util.Random;

// $FF: renamed from: vy
public class class_1725 {

   // $FF: renamed from: a java.lang.String
   private static final String field_9033 = "CL_00001503";


   // $FF: renamed from: <init> () void
   public void method_9635() {
      super();
   }

   // $FF: renamed from: b (java.util.Collection) int
   public static int method_9636(Collection var0) {
      String[] var10000 = class_752.method_4253();
      int var2 = 0;
      String[] var1 = var10000;
      Iterator var4 = var0.iterator();

      int var5;
      while(true) {
         if(var4.hasNext()) {
            class_1650 var3 = (class_1650)var4.next();
            var5 = var2 + var3.field_8596;
            if(var1 == null) {
               break;
            }

            var2 = var5;
            if(var1 != null) {
               continue;
            }
         }

         var5 = var2;
         break;
      }

      return var5;
   }

   // $FF: renamed from: b (java.util.Random, java.util.Collection, int) vz
   public static class_1650 method_9637(Random param0, Collection param1, int param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (java.util.Random, java.util.Collection) vz
   public static class_1650 method_9638(Random var0, Collection var1) {
      return method_9637(var0, var1, method_9636(var1));
   }

   // $FF: renamed from: b (vz[]) int
   public static int method_9639(class_1650[] var0) {
      int var2 = 0;
      String[] var10000 = class_752.method_4253();
      class_1650[] var3 = var0;
      int var4 = var0.length;
      String[] var1 = var10000;
      int var5 = 0;

      int var7;
      while(true) {
         if(var5 < var4) {
            class_1650 var6 = var3[var5];
            var7 = var2 + var6.field_8596;
            if(var1 == null) {
               break;
            }

            var2 = var7;
            ++var5;
            if(var1 != null) {
               continue;
            }
         }

         var7 = var2;
         break;
      }

      return var7;
   }

   // $FF: renamed from: b (java.util.Random, vz[], int) vz
   public static class_1650 method_9640(Random param0, class_1650[] param1, int param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (java.util.Random, vz[]) vz
   public static class_1650 method_9641(Random var0, class_1650[] var1) {
      return method_9640(var0, var1, method_9639(var1));
   }

   // $FF: renamed from: b (java.lang.IllegalArgumentException) java.lang.IllegalArgumentException
   private static IllegalArgumentException method_9642(IllegalArgumentException var0) {
      return var0;
   }

   // $FF: renamed from: <clinit> () void
   static void method_9643() {
      boolean var10000 = true;
      char[] var10003 = "»utöÓúÉüw".toCharArray();
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
            field_9033 = (new String((char[])var4)).intern();
            String var2 = field_9033;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 39;
            break;
         case 1:
            var10009 = 22;
            break;
         case 2:
            var10009 = 245;
            break;
         case 3:
            var10009 = 155;
            break;
         case 4:
            var10009 = 25;
            break;
         case 5:
            var10009 = 60;
            break;
         default:
            var10009 = 21;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}
