
// $FF: renamed from: bX
public class class_557 extends adb {

   // $FF: renamed from: n int
   public final int field_2422;
   // $FF: renamed from: o int
   private final int field_2423;
   // $FF: renamed from: p float
   private final float field_2424;
   // $FF: renamed from: q boolean
   private final boolean field_2425;
   // $FF: renamed from: r boolean
   private boolean field_2426;
   // $FF: renamed from: s int
   private int field_2427;
   // $FF: renamed from: t int
   private int field_2428;
   // $FF: renamed from: u int
   private int field_2429;
   // $FF: renamed from: v float
   private float field_2430;
   // $FF: renamed from: w java.lang.String
   private static final String field_2431 = "random.burp";


   // $FF: renamed from: <init> (int, float, boolean) void
   public void getBlock40(int var1, float var2, boolean var3) {
      super.method_2917();
      this.field_2422 = 32;
      this.field_2423 = var1;
      this.field_2425 = var3;
      this.field_2424 = var2;
      this.method_2974(class_872.fontRendererInstance0);
   }

   // $FF: renamed from: <init> (int, boolean) void
   public void getBlock41(int var1, boolean var2) {
      this.getBlock40(var1, 0.6F, var2);
   }

   // $FF: renamed from: b (add, ahb, yz) add
   public add method_2929(add var1, ahb var2, class_792 var3) {
      --var1.field_2958;
      var3.method_4623().method_3633(this, var1);
      var2.method_2082(var3, "random.burp", 0.5F, var2.field_1819.nextFloat() * 0.1F + 0.9F);
      this.getBlock42(var1, var2, var3);
      return var1;
   }

   // $FF: renamed from: e (add, ahb, yz) void
   protected void getBlock42(add var1, ahb var2, class_792 var3) {
      String[] var4 = class_752.method_4253();
      int var10000 = var2.field_1832;
      if(var4 != null) {
         if(var2.field_1832) {
            return;
         }

         var10000 = this.field_2427;
      }

      if(var4 != null) {
         if(var10000 <= 0) {
            return;
         }

         float var5;
         var10000 = (var5 = var2.field_1819.nextFloat() - this.field_2430) == 0.0F?0:(var5 < 0.0F?-1:1);
      }

      if(var10000 < 0) {
         class_1645 var10001 = new class_1645;
         var10001.method_9012(this.field_2427, this.field_2428 * 20, this.field_2429);
         var3.method_4179(var10001);
      }

   }

   // $FF: renamed from: d_ (add) int
   public int method_2958(add var1) {
      return 32;
   }

   // $FF: renamed from: d (add) A
   public class_92 method_2957(add var1) {
      return class_92.field_24;
   }

   // $FF: renamed from: a (add, ahb, yz) add
   public add method_2928(add var1, ahb var2, class_792 var3) {
      String[] var4 = class_752.method_4253();
      class_792 var10000 = var3;
      if(var4 != null) {
         if(!var3.method_4624(this.field_2426)) {
            return var1;
         }

         var10000 = var3;
      }

      var10000.method_4626(var1, this.method_2958(var1));
      return var1;
   }

   // $FF: renamed from: b (add) int
   public int getBlock43(add var1) {
      return this.field_2423;
   }

   // $FF: renamed from: c (add) float
   public float getBlock44(add var1) {
      return this.field_2424;
   }

   // $FF: renamed from: e () boolean
   public boolean getBlock45() {
      return this.field_2425;
   }

   // $FF: renamed from: b (int, int, int, float) bX
   public class_557 getBlock46(int var1, int var2, int var3, float var4) {
      this.field_2427 = var1;
      this.field_2428 = var2;
      this.field_2429 = var3;
      this.field_2430 = var4;
      return this;
   }

   // $FF: renamed from: i () bX
   public class_557 getBlock47() {
      this.field_2426 = true;
      return this;
   }

   // $FF: renamed from: <clinit> () void
   static void method_2981() {
      boolean var10000 = true;
      char[] var10003 = "jõÃR-ÕzáßF".toCharArray();
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
            field_2431 = (new String((char[])var3)).intern();
            return;
         }

         char var10007 = (char)((Object[])var3)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 148;
            break;
         case 1:
            var10009 = 24;
            break;
         case 2:
            var10009 = 33;
            break;
         case 3:
            var10009 = 186;
            break;
         case 4:
            var10009 = 206;
            break;
         case 5:
            var10009 = 231;
            break;
         default:
            var10009 = 119;
         }

         ((Object[])var3)[var0] = (char)(var10007 ^ var4 ^ var10009);
         ++var0;
      }
   }
}
