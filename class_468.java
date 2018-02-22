import java.util.List;
import java.util.Random;

// $FF: renamed from: e0
public class class_468 extends aji {

   // $FF: renamed from: M vL
   private IIcon field_2239;
   // $FF: renamed from: N vL
   private IIcon field_2240;
   // $FF: renamed from: O java.lang.String[]
   private static final String[] field_2241;


   // $FF: renamed from: <init> () void
   public void method_2817() {
      super.method_2427(awt.field_4174);
   }

   // $FF: renamed from: a (int, int) vL
   public IIcon method_2448(int var1, int var2) {
      String[] var3 = class_752.method_4253();
      int var10000 = var1;
      if(var3 != null) {
         if(var1 == 1) {
            return this.field_2239;
         }

         var10000 = var1;
      }

      return var10000 == 0?class_1192.field_6145.getBlockTextureFromSide(var1):this.field_2010;
   }

   // $FF: renamed from: a (vM) void
   public void method_2535(class_74 var1) {
      StringBuilder var10002 = (new StringBuilder()).append(this.method_2533());
      String[] var2 = field_2241;
      this.field_2010 = var1.method_375(var10002.append("_side").toString());
      this.field_2239 = var1.method_375(this.method_2533() + "_top");
      this.field_2240 = var1.method_375(this.method_2533() + "_eye");
   }

   // $FF: renamed from: i () vL
   public IIcon method_2818() {
      return this.field_2240;
   }

   // $FF: renamed from: c () boolean
   public boolean method_2453() {
      return false;
   }

   // $FF: renamed from: b () int
   public int method_2436() {
      return 26;
   }

   // $FF: renamed from: g () void
   public void method_2500() {
      this.method_2443(0.0F, 0.0F, 0.0F, 1.0F, 0.8125F, 1.0F);
   }

   // $FF: renamed from: a (ahb, int, int, int, kg, java.util.List, sa) void
   public void method_2451(ahb var1, int var2, int var3, int var4, class_1343 var5, List var6, class_689 var7) {
      String[] var10000 = class_752.method_4253();
      this.method_2443(0.0F, 0.0F, 0.0F, 1.0F, 0.8125F, 1.0F);
      String[] var8 = var10000;
      super.method_2451(var1, var2, var3, var4, var5, var6, var7);
      int var9 = var1.method_33(var2, var3, var4);
      if(var8 != null) {
         if(method_2819(var9)) {
            this.method_2443(0.3125F, 0.8125F, 0.3125F, 0.6875F, 1.0F, 0.6875F);
            super.method_2451(var1, var2, var3, var4, var5, var6, var7);
         }

         this.method_2500();
      }

   }

   // $FF: renamed from: c (int) boolean
   public static boolean method_2819(int var0) {
      String[] var1 = class_752.method_4253();
      int var10000 = var0 & 4;
      if(var1 != null) {
         var10000 = var10000 != 0?1:0;
      }

      return (boolean)var10000;
   }

   // $FF: renamed from: a (int, java.util.Random, int) adb
   public adb method_2464(int var1, Random var2, int var3) {
      return null;
   }

   // $FF: renamed from: a (ahb, int, int, int, sv, add) void
   public void method_2506(ahb var1, int var2, int var3, int var4, class_752 var5, add var6) {
      int var7 = ((class_1715.method_9561((double)(var5.field_3000 * 4.0F / 360.0F) + 0.5D) & 3) + 2) % 4;
      var1.method_2055(var2, var3, var4, var7, 2);
   }

   // $FF: renamed from: M () boolean
   public boolean method_2530() {
      return true;
   }

   // $FF: renamed from: g (ahb, int, int, int, int) int
   public int method_2531(ahb var1, int var2, int var3, int var4, int var5) {
      String[] var10000 = class_752.method_4253();
      int var7 = var1.method_33(var2, var3, var4);
      String[] var6 = var10000;
      byte var8 = method_2819(var7);
      if(var6 != null) {
         if(var8 != 0) {
            return 15;
         }

         var8 = 0;
      }

      return var8;
   }

   // $FF: renamed from: <clinit> () void
   static void method_2537() {
      String[] var5 = new String[3];
      int var3 = 0;
      String var2 = ")\f£)¢d)¶";
      int var4 = ")\f£)¢d)¶".length();
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
                  field_2241 = var5;
                  return;
               }

               var1 = var2.charAt(var0);
               break;
            }

            char var10007 = (char)((Object[])var9)[var6];
            short var10009;
            switch(var6 % 7) {
            case 0:
               var10009 = 163;
               break;
            case 1:
               var10009 = 188;
               break;
            case 2:
               var10009 = 191;
               break;
            case 3:
               var10009 = 19;
               break;
            case 4:
               var10009 = 212;
               break;
            case 5:
               var10009 = 199;
               break;
            default:
               var10009 = 54;
            }

            ((Object[])var9)[var6] = (char)(var10007 ^ var10 ^ var10009);
            ++var6;
         }
      }
   }
}
