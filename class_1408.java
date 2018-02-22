import ca.diiza.t.class_600;

// $FF: renamed from: nU
public class class_1408 {

   // $FF: renamed from: b nU
   public static class_1408 field_7499;
   // $FF: renamed from: c gm
   private class_594 field_7500;
   // $FF: renamed from: d gm
   private class_594 field_7501;
   // $FF: renamed from: e gt
   private class_587 field_7502;
   // $FF: renamed from: f ca.diiza.t.a
   private class_600 field_7503;
   // $FF: renamed from: g java.lang.String
   private static final String field_7504 = "CL_00000946";


   // $FF: renamed from: <init> () void
   public void method_7689() {
      super();
      class_594 var10001 = new class_594;
      var10001.method_3161(0);
      this.field_7500 = var10001;
      var10001 = new class_594;
      var10001.method_3161(1);
      this.field_7501 = var10001;
      class_587 var1 = new class_587;
      var1.getBlock88();
      this.field_7502 = var1;
      class_600 var2 = new class_600;
      var2.method_3197(0);
      this.field_7503 = var2;
   }

   // $FF: renamed from: b (aji, int, float) void
   public void method_7690(aji var1, int var2, float var3) {
      String[] var4 = class_752.method_4253();
      aji var10000 = var1;
      aji var10001 = class_1192.field_6154;
      if(var4 != null) {
         if(var1 == class_1192.field_6154) {
            class_1380.field_7328.method_7533(this.field_7502, 0.0D, 0.0D, 0.0D, 0.0F);
            if(var4 != null) {
               return;
            }
         }

         var10000 = var1;
         var10001 = class_1192.field_6170;
      }

      if(var4 != null) {
         if(var10000 == var10001) {
            class_1380.field_7328.method_7533(this.field_7501, 0.0D, 0.0D, 0.0D, 0.0F);
            if(var4 != null) {
               return;
            }
         }

         var10000 = var1;
         var10001 = class_1192.field_6205;
      }

      if(var10000 == var10001) {
         class_1380.field_7328.method_7533(this.field_7503, 0.0D, 0.0D, 0.0D, 0.0F);
         if(var4 != null) {
            return;
         }
      }

      class_1380.field_7328.method_7533(this.field_7500, 0.0D, 0.0D, 0.0D, 0.0F);
   }

   // $FF: renamed from: <clinit> () void
   static void method_7691() {
      boolean var10000 = true;
      char[] var10003 = "áÚºdIÖ¡¯Ñb".toCharArray();
      Object var10004 = var10003.length;
      Object var5 = true;
      char[] var10002 = var10003;
      char[] var10001 = (char[])var10004;
      int var0 = 0;

      while(true) {
         var10003 = var10002;
         var10002 = var10001;
         var10001 = var10003;
         char[] var6 = var10002;
         var10002 = var10003;
         if(var10003 <= var0) {
            field_7504 = (new String((char[])var5)).intern();
            String var2 = field_7504;
            class_1408 var3 = new class_1408;
            var3.method_7689();
            field_7499 = var3;
            return;
         }

         char var10007 = (char)((Object[])var5)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 129;
            break;
         case 1:
            var10009 = 181;
            break;
         case 2:
            var10009 = 198;
            break;
         case 3:
            var10009 = 119;
            break;
         case 4:
            var10009 = 90;
            break;
         case 5:
            var10009 = 197;
            break;
         default:
            var10009 = 178;
         }

         ((Object[])var5)[var0] = (char)(var10007 ^ var6 ^ var10009);
         ++var0;
      }
   }
}
