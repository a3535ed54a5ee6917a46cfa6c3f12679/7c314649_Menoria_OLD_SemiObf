
// $FF: renamed from: nd
public class class_1220 extends bhr {

   // $FF: renamed from: b bix
   public bix field_6340;
   // $FF: renamed from: c java.lang.String
   private static final String field_6341 = "CL_00000856";


   // $FF: renamed from: <init> () void
   public void method_6510() {
      this.method_6536(0, 35, 64, 64);
   }

   // $FF: renamed from: <init> (int, int, int, int) void
   public void method_6536(int var1, int var2, int var3, int var4) {
      super.method_6510();
      this.field_6264 = var3;
      this.field_6265 = var4;
      bix var10001 = new bix;
      var10001.method_6639(this, var1, var2);
      this.field_6340 = var10001;
      this.field_6340.method_6644(-4.0F, -8.0F, -4.0F, 8, 8, 8, 0.0F);
      this.field_6340.method_6645(0.0F, 0.0F, 0.0F);
   }

   // $FF: renamed from: a (sa, float, float, float, float, float, float) void
   public void method_6511(class_689 var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      this.method_6512(var2, var3, var4, var5, var6, var7, var1);
      this.field_6340.method_6646(var7);
   }

   // $FF: renamed from: a (float, float, float, float, float, float, sa) void
   public void method_6512(float var1, float var2, float var3, float var4, float var5, float var6, class_689 var7) {
      super.method_6512(var1, var2, var3, var4, var5, var6, var7);
      this.field_6340.field_6549 = var4 / 57.295776F;
      this.field_6340.field_6548 = var5 / 57.295776F;
   }

   // $FF: renamed from: <clinit> () void
   static void method_6537() {
      boolean var10000 = true;
      char[] var10003 = "3>àRH@Tæ".toCharArray();
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
            field_6341 = (new String((char[])var4)).intern();
            String var2 = field_6341;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 190;
            break;
         case 1:
            var10009 = 253;
            break;
         case 2:
            var10009 = 175;
            break;
         case 3:
            var10009 = 30;
            break;
         case 4:
            var10009 = 124;
            break;
         case 5:
            var10009 = 172;
            break;
         default:
            var10009 = 182;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}
