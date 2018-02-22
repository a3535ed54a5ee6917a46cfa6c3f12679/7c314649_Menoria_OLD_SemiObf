
// $FF: renamed from: xe
public class class_755 extends class_754 {

   // $FF: renamed from: gb java.lang.String[]
   private static final String[] field_3394;


   // $FF: renamed from: <init> (ahb) void
   public void method_3847(ahb var1) {
      super.method_3847(var1);
      this.field_3035 = true;
   }

   // $FF: renamed from: aD () void
   protected void method_4157() {
      super.method_4157();
      this.method_4211(class_1840.field_9393).method_390(0.20000000298023224D);
   }

   // $FF: renamed from: by () boolean
   public boolean method_4274() {
      boolean var2;
      label40: {
         String[] var1 = class_752.method_4253();
         ahb var10000 = this.field_2990;
         if(var1 != null) {
            if(this.field_2990.field_1818 == class_918.field_4627) {
               break label40;
            }

            var10000 = this.field_2990;
         }

         var2 = var10000.method_2117(this.field_3004);
         if(var1 != null) {
            if(!var2) {
               break label40;
            }

            var2 = this.field_2990.method_2096(this, this.field_3004).isEmpty();
         }

         if(var1 != null) {
            if(!var2) {
               break label40;
            }

            var2 = this.field_2990.method_2120(this.field_3004);
         }

         if(var1 == null) {
            return var2;
         }

         if(!var2) {
            var2 = true;
            return var2;
         }
      }

      var2 = false;
      return var2;
   }

   // $FF: renamed from: aV () int
   public int method_4199() {
      return this.method_4304() * 3;
   }

   // $FF: renamed from: c (float) int
   public int method_3883(float var1) {
      return 15728880;
   }

   // $FF: renamed from: d (float) float
   public float method_3884(float var1) {
      return 1.0F;
   }

   // $FF: renamed from: b () java.lang.String
   protected String method_4305() {
      String[] var10000 = field_3394;
      return "flame";
   }

   // $FF: renamed from: a2 () xd
   protected class_754 method_4309() {
      class_755 var10000 = new class_755;
      var10000.method_3847(this.field_2990);
      return var10000;
   }

   // $FF: renamed from: u () adb
   protected adb method_4267() {
      return class_1010.field_5235;
   }

   // $FF: renamed from: b (boolean, int) void
   protected void method_4196(boolean var1, int var2) {
      String[] var10000 = class_752.method_4253();
      adb var4 = this.method_4267();
      String[] var3 = var10000;
      if(var4 != null) {
         int var7 = this.method_4304();
         byte var10001 = 1;
         if(var3 != null) {
            if(var7 <= 1) {
               return;
            }

            var7 = this.field_3028.nextInt(4);
            var10001 = 2;
         }

         int var5 = var7 - var10001;
         var7 = var2;
         if(var3 != null) {
            if(var2 > 0) {
               var5 += this.field_3028.nextInt(var2 + 1);
            }

            var7 = 0;
         }

         int var6 = var7;

         while(var6 < var5) {
            this.method_3914(var4, 1);
            ++var6;
            if(var3 == null) {
               break;
            }
         }
      }

   }

   // $FF: renamed from: al () boolean
   public boolean method_3936() {
      return false;
   }

   // $FF: renamed from: a1 () int
   protected int method_4308() {
      return super.method_4308() * 4;
   }

   // $FF: renamed from: i () void
   protected void method_4307() {
      this.field_3388 *= 0.9F;
   }

   // $FF: renamed from: bj () void
   protected void method_4223() {
      this.field_2998 = (double)(0.42F + (float)this.method_4304() * 0.1F);
      this.field_3047 = true;
   }

   // $FF: renamed from: b (float) void
   protected void method_3874(float var1) {}

   // $FF: renamed from: a3 () boolean
   protected boolean method_4310() {
      return true;
   }

   // $FF: renamed from: a4 () int
   protected int method_4311() {
      return super.method_4311() + 2;
   }

   // $FF: renamed from: d () java.lang.String
   protected String method_4306() {
      if(this.method_4304() > 1) {
         String[] var1 = field_3394;
         return "mob.magmacube.big";
      } else {
         String[] var10000 = field_3394;
         return "mob.magmacube.small";
      }
   }

   // $FF: renamed from: P () boolean
   public boolean method_3881() {
      return false;
   }

   // $FF: renamed from: a6 () boolean
   protected boolean method_4313() {
      return true;
   }

   // $FF: renamed from: <clinit> () void
   static void method_28() {
      String[] var5 = new String[3];
      int var3 = 0;
      String var2 = "ëÈ&è.SQéÐ!WëÉ/è.SQéÐ!W\ní";
      int var4 = "ëÈ&è.SQéÐ!WëÉ/è.SQéÐ!W\ní".length();
      char var1 = 5;
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
            char[] var10 = var8;
            var8 = var10003;
            if(var10003 <= var6) {
               var5[var3++] = (new String((char[])var9)).intern();
               if((var0 += var1) >= var4) {
                  field_3394 = var5;
                  return;
               }

               var1 = var2.charAt(var0);
               break;
            }

            char var10007 = (char)((Object[])var9)[var6];
            short var10009;
            switch(var6 % 7) {
            case 0:
               var10009 = 73;
               break;
            case 1:
               var10009 = 195;
               break;
            case 2:
               var10009 = 171;
               break;
            case 3:
               var10009 = 132;
               break;
            case 4:
               var10009 = 98;
               break;
            case 5:
               var10009 = 19;
               break;
            default:
               var10009 = 23;
            }

            ((Object[])var9)[var6] = (char)(var10007 ^ var10 ^ var10009);
            ++var6;
         }
      }
   }
}
