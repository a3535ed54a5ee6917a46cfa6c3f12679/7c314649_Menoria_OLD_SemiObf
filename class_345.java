import java.util.List;

// $FF: renamed from: r6
public class class_345 extends class_250 {

   // $FF: renamed from: c int
   private int field_1737;
   // $FF: renamed from: d int
   private int field_1738;
   // $FF: renamed from: e int
   private int field_1739;
   // $FF: renamed from: f int
   private int field_1740;
   // $FF: renamed from: g int
   private int field_1741;
   // $FF: renamed from: h int
   private int field_1742;
   // $FF: renamed from: i int
   private int field_1743;
   // $FF: renamed from: j int
   private int field_1744;
   // $FF: renamed from: k byte
   private byte field_1745;
   // $FF: renamed from: l byte
   private byte field_1746;
   // $FF: renamed from: m byte
   private byte field_1747;
   // $FF: renamed from: n x1
   private class_1710 field_1748;
   // $FF: renamed from: o java.util.List
   private List field_1749;
   // $FF: renamed from: p java.lang.String
   private static final String field_1750 = "id=%d, type=%d, x=%.2f, y=%.2f, z=%.2f, xd=%.2f, yd=%.2f, zd=%.2f";


   // $FF: renamed from: <init> () void
   public void method_1449() {
      super.method_1449();
   }

   // $FF: renamed from: <init> (sv) void
   public void method_1960(class_752 var1) {
      super.method_1449();
      String[] var10000 = class_752.method_4253();
      this.field_1737 = var1.method_3845();
      this.field_1738 = (byte)class_1775.method_9757(var1);
      this.field_1739 = var1.field_3055.method_5400(var1.field_2994);
      String[] var2 = var10000;
      this.field_1740 = class_1715.method_9561(var1.field_2995 * 32.0D);
      this.field_1741 = var1.field_3055.method_5400(var1.field_2996);
      this.field_1745 = (byte)((int)(var1.field_3000 * 256.0F / 360.0F));
      this.field_1746 = (byte)((int)(var1.field_3001 * 256.0F / 360.0F));
      this.field_1747 = (byte)((int)(var1.field_3332 * 256.0F / 360.0F));
      double var3 = 3.9D;
      double var5 = var1.field_2997;
      double var7 = var1.field_2998;
      double var9 = var1.field_2999;
      double var13;
      int var11 = (var13 = var5 - -var3) == 0.0D?0:(var13 < 0.0D?-1:1);
      if(var2 != null) {
         if(var11 < 0) {
            var5 = -var3;
         }

         double var14;
         var11 = (var14 = var7 - -var3) == 0.0D?0:(var14 < 0.0D?-1:1);
      }

      if(var2 != null) {
         if(var11 < 0) {
            var7 = -var3;
         }

         double var15;
         var11 = (var15 = var9 - -var3) == 0.0D?0:(var15 < 0.0D?-1:1);
      }

      if(var2 != null) {
         if(var11 < 0) {
            var9 = -var3;
         }

         double var16;
         var11 = (var16 = var5 - var3) == 0.0D?0:(var16 < 0.0D?-1:1);
      }

      if(var2 != null) {
         if(var11 > 0) {
            var5 = var3;
         }

         double var17;
         var11 = (var17 = var7 - var3) == 0.0D?0:(var17 < 0.0D?-1:1);
      }

      label49: {
         double var12;
         label58: {
            if(var2 != null) {
               if(var11 > 0) {
                  var7 = var3;
               }

               var12 = var9;
               if(var2 == null) {
                  break label58;
               }

               double var18;
               var11 = (var18 = var9 - var3) == 0.0D?0:(var18 < 0.0D?-1:1);
            }

            if(var11 <= 0) {
               break label49;
            }

            var12 = var3;
         }

         var9 = var12;
      }

      this.field_1742 = (int)(var5 * 8000.0D);
      this.field_1743 = (int)(var7 * 8000.0D);
      this.field_1744 = (int)(var9 * 8000.0D);
      this.field_1748 = var1.method_3849();
   }

   // $FF: renamed from: b (d) void
   public void method_1453(class_112 var1) {
      this.field_1737 = var1.method_518();
      this.field_1738 = var1.readByte() & 255;
      this.field_1739 = var1.readInt();
      this.field_1740 = var1.readInt();
      this.field_1741 = var1.readInt();
      this.field_1745 = var1.readByte();
      this.field_1746 = var1.readByte();
      this.field_1747 = var1.readByte();
      this.field_1742 = var1.readShort();
      this.field_1743 = var1.readShort();
      this.field_1744 = var1.readShort();
      this.field_1749 = class_1710.method_9514(var1);
   }

   // $FF: renamed from: c (d) void
   public void method_1454(class_112 var1) {
      var1.method_519(this.field_1737);
      var1.writeByte(this.field_1738 & 255);
      var1.writeInt(this.field_1739);
      var1.writeInt(this.field_1740);
      var1.writeInt(this.field_1741);
      var1.writeByte(this.field_1745);
      var1.writeByte(this.field_1746);
      var1.writeByte(this.field_1747);
      var1.writeShort(this.field_1742);
      var1.writeShort(this.field_1743);
      var1.writeShort(this.field_1744);
      this.field_1748.method_9511(var1);
   }

   // $FF: renamed from: b (tF) void
   public void method_1961(class_64 var1) {
      var1.method_274(this);
   }

   // $FF: renamed from: a () java.util.List
   public List method_1962() {
      String[] var1 = class_752.method_4253();
      List var10000 = this.field_1749;
      if(var1 != null) {
         if(this.field_1749 == null) {
            this.field_1749 = this.field_1748.method_9512();
         }

         var10000 = this.field_1749;
      }

      return var10000;
   }

   // $FF: renamed from: c () java.lang.String
   public String method_1457() {
      return String.format("id=%d, type=%d, x=%.2f, y=%.2f, z=%.2f, xd=%.2f, yd=%.2f, zd=%.2f", new Object[]{Integer.valueOf(this.field_1737), Integer.valueOf(this.field_1738), Float.valueOf((float)this.field_1739 / 32.0F), Float.valueOf((float)this.field_1740 / 32.0F), Float.valueOf((float)this.field_1741 / 32.0F), Float.valueOf((float)this.field_1742 / 8000.0F), Float.valueOf((float)this.field_1743 / 8000.0F), Float.valueOf((float)this.field_1744 / 8000.0F)});
   }

   // $FF: renamed from: e () int
   public int method_1963() {
      return this.field_1737;
   }

   // $FF: renamed from: f () int
   public int method_1964() {
      return this.field_1738;
   }

   // $FF: renamed from: g () int
   public int method_1965() {
      return this.field_1739;
   }

   // $FF: renamed from: h () int
   public int method_1966() {
      return this.field_1740;
   }

   // $FF: renamed from: i () int
   public int method_1967() {
      return this.field_1741;
   }

   // $FF: renamed from: j () int
   public int method_1968() {
      return this.field_1742;
   }

   // $FF: renamed from: k () int
   public int method_1969() {
      return this.field_1743;
   }

   // $FF: renamed from: l () int
   public int method_1970() {
      return this.field_1744;
   }

   // $FF: renamed from: m () byte
   public byte method_1971() {
      return this.field_1745;
   }

   // $FF: renamed from: n () byte
   public byte method_1972() {
      return this.field_1746;
   }

   // $FF: renamed from: o () byte
   public byte method_1973() {
      return this.field_1747;
   }

   // $FF: renamed from: <clinit> () void
   static void method_1458() {
      boolean var10000 = true;
      char[] var10003 = "w¼ýóÚâj¡°³ÄÓ¦2ø¸ëÜØðxôà¯ÄÓì,¾ìöËç0ê¦úÙ¦#ýîäÚâg¼ýó×Ä¤2øº²ÄÓì,¾".toCharArray();
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
            field_1750 = (new String((char[])var3)).intern();
            return;
         }

         char var10007 = (char)((Object[])var3)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 78;
            break;
         case 1:
            var10009 = 136;
            break;
         case 2:
            var10009 = 144;
            break;
         case 3:
            var10009 = 134;
            break;
         case 4:
            var10009 = 169;
            break;
         case 5:
            var10009 = 166;
            break;
         default:
            var10009 = 146;
         }

         ((Object[])var3)[var0] = (char)(var10007 ^ var4 ^ var10009);
         ++var0;
      }
   }
}
