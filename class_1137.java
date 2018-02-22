import java.util.List;
import java.util.Random;

// $FF: renamed from: iG
public class class_1137 extends class_1131 {

   // $FF: renamed from: d boolean
   private boolean field_5872;
   // $FF: renamed from: g java.lang.String
   private static final String field_5873;
   // $FF: renamed from: j java.lang.String[]
   private static final String[] field_5874;


   // $FF: renamed from: <init> () void
   public void method_6191() {
      super.method_6191();
   }

   // $FF: renamed from: <init> (int, java.util.Random, int, int) void
   public void method_6318(int var1, Random var2, int var3, int var4) {
      String[] var10000 = class_752.method_4253();
      super.method_6192(var1);
      this.field_5872 = true;
      String[] var5 = var10000;
      this.field_5753 = var2.nextInt(4);
      this.field_5851 = class_98.field_71;
      class_1137 var6 = this;
      class_1206 var10001;
      if(var5 != null) {
         switch(this.field_5753) {
         case 0:
         case 2:
            var10001 = new class_1206;
            var10001.method_6481(var3, 64, var4, var3 + 5 - 1, 74, var4 + 5 - 1);
            this.field_5752 = var10001;
            if(var5 != null) {
               return;
            }
         default:
            var6 = this;
         }
      }

      var10001 = new class_1206;
      var10001.method_6481(var3, 64, var4, var3 + 5 - 1, 74, var4 + 5 - 1);
      var6.field_5752 = var10001;
   }

   // $FF: renamed from: <init> (int, java.util.Random, hS, int) void
   public void method_6319(int var1, Random var2, class_1206 var3, int var4) {
      super.method_6192(var1);
      this.field_5872 = false;
      this.field_5753 = var4;
      this.field_5851 = this.method_6303(var2);
      this.field_5752 = var3;
   }

   // $FF: renamed from: b (ro) void
   protected void method_6194(class_1583 var1) {
      super.method_6194(var1);
      String[] var10001 = field_5874;
      var1.initGui4("Source", this.field_5872);
   }

   // $FF: renamed from: c (ro) void
   protected void method_6196(class_1583 var1) {
      super.method_6196(var1);
      String[] var10002 = field_5874;
      this.field_5872 = var1.method_8690("Source");
   }

   // $FF: renamed from: b (h7, java.util.List, java.util.Random) void
   public void method_6197(class_1094 var1, List var2, Random var3) {
      String[] var4 = class_752.method_4253();
      if(var4 != null) {
         if(this.field_5872) {
            class_1252.method_6599(class_1132.class);
         }

         this.method_6304((class_1138)var1, var2, var3, 1, 1);
      }

   }

   // $FF: renamed from: b (java.util.List, java.util.Random, int, int, int, int, int) iG
   public static class_1137 method_6320(List var0, Random var1, int var2, int var3, int var4, int var5, int var6) {
      class_1206 var7 = class_1206.method_6479(var2, var3, var4, -1, -7, 0, 5, 11, 5, var5);
      class_1137 var10000;
      if(method_6307(var7) && class_1094.method_6201(var0, var7) == null) {
         var10000 = new class_1137;
         var10000.method_6319(var6, var1, var7, var5);
      } else {
         var10000 = null;
      }

      return var10000;
   }

   // $FF: renamed from: b (ahb, java.util.Random, hS) boolean
   public boolean method_6198(ahb var1, Random var2, class_1206 var3) {
      String[] var4 = class_752.method_4253();
      boolean var10000 = this.method_6203(var1, var3);
      if(var4 != null) {
         if(var10000) {
            return false;
         }

         this.method_6213(var1, var3, 0, 0, 0, 4, 10, 4, true, var2, class_1252.method_6598());
         this.method_6302(var1, var2, var3, this.field_5851, 1, 7, 0);
         this.method_6302(var1, var2, var3, class_98.field_71, 1, 1, 4);
         this.method_6208(var1, class_1192.field_6123, 0, 2, 6, 1, var3);
         this.method_6208(var1, class_1192.field_6123, 0, 1, 5, 1, var3);
         this.method_6208(var1, class_1192.field_6071, 0, 1, 6, 1, var3);
         this.method_6208(var1, class_1192.field_6123, 0, 1, 5, 2, var3);
         this.method_6208(var1, class_1192.field_6123, 0, 1, 4, 3, var3);
         this.method_6208(var1, class_1192.field_6071, 0, 1, 5, 3, var3);
         this.method_6208(var1, class_1192.field_6123, 0, 2, 4, 3, var3);
         this.method_6208(var1, class_1192.field_6123, 0, 3, 3, 3, var3);
         this.method_6208(var1, class_1192.field_6071, 0, 3, 4, 3, var3);
         this.method_6208(var1, class_1192.field_6123, 0, 3, 3, 2, var3);
         this.method_6208(var1, class_1192.field_6123, 0, 3, 2, 1, var3);
         this.method_6208(var1, class_1192.field_6071, 0, 3, 3, 1, var3);
         this.method_6208(var1, class_1192.field_6123, 0, 2, 2, 1, var3);
         this.method_6208(var1, class_1192.field_6123, 0, 1, 1, 1, var3);
         this.method_6208(var1, class_1192.field_6071, 0, 1, 2, 1, var3);
         this.method_6208(var1, class_1192.field_6123, 0, 1, 1, 2, var3);
         this.method_6208(var1, class_1192.field_6071, 0, 1, 1, 3, var3);
         var10000 = true;
      }

      return var10000;
   }

   // $FF: renamed from: <clinit> () void
   static void method_6222() {
      String[] var5 = new String[2];
      int var3 = 0;
      String var2 = "ù.Ò\bÓé\røÂ[uÊ";
      int var4 = "ù.Ò\bÓé\røÂ[uÊ".length();
      char var1 = 6;
      int var0 = -1;

      while(true) {
         ++var0;
         String var10002 = var2.substring(var0, var0 + var1);
         boolean var10000 = true;
         char[] var10003 = var10002.toCharArray();
         Object var10004 = var10003.length;
         Object var9 = true;
         char[] var8 = var10003;
         char[] var10001 = (char[])var10004;
         int var6 = 0;

         while(true) {
            var10003 = var8;
            var8 = var10001;
            var10001 = var10003;
            char[] var11 = var8;
            var8 = var10003;
            if(var10003 <= var6) {
               var5[var3++] = (new String((char[])var9)).intern();
               if((var0 += var1) >= var4) {
                  field_5874 = var5;
                  String[] var10 = field_5874;
                  field_5873 = "CL_00000498";
                  return;
               }

               var1 = var2.charAt(var0);
               break;
            }

            char var10007 = (char)((Object[])var9)[var6];
            short var10009;
            switch(var6 % 7) {
            case 0:
               var10009 = 227;
               break;
            case 1:
               var10009 = 8;
               break;
            case 2:
               var10009 = 238;
               break;
            case 3:
               var10009 = 187;
               break;
            case 4:
               var10009 = 34;
               break;
            case 5:
               var10009 = 255;
               break;
            default:
               var10009 = 224;
            }

            ((Object[])var9)[var6] = (char)(var10007 ^ var11 ^ var10009);
            ++var6;
         }
      }
   }
}
