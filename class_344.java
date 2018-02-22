
// $FF: renamed from: r7
public class class_344 extends class_250 {

   // $FF: renamed from: c int
   private int field_1730;
   // $FF: renamed from: d int
   private int field_1731;
   // $FF: renamed from: e int
   private int field_1732;
   // $FF: renamed from: f int
   private int field_1733;
   // $FF: renamed from: g int
   private int field_1734;
   // $FF: renamed from: h java.lang.String
   private String field_1735;
   // $FF: renamed from: i java.lang.String
   private static final String field_1736 = "id=%d, type=%s, x=%d, y=%d, z=%d";


   // $FF: renamed from: <init> () void
   public void method_1449() {
      super.method_1449();
   }

   // $FF: renamed from: <init> (wF) void
   public void method_1952(class_749 var1) {
      super.method_1449();
      this.field_1730 = var1.method_3845();
      this.field_1731 = var1.field_3295;
      this.field_1732 = var1.field_3296;
      this.field_1733 = var1.field_3297;
      this.field_1734 = var1.field_3294;
      this.field_1735 = var1.field_3299.field_4701;
   }

   // $FF: renamed from: b (d) void
   public void method_1453(class_112 var1) {
      this.field_1730 = var1.method_518();
      this.field_1735 = var1.method_524(class_925.field_4700);
      this.field_1731 = var1.readInt();
      this.field_1732 = var1.readInt();
      this.field_1733 = var1.readInt();
      this.field_1734 = var1.readInt();
   }

   // $FF: renamed from: c (d) void
   public void method_1454(class_112 var1) {
      var1.method_519(this.field_1730);
      var1.method_525(this.field_1735);
      var1.writeInt(this.field_1731);
      var1.writeInt(this.field_1732);
      var1.writeInt(this.field_1733);
      var1.writeInt(this.field_1734);
   }

   // $FF: renamed from: b (tF) void
   public void method_1953(class_64 var1) {
      var1.method_276(this);
   }

   // $FF: renamed from: c () java.lang.String
   public String method_1457() {
      return String.format("id=%d, type=%s, x=%d, y=%d, z=%d", new Object[]{Integer.valueOf(this.field_1730), this.field_1735, Integer.valueOf(this.field_1731), Integer.valueOf(this.field_1732), Integer.valueOf(this.field_1733)});
   }

   // $FF: renamed from: a () int
   public int method_1954() {
      return this.field_1730;
   }

   // $FF: renamed from: e () int
   public int method_1955() {
      return this.field_1731;
   }

   // $FF: renamed from: f () int
   public int method_1956() {
      return this.field_1732;
   }

   // $FF: renamed from: g () int
   public int method_1957() {
      return this.field_1733;
   }

   // $FF: renamed from: h () int
   public int method_1958() {
      return this.field_1734;
   }

   // $FF: renamed from: i () java.lang.String
   public String method_1959() {
      return this.field_1735;
   }

   // $FF: renamed from: <clinit> () void
   static void method_1458() {
      boolean var10000 = true;
      char[] var10003 = "ÞgÞ>ÃB\'××mRJÏ2gÞ>ÍO&".toCharArray();
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
            field_1736 = (new String((char[])var3)).intern();
            return;
         }

         char var10007 = (char)((Object[])var3)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 202;
            break;
         case 1:
            var10009 = 15;
            break;
         case 2:
            var10009 = 79;
            break;
         case 3:
            var10009 = 63;
            break;
         case 4:
            var10009 = 151;
            break;
         case 5:
            var10009 = 143;
            break;
         default:
            var10009 = 99;
         }

         ((Object[])var3)[var0] = (char)(var10007 ^ var4 ^ var10009);
         ++var0;
      }
   }
}
