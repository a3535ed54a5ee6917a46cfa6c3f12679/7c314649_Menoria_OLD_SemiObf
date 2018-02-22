import com.google.common.collect.Multimap;
import java.util.Set;

// $FF: renamed from: bH
public class class_539 extends adb {

   // $FF: renamed from: n java.util.Set
   private Set field_2391;
   // $FF: renamed from: o float
   protected float field_2392;
   // $FF: renamed from: p float
   private float field_2393;
   // $FF: renamed from: q y
   protected class_133 field_2394;
   // $FF: renamed from: r java.lang.String
   private static final String field_2395 = "Tool modifier";


   // $FF: renamed from: <init> (float, y, java.util.Set) void
   protected void getBlock12(float var1, class_133 var2, Set var3) {
      super.method_2917();
      this.field_2392 = 4.0F;
      this.field_2394 = var2;
      this.field_2391 = var3;
      this.field_2333 = 1;
      this.method_2935(var2.method_628());
      this.field_2392 = var2.method_629();
      this.field_2393 = var1 + var2.method_630();
      this.method_2974(class_872.fontRendererInstance1);
   }

   // $FF: renamed from: a (add, aji) float
   public float method_2927(add var1, aji var2) {
      String[] var3 = class_752.method_4253();
      class_539 var10000 = this;
      float var4;
      if(var3 != null) {
         if(!this.field_2391.contains(var2)) {
            var4 = 1.0F;
            return var4;
         }

         var10000 = this;
      }

      var4 = var10000.field_2392;
      return var4;
   }

   // $FF: renamed from: a (add, sv, sv) boolean
   public boolean method_2937(add var1, class_752 var2, class_752 var3) {
      var1.method_3749(2, var3);
      return true;
   }

   // $FF: renamed from: a (add, ahb, aji, int, int, int, sv) boolean
   public boolean method_2938(add var1, ahb var2, aji var3, int var4, int var5, int var6, class_752 var7) {
      String[] var8 = class_752.method_4253();
      double var9;
      int var10000 = (var9 = (double)var3.method_2439(var2, var4, var5, var6) - 0.0D) == 0.0D?0:(var9 < 0.0D?-1:1);
      if(var8 != null) {
         if(var10000 != 0) {
            var1.method_3749(1, var7);
         }

         var10000 = 1;
      }

      return (boolean)var10000;
   }

   // $FF: renamed from: f () boolean
   public boolean method_2942() {
      return true;
   }

   // $FF: renamed from: e () y
   public class_133 getBlock13() {
      return this.field_2394;
   }

   // $FF: renamed from: c () int
   public int method_2969() {
      return this.field_2394.method_632();
   }

   // $FF: renamed from: i () java.lang.String
   public String getBlock14() {
      return this.field_2394.toString();
   }

   // $FF: renamed from: a (add, add) boolean
   public boolean method_2976(add var1, add var2) {
      String[] var3 = class_752.method_4253();
      class_539 var10000 = this;
      if(var3 != null) {
         if(this.field_2394.method_633() == var2.method_3730()) {
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
      var10002.method_9593(field_2330, "Tool modifier", (double)this.field_2393, 0);
      var1.put(var10001, var10002);
      return var1;
   }

   // $FF: renamed from: <clinit> () void
   static void method_2981() {
      boolean var10000 = true;
      char[] var10003 = "Ëê\"Ñàûì+QÎ".toCharArray();
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
            field_2395 = (new String((char[])var3)).intern();
            return;
         }

         char var10007 = (char)((Object[])var3)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 25;
            break;
         case 1:
            var10009 = 3;
            break;
         case 2:
            var10009 = 203;
            break;
         case 3:
            var10009 = 118;
            break;
         case 4:
            var10009 = 178;
            break;
         case 5:
            var10009 = 58;
            break;
         default:
            var10009 = 9;
         }

         ((Object[])var3)[var0] = (char)(var10007 ^ var4 ^ var10009);
         ++var0;
      }
   }
}
