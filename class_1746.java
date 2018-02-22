import java.util.Iterator;
import java.util.List;

// $FF: renamed from: yT
public class class_1746 extends class_1727 {

   // $FF: renamed from: c wU
   private class_768 field_9131;
   // $FF: renamed from: d wX
   private class_765 field_9132;
   // $FF: renamed from: e int
   private int field_9133;
   // $FF: renamed from: f boolean
   private boolean field_9134;
   // $FF: renamed from: g java.lang.String
   private static final String field_9135 = "CL_00001615";


   // $FF: renamed from: <init> (wU) void
   public void method_9693(class_768 var1) {
      super.method_9648();
      this.field_9131 = var1;
      this.method_9655(3);
   }

   // $FF: renamed from: b () boolean
   public boolean method_9649() {
      int var10000;
      String[] var1;
      ahb var5;
      label61: {
         var1 = class_752.method_4253();
         var10000 = this.field_9131.method_4354();
         if(var1 != null) {
            if(var10000 >= 0) {
               return false;
            }

            var5 = this.field_9131.field_2990;
            if(var1 == null) {
               break label61;
            }

            var10000 = this.field_9131.field_2990.method_2078();
         }

         if(var10000 == 0) {
            return false;
         }

         var5 = this.field_9131.field_2990;
      }

      List var2 = var5.method_2157(class_765.class, this.field_9131.field_3004.method_7097(6.0D, 2.0D, 6.0D));
      List var6 = var2;
      if(var1 != null) {
         if(var2.isEmpty()) {
            return false;
         }

         var6 = var2;
      }

      Iterator var3 = var6.iterator();

      while(true) {
         if(var3.hasNext()) {
            label47: {
               label46: {
                  class_765 var4 = (class_765)var3.next();
                  if(var1 != null) {
                     var10000 = var4.method_4349();
                     if(var1 == null) {
                        break;
                     }

                     if(var10000 <= 0) {
                        break label46;
                     }

                     this.field_9132 = var4;
                  }

                  if(var1 != null) {
                     break label47;
                  }
               }

               if(var1 != null) {
                  continue;
               }
            }
         }

         var10000 = this.field_9132 != null?1:0;
         break;
      }

      return (boolean)var10000;
   }

   // $FF: renamed from: c () boolean
   public boolean method_9650() {
      String[] var1 = class_752.method_4253();
      int var10000 = this.field_9132.method_4349();
      if(var1 != null) {
         var10000 = var10000 > 0?1:0;
      }

      return (boolean)var10000;
   }

   // $FF: renamed from: e () void
   public void method_9652() {
      this.field_9133 = this.field_9131.method_4165().nextInt(320);
      this.field_9134 = false;
      this.field_9132.method_4257().method_9802();
   }

   // $FF: renamed from: f () void
   public void method_9653() {
      this.field_9132 = null;
      this.field_9131.method_4257().method_9802();
   }

   // $FF: renamed from: g () void
   public void method_9654() {
      this.field_9131.method_4254().method_9975(this.field_9132, 30.0F, 30.0F);
      String[] var1 = class_752.method_4253();
      int var10000 = this.field_9132.method_4349();
      if(var1 != null) {
         if(var10000 == this.field_9133) {
            this.field_9131.method_4257().method_9796(this.field_9132, 0.5D);
            this.field_9134 = true;
         }

         var10000 = this.field_9134;
      }

      class_768 var2;
      label33: {
         if(var1 != null) {
            if(var10000 == 0) {
               return;
            }

            var2 = this.field_9131;
            if(var1 == null) {
               break label33;
            }

            double var3;
            var10000 = (var3 = this.field_9131.method_3891(this.field_9132) - 4.0D) == 0.0D?0:(var3 < 0.0D?-1:1);
         }

         if(var10000 >= 0) {
            return;
         }

         this.field_9132.method_4348(false);
         var2 = this.field_9131;
      }

      var2.method_4257().method_9802();
   }

   // $FF: renamed from: <clinit> () void
   static void method_9694() {
      boolean var10000 = true;
      char[] var10003 = "TU[×Ý&/5Ò".toCharArray();
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
            field_9135 = (new String((char[])var4)).intern();
            String var2 = field_9135;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 220;
            break;
         case 1:
            var10009 = 210;
            break;
         case 2:
            var10009 = 207;
            break;
         case 3:
            var10009 = 44;
            break;
         case 4:
            var10009 = 38;
            break;
         case 5:
            var10009 = 248;
            break;
         default:
            var10009 = 118;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}
