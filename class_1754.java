
// $FF: renamed from: yL
public class class_1754 extends class_1727 {

   // $FF: renamed from: c sw
   private class_753 field_9164;
   // $FF: renamed from: d double
   private double field_9165;
   // $FF: renamed from: e double
   private double field_9166;
   // $FF: renamed from: f int
   private int field_9167;
   // $FF: renamed from: g java.lang.String
   private static final String field_9168 = "CL_00001607";


   // $FF: renamed from: <init> (sw) void
   public void method_9706(class_753 var1) {
      super.method_9648();
      this.field_9164 = var1;
      this.method_9655(3);
   }

   // $FF: renamed from: b () boolean
   public boolean method_9649() {
      String[] var1 = class_752.method_4253();
      float var2;
      int var10000 = (var2 = this.field_9164.method_4165().nextFloat() - 0.02F) == 0.0F?0:(var2 < 0.0F?-1:1);
      if(var1 != null) {
         var10000 = var10000 < 0?1:0;
      }

      return (boolean)var10000;
   }

   // $FF: renamed from: c () boolean
   public boolean method_9650() {
      String[] var1 = class_752.method_4253();
      int var10000 = this.field_9167;
      if(var1 != null) {
         var10000 = this.field_9167 >= 0?1:0;
      }

      return (boolean)var10000;
   }

   // $FF: renamed from: e () void
   public void method_9652() {
      double var1 = 6.283185307179586D * this.field_9164.method_4165().nextDouble();
      this.field_9165 = Math.cos(var1);
      this.field_9166 = Math.sin(var1);
      this.field_9167 = 20 + this.field_9164.method_4165().nextInt(20);
   }

   // $FF: renamed from: g () void
   public void method_9654() {
      --this.field_9167;
      this.field_9164.method_4254().method_9976(this.field_9164.field_2994 + this.field_9165, this.field_9164.field_2995 + (double)this.field_9164.method_3880(), this.field_9164.field_2996 + this.field_9166, 10.0F, (float)this.field_9164.method_4271());
   }

   // $FF: renamed from: <clinit> () void
   static void method_9707() {
      boolean var10000 = true;
      char[] var10003 = "wé^+zá\rY".toCharArray();
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
            field_9168 = (new String((char[])var4)).intern();
            String var2 = field_9168;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 87;
            break;
         case 1:
            var10009 = 188;
            break;
         case 2:
            var10009 = 49;
            break;
         case 3:
            var10009 = 233;
            break;
         case 4:
            var10009 = 156;
            break;
         case 5:
            var10009 = 205;
            break;
         default:
            var10009 = 51;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}
