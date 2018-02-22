
// $FF: renamed from: gV
public class class_1092 extends class_1089 {

   // $FF: renamed from: m java.lang.String
   private static final String field_5744 = "Nether";


   // $FF: renamed from: <init> () void
   public void method_6160() {
      super.method_6160();
   }

   // $FF: renamed from: c () void
   public void method_6163() {
      class_959 var10001 = new class_959;
      var10001.method_5548(class_985.field_4996, 0.0F);
      this.field_5734 = var10001;
      this.field_5735 = true;
      this.field_5736 = true;
      this.field_5738 = -1;
   }

   // $FF: renamed from: c (float, float) azw
   public azw method_6170(float var1, float var2) {
      return azw.method_5086(0.20000000298023224D, 0.029999999329447746D, 0.029999999329447746D);
   }

   // $FF: renamed from: b () void
   protected void method_6162() {
      String[] var10000 = class_752.method_4253();
      float var2 = 0.1F;
      String[] var1 = var10000;
      int var3 = 0;

      while(var3 <= 15) {
         float var4 = 1.0F - (float)var3 / 15.0F;
         this.field_5737[var3] = (1.0F - var4) / (var4 * 3.0F + 1.0F) * (1.0F - var2) + var2;
         ++var3;
         if(var1 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: d () gG
   public class_25 method_6164() {
      class_1149 var10000 = new class_1149;
      var10000.method_6339(this.field_5731, this.field_5731.method_2183());
      return var10000;
   }

   // $FF: renamed from: e () boolean
   public boolean method_6168() {
      return false;
   }

   // $FF: renamed from: b (int, int) boolean
   public boolean method_6165(int var1, int var2) {
      return false;
   }

   // $FF: renamed from: b (long, float) float
   public float method_6166(long var1, float var3) {
      return 0.5F;
   }

   // $FF: renamed from: f () boolean
   public boolean method_6171() {
      return false;
   }

   // $FF: renamed from: c (int, int) boolean
   public boolean method_6179(int var1, int var2) {
      return true;
   }

   // $FF: renamed from: m () java.lang.String
   public String method_6180() {
      return "Nether";
   }

   // $FF: renamed from: <clinit> () void
   static void method_6181() {
      boolean var10000 = true;
      char[] var10003 = "Ì\\]£Z".toCharArray();
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
            field_5744 = (new String((char[])var3)).intern();
            return;
         }

         char var10007 = (char)((Object[])var3)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 133;
            break;
         case 1:
            var10009 = 62;
            break;
         case 2:
            var10009 = 46;
            break;
         case 3:
            var10009 = 204;
            break;
         case 4:
            var10009 = 115;
            break;
         case 5:
            var10009 = 47;
            break;
         default:
            var10009 = 105;
         }

         ((Object[])var3)[var0] = (char)(var10007 ^ var4 ^ var10009);
         ++var0;
      }
   }
}
