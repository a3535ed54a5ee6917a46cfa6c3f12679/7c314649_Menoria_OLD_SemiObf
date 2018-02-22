import java.util.Collections;
import java.util.List;

// $FF: renamed from: yZ
public class class_1771 extends class_1766 {

   // $FF: renamed from: h java.lang.Class
   private final Class field_9252;
   // $FF: renamed from: i int
   private final int field_9253;
   // $FF: renamed from: j y6
   private final class_1781 field_9254;
   // $FF: renamed from: k xT
   private final class_82 field_9255;
   // $FF: renamed from: l sv
   private class_752 field_9256;
   // $FF: renamed from: m java.lang.String
   private static final String field_9257 = "CL_00001620";


   // $FF: renamed from: <init> (wI, java.lang.Class, int, boolean) void
   public void method_9740(class_761 var1, Class var2, int var3, boolean var4) {
      this.method_9741(var1, var2, var3, var4, false);
   }

   // $FF: renamed from: <init> (wI, java.lang.Class, int, boolean, boolean) void
   public void method_9741(class_761 var1, Class var2, int var3, boolean var4, boolean var5) {
      this.method_9742(var1, var2, var3, var4, var5, (class_82)null);
   }

   // $FF: renamed from: <init> (wI, java.lang.Class, int, boolean, boolean, xT) void
   public void method_9742(class_761 var1, Class var2, int var3, boolean var4, boolean var5, class_82 var6) {
      super.method_9733(var1, var4, var5);
      this.field_9252 = var2;
      this.field_9253 = var3;
      class_1781 var10001 = new class_1781;
      var10001.method_9779(var1);
      this.field_9254 = var10001;
      this.method_9655(1);
      class_1779 var7 = new class_1779;
      var7.method_9777(this, var6);
      this.field_9255 = var7;
   }

   // $FF: renamed from: b () boolean
   public boolean method_9649() {
      String[] var1 = class_752.method_4253();
      class_1771 var10000 = this;
      if(var1 != null) {
         label24: {
            if(this.field_9253 > 0) {
               var10000 = this;
               if(var1 == null) {
                  break label24;
               }

               if(this.field_9236.method_4165().nextInt(this.field_9253) != 0) {
                  return false;
               }
            }

            var10000 = this;
         }
      }

      double var2 = var10000.method_9734();
      List var4 = this.field_9236.field_2990.method_2158(this.field_9252, this.field_9236.field_3004.method_7097(var2, 4.0D, var2), this.field_9255);
      Collections.sort(var4, this.field_9254);
      boolean var5 = var4.isEmpty();
      if(var1 != null) {
         if(var5) {
            return false;
         }

         this.field_9256 = (class_752)var4.get(0);
         var5 = true;
      }

      return var5;
   }

   // $FF: renamed from: e () void
   public void method_9652() {
      this.field_9236.method_4260(this.field_9256);
      super.method_9652();
   }

   // $FF: renamed from: <clinit> () void
   static void method_9743() {
      boolean var10000 = true;
      char[] var10003 = "î+¨S öf+".toCharArray();
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
            field_9257 = (new String((char[])var4)).intern();
            String var2 = field_9257;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 229;
            break;
         case 1:
            var10009 = 136;
            break;
         case 2:
            var10009 = 28;
            break;
         case 3:
            var10009 = 83;
            break;
         case 4:
            var10009 = 208;
            break;
         case 5:
            var10009 = 43;
            break;
         default:
            var10009 = 216;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}
