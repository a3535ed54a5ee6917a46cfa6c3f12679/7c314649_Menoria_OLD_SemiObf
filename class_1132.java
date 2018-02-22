import java.util.List;
import java.util.Random;

// $FF: renamed from: iz
public class class_1132 extends class_1131 {

   // $FF: renamed from: d boolean
   private boolean field_5854;
   // $FF: renamed from: g boolean
   private boolean field_5855;
   // $FF: renamed from: h boolean
   private boolean field_5856;
   // $FF: renamed from: i boolean
   private boolean field_5857;
   // $FF: renamed from: j java.lang.String
   private static final String field_5858;
   // $FF: renamed from: k java.lang.String[]
   private static final String[] field_5859;


   // $FF: renamed from: <init> () void
   public void method_6191() {
      super.method_6191();
   }

   // $FF: renamed from: <init> (int, java.util.Random, hS, int) void
   public void method_6308(int var1, Random var2, class_1206 var3, int var4) {
      super.method_6192(var1);
      this.field_5753 = var4;
      this.field_5851 = this.method_6303(var2);
      this.field_5752 = var3;
      String[] var10000 = class_752.method_4253();
      this.field_5854 = var2.nextBoolean();
      String[] var5 = var10000;
      this.field_5855 = var2.nextBoolean();
      this.field_5856 = var2.nextBoolean();
      int var10001 = var2.nextInt(3);
      if(var5 != null) {
         var10001 = var10001 > 0?1:0;
      }

      this.field_5857 = (boolean)var10001;
   }

   // $FF: renamed from: b (ro) void
   protected void method_6194(class_1583 var1) {
      super.method_6194(var1);
      String[] var2 = field_5859;
      var1.initGui4("leftLow", this.field_5854);
      var1.initGui4("leftHigh", this.field_5855);
      var1.initGui4("rightLow", this.field_5856);
      var1.initGui4("rightHigh", this.field_5857);
   }

   // $FF: renamed from: c (ro) void
   protected void method_6196(class_1583 var1) {
      super.method_6196(var1);
      String[] var2 = field_5859;
      this.field_5854 = var1.method_8690("leftLow");
      this.field_5855 = var1.method_8690("leftHigh");
      this.field_5856 = var1.method_8690("rightLow");
      this.field_5857 = var1.method_8690("rightHigh");
   }

   // $FF: renamed from: b (h7, java.util.List, java.util.Random) void
   public void method_6197(class_1094 var1, List var2, Random var3) {
      int var10000;
      String[] var4;
      int var5;
      int var6;
      label57: {
         label56: {
            var5 = 3;
            var4 = class_752.method_4253();
            var6 = 5;
            var10000 = this.field_5753;
            int var10001 = 1;
            if(var4 != null) {
               if(this.field_5753 != 1) {
                  var10000 = this.field_5753;
                  if(var4 == null) {
                     break label57;
                  }

                  if(this.field_5753 != 2) {
                     break label56;
                  }
               }

               var5 = 8 - var5;
               var10000 = 8;
               var10001 = var6;
            }

            var6 = var10000 - var10001;
         }

         this.method_6304((class_1138)var1, var2, var3, 5, 1);
         var10000 = this.field_5854;
      }

      if(var4 != null) {
         if(var10000 != 0) {
            this.method_6305((class_1138)var1, var2, var3, var5, 1);
         }

         var10000 = this.field_5855;
      }

      if(var4 != null) {
         if(var10000 != 0) {
            this.method_6305((class_1138)var1, var2, var3, var6, 7);
         }

         var10000 = this.field_5856;
      }

      if(var4 != null) {
         if(var10000 != 0) {
            this.method_6306((class_1138)var1, var2, var3, var5, 1);
         }

         if(var4 == null) {
            return;
         }

         var10000 = this.field_5857;
      }

      if(var10000 != 0) {
         this.method_6306((class_1138)var1, var2, var3, var6, 7);
      }

   }

   // $FF: renamed from: b (java.util.List, java.util.Random, int, int, int, int, int) iz
   public static class_1132 method_6309(List var0, Random var1, int var2, int var3, int var4, int var5, int var6) {
      class_1206 var7 = class_1206.method_6479(var2, var3, var4, -4, -3, 0, 10, 9, 11, var5);
      class_1132 var10000;
      if(method_6307(var7) && class_1094.method_6201(var0, var7) == null) {
         var10000 = new class_1132;
         var10000.method_6308(var6, var1, var7, var5);
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

         this.method_6213(var1, var3, 0, 0, 0, 9, 8, 10, true, var2, class_1252.method_6598());
         this.method_6302(var1, var2, var3, this.field_5851, 4, 3, 0);
         var10000 = this.field_5854;
      }

      if(var4 != null) {
         if(var10000) {
            this.method_6211(var1, var3, 0, 3, 1, 0, 5, 3, class_1192.field_6025, class_1192.field_6025, false);
         }

         var10000 = this.field_5856;
      }

      if(var4 != null) {
         if(var10000) {
            this.method_6211(var1, var3, 9, 3, 1, 9, 5, 3, class_1192.field_6025, class_1192.field_6025, false);
         }

         var10000 = this.field_5855;
      }

      if(var4 != null) {
         if(var10000) {
            this.method_6211(var1, var3, 0, 5, 7, 0, 7, 9, class_1192.field_6025, class_1192.field_6025, false);
         }

         var10000 = this.field_5857;
      }

      if(var4 != null) {
         if(var10000) {
            this.method_6211(var1, var3, 9, 5, 7, 9, 7, 9, class_1192.field_6025, class_1192.field_6025, false);
         }

         this.method_6211(var1, var3, 5, 1, 10, 7, 3, 10, class_1192.field_6025, class_1192.field_6025, false);
         this.method_6213(var1, var3, 1, 2, 1, 8, 2, 6, false, var2, class_1252.method_6598());
         this.method_6213(var1, var3, 4, 1, 5, 4, 4, 9, false, var2, class_1252.method_6598());
         this.method_6213(var1, var3, 8, 1, 5, 8, 4, 9, false, var2, class_1252.method_6598());
         this.method_6213(var1, var3, 1, 4, 7, 3, 4, 9, false, var2, class_1252.method_6598());
         this.method_6213(var1, var3, 1, 3, 5, 3, 3, 6, false, var2, class_1252.method_6598());
         this.method_6211(var1, var3, 1, 3, 4, 3, 3, 4, class_1192.field_6071, class_1192.field_6071, false);
         this.method_6211(var1, var3, 1, 4, 6, 3, 4, 6, class_1192.field_6071, class_1192.field_6071, false);
         this.method_6213(var1, var3, 5, 1, 7, 7, 1, 8, false, var2, class_1252.method_6598());
         this.method_6211(var1, var3, 5, 1, 9, 7, 1, 9, class_1192.field_6071, class_1192.field_6071, false);
         this.method_6211(var1, var3, 5, 2, 7, 7, 2, 7, class_1192.field_6071, class_1192.field_6071, false);
         this.method_6211(var1, var3, 4, 5, 7, 4, 5, 9, class_1192.field_6071, class_1192.field_6071, false);
         this.method_6211(var1, var3, 8, 5, 7, 8, 5, 9, class_1192.field_6071, class_1192.field_6071, false);
         this.method_6211(var1, var3, 5, 5, 7, 7, 5, 9, class_1192.field_6070, class_1192.field_6070, false);
         this.method_6208(var1, class_1192.field_6077, 0, 6, 5, 6, var3);
         var10000 = true;
      }

      return var10000;
   }

   // $FF: renamed from: <clinit> () void
   static void method_6222() {
      // $FF: Couldn't be decompiled
   }
}
