
// $FF: renamed from: yw
public class class_1728 extends class_1727 {

   // $FF: renamed from: a sw
   private class_753 field_9038;
   // $FF: renamed from: c sa
   protected class_689 field_9039;
   // $FF: renamed from: d float
   private float field_9040;
   // $FF: renamed from: e int
   private int field_9041;
   // $FF: renamed from: f float
   private float field_9042;
   // $FF: renamed from: g java.lang.Class
   private Class field_9043;
   // $FF: renamed from: h java.lang.String
   private static final String field_9044 = "CL_00001592";


   // $FF: renamed from: <init> (sw, java.lang.Class, float) void
   public void method_9657(class_753 var1, Class var2, float var3) {
      super.method_9648();
      this.field_9038 = var1;
      this.field_9043 = var2;
      this.field_9040 = var3;
      this.field_9042 = 0.02F;
      this.method_9655(2);
   }

   // $FF: renamed from: <init> (sw, java.lang.Class, float, float) void
   public void method_9658(class_753 var1, Class var2, float var3, float var4) {
      super.method_9648();
      this.field_9038 = var1;
      this.field_9043 = var2;
      this.field_9040 = var3;
      this.field_9042 = var4;
      this.method_9655(2);
   }

   // $FF: renamed from: b () boolean
   public boolean method_9649() {
      String[] var1;
      class_1728 var2;
      label41: {
         var1 = class_752.method_4253();
         Object var10000 = this.field_9038;
         if(var1 != null) {
            if(this.field_9038.method_4165().nextFloat() >= this.field_9042) {
               return false;
            }

            var2 = this;
            if(var1 == null) {
               break label41;
            }

            var10000 = this.field_9038.method_4259();
         }

         if(var10000 != null) {
            this.field_9039 = this.field_9038.method_4259();
         }

         var2 = this;
      }

      if(var1 != null) {
         if(var2.field_9043 == class_792.class) {
            this.field_9039 = this.field_9038.field_2990.method_2174(this.field_9038, (double)this.field_9040);
            if(var1 != null) {
               return this.field_9039 != null;
            }
         }

         var2 = this;
      }

      var2.field_9039 = this.field_9038.field_2990.method_2159(this.field_9043, this.field_9038.field_3004.method_7097((double)this.field_9040, 3.0D, (double)this.field_9040), this.field_9038);
      return this.field_9039 != null;
   }

   // $FF: renamed from: c () boolean
   public boolean method_9650() {
      String[] var1 = class_752.method_4253();
      int var10000 = this.field_9039.method_3917();
      if(var1 != null) {
         if(var10000 == 0) {
            var10000 = 0;
            return (boolean)var10000;
         }

         double var2;
         var10000 = (var2 = this.field_9038.method_3891(this.field_9039) - (double)(this.field_9040 * this.field_9040)) == 0.0D?0:(var2 < 0.0D?-1:1);
      }

      if(var1 != null) {
         if(var10000 > 0) {
            var10000 = 0;
            return (boolean)var10000;
         }

         var10000 = this.field_9041;
      }

      if(var1 != null) {
         var10000 = var10000 > 0?1:0;
      }

      return (boolean)var10000;
   }

   // $FF: renamed from: e () void
   public void method_9652() {
      this.field_9041 = 40 + this.field_9038.method_4165().nextInt(40);
   }

   // $FF: renamed from: f () void
   public void method_9653() {
      this.field_9039 = null;
   }

   // $FF: renamed from: g () void
   public void method_9654() {
      this.field_9038.method_4254().method_9976(this.field_9039.field_2994, this.field_9039.field_2995 + (double)this.field_9039.method_3880(), this.field_9039.field_2996, 10.0F, (float)this.field_9038.method_4271());
      --this.field_9041;
   }

   // $FF: renamed from: <clinit> () void
   static void method_9659() {
      boolean var10000 = true;
      char[] var10003 = "Pø¦y¤\"ô".toCharArray();
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
            field_9044 = (new String((char[])var4)).intern();
            String var2 = field_9044;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 178;
            break;
         case 1:
            var10009 = 96;
            break;
         case 2:
            var10009 = 6;
            break;
         case 3:
            var10009 = 15;
            break;
         case 4:
            var10009 = 55;
            break;
         case 5:
            var10009 = 232;
            break;
         default:
            var10009 = 53;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}
