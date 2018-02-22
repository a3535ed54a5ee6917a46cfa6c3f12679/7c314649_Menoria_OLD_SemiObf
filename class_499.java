
// $FF: renamed from: aT
class class_499 extends class_492 {

   // $FF: renamed from: g yz
   private class_792 field_2306;
   // $FF: renamed from: h java.lang.String
   private static final String field_2307 = "CL_00001740";


   // $FF: renamed from: <init> (yz, vI, int, int, int) void
   public void method_2896(class_792 var1, class_22 var2, int var3, int var4, int var5) {
      super.method_2869(var2, var3, var4, var5);
      this.field_2306 = var1;
   }

   // $FF: renamed from: b (add) boolean
   public boolean method_2874(add var1) {
      return method_2897(var1);
   }

   // $FF: renamed from: d () int
   public int method_2879() {
      return 1;
   }

   // $FF: renamed from: b (yz, add) void
   public void method_2873(class_792 var1, add var2) {
      String[] var3 = class_752.method_4253();
      if(var3 != null) {
         if(var2.method_3730() == class_1010.field_5230 && var2.method_3745() > 0) {
            this.field_2306.method_4615(class_1600.field_8352, 1);
         }

         super.method_2873(var1, var2);
      }

   }

   // $FF: renamed from: c (add) boolean
   public static boolean method_2897(add var0) {
      boolean var3;
      label35: {
         String[] var1 = class_752.method_4253();
         add var10000 = var0;
         if(var1 != null) {
            if(var0 == null) {
               break label35;
            }

            var10000 = var0;
         }

         label21: {
            adb var2 = var10000.method_3730();
            Object var10001 = class_1010.field_5230;
            if(var1 != null) {
               if(var2 == class_1010.field_5230) {
                  break label21;
               }

               var2 = var0.method_3730();
               var10001 = class_1010.field_5231;
            }

            if(var2 != var10001) {
               break label35;
            }
         }

         var3 = true;
         return var3;
      }

      var3 = false;
      return var3;
   }

   // $FF: renamed from: <clinit> () void
   static void method_2898() {
      boolean var10000 = true;
      char[] var10003 = "_Áv´ú°-º´".toCharArray();
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
            field_2307 = (new String((char[])var4)).intern();
            String var2 = field_2307;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 147;
            break;
         case 1:
            var10009 = 2;
            break;
         case 2:
            var10009 = 166;
            break;
         case 3:
            var10009 = 11;
            break;
         case 4:
            var10009 = 69;
            break;
         case 5:
            var10009 = 51;
            break;
         default:
            var10009 = 15;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}
