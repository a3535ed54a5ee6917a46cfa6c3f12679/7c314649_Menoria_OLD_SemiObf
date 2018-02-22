
// $FF: renamed from: sC
public class class_328 extends class_250 {

   // $FF: renamed from: c int
   private int field_1652;
   // $FF: renamed from: d boolean
   private boolean field_1653;
   // $FF: renamed from: e G
   private class_94 field_1654;
   // $FF: renamed from: f int
   private int field_1655;
   // $FF: renamed from: g aq
   private class_918 field_1656;
   // $FF: renamed from: h int
   private int field_1657;
   // $FF: renamed from: i du
   private class_1046 field_1658;
   // $FF: renamed from: j java.lang.String
   private static final String field_1659 = "eid=%d, gameType=%d, hardcore=%b, dimension=%d, difficulty=%s, maxplayers=%d";


   // $FF: renamed from: <init> () void
   public void method_1449() {
      super.method_1449();
   }

   // $FF: renamed from: <init> (int, G, boolean, int, aq, int, du) void
   public void method_1854(int var1, class_94 var2, boolean var3, int var4, class_918 var5, int var6, class_1046 var7) {
      super.method_1449();
      this.field_1652 = var1;
      this.field_1655 = var4;
      this.field_1656 = var5;
      this.field_1654 = var2;
      this.field_1657 = var6;
      this.field_1653 = var3;
      this.field_1658 = var7;
   }

   // $FF: renamed from: b (d) void
   public void method_1453(class_112 var1) {
      String[] var10000 = class_752.method_4253();
      this.field_1652 = var1.readInt();
      short var3 = var1.readUnsignedByte();
      String[] var2 = var10000;
      int var10001 = var3 & 8;
      if(var2 != null) {
         var10001 = var10001 == 8?1:0;
      }

      this.field_1653 = (boolean)var10001;
      int var4 = var3 & -9;
      this.field_1654 = class_94.method_449(var4);
      this.field_1655 = var1.readByte();
      this.field_1656 = class_918.method_5393(var1.readUnsignedByte());
      this.field_1657 = var1.readUnsignedByte();
      this.field_1658 = class_1046.method_5931(var1.method_524(16));
      class_328 var5 = this;
      if(var2 != null) {
         if(this.field_1658 != null) {
            return;
         }

         var5 = this;
      }

      var5.field_1658 = class_1046.field_5527;
   }

   // $FF: renamed from: c (d) void
   public void method_1454(class_112 var1) {
      String[] var10000 = class_752.method_4253();
      var1.writeInt(this.field_1652);
      String[] var2 = var10000;
      int var3 = this.field_1654.method_443();
      if(var2 != null) {
         if(this.field_1653) {
            var3 |= 8;
         }

         var1.writeByte(var3);
         var1.writeByte(this.field_1655);
         var1.writeByte(this.field_1656.method_5392());
         var1.writeByte(this.field_1657);
         var1.method_525(this.field_1658.method_5922());
      }

   }

   // $FF: renamed from: b (tF) void
   public void method_1855(class_64 var1) {
      var1.getBlock6(this);
   }

   // $FF: renamed from: c () java.lang.String
   public String method_1457() {
      return String.format("eid=%d, gameType=%d, hardcore=%b, dimension=%d, difficulty=%s, maxplayers=%d", new Object[]{Integer.valueOf(this.field_1652), Integer.valueOf(this.field_1654.method_443()), Boolean.valueOf(this.field_1653), Integer.valueOf(this.field_1655), this.field_1656, Integer.valueOf(this.field_1657)});
   }

   // $FF: renamed from: a () int
   public int method_1856() {
      return this.field_1652;
   }

   // $FF: renamed from: e () boolean
   public boolean method_1857() {
      return this.field_1653;
   }

   // $FF: renamed from: f () G
   public class_94 method_1858() {
      return this.field_1654;
   }

   // $FF: renamed from: g () int
   public int method_1859() {
      return this.field_1655;
   }

   // $FF: renamed from: h () aq
   public class_918 method_1860() {
      return this.field_1656;
   }

   // $FF: renamed from: i () int
   public int method_1861() {
      return this.field_1657;
   }

   // $FF: renamed from: j () du
   public class_1046 method_1862() {
      return this.field_1658;
   }

   // $FF: renamed from: <clinit> () void
   static void method_1458() {
      boolean var10000 = true;
      char[] var10003 = "Ë÷»fFzÀÅòë&v/Ç®£\'vÃáâ M$¶äo2Ïöè0K9¶âo2Äõï W:Û®£0vÃëö/C/Ðà»fF".toCharArray();
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
            field_1659 = (new String((char[])var3)).intern();
            return;
         }

         char var10007 = (char)((Object[])var3)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 53;
            break;
         case 1:
            var10009 = 119;
            break;
         case 2:
            var10009 = 70;
            break;
         case 3:
            var10009 = 83;
            break;
         case 4:
            var10009 = 150;
            break;
         case 5:
            var10009 = 247;
            break;
         default:
            var10009 = 131;
         }

         ((Object[])var3)[var0] = (char)(var10007 ^ var4 ^ var10009);
         ++var0;
      }
   }
}
