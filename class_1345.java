import java.util.Comparator;
import java.util.List;

// $FF: renamed from: ki
public class class_1345 {

   // $FF: renamed from: b java.util.Comparator
   public static final Comparator field_6924;
   // $FF: renamed from: c kl
   private final class_1348 field_6925;
   // $FF: renamed from: d kh
   private final class_1344 field_6926;
   // $FF: renamed from: e java.lang.String
   private final String field_6927;
   // $FF: renamed from: f int
   private int field_6928;
   // $FF: renamed from: g java.lang.String
   private static final String field_6929;
   // $FF: renamed from: h java.lang.String[]
   private static final String[] field_6930;


   // $FF: renamed from: <init> (kl, kh, java.lang.String) void
   public void method_7128(class_1348 var1, class_1344 var2, String var3) {
      super();
      this.field_6925 = var1;
      this.field_6926 = var2;
      this.field_6927 = var3;
   }

   // $FF: renamed from: b (int) void
   public void method_7129(int param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: c (int) void
   public void writeText0(int param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b () void
   public void writeText1() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: d () int
   public int writeText2() {
      return this.field_6928;
   }

   // $FF: renamed from: d (int) void
   public void writeText3(int param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: e () kh
   public class_1344 writeText4() {
      return this.field_6926;
   }

   // $FF: renamed from: f () java.lang.String
   public String writeText5() {
      return this.field_6927;
   }

   // $FF: renamed from: g () kl
   public class_1348 writeText6() {
      return this.field_6925;
   }

   // $FF: renamed from: b (java.util.List) void
   public void writeText7(List var1) {
      this.writeText3(this.field_6926.GuiTextField8().method_155(var1));
   }

   // $FF: renamed from: <clinit> () void
   static void writeText8() {
      String[] var5 = new String[2];
      int var3 = 0;
      String var2 = "8r·1Ð#Kî°8¹Cén3·Iîg3\t½Lã,}¡\rôba";
      int var4 = "8r·1Ð#Kî°8¹Cén3·Iîg3\t½Lã,}¡\rôba".length();
      char var1 = 11;
      int var0 = -1;

      while(true) {
         ++var0;
         String var10002 = var2.substring(var0, var0 + var1);
         boolean var10000 = true;
         char[] var10003 = var10002.toCharArray();
         Object var10004 = var10003.length;
         Object var10 = true;
         char[] var9 = var10003;
         char[] var10001 = (char[])var10004;
         int var6 = 0;

         while(true) {
            var10003 = var9;
            var9 = var10001;
            var10001 = var10003;
            char[] var12 = var9;
            var9 = var10003;
            if(var10003 <= var6) {
               var5[var3++] = (new String((char[])var10)).intern();
               if((var0 += var1) >= var4) {
                  field_6930 = var5;
                  String[] var11 = field_6930;
                  field_6929 = "CL_00000617";
                  class_1347 var8 = new class_1347;
                  var8.method_7156();
                  field_6924 = var8;
                  return;
               }

               var1 = var2.charAt(var0);
               break;
            }

            char var10007 = (char)((Object[])var10)[var6];
            short var10009;
            switch(var6 % 7) {
            case 0:
               var10009 = 208;
               break;
            case 1:
               var10009 = 115;
               break;
            case 2:
               var10009 = 134;
               break;
            case 3:
               var10009 = 44;
               break;
            case 4:
               var10009 = 170;
               break;
            case 5:
               var10009 = 75;
               break;
            default:
               var10009 = 184;
            }

            ((Object[])var10)[var6] = (char)(var10007 ^ var12 ^ var10009);
            ++var6;
         }
      }
   }

   // $FF: renamed from: b (java.lang.IllegalStateException) java.lang.IllegalStateException
   private static IllegalStateException writeText9(IllegalStateException var0) {
      return var0;
   }
}
