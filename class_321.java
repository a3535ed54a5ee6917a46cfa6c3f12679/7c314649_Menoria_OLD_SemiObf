
// $FF: renamed from: sJ
public class class_321 extends class_250 {

   // $FF: renamed from: c boolean
   private boolean field_1624;
   // $FF: renamed from: d boolean
   private boolean field_1625;
   // $FF: renamed from: e boolean
   private boolean field_1626;
   // $FF: renamed from: f boolean
   private boolean field_1627;
   // $FF: renamed from: g float
   private float field_1628;
   // $FF: renamed from: h float
   private float field_1629;
   // $FF: renamed from: i java.lang.String
   private static final String field_1630 = "invuln=%b, flying=%b, canfly=%b, instabuild=%b, flyspeed=%.4f, walkspped=%.4f";


   // $FF: renamed from: <init> () void
   public void method_1449() {
      super.method_1449();
   }

   // $FF: renamed from: <init> (Ae) void
   public void method_1819(class_665 var1) {
      super.method_1449();
      this.method_1822(var1.field_2836);
      this.method_1824(var1.field_2837);
      this.method_1826(var1.field_2838);
      this.method_1828(var1.field_2839);
      this.method_1830(var1.method_3587());
      this.method_1832(var1.method_3589());
   }

   // $FF: renamed from: b (d) void
   public void method_1453(class_112 var1) {
      String[] var10000 = class_752.method_4253();
      byte var3 = var1.readByte();
      String[] var2 = var10000;
      int var10001 = var3 & 1;
      if(var2 != null) {
         var10001 = var10001 > 0?1:0;
      }

      this.method_1822((boolean)var10001);
      var10001 = var3 & 2;
      if(var2 != null) {
         var10001 = var10001 > 0?1:0;
      }

      this.method_1824((boolean)var10001);
      var10001 = var3 & 4;
      if(var2 != null) {
         var10001 = var10001 > 0?1:0;
      }

      this.method_1826((boolean)var10001);
      var10001 = var3 & 8;
      if(var2 != null) {
         var10001 = var10001 > 0?1:0;
      }

      this.method_1828((boolean)var10001);
      this.method_1830(var1.readFloat());
      this.method_1832(var1.readFloat());
   }

   // $FF: renamed from: c (d) void
   public void method_1454(class_112 var1) {
      String[] var10000 = class_752.method_4253();
      byte var3 = 0;
      String[] var2 = var10000;
      byte var4 = this.method_1821();
      if(var2 != null) {
         if(var4 != 0) {
            var3 = (byte)(var3 | 1);
         }

         var4 = this.method_1823();
      }

      if(var2 != null) {
         if(var4 != 0) {
            var3 = (byte)(var3 | 2);
         }

         var4 = this.method_1825();
      }

      if(var2 != null) {
         if(var4 != 0) {
            var3 = (byte)(var3 | 4);
         }

         var4 = this.method_1827();
      }

      label33: {
         if(var2 != null) {
            if(var4 == 0) {
               break label33;
            }

            var4 = (byte)(var3 | 8);
         }

         var3 = var4;
      }

      var1.writeByte(var3);
      var1.writeFloat(this.field_1628);
      var1.writeFloat(this.field_1629);
   }

   // $FF: renamed from: b (tF) void
   public void method_1820(class_64 var1) {
      var1.method_310(this);
   }

   // $FF: renamed from: c () java.lang.String
   public String method_1457() {
      return String.format("invuln=%b, flying=%b, canfly=%b, instabuild=%b, flyspeed=%.4f, walkspped=%.4f", new Object[]{Boolean.valueOf(this.method_1821()), Boolean.valueOf(this.method_1823()), Boolean.valueOf(this.method_1825()), Boolean.valueOf(this.method_1827()), Float.valueOf(this.method_1829()), Float.valueOf(this.method_1831())});
   }

   // $FF: renamed from: a () boolean
   public boolean method_1821() {
      return this.field_1624;
   }

   // $FF: renamed from: b (boolean) void
   public void method_1822(boolean var1) {
      this.field_1624 = var1;
   }

   // $FF: renamed from: e () boolean
   public boolean method_1823() {
      return this.field_1625;
   }

   // $FF: renamed from: c (boolean) void
   public void method_1824(boolean var1) {
      this.field_1625 = var1;
   }

   // $FF: renamed from: f () boolean
   public boolean method_1825() {
      return this.field_1626;
   }

   // $FF: renamed from: d (boolean) void
   public void method_1826(boolean var1) {
      this.field_1626 = var1;
   }

   // $FF: renamed from: g () boolean
   public boolean method_1827() {
      return this.field_1627;
   }

   // $FF: renamed from: e (boolean) void
   public void method_1828(boolean var1) {
      this.field_1627 = var1;
   }

   // $FF: renamed from: h () float
   public float method_1829() {
      return this.field_1628;
   }

   // $FF: renamed from: b (float) void
   public void method_1830(float var1) {
      this.field_1628 = var1;
   }

   // $FF: renamed from: i () float
   public float method_1831() {
      return this.field_1629;
   }

   // $FF: renamed from: c (float) void
   public void method_1832(float var1) {
      this.field_1629 = var1;
   }

   // $FF: renamed from: <clinit> () void
   static void method_1458() {
      boolean var10000 = true;
      char[] var10003 = "ZéÒ¯åÏëZé]¾äÉë¢Xü@óÅ\rþWºÆÅTÍô_þ×ö¢ÍÁ²DæÌâVãÞVÙô".toCharArray();
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
            field_1630 = (new String((char[])var3)).intern();
            return;
         }

         char var10007 = (char)((Object[])var3)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 177;
            break;
         case 1:
            var10009 = 5;
            break;
         case 2:
            var10009 = 97;
            break;
         case 3:
            var10009 = 37;
            break;
         case 4:
            var10009 = 250;
            break;
         case 5:
            var10009 = 111;
            break;
         default:
            var10009 = 16;
         }

         ((Object[])var3)[var0] = (char)(var10007 ^ var4 ^ var10009);
         ++var0;
      }
   }
}
