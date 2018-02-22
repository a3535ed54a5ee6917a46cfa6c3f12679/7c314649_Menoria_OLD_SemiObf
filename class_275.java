
// $FF: renamed from: tb
public class class_275 extends class_250 {

   // $FF: renamed from: c java.lang.String
   private String field_1459;
   // $FF: renamed from: d int
   private int field_1460;
   // $FF: renamed from: e ay
   private class_932 field_1461;
   // $FF: renamed from: f boolean
   private boolean field_1462;
   // $FF: renamed from: g aq
   private class_918 field_1463;
   // $FF: renamed from: h boolean
   private boolean field_1464;
   // $FF: renamed from: i java.lang.String
   private static final String field_1465 = "lang=\'%s\', view=%d, chat=%s, col=%b, difficulty=%s, cape=%b";


   // $FF: renamed from: <init> () void
   public void method_1449() {
      super.method_1449();
   }

   // $FF: renamed from: <init> (java.lang.String, int, ay, boolean, aq, boolean) void
   public void method_1578(String var1, int var2, class_932 var3, boolean var4, class_918 var5, boolean var6) {
      super.method_1449();
      this.field_1459 = var1;
      this.field_1460 = var2;
      this.field_1461 = var3;
      this.field_1462 = var4;
      this.field_1463 = var5;
      this.field_1464 = var6;
   }

   // $FF: renamed from: b (d) void
   public void method_1453(class_112 var1) {
      this.field_1459 = var1.method_524(7);
      this.field_1460 = var1.readByte();
      this.field_1461 = class_932.method_5460(var1.readByte());
      this.field_1462 = var1.readBoolean();
      this.field_1463 = class_918.method_5393(var1.readByte());
      this.field_1464 = var1.readBoolean();
   }

   // $FF: renamed from: c (d) void
   public void method_1454(class_112 var1) {
      var1.method_525(this.field_1459);
      var1.writeByte(this.field_1460);
      var1.writeByte(this.field_1461.method_5459());
      var1.writeBoolean(this.field_1462);
      var1.writeByte(this.field_1463.method_5392());
      var1.writeBoolean(this.field_1464);
   }

   // $FF: renamed from: b (tL) void
   public void method_1579(class_63 var1) {
      var1.method_254(this);
   }

   // $FF: renamed from: a () java.lang.String
   public String method_1580() {
      return this.field_1459;
   }

   // $FF: renamed from: e () int
   public int method_1581() {
      return this.field_1460;
   }

   // $FF: renamed from: f () ay
   public class_932 method_1582() {
      return this.field_1461;
   }

   // $FF: renamed from: g () boolean
   public boolean method_1583() {
      return this.field_1462;
   }

   // $FF: renamed from: h () aq
   public class_918 method_1584() {
      return this.field_1463;
   }

   // $FF: renamed from: i () boolean
   public boolean method_1585() {
      return this.field_1464;
   }

   // $FF: renamed from: c () java.lang.String
   public String method_1457() {
      return String.format("lang=\'%s\', view=%d, chat=%s, col=%b, difficulty=%s, cape=%b", new Object[]{this.field_1459, Integer.valueOf(this.field_1460), this.field_1461, Boolean.valueOf(this.field_1462), this.field_1463, Boolean.valueOf(this.field_1464)});
   }

   // $FF: renamed from: <clinit> () void
   static void method_1458() {
      boolean var10000 = true;
      char[] var10003 = "ù5)+\r(æskl[Châib(\nný53q\bY!µ7( o¹t#%KLdö!+8T(æxg/LZh¨q%".toCharArray();
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
            field_1465 = (new String((char[])var3)).intern();
            return;
         }

         char var10007 = (char)((Object[])var3)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 155;
            break;
         case 1:
            var10009 = 90;
            break;
         case 2:
            var10009 = 73;
            break;
         case 3:
            var10009 = 66;
            break;
         case 4:
            var10009 = 35;
            break;
         case 5:
            var10009 = 36;
            break;
         default:
            var10009 = 3;
         }

         ((Object[])var3)[var0] = (char)(var10007 ^ var4 ^ var10009);
         ++var0;
      }
   }
}
