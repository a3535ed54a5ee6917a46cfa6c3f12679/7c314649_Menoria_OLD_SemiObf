import java.util.ArrayList;
import java.util.List;
import java.util.Random;

// $FF: renamed from: iH
public class class_1138 extends class_1137 {

   // $FF: renamed from: h h0
   public class_1075 field_5875;
   // $FF: renamed from: i iD
   public class_1141 field_5876;
   // $FF: renamed from: j java.util.List
   public List field_5877;
   // $FF: renamed from: k java.lang.String
   private static final String field_5878 = "CL_00000499";


   // $FF: renamed from: <init> () void
   public void method_6191() {
      super.method_6191();
      this.field_5877 = new ArrayList();
   }

   // $FF: renamed from: <init> (int, java.util.Random, int, int) void
   public void method_6318(int var1, Random var2, int var3, int var4) {
      super.method_6318(0, var2, var3, var4);
      this.field_5877 = new ArrayList();
   }

   // $FF: renamed from: d () dd
   public class_1034 method_6202() {
      String[] var1 = class_752.method_4253();
      class_1138 var10000 = this;
      class_1034 var2;
      if(var1 != null) {
         if(this.field_5876 != null) {
            var2 = this.field_5876.method_6202();
            return var2;
         }

         var10000 = this;
      }

      var2 = var10000.method_6202();
      return var2;
   }

   // $FF: renamed from: <clinit> () void
   static void method_6222() {
      boolean var10000 = true;
      char[] var10003 = "Ë=³±¤w¸Erº".toCharArray();
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
            field_5878 = (new String((char[])var4)).intern();
            String var2 = field_5878;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 77;
            break;
         case 1:
            var10009 = 180;
            break;
         case 2:
            var10009 = 142;
            break;
         case 3:
            var10009 = 70;
            break;
         case 4:
            var10009 = 68;
            break;
         case 5:
            var10009 = 81;
            break;
         default:
            var10009 = 130;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}
