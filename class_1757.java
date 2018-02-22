
// $FF: renamed from: yI
public class class_1757 extends class_1727 {

   // $FF: renamed from: c wX
   private class_765 field_9179;
   // $FF: renamed from: d wU
   private class_768 field_9180;
   // $FF: renamed from: e int
   private int field_9181;
   // $FF: renamed from: f java.lang.String
   private static final String field_9182 = "CL_00001602";


   // $FF: renamed from: <init> (wX) void
   public void method_9711(class_765 var1) {
      super.method_9648();
      this.field_9179 = var1;
      this.method_9655(3);
   }

   // $FF: renamed from: b () boolean
   public boolean method_9649() {
      String[] var1 = class_752.method_4253();
      int var10000 = this.field_9179.field_2990.method_2078();
      class_1757 var2;
      if(var1 != null) {
         if(var10000 == 0) {
            return false;
         }

         var2 = this;
         if(var1 == null) {
            return var2.field_9180 != null;
         }

         var10000 = this.field_9179.method_4165().nextInt(8000);
      }

      if(var10000 != 0) {
         return false;
      } else {
         this.field_9180 = (class_768)this.field_9179.field_2990.method_2159(class_768.class, this.field_9179.field_3004.method_7097(6.0D, 2.0D, 6.0D), this.field_9179);
         var2 = this;
         return var2.field_9180 != null;
      }
   }

   // $FF: renamed from: c () boolean
   public boolean method_9650() {
      String[] var1 = class_752.method_4253();
      int var10000 = this.field_9181;
      if(var1 != null) {
         var10000 = this.field_9181 > 0?1:0;
      }

      return (boolean)var10000;
   }

   // $FF: renamed from: e () void
   public void method_9652() {
      this.field_9181 = 400;
      this.field_9179.method_4348(true);
   }

   // $FF: renamed from: f () void
   public void method_9653() {
      this.field_9179.method_4348(false);
      this.field_9180 = null;
   }

   // $FF: renamed from: g () void
   public void method_9654() {
      this.field_9179.method_4254().method_9975(this.field_9180, 30.0F, 30.0F);
      --this.field_9181;
   }

   // $FF: renamed from: <clinit> () void
   static void method_9712() {
      boolean var10000 = true;
      char[] var10003 = "ºö\\Èd{ô".toCharArray();
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
            field_9182 = (new String((char[])var4)).intern();
            String var2 = field_9182;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 92;
            break;
         case 1:
            var10009 = 247;
            break;
         case 2:
            var10009 = 238;
            break;
         case 3:
            var10009 = 99;
            break;
         case 4:
            var10009 = 11;
            break;
         case 5:
            var10009 = 201;
            break;
         default:
            var10009 = 10;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}
