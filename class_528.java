
// $FF: renamed from: bV
public class class_528 extends adb {

   // $FF: renamed from: n vL
   private class_73 field_2374;
   // $FF: renamed from: o java.lang.String[]
   private static final String[] field_2375;


   // $FF: renamed from: <init> () void
   public void method_2917() {
      super.method_2917();
      this.method_2935(64);
      this.method_2922(1);
      this.method_2974(class_872.fontRendererInstance1);
   }

   // $FF: renamed from: f () boolean
   public boolean method_2942() {
      return true;
   }

   // $FF: renamed from: g () boolean
   public boolean method_2943() {
      return true;
   }

   // $FF: renamed from: a (add, ahb, yz) add
   public add method_2928(add var1, ahb var2, class_792 var3) {
      String[] var4;
      label26: {
         var4 = class_752.method_4253();
         class_704 var10000 = var3.field_3650;
         if(var4 != null) {
            if(var3.field_3650 == null) {
               break label26;
            }

            var10000 = var3.field_3650;
         }

         int var5 = var10000.method_4057();
         var1.method_3749(var5, var3);
         var3.method_4209();
         if(var4 != null) {
            return var1;
         }
      }

      String[] var10002 = field_2375;
      var2.method_2082(var3, "random.bow", 0.5F, 0.4F / (field_2332.nextFloat() * 0.4F + 0.8F));
      if(var4 != null && !var2.field_1832) {
         class_704 var10001 = new class_704;
         var10001.method_4055(var2, var3);
         var2.method_2089(var10001);
      }

      var3.method_4209();
      return var1;
   }

   // $FF: renamed from: a (vM) void
   public void registerIcons(class_74 var1) {
      StringBuilder var10002 = (new StringBuilder()).append(this.method_2980());
      String[] var2 = field_2375;
      this.field_2340 = var1.method_375(var10002.append("_uncast").toString());
      this.field_2374 = var1.method_375(this.method_2980() + "_cast");
   }

   // $FF: renamed from: e () vL
   public class_73 method_2999() {
      return this.field_2374;
   }

   // $FF: renamed from: e_ (add) boolean
   public boolean method_2967(add var1) {
      return super.method_2967(var1);
   }

   // $FF: renamed from: c () int
   public int method_2969() {
      return 1;
   }

   // $FF: renamed from: <clinit> () void
   static void method_2981() {
      String[] var5 = new String[3];
      int var3 = 0;
      String var2 = "Ô] }\"DÚD(ÖRf(À]s<";
      int var4 = "Ô] }\"DÚD(ÖRf(À]s<".length();
      char var1 = 10;
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
                  field_2375 = var5;
                  return;
               }

               var1 = var2.charAt(var0);
               break;
            }

            char var10007 = (char)((Object[])var9)[var6];
            short var10009;
            switch(var6 % 7) {
            case 0:
               var10009 = 130;
               break;
            case 1:
               var10009 = 64;
               break;
            case 2:
               var10009 = 198;
               break;
            case 3:
               var10009 = 145;
               break;
            case 4:
               var10009 = 231;
               break;
            case 5:
               var10009 = 186;
               break;
            default:
               var10009 = 159;
            }

            ((Object[])var9)[var6] = (char)(var10007 ^ var10 ^ var10009);
            ++var6;
         }
      }
   }
}
