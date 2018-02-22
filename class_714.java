
// $FF: renamed from: xA
public class class_714 extends class_689 {

   // $FF: renamed from: at int
   public int field_3201;
   // $FF: renamed from: au sv
   private class_752 field_3202;
   // $FF: renamed from: av java.lang.String
   private static final String field_3203;
   // $FF: renamed from: db java.lang.String[]
   private static final String[] field_3204;


   // $FF: renamed from: <init> (ahb) void
   public void method_3847(ahb var1) {
      super.method_3847(var1);
      this.field_2986 = true;
      this.method_3852(0.98F, 0.98F);
      this.field_3013 = this.field_3015 / 2.0F;
   }

   // $FF: renamed from: <init> (ahb, double, double, double, sv) void
   public void method_4083(ahb var1, double var2, double var4, double var6, class_752 var8) {
      this.method_3847(var1);
      this.method_3854(var2, var4, var6);
      float var9 = (float)(Math.random() * 3.141592653589793D * 2.0D);
      this.field_2997 = (double)(-((float)Math.sin((double)var9)) * 0.02F);
      this.field_2998 = 0.20000000298023224D;
      this.field_2999 = (double)(-((float)Math.cos((double)var9)) * 0.02F);
      this.field_3201 = 80;
      this.field_2991 = var2;
      this.field_2992 = var4;
      this.field_2993 = var6;
      this.field_3202 = var8;
   }

   // $FF: renamed from: c () void
   protected void method_3848() {}

   // $FF: renamed from: g_ () boolean
   protected boolean method_3869() {
      return false;
   }

   // $FF: renamed from: R () boolean
   public boolean method_3897() {
      String[] var1 = class_752.method_4253();
      boolean var10000 = this.field_3012;
      if(var1 != null) {
         var10000 = !this.field_3012;
      }

      return var10000;
   }

   // $FF: renamed from: h () void
   public void method_3856() {
      class_714 var3;
      label34: {
         String[] var10000 = class_752.method_4253();
         this.field_2991 = this.field_2994;
         this.field_2992 = this.field_2995;
         this.field_2993 = this.field_2996;
         this.field_2998 -= 0.03999999910593033D;
         this.method_3864(this.field_2997, this.field_2998, this.field_2999);
         this.field_2997 *= 0.9800000190734863D;
         this.field_2998 *= 0.9800000190734863D;
         String[] var1 = var10000;
         this.field_2999 *= 0.9800000190734863D;
         int var2 = this.field_3005;
         if(var1 != null) {
            if(this.field_3005) {
               this.field_2997 *= 0.699999988079071D;
               this.field_2999 *= 0.699999988079071D;
               this.field_2998 *= -0.5D;
            }

            var3 = this;
            if(var1 == null) {
               break label34;
            }

            var2 = this.field_3201--;
         }

         if(var2 <= 0) {
            this.method_3851();
            var3 = this;
            if(var1 != null) {
               if(this.field_2990.field_1832) {
                  return;
               }

               var3 = this;
            }

            var3.method_4084();
            if(var1 != null) {
               return;
            }
         }

         var3 = this;
      }

      String[] var10001 = field_3204;
      var3.field_2990.method_2087("smoke", this.field_2994, this.field_2995 + 0.5D, this.field_2996, 0.0D, 0.0D, 0.0D);
   }

   // $FF: renamed from: a () void
   private void method_4084() {
      float var1 = 4.0F;
      this.field_2990.method_2125(this, this.field_2994, this.field_2995, this.field_2996, var1, true);
   }

   // $FF: renamed from: b (ro) void
   protected void method_3909(class_1583 var1) {
      String[] var10001 = field_3204;
      var1.method_8665("Fuse", (byte)this.field_3201);
   }

   // $FF: renamed from: a (ro) void
   protected void method_3908(class_1583 var1) {
      String[] var10002 = field_3204;
      this.field_3201 = var1.initGui9("Fuse");
   }

   // $FF: renamed from: Y () float
   public float method_3913() {
      return 0.0F;
   }

   // $FF: renamed from: b () sv
   public class_752 method_4085() {
      return this.field_3202;
   }

   // $FF: renamed from: <clinit> () void
   static void method_4086() {
      String[] var5 = new String[3];
      int var3 = 0;
      String var2 = "§AëY÷Ù¢xÇß¤Ð Þ";
      int var4 = "§AëY÷Ù¢xÇß¤Ð Þ".length();
      char var1 = 4;
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
            char[] var11 = var8;
            var8 = var10003;
            if(var10003 <= var6) {
               var5[var3++] = (new String((char[])var9)).intern();
               if((var0 += var1) >= var4) {
                  field_3204 = var5;
                  String[] var10 = field_3204;
                  field_3203 = "CL_00001681";
                  return;
               }

               var1 = var2.charAt(var0);
               break;
            }

            char var10007 = (char)((Object[])var9)[var6];
            short var10009;
            switch(var6 % 7) {
            case 0:
               var10009 = 116;
               break;
            case 1:
               var10009 = 161;
               break;
            case 2:
               var10009 = 13;
               break;
            case 3:
               var10009 = 122;
               break;
            case 4:
               var10009 = 41;
               break;
            case 5:
               var10009 = 1;
               break;
            default:
               var10009 = 181;
            }

            ((Object[])var9)[var6] = (char)(var10007 ^ var11 ^ var10009);
            ++var6;
         }
      }
   }
}
