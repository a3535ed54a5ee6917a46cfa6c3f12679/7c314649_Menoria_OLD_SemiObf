
// $FF: renamed from: sV
public class class_309 extends class_250 {

   // $FF: renamed from: c int
   private int field_1589;
   // $FF: renamed from: d int
   private int field_1590;
   // $FF: renamed from: e add
   private add field_1591;
   // $FF: renamed from: i java.lang.String
   private static final String field_1592 = "entity=%d, slot=%d, item=%s";


   // $FF: renamed from: <init> () void
   public void method_1449() {
      super.method_1449();
   }

   // $FF: renamed from: <init> (int, int, add) void
   public void method_1763(int var1, int var2, add var3) {
      add var10001;
      label14: {
         super.method_1449();
         this.field_1589 = var1;
         String[] var10000 = class_752.method_4253();
         this.field_1590 = var2;
         String[] var4 = var10000;
         var10001 = var3;
         if(var4 != null) {
            if(var3 == null) {
               var10001 = null;
               break label14;
            }

            var10001 = var3;
         }

         var10001 = var10001.method_3754();
      }

      this.field_1591 = var10001;
   }

   // $FF: renamed from: b (d) void
   public void method_1453(class_112 var1) {
      this.field_1589 = var1.readInt();
      this.field_1590 = var1.readShort();
      this.field_1591 = var1.method_523();
   }

   // $FF: renamed from: c (d) void
   public void method_1454(class_112 var1) {
      var1.writeInt(this.field_1589);
      var1.writeShort(this.field_1590);
      var1.method_522(this.field_1591);
   }

   // $FF: renamed from: b (tF) void
   public void method_1764(class_64 var1) {
      var1.method_320(this);
   }

   // $FF: renamed from: a () add
   public add method_1765() {
      return this.field_1591;
   }

   // $FF: renamed from: c () java.lang.String
   public String method_1457() {
      return String.format("entity=%d, slot=%d, item=%s", new Object[]{Integer.valueOf(this.field_1589), Integer.valueOf(this.field_1590), this.field_1591});
   }

   // $FF: renamed from: e () int
   public int method_1766() {
      return this.field_1589;
   }

   // $FF: renamed from: f () int
   public int method_1767() {
      return this.field_1590;
   }

   // $FF: renamed from: <clinit> () void
   static void method_1458() {
      boolean var10000 = true;
      char[] var10003 = "ãX¡%ÂÝÁé è\"×°\t¬}èAõtÈ".toCharArray();
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
            field_1592 = (new String((char[])var3)).intern();
            return;
         }

         char var10007 = (char)((Object[])var3)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 239;
            break;
         case 1:
            var10009 = 134;
            break;
         case 2:
            var10009 = 39;
            break;
         case 3:
            var10009 = 195;
            break;
         case 4:
            var10009 = 90;
            break;
         case 5:
            var10009 = 176;
            break;
         default:
            var10009 = 235;
         }

         ((Object[])var3)[var0] = (char)(var10007 ^ var4 ^ var10009);
         ++var0;
      }
   }
}
