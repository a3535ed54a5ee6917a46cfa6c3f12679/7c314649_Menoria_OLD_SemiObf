
// $FF: renamed from: dX
public class class_1027 {

   // $FF: renamed from: b float[]
   public float[] field_5406;
   // $FF: renamed from: c dz[]
   public class_985[] field_5407;
   // $FF: renamed from: d int
   public int field_5408;
   // $FF: renamed from: e int
   public int field_5409;
   // $FF: renamed from: f long
   public long field_5410;
   // $FF: renamed from: g java.lang.String
   private static final String field_5411 = "CL_00000163";
   // $FF: renamed from: h dW
   final class_1021 field_5412;


   // $FF: renamed from: <init> (dW, int, int) void
   public void method_5821(class_1021 var1, int var2, int var3) {
      this.field_5412 = var1;
      super();
      this.field_5406 = new float[256];
      this.field_5407 = new class_985[256];
      this.field_5408 = var2;
      this.field_5409 = var3;
      class_1021.method_5802(var1).method_5538(this.field_5406, var2 << 4, var3 << 4, 16, 16);
      class_1021.method_5802(var1).method_5542(this.field_5407, var2 << 4, var3 << 4, 16, 16, false);
   }

   // $FF: renamed from: b (int, int) dz
   public class_985 method_5822(int var1, int var2) {
      return this.field_5407[var1 & 15 | (var2 & 15) << 4];
   }

   // $FF: renamed from: <clinit> () void
   static void method_5823() {
      boolean var10000 = true;
      char[] var10003 = "1{ZUBåY".toCharArray();
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
            field_5411 = (new String((char[])var4)).intern();
            String var2 = field_5411;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 106;
            break;
         case 1:
            var10009 = 47;
            break;
         case 2:
            var10009 = 203;
            break;
         case 3:
            var10009 = 114;
            break;
         case 4:
            var10009 = 185;
            break;
         case 5:
            var10009 = 125;
            break;
         default:
            var10009 = 170;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}
