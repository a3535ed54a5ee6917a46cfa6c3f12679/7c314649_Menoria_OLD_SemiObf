import java.util.Iterator;
import java.util.List;

// $FF: renamed from: yu
public class class_1732 extends class_1727 {

   // $FF: renamed from: c wK
   class_769 field_9050;
   // $FF: renamed from: d wK
   class_769 field_9051;
   // $FF: renamed from: e double
   double field_9052;
   // $FF: renamed from: f int
   private int field_9053;
   // $FF: renamed from: g java.lang.String
   private static final String field_9054 = "CL_00001586";


   // $FF: renamed from: <init> (wK, double) void
   public void method_9662(class_769 var1, double var2) {
      super.method_9648();
      this.field_9050 = var1;
      this.field_9052 = var2;
   }

   // $FF: renamed from: b () boolean
   public boolean method_9649() {
      String[] var1 = class_752.method_4253();
      class_769 var10000 = this.field_9050;
      if(var1 != null) {
         if(this.field_9050.method_4354() >= 0) {
            return false;
         }

         var10000 = this.field_9050;
      }

      List var2 = var10000.field_2990.method_2157(this.field_9050.getClass(), this.field_9050.field_3004.method_7097(8.0D, 4.0D, 8.0D));
      class_769 var3 = null;
      double var4 = Double.MAX_VALUE;
      Iterator var6 = var2.iterator();

      int var10;
      while(true) {
         if(var6.hasNext()) {
            label59: {
               class_769 var7 = (class_769)var6.next();
               var10000 = var7;
               if(var1 != null) {
                  var10 = var7.method_4354();
                  if(var1 == null) {
                     break;
                  }

                  if(var10 < 0) {
                     break label59;
                  }

                  var10000 = this.field_9050;
               }

               double var8 = var10000.method_3891(var7);
               double var11 = var8;
               if(var1 != null) {
                  if(var8 > var4) {
                     break label59;
                  }

                  var11 = var8;
               }

               var4 = var11;
               var3 = var7;
            }

            if(var1 != null) {
               continue;
            }
         }

         if(var3 == null) {
            return false;
         }

         double var12;
         var10 = (var12 = var4 - 9.0D) == 0.0D?0:(var12 < 0.0D?-1:1);
         break;
      }

      if(var1 != null) {
         if(var10 < 0) {
            return false;
         }

         this.field_9051 = var3;
         var10 = 1;
      }

      return (boolean)var10;
   }

   // $FF: renamed from: c () boolean
   public boolean method_9650() {
      String[] var1 = class_752.method_4253();
      class_769 var10000 = this.field_9051;
      if(var1 != null) {
         if(!this.field_9051.method_3917()) {
            return false;
         }

         var10000 = this.field_9050;
      }

      int var4;
      label33: {
         double var2 = var10000.method_3891(this.field_9051);
         double var5;
         var4 = (var5 = var2 - 9.0D) == 0.0D?0:(var5 < 0.0D?-1:1);
         if(var1 != null) {
            if(var4 < 0) {
               break label33;
            }

            double var6;
            var4 = (var6 = var2 - 256.0D) == 0.0D?0:(var6 < 0.0D?-1:1);
         }

         if(var1 == null) {
            return (boolean)var4;
         }

         if(var4 <= 0) {
            var4 = 1;
            return (boolean)var4;
         }
      }

      var4 = 0;
      return (boolean)var4;
   }

   // $FF: renamed from: e () void
   public void method_9652() {
      this.field_9053 = 0;
   }

   // $FF: renamed from: f () void
   public void method_9653() {
      this.field_9051 = null;
   }

   // $FF: renamed from: g () void
   public void method_9654() {
      String[] var1 = class_752.method_4253();
      if(var1 != null && --this.field_9053 <= 0) {
         this.field_9053 = 10;
         this.field_9050.method_4257().method_9796(this.field_9051, this.field_9052);
      }

   }

   // $FF: renamed from: <clinit> () void
   static void method_9663() {
      boolean var10000 = true;
      char[] var10003 = "À¶Õböe§°".toCharArray();
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
            field_9054 = (new String((char[])var4)).intern();
            String var2 = field_9054;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 244;
            break;
         case 1:
            var10009 = 99;
            break;
         case 2:
            var10009 = 172;
            break;
         case 3:
            var10009 = 181;
            break;
         case 4:
            var10009 = 155;
            break;
         case 5:
            var10009 = 214;
            break;
         default:
            var10009 = 97;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}
