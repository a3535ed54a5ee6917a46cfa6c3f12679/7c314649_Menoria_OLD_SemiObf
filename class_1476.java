import java.util.List;

// $FF: renamed from: qK
final class class_1476 extends class_1460 {

   // $FF: renamed from: a java.lang.String
   private static final String field_7751 = "CL_00001767";


   // $FF: renamed from: <init> () void
   void method_7939() {
      super.method_7939();
   }

   // $FF: renamed from: a (qH, add) add
   protected add method_7940(class_48 var1, add var2) {
      class_905 var4 = class_484.method_2849(var1.method_186());
      String[] var10000 = class_752.method_4253();
      int var5 = var1.method_183() + var4.method_5322();
      int var6 = var1.method_184() + var4.method_5323();
      int var7 = var1.method_185() + var4.method_5324();
      String[] var3 = var10000;
      class_1343 var8 = class_1343.method_7093((double)var5, (double)var6, (double)var7, (double)(var5 + 1), (double)(var6 + 1), (double)(var7 + 1));
      ahb var14 = var1.method_182();
      class_1786 var10003 = new class_1786;
      var10003.method_9816(var2);
      List var9 = var14.method_2158(class_752.class, var8, var10003);
      Object var15 = var9;
      if(var3 != null) {
         if(var9.size() <= 0) {
            return super.method_7940(var1, var2);
         }

         var15 = var9.get(0);
      }

      class_752 var10 = (class_752)var15;
      int var16 = var10 instanceof class_792;
      if(var3 != null) {
         var16 = var16 != 0?1:0;
      }

      int var11 = var16;
      int var12 = class_753.method_4279(var2);
      add var13 = var2.method_3754();
      var13.field_2958 = 1;
      var10.method_3935(var12 - var11, var13);
      if(var3 != null) {
         if(var10 instanceof class_753) {
            ((class_753)var10).method_4291(var12, 2.0F);
         }

         --var2.field_2958;
      }

      return var2;
   }

   // $FF: renamed from: <clinit> () void
   static void method_177() {
      boolean var10000 = true;
      char[] var10003 = "±¬UÙjÖ®Ã×<Þ".toCharArray();
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
            field_7751 = (new String((char[])var4)).intern();
            String var2 = field_7751;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 21;
            break;
         case 1:
            var10009 = 7;
            break;
         case 2:
            var10009 = 237;
            break;
         case 3:
            var10009 = 14;
            break;
         case 4:
            var10009 = 189;
            break;
         case 5:
            var10009 = 1;
            break;
         default:
            var10009 = 121;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}
