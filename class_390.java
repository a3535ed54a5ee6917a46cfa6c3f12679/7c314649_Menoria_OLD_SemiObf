import java.util.List;

// $FF: renamed from: fS
public class class_390 extends class_389 {

   // $FF: renamed from: Q vL[]
   private static final class_73[] field_2079;
   // $FF: renamed from: R vL[]
   private static final class_73[] field_2080;
   // $FF: renamed from: S java.lang.String[]
   private static final String[] field_2081;


   // $FF: renamed from: <init> () void
   public void method_2608() {
      String[] var1 = field_2081;
      super.method_2605("glass", "glass_pane_top", awt.field_4188, false);
      this.method_2521(class_872.field_4245);
   }

   // $FF: renamed from: b (int, int) vL
   public class_73 method_2534(int var1, int var2) {
      return field_2079[var2 % field_2079.length];
   }

   // $FF: renamed from: c (int) vL
   public class_73 method_2609(int var1) {
      return field_2080[~var1 & 15];
   }

   // $FF: renamed from: a (int, int) vL
   public class_73 method_2448(int var1, int var2) {
      return this.method_2534(var1, ~var2 & 15);
   }

   // $FF: renamed from: a (int) int
   public int method_2470(int var1) {
      return var1;
   }

   // $FF: renamed from: d (int) int
   public static int method_2610(int var0) {
      return var0 & 15;
   }

   // $FF: renamed from: a (adb, a5, java.util.List) void
   public void method_2519(adb var1, class_872 var2, List var3) {
      String[] var10000 = class_752.method_4253();
      int var5 = 0;
      String[] var4 = var10000;

      while(var5 < field_2079.length) {
         add var10001 = new add;
         var10001.method_3726(var1, 1, var5);
         var3.add(var10001);
         ++var5;
         if(var4 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: w () int
   public int method_2477() {
      return 1;
   }

   // $FF: renamed from: a (vM) void
   public void method_2535(class_74 var1) {
      String[] var10000 = class_752.method_4253();
      super.method_2535(var1);
      String[] var2 = var10000;
      int var3 = 0;

      while(var3 < field_2079.length) {
         field_2079[var3] = var1.method_375(this.method_2533() + "_" + class_537.field_2386[method_2610(var3)]);
         class_73[] var4 = field_2080;
         StringBuilder var10003 = (new StringBuilder()).append(this.method_2533());
         String[] var10004 = field_2081;
         var4[var3] = var1.method_375(var10003.append("_pane_top_").append(class_537.field_2386[method_2610(var3)]).toString());
         ++var3;
         if(var2 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: <clinit> () void
   static void method_2537() {
      String[] var5 = new String[3];
      int var3 = 0;
      String var2 = "!,!Ä¾\n\'.%è\n\n0!Ù¾)0!,!Ä";
      int var4 = "!,!Ä¾\n\'.%è\n\n0!Ù¾)0!,!Ä".length();
      char var1 = 14;
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
                  field_2081 = var5;
                  field_2079 = new class_73[16];
                  field_2080 = new class_73[16];
                  return;
               }

               var1 = var2.charAt(var0);
               break;
            }

            char var10007 = (char)((Object[])var9)[var6];
            short var10009;
            switch(var6 % 7) {
            case 0:
               var10009 = 185;
               break;
            case 1:
               var10009 = 191;
               break;
            case 2:
               var10009 = 191;
               break;
            case 3:
               var10009 = 72;
               break;
            case 4:
               var10009 = 23;
               break;
            case 5:
               var10009 = 30;
               break;
            default:
               var10009 = 133;
            }

            ((Object[])var9)[var6] = (char)(var10007 ^ var10 ^ var10009);
            ++var6;
         }
      }
   }
}
