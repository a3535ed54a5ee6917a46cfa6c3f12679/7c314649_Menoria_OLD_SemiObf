
// $FF: renamed from: aO
public class class_897 implements class_22 {

   // $FF: renamed from: b add[]
   private add[] height3;
   // $FF: renamed from: c int
   private int height4;
   // $FF: renamed from: d Al
   private class_671 height5;
   // $FF: renamed from: h java.lang.String
   private static final String height6 = "container.crafting";


   // $FF: renamed from: <init> (Al, int, int) void
   public void method_5202(class_671 var1, int var2, int var3) {
      super();
      int var4 = var2 * var3;
      this.height3 = new add[var4];
      this.height5 = var1;
      this.height4 = var2;
   }

   // $FF: renamed from: f () int
   public int method_83() {
      return this.height3.length;
   }

   // $FF: renamed from: c (int) add
   public add method_84(int var1) {
      return var1 >= this.method_83()?null:this.height3[var1];
   }

   // $FF: renamed from: a (int, int) add
   public add method_5203(int var1, int var2) {
      String[] var3 = class_752.method_4253();
      int var10000 = var1;
      if(var3 != null) {
         if(var1 < 0) {
            return null;
         }

         var10000 = var1;
      }

      int var10001 = this.height4;
      if(var3 != null) {
         if(var10000 >= this.height4) {
            return null;
         }

         var10000 = var1;
         var10001 = var2 * this.height4;
      }

      int var4 = var10000 + var10001;
      return this.method_84(var4);
   }

   // $FF: renamed from: i () java.lang.String
   public String method_88() {
      return "container.crafting";
   }

   // $FF: renamed from: j () boolean
   public boolean method_89() {
      return false;
   }

   // $FF: renamed from: j (int) add
   public add method_86(int var1) {
      String[] var2 = class_752.method_4253();
      add var10000 = this.height3[var1];
      if(var2 != null) {
         if(var10000 == null) {
            return null;
         }

         var10000 = this.height3[var1];
      }

      add var3 = var10000;
      this.height3[var1] = null;
      return var3;
   }

   // $FF: renamed from: b (int, int) add
   public add method_85(int var1, int var2) {
      String[] var3 = class_752.method_4253();
      add var10000 = this.height3[var1];
      if(var3 != null) {
         if(var10000 == null) {
            return null;
         }

         var10000 = this.height3[var1];
      }

      add var4;
      if(var3 != null) {
         if(var10000.field_2958 <= var2) {
            var4 = this.height3[var1];
            this.height3[var1] = null;
            this.height5.method_3659(this);
            return var4;
         }

         var10000 = this.height3[var1].method_3729(var2);
      }

      var4 = var10000;
      var10000 = this.height3[var1];
      if(var3 != null) {
         if(var10000.field_2958 == 0) {
            this.height3[var1] = null;
         }

         this.height5.method_3659(this);
         var10000 = var4;
      }

      return var10000;
   }

   // $FF: renamed from: b (int, add) void
   public void method_87(int var1, add var2) {
      this.height3[var1] = var2;
      this.height5.method_3659(this);
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
   static void method_5204() {
      boolean var10000 = true;
      char[] var10003 = "½ñÇoÑD ±Ð|ÙL»ñÔ".toCharArray();
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
            height6 = (new String((char[])var3)).intern();
            return;
         }

         char var10007 = (char)((Object[])var3)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 115;
            break;
         case 1:
            var10009 = 209;
            break;
         case 2:
            var10009 = 156;
            break;
         case 3:
            var10009 = 176;
            break;
         case 4:
            var10009 = 13;
            break;
         case 5:
            var10009 = 187;
            break;
         default:
            var10009 = 41;
         }

         ((Object[])var3)[var0] = (char)(var10007 ^ var4 ^ var10009);
         ++var0;
      }
   }
}
