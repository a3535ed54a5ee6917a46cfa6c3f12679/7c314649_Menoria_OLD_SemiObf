
// $FF: renamed from: aQ
public class class_899 implements class_22 {

   // $FF: renamed from: b add[]
   private add[] text6;
   // $FF: renamed from: h java.lang.String
   private static final String text7 = "Result";


   // $FF: renamed from: <init> () void
   public void method_5218() {
      super();
      this.text6 = new add[1];
   }

   // $FF: renamed from: f () int
   public int method_83() {
      return 1;
   }

   // $FF: renamed from: c (int) add
   public add method_84(int var1) {
      return this.text6[0];
   }

   // $FF: renamed from: i () java.lang.String
   public String method_88() {
      return "Result";
   }

   // $FF: renamed from: j () boolean
   public boolean method_89() {
      return false;
   }

   // $FF: renamed from: b (int, int) add
   public add method_85(int var1, int var2) {
      String[] var3 = class_752.method_4253();
      add var10000 = this.text6[0];
      if(var3 != null) {
         if(var10000 == null) {
            return null;
         }

         var10000 = this.text6[0];
      }

      add var4 = var10000;
      this.text6[0] = null;
      return var4;
   }

   // $FF: renamed from: j (int) add
   public add method_86(int var1) {
      String[] var2 = class_752.method_4253();
      add var10000 = this.text6[0];
      if(var2 != null) {
         if(var10000 == null) {
            return null;
         }

         var10000 = this.text6[0];
      }

      add var3 = var10000;
      this.text6[0] = null;
      return var3;
   }

   // $FF: renamed from: b (int, add) void
   public void method_87(int var1, add var2) {
      this.text6[0] = var2;
   }

   // $FF: renamed from: k () int
   public int method_90() {
      return 64;
   }

   // $FF: renamed from: l () void
   public void method_91() {}

   // $FF: renamed from: b (yz) boolean
   public boolean method_92(class_792 var1) {
      return true;
   }

   // $FF: renamed from: m () void
   public void method_93() {}

   // $FF: renamed from: n () void
   public void method_94() {}

   // $FF: renamed from: d (int, add) boolean
   public boolean method_95(int var1, add var2) {
      return true;
   }

   // $FF: renamed from: <clinit> () void
   static void method_5219() {
      boolean var10000 = true;
      char[] var10003 = "\t|á4÷".toCharArray();
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
            text7 = (new String((char[])var3)).intern();
            return;
         }

         char var10007 = (char)((Object[])var3)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 38;
            break;
         case 1:
            var10009 = 100;
            break;
         case 2:
            var10009 = 147;
            break;
         case 3:
            var10009 = 233;
            break;
         case 4:
            var10009 = 37;
            break;
         case 5:
            var10009 = 254;
            break;
         default:
            var10009 = 19;
         }

         ((Object[])var3)[var0] = (char)(var10007 ^ var4 ^ var10009);
         ++var0;
      }
   }
}
