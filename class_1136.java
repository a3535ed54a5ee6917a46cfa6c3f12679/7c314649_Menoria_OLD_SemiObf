import java.util.List;
import java.util.Random;

// $FF: renamed from: iI
public class class_1136 extends class_1131 {

   // $FF: renamed from: d boolean
   private boolean field_5868;
   // $FF: renamed from: g boolean
   private boolean field_5869;
   // $FF: renamed from: h java.lang.String
   private static final String field_5870;
   // $FF: renamed from: j java.lang.String[]
   private static final String[] field_5871;


   // $FF: renamed from: <init> () void
   public void method_6191() {
      super.method_6191();
   }

   // $FF: renamed from: <init> (int, java.util.Random, hS, int) void
   public void method_6316(int var1, Random var2, class_1206 var3, int var4) {
      String[] var10000 = class_752.method_4253();
      super.method_6192(var1);
      String[] var5 = var10000;
      this.field_5753 = var4;
      this.field_5851 = this.method_6303(var2);
      this.field_5752 = var3;
      int var10001 = var2.nextInt(2);
      if(var5 != null) {
         var10001 = var10001 == 0?1:0;
      }

      this.field_5868 = (boolean)var10001;
      var10001 = var2.nextInt(2);
      if(var5 != null) {
         var10001 = var10001 == 0?1:0;
      }

      this.field_5869 = (boolean)var10001;
   }

   // $FF: renamed from: b (ro) void
   protected void method_6194(class_1583 var1) {
      super.method_6194(var1);
      String[] var2 = field_5871;
      var1.initGui4("Left", this.field_5868);
      var1.initGui4("Right", this.field_5869);
   }

   // $FF: renamed from: c (ro) void
   protected void method_6196(class_1583 var1) {
      super.method_6196(var1);
      String[] var2 = field_5871;
      this.field_5868 = var1.method_8690("Left");
      this.field_5869 = var1.method_8690("Right");
   }

   // $FF: renamed from: b (h7, java.util.List, java.util.Random) void
   public void method_6197(class_1094 var1, List var2, Random var3) {
      String[] var10000 = class_752.method_4253();
      this.method_6304((class_1138)var1, var2, var3, 1, 1);
      String[] var4 = var10000;
      boolean var5 = this.field_5868;
      if(var4 != null) {
         if(this.field_5868) {
            this.method_6305((class_1138)var1, var2, var3, 1, 2);
         }

         if(var4 == null) {
            return;
         }

         var5 = this.field_5869;
      }

      if(var5) {
         this.method_6306((class_1138)var1, var2, var3, 1, 2);
      }

   }

   // $FF: renamed from: b (java.util.List, java.util.Random, int, int, int, int, int) iI
   public static class_1136 method_6317(List var0, Random var1, int var2, int var3, int var4, int var5, int var6) {
      class_1206 var7 = class_1206.method_6479(var2, var3, var4, -1, -1, 0, 5, 5, 7, var5);
      class_1136 var10000;
      if(method_6307(var7) && class_1094.method_6201(var0, var7) == null) {
         var10000 = new class_1136;
         var10000.method_6316(var6, var1, var7, var5);
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

         this.method_6213(var1, var3, 0, 0, 0, 4, 4, 6, true, var2, class_1252.method_6598());
         this.method_6302(var1, var2, var3, this.field_5851, 1, 1, 0);
         this.method_6302(var1, var2, var3, class_98.field_71, 1, 1, 6);
         this.method_6215(var1, var3, var2, 0.1F, 1, 2, 1, class_1192.field_6077, 0);
         this.method_6215(var1, var3, var2, 0.1F, 3, 2, 1, class_1192.field_6077, 0);
         this.method_6215(var1, var3, var2, 0.1F, 1, 2, 5, class_1192.field_6077, 0);
         this.method_6215(var1, var3, var2, 0.1F, 3, 2, 5, class_1192.field_6077, 0);
         var10000 = this.field_5868;
      }

      if(var4 != null) {
         if(var10000) {
            this.method_6211(var1, var3, 0, 1, 2, 0, 3, 4, class_1192.field_6025, class_1192.field_6025, false);
         }

         var10000 = this.field_5869;
      }

      if(var4 != null) {
         if(var10000) {
            this.method_6211(var1, var3, 4, 1, 2, 4, 3, 4, class_1192.field_6025, class_1192.field_6025, false);
         }

         var10000 = true;
      }

      return var10000;
   }

   // $FF: renamed from: <clinit> () void
   static void method_6222() {
      String[] var5 = new String[3];
      int var3 = 0;
      String var2 = "ÄÆíÿØ¶»iØÈÇò";
      int var4 = "ÄÆíÿØ¶»iØÈÇò".length();
      char var1 = 4;
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
                  field_5871 = var5;
                  String[] var10 = field_5871;
                  field_5870 = "CL_00000500";
                  return;
               }

               var1 = var2.charAt(var0);
               break;
            }

            char var10007 = (char)((Object[])var9)[var6];
            short var10009;
            switch(var6 % 7) {
            case 0:
               var10009 = 29;
               break;
            case 1:
               var10009 = 229;
               break;
            case 2:
               var10009 = 228;
               break;
            case 3:
               var10009 = 172;
               break;
            case 4:
               var10009 = 194;
               break;
            case 5:
               var10009 = 252;
               break;
            default:
               var10009 = 207;
            }

            ((Object[])var9)[var6] = (char)(var10007 ^ var11 ^ var10009);
            ++var6;
         }
      }
   }
}
