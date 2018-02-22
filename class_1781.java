import java.util.Comparator;

// $FF: renamed from: y6
public class class_1781 implements Comparator {

   // $FF: renamed from: b sa
   private final class_689 field_9294;
   // $FF: renamed from: c java.lang.String
   private static final String field_9295 = "CL_00001622";


   // $FF: renamed from: <init> (sa) void
   public void method_9779(class_689 var1) {
      super();
      this.field_9294 = var1;
   }

   // $FF: renamed from: b (sa, sa) int
   public int method_9780(class_689 var1, class_689 var2) {
      double var4 = this.field_9294.method_3891(var1);
      String[] var10000 = class_752.method_4253();
      double var6 = this.field_9294.method_3891(var2);
      String[] var3 = var10000;
      double var9;
      int var8 = (var9 = var4 - var6) == 0.0D?0:(var9 < 0.0D?-1:1);
      if(var3 != null) {
         if(var8 < 0) {
            var8 = -1;
            return var8;
         }

         double var10;
         var8 = (var10 = var4 - var6) == 0.0D?0:(var10 < 0.0D?-1:1);
      }

      if(var3 != null) {
         var8 = var8 > 0?1:0;
      }

      return var8;
   }

   public int compare(Object var1, Object var2) {
      return this.method_9780((class_689)var1, (class_689)var2);
   }

   // $FF: renamed from: <clinit> () void
   static void method_9781() {
      boolean var10000 = true;
      char[] var10003 = "ÉY_!»óø[".toCharArray();
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
            field_9295 = (new String((char[])var4)).intern();
            String var2 = field_9295;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 93;
            break;
         case 1:
            var10009 = 18;
            break;
         case 2:
            var10009 = 29;
            break;
         case 3:
            var10009 = 190;
            break;
         case 4:
            var10009 = 184;
            break;
         case 5:
            var10009 = 198;
            break;
         default:
            var10009 = 250;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}
