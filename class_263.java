
// $FF: renamed from: tn
public class class_263 extends class_250 {

   // $FF: renamed from: c boolean
   private boolean field_1418;
   // $FF: renamed from: d boolean
   private boolean field_1419;
   // $FF: renamed from: e boolean
   private boolean field_1420;
   // $FF: renamed from: f boolean
   private boolean field_1421;
   // $FF: renamed from: g float
   private float field_1422;
   // $FF: renamed from: h float
   private float field_1423;
   // $FF: renamed from: i java.lang.String
   private static final String field_1424 = "invuln=%b, flying=%b, canfly=%b, instabuild=%b, flyspeed=%.4f, walkspped=%.4f";


   // $FF: renamed from: <init> () void
   public void method_1449() {
      super.method_1449();
   }

   // $FF: renamed from: <init> (Ae) void
   public void method_1518(class_665 var1) {
      super.method_1449();
      this.method_1521(var1.field_2836);
      this.method_1523(var1.field_2837);
      this.method_1525(var1.field_2838);
      this.method_1527(var1.field_2839);
      this.method_1529(var1.method_3587());
      this.method_1531(var1.method_3589());
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

      this.method_1521((boolean)var10001);
      var10001 = var3 & 2;
      if(var2 != null) {
         var10001 = var10001 > 0?1:0;
      }

      this.method_1523((boolean)var10001);
      var10001 = var3 & 4;
      if(var2 != null) {
         var10001 = var10001 > 0?1:0;
      }

      this.method_1525((boolean)var10001);
      var10001 = var3 & 8;
      if(var2 != null) {
         var10001 = var10001 > 0?1:0;
      }

      this.method_1527((boolean)var10001);
      this.method_1529(var1.readFloat());
      this.method_1531(var1.readFloat());
   }

   // $FF: renamed from: c (d) void
   public void method_1454(class_112 var1) {
      String[] var10000 = class_752.method_4253();
      byte var3 = 0;
      String[] var2 = var10000;
      byte var4 = this.method_1520();
      if(var2 != null) {
         if(var4 != 0) {
            var3 = (byte)(var3 | 1);
         }

         var4 = this.method_1522();
      }

      if(var2 != null) {
         if(var4 != 0) {
            var3 = (byte)(var3 | 2);
         }

         var4 = this.method_1524();
      }

      if(var2 != null) {
         if(var4 != 0) {
            var3 = (byte)(var3 | 4);
         }

         var4 = this.method_1526();
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
      var1.writeFloat(this.field_1422);
      var1.writeFloat(this.field_1423);
   }

   // $FF: renamed from: b (tL) void
   public void method_1519(class_63 var1) {
      var1.method_263(this);
   }

   // $FF: renamed from: c () java.lang.String
   public String method_1457() {
      return String.format("invuln=%b, flying=%b, canfly=%b, instabuild=%b, flyspeed=%.4f, walkspped=%.4f", new Object[]{Boolean.valueOf(this.method_1520()), Boolean.valueOf(this.method_1522()), Boolean.valueOf(this.method_1524()), Boolean.valueOf(this.method_1526()), Float.valueOf(this.method_1528()), Float.valueOf(this.method_1530())});
   }

   // $FF: renamed from: a () boolean
   public boolean method_1520() {
      return this.field_1418;
   }

   // $FF: renamed from: b (boolean) void
   public void method_1521(boolean var1) {
      this.field_1418 = var1;
   }

   // $FF: renamed from: e () boolean
   public boolean method_1522() {
      return this.field_1419;
   }

   // $FF: renamed from: c (boolean) void
   public void method_1523(boolean var1) {
      this.field_1419 = var1;
   }

   // $FF: renamed from: f () boolean
   public boolean method_1524() {
      return this.field_1420;
   }

   // $FF: renamed from: d (boolean) void
   public void method_1525(boolean var1) {
      this.field_1420 = var1;
   }

   // $FF: renamed from: g () boolean
   public boolean method_1526() {
      return this.field_1421;
   }

   // $FF: renamed from: e (boolean) void
   public void method_1527(boolean var1) {
      this.field_1421 = var1;
   }

   // $FF: renamed from: h () float
   public float method_1528() {
      return this.field_1422;
   }

   // $FF: renamed from: b (float) void
   public void method_1529(float var1) {
      this.field_1422 = var1;
   }

   // $FF: renamed from: i () float
   public float method_1530() {
      return this.field_1423;
   }

   // $FF: renamed from: c (float) void
   public void method_1531(float var1) {
      this.field_1423 = var1;
   }

   // $FF: renamed from: <clinit> () void
   static void method_1458() {
      boolean var10000 = true;
      char[] var10003 = "»/3ãQ÷ufá»>{Uï@ò8(áïQ;jPä¡ 8$ä ¶I|$\\­\n¾\r*6è\bïQwr¡L¥5-ý·dc^¹\n".toCharArray();
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
            field_1424 = (new String((char[])var3)).intern();
            return;
         }

         char var10007 = (char)((Object[])var3)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 168;
            break;
         case 1:
            var10009 = 14;
            break;
         case 2:
            var10009 = 35;
            break;
         case 3:
            var10009 = 60;
            break;
         case 4:
            var10009 = 10;
            break;
         case 5:
            var10009 = 247;
            break;
         default:
            var10009 = 22;
         }

         ((Object[])var3)[var0] = (char)(var10007 ^ var4 ^ var10009);
         ++var0;
      }
   }
}
