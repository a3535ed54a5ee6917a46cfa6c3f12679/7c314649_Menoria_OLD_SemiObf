
// $FF: renamed from: zx
public class class_1794 extends class_1793 {

   // $FF: renamed from: j java.lang.String[]
   private static final String[] field_9335;


   // $FF: renamed from: <init> () void
   public void method_9832() {
      super.method_9832();
   }

   // $FF: renamed from: a () java.lang.String
   public String method_43() {
      String[] var10000 = field_9335;
      return "defaultgamemode";
   }

   // $FF: renamed from: a (bh) java.lang.String
   public String method_44(class_20 var1) {
      String[] var10000 = field_9335;
      return "commands.defaultgamemode.usage";
   }

   // $FF: renamed from: a (bh, java.lang.String[]) void
   public void method_46(class_20 var1, String[] var2) {
      if(var2.length > 0) {
         class_94 var3 = this.method_9867(var1, var2[0]);
         this.method_9870(var3);
         String[] var4 = field_9335;
         Object[] var10003 = new Object[1];
         class_1081 var10006 = new class_1081;
         var10006.method_6126("gameMode." + var3.method_444(), new Object[0]);
         var10003[0] = var10006;
         method_9857(var1, this, "commands.defaultgamemode.success", var10003);
      } else {
         class_641 var10000 = new class_641;
         String[] var10002 = field_9335;
         var10000.method_3515("commands.defaultgamemode.usage", new Object[0]);
         throw var10000;
      }
   }

   // $FF: renamed from: b (G) void
   protected void method_9870(class_94 param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: c (AD) AD
   private static class_641 method_9871(class_641 var0) {
      return var0;
   }

   // $FF: renamed from: <clinit> () void
   static void method_9862() {
      // $FF: Couldn't be decompiled
   }
}
