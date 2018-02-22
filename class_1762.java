import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// $FF: renamed from: yD
public class class_1762 extends class_1727 {

   // $FF: renamed from: c wI
   private class_761 field_9208;
   // $FF: renamed from: d double
   private double field_9209;
   // $FF: renamed from: e jK
   private class_1289 field_9210;
   // $FF: renamed from: f y_
   private class_1841 field_9211;
   // $FF: renamed from: g boolean
   private boolean field_9212;
   // $FF: renamed from: h java.util.List
   private List field_9213;
   // $FF: renamed from: i java.lang.String
   private static final String field_9214 = "CL_00001597";


   // $FF: renamed from: <init> (wI, double, boolean) void
   public void method_9720(class_761 var1, double var2, boolean var4) {
      super.method_9648();
      this.field_9213 = new ArrayList();
      this.field_9208 = var1;
      this.field_9209 = var2;
      this.field_9212 = var4;
      this.method_9655(1);
   }

   // $FF: renamed from: b () boolean
   public boolean method_9649() {
      String[] var1;
      class_1762 var5;
      ahb var6;
      label56: {
         String[] var10000 = class_752.method_4253();
         this.method_9723();
         var1 = var10000;
         var5 = this;
         if(var1 != null) {
            if(this.field_9212) {
               var6 = this.field_9208.field_2990;
               if(var1 == null) {
                  break label56;
               }

               if(this.field_9208.field_2990.method_2078()) {
                  return false;
               }
            }

            var5 = this;
         }

         var6 = var5.field_9208.field_2990;
      }

      class_1849 var2 = var6.field_1827.method_6780(class_1715.method_9561(this.field_9208.field_2994), class_1715.method_9561(this.field_9208.field_2995), class_1715.method_9561(this.field_9208.field_2996), 0);
      if(var1 != null) {
         if(var2 == null) {
            return false;
         }

         this.field_9211 = this.method_9721(var2);
      }

      var5 = this;
      if(var1 != null) {
         if(this.field_9211 == null) {
            return false;
         }

         var5 = this;
      }

      boolean var3 = var5.field_9208.method_4257().method_9788();
      this.field_9208.method_4257().method_9786(false);
      this.field_9210 = this.field_9208.method_4257().method_9793((double)this.field_9211.field_9397, (double)this.field_9211.field_9398, (double)this.field_9211.field_9399);
      this.field_9208.method_4257().method_9786(var3);
      var5 = this;
      if(var1 != null) {
         if(this.field_9210 != null) {
            return true;
         }

         var5 = this;
      }

      azw var4 = class_1787.method_9819(var5.field_9208, 10, 7, azw.method_5086((double)this.field_9211.field_9397, (double)this.field_9211.field_9398, (double)this.field_9211.field_9399));
      if(var1 != null) {
         if(var4 == null) {
            return false;
         }

         this.field_9208.method_4257().method_9786(false);
         this.field_9210 = this.field_9208.method_4257().method_9793(var4.field_4220, var4.field_4221, var4.field_4222);
         this.field_9208.method_4257().method_9786(var3);
      }

      return this.field_9210 != null;
   }

   // $FF: renamed from: c () boolean
   public boolean method_9650() {
      String[] var1 = class_752.method_4253();
      class_761 var10000 = this.field_9208;
      if(var1 != null) {
         if(this.field_9208.method_4257().method_9801()) {
            return false;
         }

         var10000 = this.field_9208;
      }

      float var2 = var10000.field_3014 + 4.0F;
      double var4;
      int var3 = (var4 = this.field_9208.method_3889((double)this.field_9211.field_9397, (double)this.field_9211.field_9398, (double)this.field_9211.field_9399) - (double)(var2 * var2)) == 0.0D?0:(var4 < 0.0D?-1:1);
      if(var1 != null) {
         var3 = var3 > 0?1:0;
      }

      return (boolean)var3;
   }

   // $FF: renamed from: e () void
   public void method_9652() {
      this.field_9208.method_4257().method_9797(this.field_9210, this.field_9209);
   }

   // $FF: renamed from: f () void
   public void method_9653() {
      String[] var1 = class_752.method_4253();
      if(var1 != null && (this.field_9208.method_4257().method_9801() || var1 != null && this.field_9208.method_3889((double)this.field_9211.field_9397, (double)this.field_9211.field_9398, (double)this.field_9211.field_9399) < 16.0D)) {
         this.field_9213.add(this.field_9211);
      }

   }

   // $FF: renamed from: b (za) y_
   private class_1841 method_9721(class_1849 var1) {
      class_1841 var3 = null;
      String[] var10000 = class_752.method_4253();
      int var4 = Integer.MAX_VALUE;
      List var5 = var1.method_10009();
      String[] var2 = var10000;
      Iterator var6 = var5.iterator();

      class_1841 var9;
      while(true) {
         if(var6.hasNext()) {
            class_1841 var7 = (class_1841)var6.next();
            var9 = var7;
            if(var2 == null) {
               break;
            }

            label39: {
               int var8 = var7.method_9959(class_1715.method_9561(this.field_9208.field_2994), class_1715.method_9561(this.field_9208.field_2995), class_1715.method_9561(this.field_9208.field_2996));
               int var10 = var8;
               if(var2 != null) {
                  if(var8 >= var4) {
                     break label39;
                  }

                  var10 = this.method_9722(var7);
               }

               if(var2 != null) {
                  if(var10 != 0) {
                     break label39;
                  }

                  var3 = var7;
                  var10 = var8;
               }

               var4 = var10;
            }

            if(var2 != null) {
               continue;
            }
         }

         var9 = var3;
         break;
      }

      return var9;
   }

   // $FF: renamed from: b (y_) boolean
   private boolean method_9722(class_1841 var1) {
      String[] var10000 = class_752.method_4253();
      Iterator var3 = this.field_9213.iterator();
      String[] var2 = var10000;

      boolean var6;
      while(true) {
         if(!var3.hasNext()) {
            var6 = false;
            break;
         }

         class_1841 var4 = (class_1841)var3.next();
         int var5 = var1.field_9397;
         int var10001 = var4.field_9397;
         if(var2 != null) {
            if(var1.field_9397 != var4.field_9397) {
               continue;
            }

            var5 = var1.field_9398;
            var10001 = var4.field_9398;
         }

         if(var2 != null) {
            if(var5 != var10001) {
               continue;
            }

            var5 = var1.field_9399;
            var10001 = var4.field_9399;
         }

         if(var5 == var10001) {
            var6 = true;
            if(var2 != null) {
               return true;
            }
            break;
         }
      }

      return var6;
   }

   // $FF: renamed from: a () void
   private void method_9723() {
      String[] var1 = class_752.method_4253();
      if(var1 != null && this.field_9213.size() > 15) {
         this.field_9213.remove(0);
      }

   }

   // $FF: renamed from: <clinit> () void
   static void method_9724() {
      boolean var10000 = true;
      char[] var10003 = "ªÝ\\oüÌÚ".toCharArray();
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
            field_9214 = (new String((char[])var4)).intern();
            String var2 = field_9214;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 110;
            break;
         case 1:
            var10009 = 249;
            break;
         case 2:
            var10009 = 197;
            break;
         case 3:
            var10009 = 221;
            break;
         case 4:
            var10009 = 159;
            break;
         case 5:
            var10009 = 92;
            break;
         default:
            var10009 = 128;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}
