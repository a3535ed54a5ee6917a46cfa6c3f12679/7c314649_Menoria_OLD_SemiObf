import java.util.List;

// $FF: renamed from: yi
public class class_1743 extends class_1727 {

   // $FF: renamed from: c xT
   public final class_82 field_9107;
   // $FF: renamed from: d wI
   private class_761 field_9108;
   // $FF: renamed from: e double
   private double field_9109;
   // $FF: renamed from: f double
   private double field_9110;
   // $FF: renamed from: g sa
   private class_689 field_9111;
   // $FF: renamed from: h float
   private float field_9112;
   // $FF: renamed from: i jK
   private class_1289 field_9113;
   // $FF: renamed from: j y7
   private class_1783 field_9114;
   // $FF: renamed from: k java.lang.Class
   private Class field_9115;
   // $FF: renamed from: l java.lang.String
   private static final String field_9116 = "CL_00001574";


   // $FF: renamed from: <init> (wI, java.lang.Class, float, double, double) void
   public void method_9687(class_761 var1, Class var2, float var3, double var4, double var6) {
      super.method_9648();
      class_1846 var10001 = new class_1846;
      var10001.method_9987(this);
      this.field_9107 = var10001;
      this.field_9108 = var1;
      this.field_9115 = var2;
      this.field_9112 = var3;
      this.field_9109 = var4;
      this.field_9110 = var6;
      this.field_9114 = var1.method_4257();
      this.method_9655(1);
   }

   // $FF: renamed from: b () boolean
   public boolean method_9649() {
      class_1743 var10000;
      String[] var1;
      boolean var5;
      label69: {
         label76: {
            var1 = class_752.method_4253();
            var10000 = this;
            if(var1 != null) {
               if(this.field_9115 == class_792.class) {
                  Object var6 = this.field_9108;
                  if(var1 != null) {
                     label73: {
                        if(this.field_9108 instanceof class_776) {
                           var6 = (class_776)this.field_9108;
                           if(var1 == null) {
                              break label73;
                           }

                           if(((class_776)var6).method_4476()) {
                              return false;
                           }
                        }

                        this.field_9111 = this.field_9108.field_2990.method_2174(this.field_9108, (double)this.field_9112);
                        var10000 = this;
                        if(var1 == null) {
                           break label69;
                        }

                        var6 = this.field_9111;
                     }
                  }

                  if(var6 == null) {
                     return false;
                  }
                  break label76;
               }

               var10000 = this;
            }

            List var2 = var10000.field_9108.field_2990.method_2158(this.field_9115, this.field_9108.field_3004.method_7097((double)this.field_9112, 3.0D, (double)this.field_9112), this.field_9107);
            var5 = var2.isEmpty();
            if(var1 != null) {
               if(!var5) {
                  this.field_9111 = (class_689)var2.get(0);
                  break label76;
               }

               var5 = false;
            }

            return var5;
         }

         var10000 = this;
      }

      azw var4 = class_1787.method_9820(var10000.field_9108, 16, 7, azw.method_5086(this.field_9111.field_2994, this.field_9111.field_2995, this.field_9111.field_2996));
      if(var4 == null) {
         return false;
      } else {
         var10000 = this;
         if(var1 != null) {
            if(this.field_9111.method_3889(var4.field_4220, var4.field_4221, var4.field_4222) < this.field_9111.method_3891(this.field_9108)) {
               return false;
            }

            this.field_9113 = this.field_9114.method_9793(var4.field_4220, var4.field_4221, var4.field_4222);
            var10000 = this;
         }

         class_1289 var3 = var10000.field_9113;
         if(var1 != null) {
            if(var3 == null) {
               var5 = false;
               return var5;
            }

            var3 = this.field_9113;
         }

         var5 = var3.method_6751(var4);
         return var5;
      }
   }

   // $FF: renamed from: c () boolean
   public boolean method_9650() {
      String[] var1 = class_752.method_4253();
      boolean var10000 = this.field_9114.method_9801();
      if(var1 != null) {
         var10000 = !var10000;
      }

      return var10000;
   }

   // $FF: renamed from: e () void
   public void method_9652() {
      this.field_9114.method_9797(this.field_9113, this.field_9109);
   }

   // $FF: renamed from: f () void
   public void method_9653() {
      this.field_9111 = null;
   }

   // $FF: renamed from: g () void
   public void method_9654() {
      String[] var1 = class_752.method_4253();
      class_761 var10000 = this.field_9108;
      if(var1 != null) {
         if(this.field_9108.method_3891(this.field_9111) < 49.0D) {
            this.field_9108.method_4257().method_9790(this.field_9110);
            if(var1 != null) {
               return;
            }
         }

         var10000 = this.field_9108;
      }

      var10000.method_4257().method_9790(this.field_9109);
   }

   // $FF: renamed from: b (yi) wI
   static class_761 method_9688(class_1743 var0) {
      return var0.field_9108;
   }

   // $FF: renamed from: <clinit> () void
   static void method_9689() {
      boolean var10000 = true;
      char[] var10003 = "æ¼Ô§MóuÅ¼£".toCharArray();
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
            field_9116 = (new String((char[])var4)).intern();
            String var2 = field_9116;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 194;
            break;
         case 1:
            var10009 = 151;
            break;
         case 2:
            var10009 = 236;
            break;
         case 3:
            var10009 = 240;
            break;
         case 4:
            var10009 = 26;
            break;
         case 5:
            var10009 = 164;
            break;
         default:
            var10009 = 34;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}
