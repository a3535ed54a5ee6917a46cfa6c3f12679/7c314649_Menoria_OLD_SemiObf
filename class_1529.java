import java.util.Random;

// $FF: renamed from: qf
public class class_1529 implements class_69 {

   // $FF: renamed from: b java.util.Random
   private final Random field_8022;
   // $FF: renamed from: c bao
   private final bao field_8023;
   // $FF: renamed from: d p9
   private class_38 field_8024;
   // $FF: renamed from: e int
   private int field_8025;
   // $FF: renamed from: f java.lang.String
   private static final String field_8026 = "CL_00001138";


   // $FF: renamed from: <init> (bao) void
   public void method_8284(bao var1) {
      super();
      this.field_8022 = new Random();
      this.field_8025 = 100;
      this.field_8023 = var1;
   }

   // $FF: renamed from: k () void
   public void method_362() {
      String[] var1;
      class_900 var2;
      class_1529 var4;
      label50: {
         var2 = this.field_8023.method_5296();
         var1 = class_752.method_4253();
         class_38 var10000 = this.field_8024;
         if(var1 != null) {
            label37: {
               if(this.field_8024 != null) {
                  boolean var3 = var2.method_5309().equals(this.field_8024.method_165());
                  if(var1 != null) {
                     if(!var3) {
                        this.field_8023.method_5295().method_8374(this.field_8024);
                        this.field_8025 = class_1715.method_9575(this.field_8022, 0, var2.method_5310() / 2);
                     }

                     var4 = this;
                     if(var1 == null) {
                        break label37;
                     }

                     var3 = this.field_8023.method_5295().method_8376(this.field_8024);
                  }

                  if(!var3) {
                     this.field_8024 = null;
                     this.field_8025 = Math.min(class_1715.method_9575(this.field_8022, var2.method_5310(), var2.method_5311()), this.field_8025);
                  }
               }

               var4 = this;
            }

            if(var1 == null) {
               break label50;
            }

            var10000 = var4.field_8024;
         }

         if(var10000 != null) {
            return;
         }

         var4 = this;
      }

      int var10001 = var4.field_8025;
      if(var1 != null) {
         int var10002 = var4.field_8025;
         class_1529 var5 = var4;
         int var6 = var4.field_8025;
         var5.field_8025 = var10002 - 1;
         if(var6 > 0) {
            return;
         }

         this.field_8024 = class_1424.method_7769(var2.method_5309());
         this.field_8023.method_5295().method_8366(this.field_8024);
         var4 = this;
         var10001 = Integer.MAX_VALUE;
      }

      var4.field_8025 = var10001;
   }

   // $FF: renamed from: <clinit> () void
   static void method_8285() {
      boolean var10000 = true;
      char[] var10003 = "Ë¼øÁö9¹ÁÉ".toCharArray();
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
            field_8026 = (new String((char[])var4)).intern();
            String var2 = field_8026;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 241;
            break;
         case 1:
            var10009 = 137;
            break;
         case 2:
            var10009 = 222;
            break;
         case 3:
            var10009 = 136;
            break;
         case 4:
            var10009 = 87;
            break;
         case 5:
            var10009 = 191;
            break;
         default:
            var10009 = 112;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}
