
// $FF: renamed from: sU
public class class_310 extends class_250 {

   // $FF: renamed from: c int
   private int field_1593;
   // $FF: renamed from: d int
   private int field_1594;
   // $FF: renamed from: e int
   private int field_1595;
   // $FF: renamed from: f int
   private int field_1596;
   // $FF: renamed from: i java.lang.String
   private static final String field_1597 = "id=%d, x=%.2f, y=%.2f, z=%.2f";


   // $FF: renamed from: <init> () void
   public void method_1449() {
      super.method_1449();
   }

   // $FF: renamed from: <init> (sa) void
   public void method_1768(class_689 var1) {
      this.method_1769(var1.method_3845(), var1.field_2997, var1.field_2998, var1.field_2999);
   }

   // $FF: renamed from: <init> (int, double, double, double) void
   public void method_1769(int var1, double var2, double var4, double var6) {
      super.method_1449();
      String[] var10000 = class_752.method_4253();
      this.field_1593 = var1;
      double var9 = 3.9D;
      String[] var8 = var10000;
      double var13;
      int var11 = (var13 = var2 - -var9) == 0.0D?0:(var13 < 0.0D?-1:1);
      if(var8 != null) {
         if(var11 < 0) {
            var2 = -var9;
         }

         double var14;
         var11 = (var14 = var4 - -var9) == 0.0D?0:(var14 < 0.0D?-1:1);
      }

      if(var8 != null) {
         if(var11 < 0) {
            var4 = -var9;
         }

         double var15;
         var11 = (var15 = var6 - -var9) == 0.0D?0:(var15 < 0.0D?-1:1);
      }

      if(var8 != null) {
         if(var11 < 0) {
            var6 = -var9;
         }

         double var16;
         var11 = (var16 = var2 - var9) == 0.0D?0:(var16 < 0.0D?-1:1);
      }

      if(var8 != null) {
         if(var11 > 0) {
            var2 = var9;
         }

         double var17;
         var11 = (var17 = var4 - var9) == 0.0D?0:(var17 < 0.0D?-1:1);
      }

      label49: {
         double var12;
         label58: {
            if(var8 != null) {
               if(var11 > 0) {
                  var4 = var9;
               }

               var12 = var6;
               if(var8 == null) {
                  break label58;
               }

               double var18;
               var11 = (var18 = var6 - var9) == 0.0D?0:(var18 < 0.0D?-1:1);
            }

            if(var11 <= 0) {
               break label49;
            }

            var12 = var9;
         }

         var6 = var12;
      }

      this.field_1594 = (int)(var2 * 8000.0D);
      this.field_1595 = (int)(var4 * 8000.0D);
      this.field_1596 = (int)(var6 * 8000.0D);
   }

   // $FF: renamed from: b (d) void
   public void method_1453(class_112 var1) {
      this.field_1593 = var1.readInt();
      this.field_1594 = var1.readShort();
      this.field_1595 = var1.readShort();
      this.field_1596 = var1.readShort();
   }

   // $FF: renamed from: c (d) void
   public void method_1454(class_112 var1) {
      var1.writeInt(this.field_1593);
      var1.writeShort(this.field_1594);
      var1.writeShort(this.field_1595);
      var1.writeShort(this.field_1596);
   }

   // $FF: renamed from: b (tF) void
   public void method_1770(class_64 var1) {
      var1.method_319(this);
   }

   // $FF: renamed from: c () java.lang.String
   public String method_1457() {
      return String.format("id=%d, x=%.2f, y=%.2f, z=%.2f", new Object[]{Integer.valueOf(this.field_1593), Float.valueOf((float)this.field_1594 / 8000.0F), Float.valueOf((float)this.field_1595 / 8000.0F), Float.valueOf((float)this.field_1596 / 8000.0F)});
   }

   // $FF: renamed from: a () int
   public int method_1771() {
      return this.field_1593;
   }

   // $FF: renamed from: e () int
   public int method_1772() {
      return this.field_1594;
   }

   // $FF: renamed from: f () int
   public int method_1773() {
      return this.field_1595;
   }

   // $FF: renamed from: g () int
   public int method_1774() {
      return this.field_1596;
   }

   // $FF: renamed from: <clinit> () void
   static void method_1458() {
      boolean var10000 = true;
      char[] var10003 = ";uÔ®çÀ*,Ìø­ÌrhÔäù~1ïåÒ4".toCharArray();
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
            field_1597 = (new String((char[])var3)).intern();
            return;
         }

         char var10007 = (char)((Object[])var3)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 251;
            break;
         case 1:
            var10009 = 184;
            break;
         case 2:
            var10009 = 64;
            break;
         case 3:
            var10009 = 130;
            break;
         case 4:
            var10009 = 99;
            break;
         case 5:
            var10009 = 98;
            break;
         default:
            var10009 = 73;
         }

         ((Object[])var3)[var0] = (char)(var10007 ^ var4 ^ var10009);
         ++var0;
      }
   }
}
