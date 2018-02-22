import java.util.Random;

// $FF: renamed from: z_
public class class_1848 implements class_83 {

   // $FF: renamed from: b int
   public int field_9429;
   // $FF: renamed from: c java.lang.String
   private static final String field_9430 = "CL_00001700";


   // $FF: renamed from: <init> () void
   public void method_9992() {
      super();
   }

   // $FF: renamed from: b (java.util.Random) void
   public void method_9993(Random var1) {
      String[] var10000 = class_752.method_4253();
      int var3 = var1.nextInt(5);
      String[] var2 = var10000;
      int var4 = var3;
      byte var10001 = 1;
      if(var2 != null) {
         if(var3 <= 1) {
            this.field_9429 = class_1635.field_8491.field_8526;
            if(var2 != null) {
               return;
            }
         }

         var4 = var3;
         var10001 = 2;
      }

      if(var2 != null) {
         if(var4 <= var10001) {
            this.field_9429 = class_1635.field_8495.field_8526;
            if(var2 != null) {
               return;
            }
         }

         var4 = var3;
         var10001 = 3;
      }

      if(var2 != null) {
         if(var4 <= var10001) {
            this.field_9429 = class_1635.field_8500.field_8526;
            if(var2 != null) {
               return;
            }
         }

         var4 = var3;
         var10001 = 4;
      }

      if(var4 <= var10001) {
         this.field_9429 = class_1635.field_8504.field_8526;
      }

   }

   // $FF: renamed from: <clinit> () void
   static void method_9994() {
      boolean var10000 = true;
      char[] var10003 = "NnÂkîI<hÂ".toCharArray();
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
            field_9430 = (new String((char[])var4)).intern();
            String var2 = field_9430;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 128;
            break;
         case 1:
            var10009 = 175;
            break;
         case 2:
            var10009 = 213;
            break;
         case 3:
            var10009 = 127;
            break;
         case 4:
            var10009 = 214;
            break;
         case 5:
            var10009 = 83;
            break;
         default:
            var10009 = 244;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}
