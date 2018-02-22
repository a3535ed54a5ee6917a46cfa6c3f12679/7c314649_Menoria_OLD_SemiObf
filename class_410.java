import java.util.List;

// $FF: renamed from: fG
public class class_410 extends class_408 {

   // $FF: renamed from: P java.lang.String[]
   public static final String[] field_2117;
   // $FF: renamed from: Q java.lang.String[]
   private static final String[] field_2118;


   // $FF: renamed from: <init> () void
   public void method_2651() {
      super.method_2651();
   }

   // $FF: renamed from: a (adb, a5, java.util.List) void
   public void method_2519(adb var1, class_872 var2, List var3) {
      add var10001 = new add;
      var10001.method_3726(var1, 1, 0);
      var3.add(var10001);
      var10001 = new add;
      var10001.method_3726(var1, 1, 1);
      var3.add(var10001);
   }

   // $FF: renamed from: a (vM) void
   public void method_2535(class_74 var1) {
      this.field_2113 = new class_73[field_2117.length];
      String[] var2 = class_752.method_4253();
      this.field_2114 = new class_73[field_2117.length];
      int var3 = 0;

      while(var3 < this.field_2113.length) {
         this.field_2113[var3] = var1.method_375(this.method_2533() + "_" + field_2117[var3]);
         class_73[] var10000 = this.field_2114;
         StringBuilder var10003 = (new StringBuilder()).append(this.method_2533()).append("_").append(field_2117[var3]);
         String[] var10004 = field_2118;
         var10000[var3] = var1.method_375(var10003.append("_top").toString());
         ++var3;
         if(var2 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: <clinit> () void
   static void method_2537() {
      String[] var5 = new String[3];
      int var3 = 0;
      String var2 = ",m;Øz5Ë§Pp3÷¡P¨";
      int var4 = ",m;Øz5Ë§Pp3÷¡P¨".length();
      char var1 = 4;
      int var0 = -1;

      while(true) {
         ++var0;
         String var10002 = var2.substring(var0, var0 + var1);
         boolean var10000 = true;
         char[] var10003 = var10002.toCharArray();
         Object var10004 = var10003.length;
         Object var11 = true;
         char[] var10 = var10003;
         char[] var10001 = (char[])var10004;
         int var6 = 0;

         while(true) {
            var10003 = var10;
            var10 = var10001;
            var10001 = var10003;
            char[] var12 = var10;
            var10 = var10003;
            if(var10003 <= var6) {
               var5[var3++] = (new String((char[])var11)).intern();
               if((var0 += var1) >= var4) {
                  field_2118 = var5;
                  String[] var9 = new String[2];
                  String[] var8 = field_2118;
                  var9[0] = "acacia";
                  var9[1] = "big_oak";
                  field_2117 = var9;
                  return;
               }

               var1 = var2.charAt(var0);
               break;
            }

            char var10007 = (char)((Object[])var11)[var6];
            short var10009;
            switch(var6 % 7) {
            case 0:
               var10009 = 54;
               break;
            case 1:
               var10009 = 92;
               break;
            case 2:
               var10009 = 17;
               break;
            case 3:
               var10009 = 237;
               break;
            case 4:
               var10009 = 139;
               break;
            case 5:
               var10009 = 116;
               break;
            default:
               var10009 = 134;
            }

            ((Object[])var11)[var6] = (char)(var10007 ^ var12 ^ var10009);
            ++var6;
         }
      }
   }
}
