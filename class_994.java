import java.util.ArrayList;
import java.util.Random;

// $FF: renamed from: dJ
public class class_994 extends class_985 {

   // $FF: renamed from: aF dz
   protected class_985 field_5071;
   // $FF: renamed from: cb java.lang.String
   private static final String field_5072 = " M";


   // $FF: renamed from: <init> (int, dz) void
   public void method_5729(int var1, class_985 var2) {
      super.method_5691(var1);
      this.field_5071 = var2;
      this.method_5704(var2.field_5032, true);
      this.field_5031 = var2.field_5031 + " M";
      this.field_5034 = var2.field_5034;
      this.field_5036 = var2.field_5036;
      this.field_5037 = var2.field_5037;
      this.field_5038 = var2.field_5038;
      this.field_5039 = var2.field_5039;
      this.field_5040 = var2.field_5040;
      this.field_5041 = var2.field_5041;
      this.field_5042 = var2.field_5042;
      this.field_5048 = var2.field_5048;
      this.field_5049 = var2.field_5049;
      this.field_5045 = new ArrayList(var2.field_5045);
      this.field_5044 = new ArrayList(var2.field_5044);
      this.field_5047 = new ArrayList(var2.field_5047);
      this.field_5046 = new ArrayList(var2.field_5046);
      this.field_5040 = var2.field_5040;
      this.field_5041 = var2.field_5041;
      this.field_5038 = var2.field_5038 + 0.1F;
      this.field_5039 = var2.field_5039 + 0.2F;
   }

   // $FF: renamed from: b (ahb, java.util.Random, int, int) void
   public void method_5714(ahb var1, Random var2, int var3, int var4) {
      this.field_5071.field_5043.method_5828(var1, var2, this, var3, var4);
   }

   // $FF: renamed from: b (ahb, java.util.Random, aji[], byte[], int, int, double) void
   public void method_5718(ahb var1, Random var2, aji[] var3, byte[] var4, int var5, int var6, double var7) {
      this.field_5071.method_5718(var1, var2, var3, var4, var5, var6, var7);
   }

   // $FF: renamed from: h () float
   public float method_5710() {
      return this.field_5071.method_5710();
   }

   // $FF: renamed from: b (java.util.Random) hd
   public class_1162 method_5696(Random var1) {
      return this.field_5071.method_5696(var1);
   }

   // $FF: renamed from: d (int, int, int) int
   public int method_5716(int var1, int var2, int var3) {
      return this.field_5071.method_5716(var1, var2, var2);
   }

   // $FF: renamed from: c (int, int, int) int
   public int method_5715(int var1, int var2, int var3) {
      return this.field_5071.method_5715(var1, var2, var2);
   }

   // $FF: renamed from: m () java.lang.Class
   public Class method_5721() {
      return this.field_5071.method_5721();
   }

   // $FF: renamed from: b (dz) boolean
   public boolean method_5722(class_985 var1) {
      return this.field_5071.method_5722(var1);
   }

   // $FF: renamed from: n () K
   public class_96 method_5723() {
      return this.field_5071.method_5723();
   }

   // $FF: renamed from: <clinit> () void
   static void method_5726() {
      boolean var10000 = true;
      char[] var10003 = "î".toCharArray();
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
            field_5072 = (new String((char[])var3)).intern();
            return;
         }

         char var10007 = (char)((Object[])var3)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 107;
            break;
         case 1:
            var10009 = 238;
            break;
         case 2:
            var10009 = 160;
            break;
         case 3:
            var10009 = 8;
            break;
         case 4:
            var10009 = 119;
            break;
         case 5:
            var10009 = 219;
            break;
         default:
            var10009 = 242;
         }

         ((Object[])var3)[var0] = (char)(var10007 ^ var4 ^ var10009);
         ++var0;
      }
   }
}
