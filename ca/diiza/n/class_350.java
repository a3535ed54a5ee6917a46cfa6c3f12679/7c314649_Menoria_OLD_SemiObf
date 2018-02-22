package ca.diiza.n;


// $FF: renamed from: ca.diiza.n.d
public class class_350 extends class_250 {

   // $FF: renamed from: a int
   private int field_1781;
   // $FF: renamed from: c java.lang.String
   private static final String field_1782 = "ddddeadb";
   // $FF: renamed from: d boolean
   private static boolean field_1783;


   // $FF: renamed from: <init> () void
   public void method_1449() {
      super.method_1449();
   }

   // $FF: renamed from: <init> (int) void
   public void method_2017(int var1) {
      super.method_1449();
      this.field_1781 = var1;
   }

   // $FF: renamed from: b (d) void
   public void method_1453(class_112 var1) {
      this.field_1781 = var1.readInt();
   }

   // $FF: renamed from: c (d) void
   public void method_1454(class_112 var1) {
      var1.writeInt(this.field_1781);
   }

   // $FF: renamed from: a (tL) void
   public void method_2018(class_63 var1) {}

   // $FF: renamed from: a () int
   public int method_2019() {
      return this.field_1781;
   }

   // $FF: renamed from: b (rP) void
   public void method_1455(class_57 var1) {
      this.method_2018((class_63)var1);
   }

   // $FF: renamed from: a (boolean) void
   public static void method_2020(boolean var0) {
      field_1783 = var0;
   }

   // $FF: renamed from: d () boolean
   public static boolean method_2021() {
      return field_1783;
   }

   // $FF: renamed from: e () boolean
   public static boolean method_2022() {
      boolean var0 = method_2021();
      return !var0;
   }

   // $FF: renamed from: <clinit> () void
   static void method_1458() {
      method_2020(false);
      boolean var10000 = true;
      char[] var10003 = "nsià§¿\n".toCharArray();
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
            field_1782 = (new String((char[])var4)).intern();
            String var2 = field_1782;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 121;
            break;
         case 1:
            var10009 = 107;
            break;
         case 2:
            var10009 = 98;
            break;
         case 3:
            var10009 = 225;
            break;
         case 4:
            var10009 = 132;
            break;
         case 5:
            var10009 = 195;
            break;
         default:
            var10009 = 219;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}
