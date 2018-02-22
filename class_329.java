import org.apache.commons.lang3.Validate;

// $FF: renamed from: sB
public class class_329 extends class_250 {

   // $FF: renamed from: c java.lang.String
   private String field_1660;
   // $FF: renamed from: d int
   private int field_1661;
   // $FF: renamed from: e int
   private int field_1662;
   // $FF: renamed from: f int
   private int field_1663;
   // $FF: renamed from: g float
   private float field_1664;
   // $FF: renamed from: h int
   private int field_1665;
   // $FF: renamed from: i java.lang.String
   private static final String field_1666;
   // $FF: renamed from: j java.lang.String[]
   private static final String[] field_1667;


   // $FF: renamed from: <init> () void
   public void method_1449() {
      super.method_1449();
      this.field_1662 = Integer.MAX_VALUE;
   }

   // $FF: renamed from: <init> (java.lang.String, double, double, double, float, float) void
   public void method_1863(String var1, double var2, double var4, double var6, float var8, float var9) {
      class_329 var12;
      label25: {
         super.method_1449();
         this.field_1662 = Integer.MAX_VALUE;
         String[] var10000 = class_752.method_4253();
         String[] var10002 = field_1667;
         Validate.notNull(var1, "name", new Object[0]);
         String[] var10 = var10000;
         this.field_1660 = var1;
         this.field_1661 = (int)(var2 * 8.0D);
         this.field_1662 = (int)(var4 * 8.0D);
         this.field_1663 = (int)(var6 * 8.0D);
         this.field_1664 = var8;
         this.field_1665 = (int)(var9 * 63.0F);
         int var11 = this.field_1665;
         if(var10 != null) {
            if(this.field_1665 < 0) {
               this.field_1665 = 0;
            }

            var12 = this;
            if(var10 == null) {
               break label25;
            }

            var11 = this.field_1665;
         }

         if(var11 <= 255) {
            return;
         }

         var12 = this;
      }

      var12.field_1665 = 255;
   }

   // $FF: renamed from: b (d) void
   public void method_1453(class_112 var1) {
      this.field_1660 = var1.method_524(256);
      this.field_1661 = var1.readInt();
      this.field_1662 = var1.readInt();
      this.field_1663 = var1.readInt();
      this.field_1664 = var1.readFloat();
      this.field_1665 = var1.readUnsignedByte();
   }

   // $FF: renamed from: c (d) void
   public void method_1454(class_112 var1) {
      var1.method_525(this.field_1660);
      var1.writeInt(this.field_1661);
      var1.writeInt(this.field_1662);
      var1.writeInt(this.field_1663);
      var1.writeFloat(this.field_1664);
      var1.writeByte(this.field_1665);
   }

   // $FF: renamed from: a () java.lang.String
   public String method_1864() {
      return this.field_1660;
   }

   // $FF: renamed from: e () double
   public double method_1865() {
      return (double)((float)this.field_1661 / 8.0F);
   }

   // $FF: renamed from: f () double
   public double method_1866() {
      return (double)((float)this.field_1662 / 8.0F);
   }

   // $FF: renamed from: g () double
   public double method_1867() {
      return (double)((float)this.field_1663 / 8.0F);
   }

   // $FF: renamed from: h () float
   public float method_1868() {
      return this.field_1664;
   }

   // $FF: renamed from: i () float
   public float method_1869() {
      return (float)this.field_1665 / 63.0F;
   }

   // $FF: renamed from: b (tF) void
   public void method_1870(class_64 var1) {
      var1.method_328(this);
   }

   // $FF: renamed from: b (rP) void
   public void method_1455(class_57 var1) {
      this.method_1870((class_64)var1);
   }

   // $FF: renamed from: <clinit> () void
   static void method_1458() {
      String[] var5 = new String[2];
      int var3 = 0;
      String var2 = "VË&{æ sø\\\tOz";
      int var4 = "VË&{æ sø\\\tOz".length();
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
                  field_1667 = var5;
                  String[] var10 = field_1667;
                  field_1666 = "CL_00001309";
                  return;
               }

               var1 = var2.charAt(var0);
               break;
            }

            char var10007 = (char)((Object[])var9)[var6];
            short var10009;
            switch(var6 % 7) {
            case 0:
               var10009 = 236;
               break;
            case 1:
               var10009 = 126;
               break;
            case 2:
               var10009 = 171;
               break;
            case 3:
               var10009 = 151;
               break;
            case 4:
               var10009 = 28;
               break;
            case 5:
               var10009 = 115;
               break;
            default:
               var10009 = 184;
            }

            ((Object[])var9)[var6] = (char)(var10007 ^ var11 ^ var10009);
            ++var6;
         }
      }
   }
}
