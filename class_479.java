
// $FF: renamed from: ef
public class class_479 extends class_473 {

   // $FF: renamed from: M vL
   private class_73 field_2250;
   // $FF: renamed from: N java.lang.String[]
   private static final String[] field_2251;


   // $FF: renamed from: <init> () void
   protected void method_2833() {
      super.method_2427(awt.field_4173);
      this.method_2521(class_872.field_4245);
   }

   // $FF: renamed from: a (int, int) vL
   public class_73 method_2448(int var1, int var2) {
      return var1 == 1?this.field_2250:this.field_2010;
   }

   // $FF: renamed from: a (ahb, int, int, int, yz, int, float, float, float) boolean
   public boolean method_2481(ahb var1, int var2, int var3, int var4, class_792 var5, int var6, float var7, float var8, float var9) {
      String[] var10 = class_752.method_4253();
      int var10000 = var1.method_33(var2, var3, var4);
      if(var10 != null) {
         if(var10000 == 0) {
            return false;
         }

         this.method_2835(var1, var2, var3, var4);
         var10000 = 1;
      }

      return (boolean)var10000;
   }

   // $FF: renamed from: c (ahb, int, int, int, add) void
   public void method_2834(ahb var1, int var2, int var3, int var4, add var5) {
      String[] var6 = class_752.method_4253();
      ahb var10000 = var1;
      if(var6 != null) {
         if(var1.field_1832) {
            return;
         }

         var10000 = var1;
      }

      class_597 var7 = (class_597)var10000.method_31(var2, var3, var4);
      class_597 var8 = var7;
      if(var6 != null) {
         if(var7 == null) {
            return;
         }

         var8 = var7;
      }

      var8.method_3185(var5.method_3754());
      var1.method_2055(var2, var3, var4, 1, 2);
   }

   // $FF: renamed from: h (ahb, int, int, int) void
   public void method_2835(ahb var1, int var2, int var3, int var4) {
      String[] var5 = class_752.method_4253();
      ahb var10000 = var1;
      if(var5 != null) {
         if(var1.field_1832) {
            return;
         }

         var10000 = var1;
      }

      class_597 var6 = (class_597)var10000.method_31(var2, var3, var4);
      class_597 var17 = var6;
      if(var5 != null) {
         if(var6 == null) {
            return;
         }

         var17 = var6;
      }

      add var7 = var17.method_3184();
      if(var5 != null) {
         if(var7 == null) {
            return;
         }

         var1.method_2210(1005, var2, var3, var4, 0);
         var1.method_2086((String)null, var2, var3, var4);
         var6.method_3185((add)null);
         var1.method_2055(var2, var3, var4, 0, 2);
      }

      float var8 = 0.7F;
      double var9 = (double)(var1.field_1819.nextFloat() * var8) + (double)(1.0F - var8) * 0.5D;
      double var11 = (double)(var1.field_1819.nextFloat() * var8) + (double)(1.0F - var8) * 0.2D + 0.6D;
      double var13 = (double)(var1.field_1819.nextFloat() * var8) + (double)(1.0F - var8) * 0.5D;
      add var15 = var7.method_3754();
      class_699 var18 = new class_699;
      var18.method_4025(var1, (double)var2 + var9, (double)var3 + var11, (double)var4 + var13, var15);
      class_699 var16 = var18;
      var16.field_3093 = 10;
      var1.method_2089(var16);
   }

   // $FF: renamed from: a (ahb, int, int, int, aji, int) void
   public void method_2462(ahb var1, int var2, int var3, int var4, aji var5, int var6) {
      this.method_2835(var1, var2, var3, var4);
      super.method_2462(var1, var2, var3, var4, var5, var6);
   }

   // $FF: renamed from: a (ahb, int, int, int, int, float, int) void
   public void method_2467(ahb var1, int var2, int var3, int var4, int var5, float var6, int var7) {
      if(!var1.field_1832) {
         super.method_2467(var1, var2, var3, var4, var5, var6, 0);
      }
   }

   // $FF: renamed from: a (ahb, int) gi
   public class_580 method_124(ahb var1, int var2) {
      class_597 var10000 = new class_597;
      var10000.getBlock88();
      return var10000;
   }

   // $FF: renamed from: a (vM) void
   public void method_2535(class_74 var1) {
      StringBuilder var10002 = (new StringBuilder()).append(this.method_2533());
      String[] var2 = field_2251;
      this.field_2010 = var1.method_375(var10002.append("_side").toString());
      this.field_2250 = var1.method_375(this.method_2533() + "_top");
   }

   // $FF: renamed from: M () boolean
   public boolean method_2530() {
      return true;
   }

   // $FF: renamed from: g (ahb, int, int, int, int) int
   public int method_2531(ahb var1, int var2, int var3, int var4, int var5) {
      String[] var10000 = class_752.method_4253();
      add var7 = ((class_597)var1.method_31(var2, var3, var4)).method_3184();
      String[] var6 = var10000;
      add var8 = var7;
      int var9;
      if(var6 != null) {
         if(var7 == null) {
            var9 = 0;
            return var9;
         }

         var8 = var7;
      }

      var9 = adb.method_2918(var8.method_3730()) + 1 - adb.method_2918(class_1010.field_5271);
      return var9;
   }

   // $FF: renamed from: <clinit> () void
   static void method_2537() {
      String[] var5 = new String[2];
      int var3 = 0;
      String var2 = "]giq]`oeó";
      int var4 = "]giq]`oeó".length();
      char var1 = 4;
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
            char[] var10 = var8;
            var8 = var10003;
            if(var10003 <= var6) {
               var5[var3++] = (new String((char[])var9)).intern();
               if((var0 += var1) >= var4) {
                  field_2251 = var5;
                  return;
               }

               var1 = var2.charAt(var0);
               break;
            }

            char var10007 = (char)((Object[])var9)[var6];
            short var10009;
            switch(var6 % 7) {
            case 0:
               var10009 = 234;
               break;
            case 1:
               var10009 = 251;
               break;
            case 2:
               var10009 = 238;
               break;
            case 3:
               var10009 = 233;
               break;
            case 4:
               var10009 = 126;
               break;
            case 5:
               var10009 = 231;
               break;
            default:
               var10009 = 220;
            }

            ((Object[])var9)[var6] = (char)(var10007 ^ var10 ^ var10009);
            ++var6;
         }
      }
   }
}
