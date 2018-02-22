import java.util.ArrayList;
import java.util.List;
import java.util.Random;

// $FF: renamed from: id
public class class_1114 extends class_1113 {

   // $FF: renamed from: g hV
   public class_1247 field_5802;
   // $FF: renamed from: h java.util.List
   public List field_5803;
   // $FF: renamed from: i java.util.List
   public List field_5804;
   // $FF: renamed from: j java.util.ArrayList
   public ArrayList field_5805;
   // $FF: renamed from: k java.lang.String
   private static final String field_5806 = "CL_00000470";


   // $FF: renamed from: <init> () void
   public void method_6191() {
      super.method_6191();
      this.field_5805 = new ArrayList();
   }

   // $FF: renamed from: <init> (java.util.Random, int, int) void
   public void method_6262(Random var1, int var2, int var3) {
      String[] var10000 = class_752.method_4253();
      super.method_6262(var1, var2, var3);
      this.field_5805 = new ArrayList();
      String[] var4 = var10000;
      this.field_5803 = new ArrayList();
      class_1247[] var5 = class_1208.method_6507();
      int var6 = var5.length;
      int var7 = 0;

      class_1247 var8;
      while(true) {
         if(var7 < var6) {
            var8 = var5[var7];
            var8.field_6480 = 0;
            this.field_5803.add(var8);
            ++var7;
            if(var4 == null) {
               break;
            }

            if(var4 != null) {
               continue;
            }
         }

         this.field_5804 = new ArrayList();
         var5 = class_1208.method_6508();
         var6 = var5.length;
         break;
      }

      var7 = 0;

      while(var7 < var6) {
         var8 = var5[var7];
         var8.field_6480 = 0;
         this.field_5804.add(var8);
         ++var7;
         if(var4 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: c (ro) void
   protected void method_6196(class_1583 var1) {
      super.method_6196(var1);
   }

   // $FF: renamed from: b (ro) void
   protected void method_6194(class_1583 var1) {
      super.method_6194(var1);
   }

   // $FF: renamed from: <clinit> () void
   static void method_6222() {
      boolean var10000 = true;
      char[] var10003 = "4´°qØýGÌØq".toCharArray();
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
            field_5806 = (new String((char[])var4)).intern();
            String var2 = field_5806;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 178;
            break;
         case 1:
            var10009 = 61;
            break;
         case 2:
            var10009 = 42;
            break;
         case 3:
            var10009 = 132;
            break;
         case 4:
            var10009 = 232;
            break;
         case 5:
            var10009 = 45;
            break;
         default:
            var10009 = 8;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}
