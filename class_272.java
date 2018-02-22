
// $FF: renamed from: te
public class class_272 extends class_250 {

   // $FF: renamed from: c int
   private int field_1445;
   // $FF: renamed from: d int
   private int field_1446;
   // $FF: renamed from: e int
   private int field_1447;
   // $FF: renamed from: f short
   private short field_1448;
   // $FF: renamed from: g add
   private add field_1449;
   // $FF: renamed from: h int
   private int field_1450;
   // $FF: renamed from: i java.lang.String[]
   private static final String[] field_1451;


   // $FF: renamed from: <init> () void
   public void method_1449() {
      super.method_1449();
   }

   // $FF: renamed from: <init> (int, int, int, int, add, short) void
   public void method_1562(int var1, int var2, int var3, int var4, add var5, short var6) {
      super.method_1449();
      String[] var10000 = class_752.method_4253();
      this.field_1445 = var1;
      this.field_1446 = var2;
      String[] var7 = var10000;
      this.field_1447 = var3;
      add var10001 = var5;
      if(var7 != null) {
         var10001 = var5 != null?var5.method_3754():null;
      }

      this.field_1449 = var10001;
      this.field_1448 = var6;
      this.field_1450 = var4;
   }

   // $FF: renamed from: b (tL) void
   public void method_1563(class_63 var1) {
      var1.method_257(this);
   }

   // $FF: renamed from: b (d) void
   public void method_1453(class_112 var1) {
      this.field_1445 = var1.readByte();
      this.field_1446 = var1.readShort();
      this.field_1447 = var1.readByte();
      this.field_1448 = var1.readShort();
      this.field_1450 = var1.readByte();
      this.field_1449 = var1.method_523();
   }

   // $FF: renamed from: c (d) void
   public void method_1454(class_112 var1) {
      var1.writeByte(this.field_1445);
      var1.writeShort(this.field_1446);
      var1.writeByte(this.field_1447);
      var1.writeShort(this.field_1448);
      var1.writeByte(this.field_1450);
      var1.method_522(this.field_1449);
   }

   // $FF: renamed from: c () java.lang.String
   public String method_1457() {
      if(this.field_1449 != null) {
         String[] var1 = field_1451;
         return String.format("id=%d, slot=%d, button=%d, type=%d, itemid=%d, itemcount=%d, itemaux=%d", new Object[]{Integer.valueOf(this.field_1445), Integer.valueOf(this.field_1446), Integer.valueOf(this.field_1447), Integer.valueOf(this.field_1450), Integer.valueOf(adb.method_2918(this.field_1449.method_3730())), Integer.valueOf(this.field_1449.field_2958), Integer.valueOf(this.field_1449.method_3745())});
      } else {
         String[] var10000 = field_1451;
         return String.format("id=%d, slot=%d, button=%d, type=%d, itemid=-1", new Object[]{Integer.valueOf(this.field_1445), Integer.valueOf(this.field_1446), Integer.valueOf(this.field_1447), Integer.valueOf(this.field_1450)});
      }
   }

   // $FF: renamed from: a () int
   public int method_1564() {
      return this.field_1445;
   }

   // $FF: renamed from: e () int
   public int method_1565() {
      return this.field_1446;
   }

   // $FF: renamed from: f () int
   public int method_1566() {
      return this.field_1447;
   }

   // $FF: renamed from: g () short
   public short method_1567() {
      return this.field_1448;
   }

   // $FF: renamed from: h () add
   public add method_1568() {
      return this.field_1449;
   }

   // $FF: renamed from: i () int
   public int method_1569() {
      return this.field_1450;
   }

   // $FF: renamed from: <clinit> () void
   static void method_1458() {
      String[] var5 = new String[2];
      int var3 = 0;
      String var2 = "tÒ\tt!1nÚ[%Â(u1V$y~s5Ó-edÆQlÚi==ß@4du GtÒ\tt!1nÚ[%Â(u1V$y~s5Ó-edÆQlÚi==ß@4du P}ßdexÛW>ce P}ßdexÛU$04y";
      int var4 = "tÒ\tt!1nÚ[%Â(u1V$y~s5Ó-edÆQlÚi==ß@4du GtÒ\tt!1nÚ[%Â(u1V$y~s5Ó-edÆQlÚi==ß@4du P}ßdexÛW>ce P}ßdexÛU$04y".length();
      char var1 = 45;
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
                  field_1451 = var5;
                  return;
               }

               var1 = var2.charAt(var0);
               break;
            }

            char var10007 = (char)((Object[])var9)[var6];
            short var10009;
            switch(var6 % 7) {
            case 0:
               var10009 = 19;
               break;
            case 1:
               var10009 = 184;
               break;
            case 2:
               var10009 = 58;
               break;
            case 3:
               var10009 = 95;
               break;
            case 4:
               var10009 = 241;
               break;
            case 5:
               var10009 = 3;
               break;
            default:
               var10009 = 31;
            }

            ((Object[])var9)[var6] = (char)(var10007 ^ var10 ^ var10009);
            ++var6;
         }
      }
   }
}
