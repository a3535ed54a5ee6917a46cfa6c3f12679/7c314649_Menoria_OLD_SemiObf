
// $FF: renamed from: xy
public class class_692 extends class_690 {

   // $FF: renamed from: aG c_
   private final class_982 field_3074;
   // $FF: renamed from: aH java.lang.String
   private static final String field_3075 = "CL_00001678";


   // $FF: renamed from: <init> (ahb) void
   public void method_3847(ahb var1) {
      super.method_3847(var1);
      class_983 var10001 = new class_983;
      var10001.method_5689(this);
      this.field_3074 = var10001;
   }

   // $FF: renamed from: <init> (ahb, double, double, double) void
   public void method_3980(ahb var1, double var2, double var4, double var6) {
      super.method_3980(var1, var2, var4, var6);
      class_983 var10001 = new class_983;
      var10001.method_5689(this);
      this.field_3074 = var10001;
   }

   // $FF: renamed from: s () int
   public int method_3994() {
      return 4;
   }

   // $FF: renamed from: u () aji
   public aji method_3996() {
      return class_1192.field_6079;
   }

   // $FF: renamed from: a (ro) void
   protected void method_3908(class_1583 var1) {
      super.method_3908(var1);
      this.field_3074.method_5677(var1);
   }

   // $FF: renamed from: b (ro) void
   protected void method_3909(class_1583 var1) {
      super.method_3909(var1);
      this.field_3074.method_5678(var1);
   }

   // $FF: renamed from: a (byte) void
   public void method_3932(byte var1) {
      this.field_3074.method_5680(var1);
   }

   // $FF: renamed from: h () void
   public void method_3856() {
      super.method_3856();
      this.field_3074.method_5674();
   }

   // $FF: renamed from: a () c_
   public class_982 method_4014() {
      return this.field_3074;
   }

   // $FF: renamed from: <clinit> () void
   static void method_4009() {
      boolean var10000 = true;
      char[] var10003 = "ãòóÍ÷{".toCharArray();
      Object var10004 = var10003.length;
      Object var4 = true;
      char[] var10002 = var10003;
      char[] var10001 = (char[])var10004;
      int var0 = 0;

      while(true) {
         var10003 = var10002;
         var10002 = var10001;
         var10001 = var10003;
         char[] var5 = var10002;
         var10002 = var10003;
         if(var10003 <= var0) {
            field_3075 = (new String((char[])var4)).intern();
            String var2 = field_3075;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 169;
            break;
         case 1:
            var10009 = 183;
            break;
         case 2:
            var10009 = 165;
            break;
         case 3:
            var10009 = 191;
            break;
         case 4:
            var10009 = 244;
            break;
         case 5:
            var10009 = 206;
            break;
         default:
            var10009 = 66;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}
