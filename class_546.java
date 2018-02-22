import java.util.List;

// $FF: renamed from: bD
public class class_546 extends adb {

   // $FF: renamed from: n vL
   private class_73 field_2402;
   // $FF: renamed from: o java.lang.String[]
   private static final String[] field_2403;


   // $FF: renamed from: <init> () void
   public void method_2917() {
      super.method_2917();
      this.method_2933(true);
      this.method_2935(0);
      this.method_2974(class_872.fontRendererInstance4);
   }

   // $FF: renamed from: a (add) java.lang.String
   public String getUnlocalizedName(add var1) {
      if(var1.method_3745() == 1) {
         String[] var2 = field_2403;
         return "item.charcoal";
      } else {
         String[] var10000 = field_2403;
         return "item.coal";
      }
   }

   // $FF: renamed from: a (adb, a5, java.util.List) void
   public void getSubItems(adb var1, class_872 var2, List var3) {
      add var10001 = new add;
      var10001.method_3726(var1, 1, 0);
      var3.add(var10001);
      var10001 = new add;
      var10001.method_3726(var1, 1, 1);
      var3.add(var10001);
   }

   // $FF: renamed from: b_ (int) vL
   public class_73 getIconFromDamage(int var1) {
      return var1 == 1?this.field_2402:super.getIconFromDamage(var1);
   }

   // $FF: renamed from: a (vM) void
   public void registerIcons(class_74 var1) {
      super.registerIcons(var1);
      String[] var10002 = field_2403;
      this.field_2402 = var1.method_375("charcoal");
   }

   // $FF: renamed from: <clinit> () void
   static void method_2981() {
      String[] var5 = new String[3];
      int var3 = 0;
      String var2 = "ÜÙ-«Ô\bÖÝ`§\fÙ\rÜÙ-«Ô\tßb¤";
      int var4 = "ÜÙ-«Ô\bÖÝ`§\fÙ\rÜÙ-«Ô\tßb¤".length();
      char var1 = 9;
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
                  field_2403 = var5;
                  return;
               }

               var1 = var2.charAt(var0);
               break;
            }

            char var10007 = (char)((Object[])var9)[var6];
            short var10009;
            switch(var6 % 7) {
            case 0:
               var10009 = 234;
               break;
            case 1:
               var10009 = 36;
               break;
            case 2:
               var10009 = 227;
               break;
            case 3:
               var10009 = 163;
               break;
            case 4:
               var10009 = 92;
               break;
            case 5:
               var10009 = 151;
               break;
            default:
               var10009 = 50;
            }

            ((Object[])var9)[var6] = (char)(var10007 ^ var10 ^ var10009);
            ++var6;
         }
      }
   }
}
