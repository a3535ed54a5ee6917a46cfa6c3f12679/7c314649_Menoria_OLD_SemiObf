import java.util.concurrent.atomic.AtomicReference;

// $FF: renamed from: rM
class class_1542 {

   // $FF: renamed from: b java.util.concurrent.atomic.AtomicReference[]
   private AtomicReference[] field_8093;
   // $FF: renamed from: c java.lang.String
   private static final String field_8094;
   // $FF: renamed from: h java.lang.String[]
   private static final String[] field_8095;


   // $FF: renamed from: <init> () void
   public void method_8380() {
      super();
      this.field_8093 = new AtomicReference[100];

      for(int var1 = 0; var1 < 100; ++var1) {
         AtomicReference[] var10000 = this.field_8093;
         AtomicReference var10002 = new AtomicReference;
         class_1544 var10004 = new class_1544;
         var10004.method_8395(0L, 0, 0.0D, (Object)null);
         var10002.<init>(var10004);
         var10000[var1] = var10002;
      }

   }

   // $FF: renamed from: b (int, long) void
   public void method_8381(int param1, long param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b () long
   public long method_8382() {
      String[] var10000 = class_752.method_4253();
      long var2 = 0L;
      String[] var1 = var10000;
      int var4 = 0;

      long var5;
      while(true) {
         if(var4 < 100) {
            var5 = var2 + ((class_1544)this.field_8093[var4].get()).method_8393();
            if(var1 == null) {
               break;
            }

            var2 = var5;
            ++var4;
            if(var1 != null) {
               continue;
            }
         }

         var5 = var2;
         break;
      }

      return var5;
   }

   // $FF: renamed from: c () long
   public long method_8383() {
      String[] var10000 = class_752.method_4253();
      long var2 = 0L;
      int var4 = 0;
      String[] var1 = var10000;

      long var5;
      while(true) {
         if(var4 < 100) {
            var5 = var2 + (long)((class_1544)this.field_8093[var4].get()).method_8394();
            if(var1 == null) {
               break;
            }

            var2 = var5;
            ++var4;
            if(var1 != null) {
               continue;
            }
         }

         var5 = var2;
         break;
      }

      return var5;
   }

   // $FF: renamed from: d () rL
   public class_1540 method_8384() {
      int var2 = -1;
      String[] var10000 = class_752.method_4253();
      class_1544 var10001 = new class_1544;
      var10001.method_8395(-1L, -1, 0.0D, (Object)null);
      class_1544 var3 = var10001;
      String[] var1 = var10000;
      int var4 = 0;

      while(var4 < 100) {
         class_1544 var5 = (class_1544)this.field_8093[var4].get();
         if(var1 != null) {
            if(class_1544.method_8396(var5) > class_1544.method_8396(var3)) {
               var2 = var4;
               var3 = var5;
            }

            ++var4;
         }

         if(var1 == null) {
            break;
         }
      }

      class_1540 var6 = new class_1540;
      var6.method_8361(var2, var3);
      return var6;
   }

   // $FF: renamed from: e () rL
   public class_1540 method_8385() {
      int var2 = -1;
      class_1544 var10000 = new class_1544;
      var10000.method_8395(-1L, -1, 0.0D, (Object)null);
      class_1544 var3 = var10000;
      String[] var6 = class_752.method_4253();
      int var4 = 0;
      String[] var1 = var6;

      while(var4 < 100) {
         class_1544 var5 = (class_1544)this.field_8093[var4].get();
         if(var1 != null) {
            if(class_1544.method_8397(var5) > class_1544.method_8397(var3)) {
               var2 = var4;
               var3 = var5;
            }

            ++var4;
         }

         if(var1 == null) {
            break;
         }
      }

      class_1540 var7 = new class_1540;
      var7.method_8361(var2, var3);
      return var7;
   }

   // $FF: renamed from: b (int) rL
   public class_1540 method_8386(int var1) {
      class_1540 var3;
      label17: {
         String[] var2 = class_752.method_4253();
         int var10000 = var1;
         if(var2 != null) {
            if(var1 < 0) {
               break label17;
            }

            var10000 = var1;
         }

         if(var10000 < 100) {
            var3 = new class_1540;
            var3.method_8361(var1, (class_1544)this.field_8093[var1].get());
            return var3;
         }
      }

      var3 = null;
      return var3;
   }

   // $FF: renamed from: b (java.lang.Exception) java.lang.Exception
   private static Exception method_8387(Exception var0) {
      return var0;
   }

   // $FF: renamed from: <clinit> () void
   static void method_8388() {
      String[] var5 = new String[2];
      int var3 = 0;
      String var2 = "ÄDÊ\tª\b,\\Îª1X\rë\r Dâ°NÉ\"*u M»VLq";
      int var4 = "ÄDÊ\tª\b,\\Îª1X\rë\r Dâ°NÉ\"*u M»VLq".length();
      char var1 = 30;
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
                  field_8095 = var5;
                  String[] var10 = field_8095;
                  field_8094 = "CL_00001894";
                  return;
               }

               var1 = var2.charAt(var0);
               break;
            }

            char var10007 = (char)((Object[])var9)[var6];
            short var10009;
            switch(var6 % 7) {
            case 0:
               var10009 = 226;
               break;
            case 1:
               var10009 = 6;
               break;
            case 2:
               var10009 = 29;
               break;
            case 3:
               var10009 = 45;
               break;
            case 4:
               var10009 = 88;
               break;
            case 5:
               var10009 = 195;
               break;
            default:
               var10009 = 21;
            }

            ((Object[])var9)[var6] = (char)(var10007 ^ var11 ^ var10009);
            ++var6;
         }
      }
   }
}
