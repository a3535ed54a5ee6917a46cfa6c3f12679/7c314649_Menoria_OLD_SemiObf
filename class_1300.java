import java.io.File;

// $FF: renamed from: jV
public class class_1300 extends class_1299 {

   // $FF: renamed from: j java.lang.String[]
   private static final String[] field_6674;


   // $FF: renamed from: <init> (java.io.File, java.lang.String, boolean) void
   public void method_6814(File var1, String var2, boolean var3) {
      super.method_6814(var1, var2, var3);
   }

   // $FF: renamed from: b (gU) gN
   public class_26 method_127(class_1089 var1) {
      String[] var10000 = class_752.method_4253();
      File var3 = this.method_132();
      String[] var2 = var10000;
      boolean var6 = var1 instanceof class_1092;
      File var4;
      class_1085 var7;
      File var8;
      if(var2 != null) {
         if(var6) {
            var8 = new File(var3, "DIM-1");
            String[] var5 = field_6674;
            var4 = var8;
            var4.mkdirs();
            var7 = new class_1085;
            var7.method_6146(var4);
            return var7;
         }

         var6 = var1 instanceof class_1090;
      }

      if(var6) {
         var8 = new File(var3, "DIM1");
         String[] var10003 = field_6674;
         var4 = var8;
         var4.mkdirs();
         var7 = new class_1085;
         var7.method_6146(var4);
         return var7;
      } else {
         var7 = new class_1085;
         var7.method_6146(var3);
         return var7;
      }
   }

   // $FF: renamed from: b (jY, ro) void
   public void method_128(class_1303 var1, class_1583 var2) {
      var1.method_6854(19133);
      super.method_128(var1, var2);
   }

   // $FF: renamed from: d () void
   public void method_131() {
      try {
         class_1342.field_6903.method_7090();
      } catch (InterruptedException var2) {
         var2.printStackTrace();
      }

      class_1083.method_6138();
   }

   // $FF: renamed from: <clinit> () void
   static void method_6816() {
      String[] var5 = new String[2];
      int var3 = 0;
      String var2 = "E;åE;ù";
      int var4 = "E;åE;ù".length();
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
            char[] var10 = var8;
            var8 = var10003;
            if(var10003 <= var6) {
               var5[var3++] = (new String((char[])var9)).intern();
               if((var0 += var1) >= var4) {
                  field_6674 = var5;
                  return;
               }

               var1 = var2.charAt(var0);
               break;
            }

            char var10007 = (char)((Object[])var9)[var6];
            short var10009;
            switch(var6 % 7) {
            case 0:
               var10009 = 221;
               break;
            case 1:
               var10009 = 174;
               break;
            case 2:
               var10009 = 4;
               break;
            case 3:
               var10009 = 8;
               break;
            case 4:
               var10009 = 111;
               break;
            case 5:
               var10009 = 182;
               break;
            default:
               var10009 = 231;
            }

            ((Object[])var9)[var6] = (char)(var10007 ^ var10 ^ var10009);
            ++var6;
         }
      }
   }
}
