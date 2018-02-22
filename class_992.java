import java.util.List;
import java.util.Random;

// $FF: renamed from: dO
public class class_992 extends class_985 {

   // $FF: renamed from: aF boolean
   protected boolean field_5068;
   // $FF: renamed from: aG java.lang.String
   private static final String field_5069;
   // $FF: renamed from: cb java.lang.String[]
   private static final String[] field_5070;


   // $FF: renamed from: <init> (int) void
   protected void method_5691(int var1) {
      super.method_5691(var1);
      this.method_5693(0.8F, 0.4F);
      this.method_5694(field_4977);
      List var10000 = this.field_5045;
      class_1653 var10001 = new class_1653;
      var10001.method_9099(class_772.class, 5, 2, 6);
      var10000.add(var10001);
      this.field_5043.field_5444 = -999;
      this.field_5043.field_5445 = 4;
      this.field_5043.field_5446 = 10;
   }

   // $FF: renamed from: b (java.util.Random, int, int, int) java.lang.String
   public String method_5698(Random var1, int var2, int var3, int var4) {
      String[] var10000 = class_752.method_4253();
      double var6 = field_5029.method_6900((double)var2 / 200.0D, (double)var4 / 200.0D);
      String[] var5 = var10000;
      double var11;
      int var9 = (var11 = var6 - -0.8D) == 0.0D?0:(var11 < 0.0D?-1:1);
      int var8;
      if(var5 != null) {
         if(var9 < 0) {
            var8 = var1.nextInt(4);
            return class_447.field_2190[4 + var8];
         }

         var9 = var1.nextInt(3);
      }

      if(var5 != null) {
         if(var9 <= 0) {
            return class_447.field_2191[0];
         }

         var9 = var1.nextInt(3);
      }

      var8 = var9;
      var9 = var8;
      String var10;
      if(var5 != null) {
         if(var8 == 0) {
            var10 = class_447.field_2190[0];
            return var10;
         }

         var9 = var8;
      }

      var10 = var9 == 1?class_447.field_2190[3]:class_447.field_2190[8];
      return var10;
   }

   // $FF: renamed from: b (ahb, java.util.Random, int, int) void
   public void method_5714(ahb var1, Random var2, int var3, int var4) {
      String[] var5;
      int var8;
      int var9;
      int var10;
      int var11;
      label52: {
         String[] var10000 = class_752.method_4253();
         double var6 = field_5029.method_6900((double)(var3 + 8) / 200.0D, (double)(var4 + 8) / 200.0D);
         var5 = var10000;
         double var14;
         int var12 = (var14 = var6 - -0.8D) == 0.0D?0:(var14 < 0.0D?-1:1);
         if(var5 != null) {
            if(var12 < 0) {
               this.field_5043.field_5445 = 15;
               this.field_5043.field_5446 = 5;
               if(var5 != null) {
                  break label52;
               }
            }

            this.field_5043.field_5445 = 4;
            this.field_5043.field_5446 = 10;
            field_5030.method_6357(2);
            var12 = 0;
         }

         var8 = var12;

         while(var8 < 7) {
            var9 = var3 + var2.nextInt(16) + 8;
            var10 = var4 + var2.nextInt(16) + 8;
            var11 = var2.nextInt(var1.method_2071(var9, var10) + 32);
            field_5030.method_6351(var1, var2, var9, var11, var10);
            ++var8;
            if(var5 == null) {
               return;
            }

            if(var5 == null) {
               break;
            }
         }
      }

      class_992 var13 = this;
      if(var5 != null) {
         if(this.field_5068) {
            field_5030.method_6357(0);
            var8 = 0;

            while(var8 < 10) {
               var9 = var3 + var2.nextInt(16) + 8;
               var10 = var4 + var2.nextInt(16) + 8;
               var11 = var2.nextInt(var1.method_2071(var9, var10) + 32);
               field_5030.method_6351(var1, var2, var9, var11, var10);
               ++var8;
               if(var5 == null) {
                  return;
               }

               if(var5 == null) {
                  break;
               }
            }
         }

         var13 = this;
      }

      var13.method_5714(var1, var2, var3, var4);
   }

   // $FF: renamed from: l () dz
   protected class_985 method_5720() {
      class_992 var10000 = new class_992;
      var10000.method_5691(this.field_5050 + 128);
      class_992 var1 = var10000;
      String[] var10001 = field_5070;
      var1.method_5700("Sunflower Plains");
      var1.field_5068 = true;
      var1.method_5702(9286496);
      var1.field_5033 = 14273354;
      return var1;
   }

   // $FF: renamed from: <clinit> () void
   static void method_5726() {
      String[] var5 = new String[2];
      int var3 = 0;
      String var2 = "Ã\fÿâíõxBÉìóþyÓF=©J½ª ;Z©";
      int var4 = "Ã\fÿâíõxBÉìóþyÓF=©J½ª ;Z©".length();
      char var1 = 16;
      int var0 = -1;

      while(true) {
         ++var0;
         String var10002 = var2.substring(var0, var0 + var1);
         boolean var10000 = true;
         char[] var10003 = var10002.toCharArray();
         Object var10004 = var10003.length;
         Object var9 = true;
         char[] var8 = var10003;
         char[] var10001 = (char[])var10004;
         int var6 = 0;

         while(true) {
            var10003 = var8;
            var8 = var10001;
            var10001 = var10003;
            char[] var11 = var8;
            var8 = var10003;
            if(var10003 <= var6) {
               var5[var3++] = (new String((char[])var9)).intern();
               if((var0 += var1) >= var4) {
                  field_5070 = var5;
                  String[] var10 = field_5070;
                  field_5069 = "CL_00000180";
                  return;
               }

               var1 = var2.charAt(var0);
               break;
            }

            char var10007 = (char)((Object[])var9)[var6];
            short var10009;
            switch(var6 % 7) {
            case 0:
               var10009 = 187;
               break;
            case 1:
               var10009 = 33;
               break;
            case 2:
               var10009 = 73;
               break;
            case 3:
               var10009 = 178;
               break;
            case 4:
               var10009 = 81;
               break;
            case 5:
               var10009 = 166;
               break;
            default:
               var10009 = 177;
            }

            ((Object[])var9)[var6] = (char)(var10007 ^ var11 ^ var10009);
            ++var6;
         }
      }
   }
}
