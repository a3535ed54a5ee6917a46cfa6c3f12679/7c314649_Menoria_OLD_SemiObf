
// $FF: renamed from: r3
public class class_348 extends class_250 {

   // $FF: renamed from: c int
   private int field_1763;
   // $FF: renamed from: d int
   private int field_1764;
   // $FF: renamed from: e int
   private int field_1765;
   // $FF: renamed from: f int
   private int field_1766;
   // $FF: renamed from: g int
   private int field_1767;
   // $FF: renamed from: h int
   private int field_1768;
   // $FF: renamed from: i int
   private int field_1769;
   // $FF: renamed from: j int
   private int field_1770;
   // $FF: renamed from: k int
   private int field_1771;
   // $FF: renamed from: l int
   private int field_1772;
   // $FF: renamed from: m int
   private int field_1773;
   // $FF: renamed from: n java.lang.String
   private static final String field_1774 = "id=%d, type=%d, x=%.2f, y=%.2f, z=%.2f";


   // $FF: renamed from: <init> () void
   public void method_1449() {
      super.method_1449();
   }

   // $FF: renamed from: <init> (sa, int) void
   public void method_1988(class_689 var1, int var2) {
      this.method_1989(var1, var2, 0);
   }

   // $FF: renamed from: <init> (sa, int, int) void
   public void method_1989(class_689 var1, int var2, int var3) {
      String[] var10000 = class_752.method_4253();
      super.method_1449();
      String[] var4 = var10000;
      this.field_1763 = var1.method_3845();
      this.field_1764 = class_1715.method_9561(var1.field_2994 * 32.0D);
      this.field_1765 = class_1715.method_9561(var1.field_2995 * 32.0D);
      this.field_1766 = class_1715.method_9561(var1.field_2996 * 32.0D);
      this.field_1770 = class_1715.method_9559(var1.field_3001 * 256.0F / 360.0F);
      this.field_1771 = class_1715.method_9559(var1.field_3000 * 256.0F / 360.0F);
      this.field_1772 = var2;
      this.field_1773 = var3;
      if(var3 > 0) {
         double var5 = var1.field_2997;
         double var7 = var1.field_2998;
         double var9 = var1.field_2999;
         double var11 = 3.9D;
         double var15;
         int var13 = (var15 = var5 - -var11) == 0.0D?0:(var15 < 0.0D?-1:1);
         if(var4 != null) {
            if(var13 < 0) {
               var5 = -var11;
            }

            double var16;
            var13 = (var16 = var7 - -var11) == 0.0D?0:(var16 < 0.0D?-1:1);
         }

         if(var4 != null) {
            if(var13 < 0) {
               var7 = -var11;
            }

            double var17;
            var13 = (var17 = var9 - -var11) == 0.0D?0:(var17 < 0.0D?-1:1);
         }

         if(var4 != null) {
            if(var13 < 0) {
               var9 = -var11;
            }

            double var18;
            var13 = (var18 = var5 - var11) == 0.0D?0:(var18 < 0.0D?-1:1);
         }

         if(var4 != null) {
            if(var13 > 0) {
               var5 = var11;
            }

            double var19;
            var13 = (var19 = var7 - var11) == 0.0D?0:(var19 < 0.0D?-1:1);
         }

         label51: {
            double var14;
            label62: {
               if(var4 != null) {
                  if(var13 > 0) {
                     var7 = var11;
                  }

                  var14 = var9;
                  if(var4 == null) {
                     break label62;
                  }

                  double var20;
                  var13 = (var20 = var9 - var11) == 0.0D?0:(var20 < 0.0D?-1:1);
               }

               if(var13 <= 0) {
                  break label51;
               }

               var14 = var11;
            }

            var9 = var14;
         }

         this.field_1767 = (int)(var5 * 8000.0D);
         this.field_1768 = (int)(var7 * 8000.0D);
         this.field_1769 = (int)(var9 * 8000.0D);
      }

   }

   // $FF: renamed from: b (d) void
   public void method_1453(class_112 var1) {
      this.field_1763 = var1.method_518();
      this.field_1772 = var1.readByte();
      this.field_1764 = var1.readInt();
      this.field_1765 = var1.readInt();
      this.field_1766 = var1.readInt();
      String[] var10000 = class_752.method_4253();
      this.field_1770 = var1.readByte();
      this.field_1771 = var1.readByte();
      String[] var2 = var10000;
      this.field_1773 = var1.readInt();
      class_348 var3 = this;
      if(var2 != null) {
         if(this.field_1773 <= 0) {
            return;
         }

         this.field_1767 = var1.readShort();
         this.field_1768 = var1.readShort();
         var3 = this;
      }

      var3.field_1769 = var1.readShort();
   }

   // $FF: renamed from: c (d) void
   public void method_1454(class_112 var1) {
      var1.method_519(this.field_1763);
      var1.writeByte(this.field_1772);
      var1.writeInt(this.field_1764);
      var1.writeInt(this.field_1765);
      var1.writeInt(this.field_1766);
      String[] var10000 = class_752.method_4253();
      var1.writeByte(this.field_1770);
      String[] var2 = var10000;
      var1.writeByte(this.field_1771);
      var1.writeInt(this.field_1773);
      if(var2 != null) {
         if(this.field_1773 <= 0) {
            return;
         }

         var1.writeShort(this.field_1767);
         var1.writeShort(this.field_1768);
      }

      var1.writeShort(this.field_1769);
   }

   // $FF: renamed from: b (tF) void
   public void method_1990(class_64 var1) {
      var1.method_271(this);
   }

   // $FF: renamed from: c () java.lang.String
   public String method_1457() {
      return String.format("id=%d, type=%d, x=%.2f, y=%.2f, z=%.2f", new Object[]{Integer.valueOf(this.field_1763), Integer.valueOf(this.field_1772), Float.valueOf((float)this.field_1764 / 32.0F), Float.valueOf((float)this.field_1765 / 32.0F), Float.valueOf((float)this.field_1766 / 32.0F)});
   }

   // $FF: renamed from: a () int
   public int method_1991() {
      return this.field_1763;
   }

   // $FF: renamed from: e () int
   public int method_1992() {
      return this.field_1764;
   }

   // $FF: renamed from: f () int
   public int method_1993() {
      return this.field_1765;
   }

   // $FF: renamed from: g () int
   public int method_1994() {
      return this.field_1766;
   }

   // $FF: renamed from: h () int
   public int method_1995() {
      return this.field_1767;
   }

   // $FF: renamed from: i () int
   public int method_1996() {
      return this.field_1768;
   }

   // $FF: renamed from: j () int
   public int method_1997() {
      return this.field_1769;
   }

   // $FF: renamed from: k () int
   public int method_1998() {
      return this.field_1770;
   }

   // $FF: renamed from: l () int
   public int method_1999() {
      return this.field_1771;
   }

   // $FF: renamed from: m () int
   public int method_2000() {
      return this.field_1772;
   }

   // $FF: renamed from: n () int
   public int method_2001() {
      return this.field_1773;
   }

   // $FF: renamed from: b (int) void
   public void method_2002(int var1) {
      this.field_1764 = var1;
   }

   // $FF: renamed from: c (int) void
   public void method_2003(int var1) {
      this.field_1765 = var1;
   }

   // $FF: renamed from: d (int) void
   public void method_2004(int var1) {
      this.field_1766 = var1;
   }

   // $FF: renamed from: e (int) void
   public void method_2005(int var1) {
      this.field_1767 = var1;
   }

   // $FF: renamed from: f (int) void
   public void method_2006(int var1) {
      this.field_1768 = var1;
   }

   // $FF: renamed from: g (int) void
   public void method_2007(int var1) {
      this.field_1769 = var1;
   }

   // $FF: renamed from: h (int) void
   public void method_2008(int var1) {
      this.field_1773 = var1;
   }

   // $FF: renamed from: <clinit> () void
   static void method_1458() {
      boolean var10000 = true;
      char[] var10003 = "¾Aeé°¥£\\(©é¬Sû ññ§±\txµé¬åCtì®´ù>".toCharArray();
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
            field_1774 = (new String((char[])var3)).intern();
            return;
         }

         char var10007 = (char)((Object[])var3)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 28;
            break;
         case 1:
            var10009 = 238;
            break;
         case 2:
            var10009 = 147;
            break;
         case 3:
            var10009 = 7;
            break;
         case 4:
            var10009 = 31;
            break;
         case 5:
            var10009 = 66;
            break;
         default:
            var10009 = 252;
         }

         ((Object[])var3)[var0] = (char)(var10007 ^ var4 ^ var10009);
         ++var0;
      }
   }
}
