import java.util.List;

// $FF: renamed from: xv
public class class_696 extends class_695 implements class_24 {

   // $FF: renamed from: aI boolean
   private boolean field_3084;
   // $FF: renamed from: aJ int
   private int field_3085;
   // $FF: renamed from: aK java.lang.String
   private static final String field_3086;
   // $FF: renamed from: fb java.lang.String[]
   private static final String[] field_3087;


   // $FF: renamed from: <init> (ahb) void
   public void method_3847(ahb var1) {
      super.method_3847(var1);
      this.field_3084 = true;
      this.field_3085 = -1;
   }

   // $FF: renamed from: <init> (ahb, double, double, double) void
   public void method_3980(ahb var1, double var2, double var4, double var6) {
      super.method_3980(var1, var2, var4, var6);
      this.field_3084 = true;
      this.field_3085 = -1;
   }

   // $FF: renamed from: s () int
   public int method_3994() {
      return 5;
   }

   // $FF: renamed from: u () aji
   public aji method_3996() {
      return class_1192.field_6178;
   }

   // $FF: renamed from: aD () int
   public int method_4000() {
      return 1;
   }

   // $FF: renamed from: f () int
   public int method_83() {
      return 5;
   }

   // $FF: renamed from: c (yz) boolean
   public boolean method_3919(class_792 var1) {
      String[] var2 = class_752.method_4253();
      boolean var10000 = this.field_2990.field_1832;
      if(var2 != null) {
         if(!this.field_2990.field_1832) {
            var1.method_4577(this);
         }

         var10000 = true;
      }

      return var10000;
   }

   // $FF: renamed from: b (int, int, int, boolean) void
   public void method_3982(int var1, int var2, int var3, boolean var4) {
      String[] var5 = class_752.method_4253();
      boolean var10000 = var4;
      if(var5 != null) {
         var10000 = !var4;
      }

      boolean var6 = var10000;
      if(var6 != this.method_4017()) {
         this.method_4018(var6);
      }

   }

   // $FF: renamed from: aG () boolean
   public boolean method_4017() {
      return this.field_3084;
   }

   // $FF: renamed from: a (boolean) void
   public void method_4018(boolean var1) {
      this.field_3084 = var1;
   }

   // $FF: renamed from: a () ahb
   public ahb method_99() {
      return this.field_2990;
   }

   // $FF: renamed from: b () double
   public double method_100() {
      return this.field_2994;
   }

   // $FF: renamed from: d () double
   public double method_101() {
      return this.field_2995;
   }

   // $FF: renamed from: e () double
   public double method_102() {
      return this.field_2996;
   }

   // $FF: renamed from: h () void
   public void method_3856() {
      String[] var10000 = class_752.method_4253();
      super.method_3856();
      String[] var1 = var10000;
      boolean var2 = this.field_2990.field_1832;
      if(var1 != null) {
         if(this.field_2990.field_1832) {
            return;
         }

         var2 = this.method_3917();
      }

      if(var1 != null) {
         if(!var2) {
            return;
         }

         var2 = this.method_4017();
      }

      if(var1 != null) {
         if(!var2) {
            return;
         }

         --this.field_3085;
         var2 = this.method_4021();
      }

      class_696 var3;
      label49: {
         if(var1 != null) {
            if(var2) {
               return;
            }

            this.method_4020(0);
            var3 = this;
            if(var1 == null) {
               break label49;
            }

            var2 = this.method_4019();
         }

         if(!var2) {
            return;
         }

         this.method_4020(4);
         var3 = this;
      }

      var3.method_91();
   }

   // $FF: renamed from: aH () boolean
   public boolean method_4019() {
      String[] var1 = class_752.method_4253();
      class_696 var10000 = this;
      if(var1 != null) {
         if(class_585.method_3131(this)) {
            return true;
         }

         var10000 = this;
      }

      List var2 = var10000.field_2990.method_2158(class_699.class, this.field_3004.method_7097(0.25D, 0.0D, 0.25D), class_82.field_9);
      int var3 = var2.size();
      if(var1 != null) {
         if(var3 > 0) {
            class_585.method_3133(this, (class_699)var2.get(0));
         }

         var3 = 0;
      }

      return (boolean)var3;
   }

   // $FF: renamed from: b (vX) void
   public void method_3981(class_1691 var1) {
      super.method_3981(var1);
      this.method_3915(adb.method_2920(class_1192.field_6178), 1, 0.0F);
   }

   // $FF: renamed from: b (ro) void
   protected void method_3909(class_1583 var1) {
      super.method_3909(var1);
      String[] var10001 = field_3087;
      var1.method_8667("TransferCooldown", this.field_3085);
   }

   // $FF: renamed from: a (ro) void
   protected void method_3908(class_1583 var1) {
      super.method_3908(var1);
      String[] var10002 = field_3087;
      this.field_3085 = var1.method_8681("TransferCooldown");
   }

   // $FF: renamed from: o (int) void
   public void method_4020(int var1) {
      this.field_3085 = var1;
   }

   // $FF: renamed from: aI () boolean
   public boolean method_4021() {
      String[] var1 = class_752.method_4253();
      int var10000 = this.field_3085;
      if(var1 != null) {
         var10000 = this.field_3085 > 0?1:0;
      }

      return (boolean)var10000;
   }

   // $FF: renamed from: <clinit> () void
   static void method_4009() {
      String[] var5 = new String[2];
      int var3 = 0;
      String var2 = " å«nîn´RÃh7Û0­8áê1²:ëÇ";
      int var4 = " å«nîn´RÃh7Û0­8áê1²:ëÇ".length();
      char var1 = 11;
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
                  field_3087 = var5;
                  String[] var10 = field_3087;
                  field_3086 = "CL_00001676";
                  return;
               }

               var1 = var2.charAt(var0);
               break;
            }

            char var10007 = (char)((Object[])var9)[var6];
            short var10009;
            switch(var6 % 7) {
            case 0:
               var10009 = 184;
               break;
            case 1:
               var10009 = 114;
               break;
            case 2:
               var10009 = 47;
               break;
            case 3:
               var10009 = 133;
               break;
            case 4:
               var10009 = 5;
               break;
            case 5:
               var10009 = 133;
               break;
            default:
               var10009 = 95;
            }

            ((Object[])var9)[var6] = (char)(var10007 ^ var11 ^ var10009);
            ++var6;
         }
      }
   }
}
