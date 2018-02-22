import java.util.concurrent.Callable;

// $FF: renamed from: nC
class class_1383 implements Callable {

   // $FF: renamed from: a java.lang.String
   private static final String field_7352;
   // $FF: renamed from: b bjf
   final bjf field_7353;
   // $FF: renamed from: h java.lang.String[]
   private static final String[] field_7354;


   // $FF: renamed from: <init> (bjf) void
   void method_7547(bjf var1) {
      this.field_7353 = var1;
      super();
   }

   // $FF: renamed from: b () java.lang.String
   public String method_7548() {
      String var10000;
      if(bjf.method_2238(this.field_7353).method_5280() == null) {
         String[] var1 = field_7354;
         var10000 = "Non-integrated multiplayer server";
      } else {
         String[] var2 = field_7354;
         var10000 = "Integrated singleplayer server";
      }

      return var10000;
   }

   // $FF: renamed from: <clinit> () void
   static void method_7549() {
      String[] var5 = new String[3];
      int var3 = 0;
      String var2 = ",±:ð¼j¹&¼¡aB³!±¡m¿-¸§$¬\"¸§+° ¸²v»0ý¦m²1­¹e¬t®°v¬!íå4ZRælë";
      int var4 = ",±:ð¼j¹&¼¡aB³!±¡m¿-¸§$¬\"¸§+° ¸²v»0ý¦m²1­¹e¬t®°v¬!íå4ZRælë".length();
      char var1 = 33;
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
                  field_7354 = var5;
                  String[] var10 = field_7354;
                  field_7352 = "CL_00000886";
                  return;
               }

               var1 = var2.charAt(var0);
               break;
            }

            char var10007 = (char)((Object[])var9)[var6];
            short var10009;
            switch(var6 % 7) {
            case 0:
               var10009 = 156;
               break;
            case 1:
               var10009 = 32;
               break;
            case 2:
               var10009 = 170;
               break;
            case 3:
               var10009 = 35;
               break;
            case 4:
               var10009 = 43;
               break;
            case 5:
               var10009 = 250;
               break;
            default:
               var10009 = 148;
            }

            ((Object[])var9)[var6] = (char)(var10007 ^ var11 ^ var10009);
            ++var6;
         }
      }
   }
}
