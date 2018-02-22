import com.google.common.collect.Multimap;

// $FF: renamed from: cj
public class class_511 extends adb {

   // $FF: renamed from: n float
   private float field_2346;
   // $FF: renamed from: o y
   private final class_133 field_2347;
   // $FF: renamed from: p java.lang.String
   private static final String field_2348 = "Weapon modifier";


   // $FF: renamed from: <init> (y) void
   public void method_2984(class_133 var1) {
      super.method_2917();
      this.field_2347 = var1;
      this.field_2333 = 1;
      this.method_2935(var1.method_628());
      this.method_2974(class_872.fontRendererInstance2);
      this.field_2346 = 4.0F + var1.method_630();
   }

   // $FF: renamed from: e () float
   public float method_2985() {
      return this.field_2347.method_630();
   }

   // $FF: renamed from: a (add, aji) float
   public float method_2927(add var1, aji var2) {
      String[] var3 = class_752.method_4253();
      aji var10000 = var2;
      if(var3 != null) {
         if(var2 == class_1192.field_6057) {
            return 15.0F;
         }

         var10000 = var2;
      }

      awt var4 = var10000.method_2424();
      awt var5 = var4;
      awt var10001 = awt.field_4180;
      if(var3 != null) {
         if(var4 == awt.field_4180) {
            return 1.5F;
         }

         var5 = var4;
         var10001 = awt.field_4181;
      }

      if(var3 != null) {
         if(var5 == var10001) {
            return 1.5F;
         }

         var5 = var4;
         var10001 = awt.field_4191;
      }

      if(var3 != null) {
         if(var5 == var10001) {
            return 1.5F;
         }

         var5 = var4;
         var10001 = awt.field_4179;
      }

      if(var3 != null) {
         if(var5 == var10001) {
            return 1.5F;
         }

         var5 = var4;
         var10001 = awt.field_4198;
      }

      if(var5 != var10001) {
         return 1.0F;
      } else {
         return 1.5F;
      }
   }

   // $FF: renamed from: a (add, sv, sv) boolean
   public boolean method_2937(add var1, class_752 var2, class_752 var3) {
      var1.method_3749(1, var3);
      return true;
   }

   // $FF: renamed from: a (add, ahb, aji, int, int, int, sv) boolean
   public boolean method_2938(add var1, ahb var2, aji var3, int var4, int var5, int var6, class_752 var7) {
      String[] var8 = class_752.method_4253();
      double var9;
      int var10000 = (var9 = (double)var3.method_2439(var2, var4, var5, var6) - 0.0D) == 0.0D?0:(var9 < 0.0D?-1:1);
      if(var8 != null) {
         if(var10000 != 0) {
            var1.method_3749(2, var7);
         }

         var10000 = 1;
      }

      return (boolean)var10000;
   }

   // $FF: renamed from: f () boolean
   public boolean method_2942() {
      return true;
   }

   // $FF: renamed from: d (add) A
   public class_92 method_2957(add var1) {
      return class_92.field_26;
   }

   // $FF: renamed from: d_ (add) int
   public int method_2958(add var1) {
      return 72000;
   }

   // $FF: renamed from: a (add, ahb, yz) add
   public add method_2928(add var1, ahb var2, class_792 var3) {
      var3.method_4626(var1, this.method_2958(var1));
      return var1;
   }

   // $FF: renamed from: b (aji) boolean
   public boolean method_2939(aji var1) {
      return var1 == class_1192.field_6057;
   }

   // $FF: renamed from: c () int
   public int method_2969() {
      return this.field_2347.method_632();
   }

   // $FF: renamed from: i () java.lang.String
   public String method_2986() {
      return this.field_2347.toString();
   }

   // $FF: renamed from: a (add, add) boolean
   public boolean method_2976(add var1, add var2) {
      String[] var3 = class_752.method_4253();
      class_511 var10000 = this;
      if(var3 != null) {
         if(this.field_2347.method_633() == var2.method_3730()) {
            return true;
         }

         var10000 = this;
      }

      return var10000.method_2976(var1, var2);
   }

   // $FF: renamed from: k () com.google.common.collect.Multimap
   public Multimap method_2978() {
      Multimap var1 = super.method_2978();
      String var10001 = class_1840.field_9394.method_384();
      class_1716 var10002 = new class_1716;
      var10002.method_9593(field_2330, "Weapon modifier", (double)this.field_2346, 0);
      var1.put(var10001, var10002);
      return var1;
   }

   // $FF: renamed from: <clinit> () void
   static void method_2981() {
      boolean var10000 = true;
      char[] var10003 = " .¶M\f¹$³Tü".toCharArray();
      Object var10004 = var10003.length;
      Object var3 = true;
      char[] var10002 = var10003;
      char[] var10001 = (char[])var10004;
      int var0 = 0;

      while(true) {
         var10003 = var10002;
         var10002 = var10001;
         var10001 = var10003;
         char[] var4 = var10002;
         var10002 = var10003;
         if(var10003 <= var0) {
            field_2348 = (new String((char[])var3)).intern();
            return;
         }

         char var10007 = (char)((Object[])var3)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 235;
            break;
         case 1:
            var10009 = 215;
            break;
         case 2:
            var10009 = 75;
            break;
         case 3:
            var10009 = 161;
            break;
         case 4:
            var10009 = 241;
            break;
         case 5:
            var10009 = 254;
            break;
         default:
            var10009 = 5;
         }

         ((Object[])var3)[var0] = (char)(var10007 ^ var4 ^ var10009);
         ++var0;
      }
   }
}
