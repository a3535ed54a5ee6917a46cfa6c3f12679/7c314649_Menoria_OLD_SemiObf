import java.util.List;
import java.util.Random;

// $FF: renamed from: eE
public class class_454 extends class_446 implements class_27 {

   // $FF: renamed from: N java.lang.String[]
   private static final String[] field_2205;
   // $FF: renamed from: O vL[]
   private class_73[] field_2206;


   // $FF: renamed from: <init> () void
   protected void method_2770() {
      super.method_2427(awt.field_4181);
      float var1 = 0.4F;
      this.method_2443(0.5F - var1, 0.0F, 0.5F - var1, 0.5F + var1, 0.8F, 0.5F + var1);
   }

   // $FF: renamed from: a (int, int) vL
   public class_73 method_2448(int var1, int var2) {
      String[] var3 = class_752.method_4253();
      int var10000 = var2;
      if(var3 != null) {
         if(var2 < this.field_2206.length) {
            return this.field_2206[var2];
         }

         var10000 = 0;
      }

      var2 = var10000;
      return this.field_2206[var2];
   }

   // $FF: renamed from: D () int
   public int method_2493() {
      double var1 = 0.5D;
      double var3 = 1.0D;
      return class_1040.method_5891(var1, var3);
   }

   // $FF: renamed from: j (ahb, int, int, int) boolean
   public boolean method_2505(ahb var1, int var2, int var3, int var4) {
      return this.method_2771(var1.getBlock(var2, var3 - 1, var4));
   }

   // $FF: renamed from: i (int) int
   public int method_2494(int var1) {
      String[] var2 = class_752.method_4253();
      int var10000 = var1;
      if(var2 != null) {
         if(var1 == 0) {
            return 16777215;
         }

         var10000 = class_1040.method_5891(0.5D, 1.0D);
      }

      return var10000;
   }

   // $FF: renamed from: d (ahl, int, int, int) int
   public int method_2495(ahl var1, int var2, int var3, int var4) {
      String[] var10000 = class_752.method_4253();
      int var6 = var1.method_33(var2, var3, var4);
      String[] var5 = var10000;
      int var7 = var6;
      if(var5 != null) {
         if(var6 == 0) {
            return 16777215;
         }

         var7 = var1.method_35(var2, var4).method_5715(var2, var3, var4);
      }

      return var7;
   }

   // $FF: renamed from: a (int, java.util.Random, int) adb
   public adb method_2464(int var1, Random var2, int var3) {
      return var2.nextInt(8) == 0?class_1010.field_5153:null;
   }

   // $FF: renamed from: a (int, java.util.Random) int
   public int method_2504(int var1, Random var2) {
      return 1 + var2.nextInt(var1 * 2 + 1);
   }

   // $FF: renamed from: a (ahb, yz, int, int, int, int) void
   public void method_2501(ahb var1, class_792 var2, int var3, int var4, int var5, int var6) {
      String[] var7 = class_752.method_4253();
      if(!var1.field_1832) {
         label26: {
            class_792 var8;
            label30: {
               add var10000 = var2.method_4593();
               if(var7 != null) {
                  if(var10000 == null) {
                     break label26;
                  }

                  var8 = var2;
                  if(var7 == null) {
                     break label30;
                  }

                  var10000 = var2.method_4593();
               }

               if(var10000.method_3730() != class_1010.field_5216) {
                  break label26;
               }

               var8 = var2;
            }

            var8.method_4615(class_1698.field_8908[aji.method_2415(this)], 1);
            add var10005 = new add;
            var10005.method_3723(class_1192.field_6058, 1, var6);
            this.method_2468(var1, var3, var4, var5, var10005);
            if(var7 != null) {
               return;
            }
         }
      }

      super.method_2501(var1, var2, var3, var4, var5, var6);
   }

   // $FF: renamed from: k (ahb, int, int, int) int
   public int method_2518(ahb var1, int var2, int var3, int var4) {
      return var1.method_33(var2, var3, var4);
   }

   // $FF: renamed from: a (adb, a5, java.util.List) void
   public void method_2519(adb var1, class_872 var2, List var3) {
      String[] var10000 = class_752.method_4253();
      int var5 = 1;
      String[] var4 = var10000;

      while(var5 < 3) {
         add var10001 = new add;
         var10001.method_3726(var1, 1, var5);
         var3.add(var10001);
         ++var5;
         if(var4 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: a (vM) void
   public void method_2535(class_74 var1) {
      String[] var10000 = class_752.method_4253();
      this.field_2206 = new class_73[field_2205.length];
      String[] var2 = var10000;
      int var3 = 0;

      while(var3 < this.field_2206.length) {
         this.field_2206[var3] = var1.method_375(field_2205[var3]);
         ++var3;
         if(var2 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: b (ahb, int, int, int, boolean) boolean
   public boolean method_121(ahb var1, int var2, int var3, int var4, boolean var5) {
      String[] var10000 = class_752.method_4253();
      int var7 = var1.method_33(var2, var3, var4);
      String[] var6 = var10000;
      int var8 = var7;
      if(var6 != null) {
         if(var7 == 0) {
            return false;
         }

         var8 = 1;
      }

      return (boolean)var8;
   }

   // $FF: renamed from: b (ahb, java.util.Random, int, int, int) boolean
   public boolean method_122(ahb var1, Random var2, int var3, int var4, int var5) {
      return true;
   }

   // $FF: renamed from: c (ahb, java.util.Random, int, int, int) void
   public void method_123(ahb var1, Random var2, int var3, int var4, int var5) {
      byte var8;
      class_448 var10;
      ahb var10001;
      int var10002;
      int var10003;
      int var10004;
      label25: {
         String[] var10000 = class_752.method_4253();
         int var7 = var1.method_33(var3, var4, var5);
         String[] var6 = var10000;
         var8 = 2;
         int var9 = var7;
         if(var6 != null) {
            if(var7 == 2) {
               var8 = 3;
            }

            var10 = class_1192.field_6191;
            var10001 = var1;
            var10002 = var3;
            var10003 = var4;
            var10004 = var5;
            if(var6 == null) {
               break label25;
            }

            var9 = class_1192.field_6191.method_2480(var1, var3, var4, var5);
         }

         if(var9 == 0) {
            return;
         }

         var10 = class_1192.field_6191;
         var10001 = var1;
         var10002 = var3;
         var10003 = var4;
         var10004 = var5;
      }

      var10.method_2780(var10001, var10002, var10003, var10004, var8, 2);
   }

   // $FF: renamed from: <clinit> () void
   static void method_2537() {
      String[] var6 = new String[3];
      int var4 = 0;
      String var3 = "Òi³Ìk\bßa¶";
      int var5 = "Òi³Ìk\bßa¶".length();
      char var2 = 9;
      int var1 = -1;

      while(true) {
         ++var1;
         String var10002 = var3.substring(var1, var1 + var2);
         boolean var10000 = true;
         char[] var10003 = var10002.toCharArray();
         Object var10004 = var10003.length;
         Object var10 = true;
         char[] var9 = var10003;
         char[] var10001 = (char[])var10004;
         int var7 = 0;

         while(true) {
            var10003 = var9;
            var9 = var10001;
            var10001 = var10003;
            char[] var11 = var9;
            var9 = var10003;
            if(var10003 <= var7) {
               var6[var4++] = (new String((char[])var10)).intern();
               if((var1 += var2) >= var5) {
                  field_2205 = new String[]{"deadbush", "tallgrass", "fern"};
                  return;
               }

               var2 = var3.charAt(var1);
               break;
            }

            char var10007 = (char)((Object[])var10)[var7];
            short var10009;
            switch(var7 % 7) {
            case 0:
               var10009 = 57;
               break;
            case 1:
               var10009 = 176;
               break;
            case 2:
               var10009 = 123;
               break;
            case 3:
               var10009 = 192;
               break;
            case 4:
               var10009 = 17;
               break;
            case 5:
               var10009 = 50;
               break;
            default:
               var10009 = 32;
            }

            ((Object[])var10)[var7] = (char)(var10007 ^ var11 ^ var10009);
            ++var7;
         }
      }
   }
}
