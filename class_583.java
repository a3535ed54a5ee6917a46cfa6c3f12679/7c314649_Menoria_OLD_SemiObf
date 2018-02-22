
// $FF: renamed from: gx
public class class_583 extends class_580 {

   // $FF: renamed from: m byte
   public byte field_2483;
   // $FF: renamed from: n boolean
   public boolean field_2484;
   // $FF: renamed from: o java.lang.String
   private static final String field_2485 = "note";


   // $FF: renamed from: <init> () void
   public void getBlock88() {
      super.getBlock88();
   }

   // $FF: renamed from: c (ro) void
   public void getBlock93(class_1583 var1) {
      super.getBlock93(var1);
      var1.method_8665("note", this.field_2483);
   }

   // $FF: renamed from: b (ro) void
   public void getBlock92(class_1583 var1) {
      class_583 var4;
      label25: {
         String[] var10000 = class_752.method_4253();
         super.getBlock92(var1);
         String[] var2 = var10000;
         this.field_2483 = var1.initGui9("note");
         byte var3 = this.field_2483;
         if(var2 != null) {
            if(this.field_2483 < 0) {
               this.field_2483 = 0;
            }

            var4 = this;
            if(var2 == null) {
               break label25;
            }

            var3 = this.field_2483;
         }

         if(var3 <= 24) {
            return;
         }

         var4 = this;
      }

      var4.field_2483 = 24;
   }

   // $FF: renamed from: b () void
   public void method_3121() {
      this.field_2483 = (byte)((this.field_2483 + 1) % 25);
      this.method_91();
   }

   // $FF: renamed from: b (ahb, int, int, int) void
   public void method_3122(ahb var1, int var2, int var3, int var4) {
      String[] var5 = class_752.method_4253();
      awt var10000 = var1.getBlock(var2, var3 + 1, var4).method_2424();
      if(var5 != null) {
         if(var10000 != awt.field_4170) {
            return;
         }

         var10000 = var1.getBlock(var2, var3 - 1, var4).method_2424();
      }

      awt var6 = var10000;
      byte var7 = 0;
      var10000 = var6;
      awt var10001 = awt.field_4174;
      if(var5 != null) {
         if(var6 == awt.field_4174) {
            var7 = 1;
         }

         var10000 = var6;
         var10001 = awt.field_4185;
      }

      if(var5 != null) {
         if(var10000 == var10001) {
            var7 = 2;
         }

         var10000 = var6;
         var10001 = awt.field_4188;
      }

      if(var5 != null) {
         if(var10000 == var10001) {
            var7 = 3;
         }

         var10000 = var6;
         var10001 = awt.field_4173;
      }

      if(var10000 == var10001) {
         var7 = 4;
      }

      var1.method_2193(var2, var3, var4, class_1192.field_6052, var7, this.field_2483);
   }

   // $FF: renamed from: <clinit> () void
   static void method_3108() {
      boolean var10000 = true;
      char[] var10003 = "§]s".toCharArray();
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
            field_2485 = (new String((char[])var3)).intern();
            return;
         }

         char var10007 = (char)((Object[])var3)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 66;
            break;
         case 1:
            var10009 = 185;
            break;
         case 2:
            var10009 = 237;
            break;
         case 3:
            var10009 = 157;
            break;
         case 4:
            var10009 = 165;
            break;
         case 5:
            var10009 = 159;
            break;
         default:
            var10009 = 156;
         }

         ((Object[])var3)[var0] = (char)(var10007 ^ var4 ^ var10009);
         ++var0;
      }
   }
}
