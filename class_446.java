import java.util.Random;

// $FF: renamed from: et
public class class_446 extends aji {

   // $FF: renamed from: M java.lang.String
   private static final String field_2188 = "CL_00000208";


   // $FF: renamed from: <init> (awt) void
   protected void method_2427(awt var1) {
      super.method_2427(var1);
      this.method_2440(true);
      float var2 = 0.2F;
      this.method_2443(0.5F - var2, 0.0F, 0.5F - var2, 0.5F + var2, var2 * 3.0F, 0.5F + var2);
      this.method_2521(class_872.field_4245);
   }

   // $FF: renamed from: <init> () void
   protected void method_2770() {
      this.method_2427(awt.field_4180);
   }

   // $FF: renamed from: c (ahb, int, int, int) boolean
   public boolean method_2480(ahb var1, int var2, int var3, int var4) {
      boolean var10000;
      label24: {
         String[] var5 = class_752.method_4253();
         var10000 = super.method_2480(var1, var2, var3, var4);
         if(var5 != null) {
            if(!var10000) {
               break label24;
            }

            var10000 = this.method_2771(var1.getBlock(var2, var3 - 1, var4));
         }

         if(var5 == null) {
            return var10000;
         }

         if(var10000) {
            var10000 = true;
            return var10000;
         }
      }

      var10000 = false;
      return var10000;
   }

   // $FF: renamed from: d (aji) boolean
   protected boolean method_2771(aji var1) {
      boolean var3;
      label28: {
         String[] var2 = class_752.method_4253();
         aji var10000 = var1;
         Object var10001 = class_1192.field_6027;
         if(var2 != null) {
            if(var1 == class_1192.field_6027) {
               break label28;
            }

            var10000 = var1;
            var10001 = class_1192.field_6028;
         }

         if(var2 != null) {
            if(var10000 == var10001) {
               break label28;
            }

            var10000 = var1;
            var10001 = class_1192.field_6087;
         }

         if(var10000 != var10001) {
            var3 = false;
            return var3;
         }
      }

      var3 = true;
      return var3;
   }

   // $FF: renamed from: a (ahb, int, int, int, aji) void
   public void method_2459(ahb var1, int var2, int var3, int var4, aji var5) {
      super.method_2459(var1, var2, var3, var4, var5);
      this.method_2772(var1, var2, var3, var4);
   }

   // $FF: renamed from: a (ahb, int, int, int, java.util.Random) void
   public void method_2456(ahb var1, int var2, int var3, int var4, Random var5) {
      this.method_2772(var1, var2, var3, var4);
   }

   // $FF: renamed from: h (ahb, int, int, int) void
   protected void method_2772(ahb var1, int var2, int var3, int var4) {
      String[] var5 = class_752.method_4253();
      if(var5 != null && !this.method_2505(var1, var2, var3, var4)) {
         this.method_2466(var1, var2, var3, var4, var1.method_33(var2, var3, var4), 0);
         var1.method_2054(var2, var3, var4, method_2416(0), 0, 2);
      }

   }

   // $FF: renamed from: j (ahb, int, int, int) boolean
   public boolean method_2505(ahb var1, int var2, int var3, int var4) {
      return this.method_2771(var1.getBlock(var2, var3 - 1, var4));
   }

   // $FF: renamed from: a (ahb, int, int, int) kg
   public class_1343 method_2452(ahb var1, int var2, int var3, int var4) {
      return null;
   }

   // $FF: renamed from: c () boolean
   public boolean method_2453() {
      return false;
   }

   // $FF: renamed from: d () boolean
   public boolean method_2434() {
      return false;
   }

   // $FF: renamed from: b () int
   public int method_2436() {
      return 1;
   }

   // $FF: renamed from: <clinit> () void
   static void method_2537() {
      boolean var10000 = true;
      char[] var10003 = "Ê2æ>zì¹L6".toCharArray();
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
            field_2188 = (new String((char[])var4)).intern();
            String var2 = field_2188;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 13;
            break;
         case 1:
            var10009 = 250;
            break;
         case 2:
            var10009 = 61;
            break;
         case 3:
            var10009 = 138;
            break;
         case 4:
            var10009 = 206;
            break;
         case 5:
            var10009 = 54;
            break;
         default:
            var10009 = 88;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}
