import java.util.HashMap;
import java.util.Map;
import java.util.Random;

// $FF: renamed from: dv
public final class class_1047 {

   // $FF: renamed from: b java.util.HashMap
   private HashMap field_5539;
   // $FF: renamed from: c java.util.Map
   private Map field_5540;
   // $FF: renamed from: d int
   private int field_5541;
   // $FF: renamed from: e int
   private int field_5542;
   // $FF: renamed from: f java.lang.String
   private static final String field_5543 = "CL_00000152";


   // $FF: renamed from: <init> () void
   public void method_5936() {
      super();
      this.field_5539 = new HashMap();
      this.field_5540 = new HashMap();
      this.field_5541 = Integer.MAX_VALUE;
      this.field_5542 = Integer.MAX_VALUE;
   }

   // $FF: renamed from: b (ahb, int, int) dd
   protected static class_1034 method_5937(ahb var0, int var1, int var2) {
      int var5;
      int var6;
      Random var8;
      int var10;
      label14: {
         String[] var10000 = class_752.method_4253();
         class_1069 var4 = var0.method_2053(var1, var2);
         String[] var3 = var10000;
         var5 = var1 * 16 + var0.field_1819.nextInt(16);
         var6 = var2 * 16 + var0.field_1819.nextInt(16);
         var8 = var0.field_1819;
         class_1069 var10001 = var4;
         if(var3 != null) {
            if(var4 == null) {
               var10 = var0.method_2212();
               break label14;
            }

            var10001 = var4;
         }

         var10 = var10001.method_6018() + 16 - 1;
      }

      int var7 = var8.nextInt(var10);
      class_1034 var9 = new class_1034;
      var9.method_5854(var5, var7, var6);
      return var9;
   }

   // $FF: renamed from: b (dk, boolean, boolean, boolean) int
   public int method_5938(class_354 param1, boolean param2, boolean param3, boolean param4) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (as, ahb, int, int, int) boolean
   public static boolean method_5939(class_922 var0, ahb var1, int var2, int var3, int var4) {
      String[] var5 = class_752.method_4253();
      awt var10000 = var0.method_5408();
      boolean var7;
      if(var5 != null) {
         if(var10000 != awt.field_4177) {
            ahb var8 = var1;
            int var10001 = var2;
            int var10002 = var3 - 1;
            int var10003 = var4;
            if(var5 != null) {
               if(!ahb.method_2135(var1, var2, var10002, var4)) {
                  return false;
               }

               var8 = var1;
               var10001 = var2;
               var10002 = var3 - 1;
               var10003 = var4;
            }

            label85: {
               aji var6 = var8.getBlock(var10001, var10002, var10003);
               aji var9 = var6;
               if(var5 != null) {
                  if(var6 == class_1192.field_6032) {
                     break label85;
                  }

                  var9 = var1.getBlock(var2, var3, var4);
               }

               var7 = var9.method_2433();
               if(var5 != null) {
                  if(var7) {
                     break label85;
                  }

                  var7 = var1.getBlock(var2, var3, var4).method_2424().method_5062();
               }

               if(var5 != null) {
                  if(var7) {
                     break label85;
                  }

                  var7 = var1.getBlock(var2, var3 + 1, var4).method_2433();
               }

               if(var5 == null) {
                  return var7;
               }

               if(!var7) {
                  var7 = true;
                  return var7;
               }
            }

            var7 = false;
            return var7;
         }

         var10000 = var1.getBlock(var2, var3, var4).method_2424();
      }

      label86: {
         var7 = var10000.method_5062();
         if(var5 != null) {
            if(!var7) {
               break label86;
            }

            var7 = var1.getBlock(var2, var3 - 1, var4).method_2424().method_5062();
         }

         if(var5 != null) {
            if(!var7) {
               break label86;
            }

            var7 = var1.getBlock(var2, var3 + 1, var4).method_2433();
         }

         if(var5 == null) {
            return var7;
         }

         if(!var7) {
            var7 = true;
            return var7;
         }
      }

      var7 = false;
      return var7;
   }

   // $FF: renamed from: b (ahb, dz, int, int, int, int, java.util.Random) void
   public static void method_5940(ahb param0, class_985 param1, int param2, int param3, int param4, int param5, Random param6) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (java.lang.Exception) java.lang.Exception
   private static Exception method_5941(Exception var0) {
      return var0;
   }

   // $FF: renamed from: <clinit> () void
   static void method_5942() {
      boolean var10000 = true;
      char[] var10003 = "Ãr{½Ëê°¿".toCharArray();
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
            field_5543 = (new String((char[])var4)).intern();
            String var2 = field_5543;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 233;
            break;
         case 1:
            var10009 = 87;
            break;
         case 2:
            var10009 = 77;
            break;
         case 3:
            var10009 = 228;
            break;
         case 4:
            var10009 = 146;
            break;
         case 5:
            var10009 = 214;
            break;
         default:
            var10009 = 179;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}
