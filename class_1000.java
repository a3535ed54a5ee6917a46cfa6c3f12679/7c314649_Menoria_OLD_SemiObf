import java.util.List;
import java.util.Random;

// $FF: renamed from: dG
public class class_1000 extends class_985 {

   // $FF: renamed from: aF boolean
   private boolean field_5088;
   // $FF: renamed from: aG java.lang.String
   private static final String field_5089 = "CL_00000175";


   // $FF: renamed from: <init> (int, boolean) void
   public void method_5735(int var1, boolean var2) {
      super.method_5691(var1);
      this.field_5088 = var2;
      if(var2) {
         this.field_5043.field_5444 = 2;
      } else {
         this.field_5043.field_5444 = 50;
      }

      this.field_5043.field_5446 = 25;
      this.field_5043.field_5445 = 4;
      List var10000;
      class_1653 var10001;
      if(!var2) {
         var10000 = this.field_5044;
         var10001 = new class_1653;
         var10001.method_9099(class_778.class, 2, 1, 1);
         var10000.add(var10001);
      }

      var10000 = this.field_5045;
      var10001 = new class_1653;
      var10001.method_9099(class_775.class, 10, 4, 4);
      var10000.add(var10001);
   }

   // $FF: renamed from: b (java.util.Random) hd
   public class_1162 method_5696(Random var1) {
      String[] var2 = class_752.method_4253();
      int var10000 = var1.nextInt(10);
      Object var3;
      if(var2 != null) {
         if(var10000 == 0) {
            var3 = this.field_5052;
            return (class_1162)var3;
         }

         var10000 = var1.nextInt(2);
      }

      if(var2 != null) {
         if(var10000 == 0) {
            var3 = new class_1164;
            ((class_1164)var3).method_6366(3, 0);
            return (class_1162)var3;
         }

         var10000 = this.field_5088;
      }

      label25: {
         if(var2 != null) {
            if(var10000 != 0) {
               break label25;
            }

            var10000 = var1.nextInt(3);
         }

         if(var10000 == 0) {
            var3 = new class_1172;
            ((class_1172)var3).method_6370(false, 10, 20, 3, 3);
            return (class_1162)var3;
         }
      }

      var3 = new class_1163;
      ((class_1163)var3).method_6364(false, 4 + var1.nextInt(7), 3, 3, true);
      return (class_1162)var3;
   }

   // $FF: renamed from: c (java.util.Random) hb
   public class_1151 method_5697(Random var1) {
      class_1177 var10000;
      if(var1.nextInt(4) == 0) {
         var10000 = new class_1177;
         var10000.method_6397(class_1192.field_6058, 2);
      } else {
         var10000 = new class_1177;
         var10000.method_6397(class_1192.field_6058, 1);
      }

      return var10000;
   }

   // $FF: renamed from: b (ahb, java.util.Random, int, int) void
   public void method_5714(ahb var1, Random var2, int var3, int var4) {
      super.method_5714(var1, var2, var3, var4);
      int var6 = var3 + var2.nextInt(16) + 8;
      int var7 = var4 + var2.nextInt(16) + 8;
      int var8 = var2.nextInt(var1.method_2071(var6, var7) * 2);
      String[] var10000 = class_752.method_4253();
      class_1185 var10001 = new class_1185;
      var10001.method_6349();
      var10001.method_6351(var1, var2, var6, var8, var7);
      class_1176 var12 = new class_1176;
      var12.method_6349();
      class_1176 var9 = var12;
      var7 = 0;
      String[] var5 = var10000;

      while(var7 < 50) {
         var8 = var3 + var2.nextInt(16) + 8;
         short var10 = 128;
         int var11 = var4 + var2.nextInt(16) + 8;
         var9.method_6351(var1, var2, var8, var10, var11);
         ++var7;
         if(var5 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: <clinit> () void
   static void method_5726() {
      boolean var10000 = true;
      char[] var10003 = "ý~ÀÈ!À¨Í".toCharArray();
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
            field_5089 = (new String((char[])var4)).intern();
            String var2 = field_5089;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 181;
            break;
         case 1:
            var10009 = 57;
            break;
         case 2:
            var10009 = 148;
            break;
         case 3:
            var10009 = 243;
            break;
         case 4:
            var10009 = 46;
            break;
         case 5:
            var10009 = 26;
            break;
         default:
            var10009 = 251;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}
