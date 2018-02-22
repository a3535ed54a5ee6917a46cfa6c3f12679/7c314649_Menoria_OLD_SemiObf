
// $FF: renamed from: zH
public class class_1825 extends class_1790 {

   // $FF: renamed from: a java.lang.String
   private static final String field_9371;
   // $FF: renamed from: i java.lang.String[]
   private static final String[] field_9372;


   // $FF: renamed from: <init> () void
   public void method_9832() {
      super.method_9832();
   }

   // $FF: renamed from: a () java.lang.String
   public String method_43() {
      String[] var10000 = field_9372;
      return "netstat";
   }

   // $FF: renamed from: b () int
   public int method_9833() {
      return 0;
   }

   // $FF: renamed from: a (bh) java.lang.String
   public String method_44(class_20 var1) {
      String[] var10000 = field_9372;
      return "commands.players.usage";
   }

   // $FF: renamed from: a (bh, java.lang.String[]) void
   public void method_46(class_20 param1, String[] param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (bh, int, rL) void
   private void method_9932(class_20 var1, int var2, class_1540 var3) {
      class_1082 var10001;
      label16: {
         String[] var4 = class_752.method_4253();
         if(var4 != null) {
            if(var3 == null) {
               break label16;
            }

            var10001 = new class_1082;
            var10001.method_6134(var3.toString());
            var1.method_66(var10001);
         }

         if(var4 != null) {
            return;
         }
      }

      var10001 = new class_1082;
      StringBuilder var10003 = new StringBuilder();
      String[] var5 = field_9372;
      var10001.method_6134(var10003.append("Packet ").append(var2).append(" not found!").toString());
      var1.method_66(var10001);
   }

   // $FF: renamed from: b (java.lang.Exception) java.lang.Exception
   private static Exception method_9933(Exception var0) {
      return var0;
   }

   // $FF: renamed from: <clinit> () void
   static void method_9862() {
      // $FF: Couldn't be decompiled
   }
}
