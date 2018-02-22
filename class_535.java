import java.util.List;
import java.util.Random;

// $FF: renamed from: bO
public class class_535 extends adb {

   // $FF: renamed from: o java.lang.String[]
   private static final String[] field_2383;


   // $FF: renamed from: <init> () void
   public void method_2917() {
      super.method_2917();
   }

   // $FF: renamed from: e (add) boolean
   public boolean method_2965(add var1) {
      return true;
   }

   // $FF: renamed from: e_ (add) boolean
   public boolean method_2967(add var1) {
      return false;
   }

   // $FF: renamed from: f (add) z
   public class_134 method_2966(add var1) {
      String[] var2 = class_752.method_4253();
      class_535 var10000 = this;
      add var10001 = var1;
      if(var2 != null) {
         if(this.getBlock02(var1).method_8658() > 0) {
            return class_134.field_351;
         }

         var10000 = this;
         var10001 = var1;
      }

      return var10000.method_2966(var10001);
   }

   // $FF: renamed from: b (add) rr
   public class_1580 getBlock02(add var1) {
      label23: {
         String[] var2 = class_752.method_4253();
         class_1583 var10000 = var1.field_2961;
         if(var2 != null) {
            if(var1.field_2961 == null) {
               break label23;
            }

            var10000 = var1.field_2961;
         }

         String[] var3 = field_2383;
         String var10001 = "StoredEnchantments";
         if(var2 != null) {
            if(!var10000.initGui8("StoredEnchantments", 9)) {
               break label23;
            }

            var10000 = var1.field_2961;
            String[] var4 = field_2383;
            var10001 = "StoredEnchantments";
         }

         return (class_1580)var10000.initGui5(var10001);
      }

      class_1580 var5 = new class_1580;
      var5.method_8628();
      return var5;
   }

   // $FF: renamed from: a (add, yz, java.util.List, boolean) void
   public void method_2963(add var1, class_792 var2, List var3, boolean var4) {
      String[] var10000 = class_752.method_4253();
      super.method_2963(var1, var2, var3, var4);
      String[] var5 = var10000;
      class_1580 var6 = this.getBlock02(var1);
      if(var6 != null) {
         int var7 = 0;

         while(var7 < var6.method_8658()) {
            class_1583 var11 = var6.method_8653(var7);
            String[] var10 = field_2383;
            short var8 = var11.method_8680("id");
            short var9 = var6.method_8653(var7).method_8680("lvl");
            if(var5 != null) {
               if(class_940.field_4782[var8] != null) {
                  var3.add(class_940.field_4782[var8].method_5490(var9));
               }

               ++var7;
            }

            if(var5 == null) {
               break;
            }
         }
      }

   }

   // $FF: renamed from: b (add, vA) void
   public void getBlock03(add var1, class_1655 var2) {
      class_1580 var4 = this.getBlock02(var1);
      String[] var10000 = class_752.method_4253();
      short var5 = 1;
      String[] var3 = var10000;
      int var6 = 0;

      String[] var8;
      short var9;
      while(true) {
         if(var6 < var4.method_8658()) {
            label49: {
               class_1583 var7 = var4.method_8653(var6);
               if(var3 != null) {
                  var8 = field_2383;
                  var9 = var7.method_8680("id");
                  if(var3 == null) {
                     break;
                  }

                  if(var9 == var2.field_8614.field_4808) {
                     var9 = var7.method_8680("lvl");
                     if(var3 != null) {
                        if(var9 < var2.field_8615) {
                           var7.method_8666("lvl", (short)var2.field_8615);
                        }

                        var9 = 0;
                     }

                     var5 = var9;
                     if(var3 != null) {
                        break label49;
                     }
                  }

                  ++var6;
               }

               if(var3 != null) {
                  continue;
               }
            }
         }

         var9 = var5;
         break;
      }

      class_1583 var12;
      add var13;
      label57: {
         if(var3 != null) {
            if(var9 != 0) {
               var12 = new class_1583;
               var12.method_8628();
               class_1583 var10 = var12;
               var8 = field_2383;
               var10.method_8666("id", (short)var2.field_8614.field_4808);
               var10.method_8666("lvl", (short)var2.field_8615);
               var4.method_8650(var10);
            }

            var13 = var1;
            if(var3 == null) {
               break label57;
            }

            var9 = var1.method_3766();
         }

         if(var9 == 0) {
            class_1583 var10001 = new class_1583;
            var10001.method_8628();
            var1.method_3769(var10001);
         }

         var13 = var1;
      }

      var12 = var13.method_3767();
      String[] var11 = field_2383;
      var12.method_8664("StoredEnchantments", var4);
   }

   // $FF: renamed from: b (vA) add
   public add getBlock04(class_1655 var1) {
      add var10000 = new add;
      var10000.method_3724(this);
      add var2 = var10000;
      this.getBlock03(var2, var1);
      return var2;
   }

   // $FF: renamed from: b (cH, java.util.List) void
   public void getBlock05(class_940 var1, List var2) {
      String[] var10000 = class_752.method_4253();
      int var4 = var1.method_5481();
      String[] var3 = var10000;

      while(var4 <= var1.method_5482()) {
         class_1655 var10002 = new class_1655;
         var10002.method_9103(var1, var4);
         var2.add(this.getBlock04(var10002));
         ++var4;
         if(var3 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: a (java.util.Random) vD
   public class_1652 getBlock06(Random var1) {
      return this.getBlock07(var1, 1, 1, 1);
   }

   // $FF: renamed from: b (java.util.Random, int, int, int) vD
   public class_1652 getBlock07(Random var1, int var2, int var3, int var4) {
      add var10000 = new add;
      var10000.method_3726(class_1010.field_5198, 1, 0);
      add var5 = var10000;
      class_980.method_5663(var1, var5, 30);
      class_1652 var6 = new class_1652;
      var6.method_9095(var5, var2, var3, var4);
      return var6;
   }

   // $FF: renamed from: <clinit> () void
   static void method_2981() {
      String[] var5 = new String[3];
      int var3 = 0;
      String var2 = "yqZL±nzJdºc¶i³{";
      int var4 = "yqZL±nzJdºc¶i³{".length();
      char var1 = 18;
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
                  field_2383 = var5;
                  return;
               }

               var1 = var2.charAt(var0);
               break;
            }

            char var10007 = (char)((Object[])var9)[var6];
            short var10009;
            switch(var6 % 7) {
            case 0:
               var10009 = 110;
               break;
            case 1:
               var10009 = 188;
               break;
            case 2:
               var10009 = 65;
               break;
            case 3:
               var10009 = 222;
               break;
            case 4:
               var10009 = 165;
               break;
            case 5:
               var10009 = 143;
               break;
            default:
               var10009 = 184;
            }

            ((Object[])var9)[var6] = (char)(var10007 ^ var10 ^ var10009);
            ++var6;
         }
      }
   }
}
