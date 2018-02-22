import java.util.List;

// $FF: renamed from: le
public class class_186 extends class_185 {

   // $FF: renamed from: C java.lang.String
   private static final String field_737 = "multiplayer.stopSleeping";


   // $FF: renamed from: <init> () void
   public void method_651() {
      super.method_651();
   }

   // $FF: renamed from: b () void
   public void initGui() {
      super.initGui();
      List var10000 = this.buttonList;
      bcb var10001 = new bcb;
      var10001.method_747(1, this.width / 2 - 100, this.height - 40, class_1450.method_7896("multiplayer.stopSleeping", new Object[0]));
      var10000.add(var10001);
   }

   // $FF: renamed from: a (char, int) void
   protected void method_856(char var1, int var2) {
      String[] var3 = class_752.method_4253();
      int var10000 = var2;
      short var10001 = 1;
      if(var3 != null) {
         if(var2 == 1) {
            this.method_985();
            if(var3 != null) {
               return;
            }
         }

         var10000 = var2;
         var10001 = 28;
      }

      label42: {
         label31: {
            if(var3 != null) {
               if(var10000 == var10001) {
                  break label31;
               }

               var10000 = var2;
               var10001 = 156;
            }

            if(var10000 != var10001) {
               break label42;
            }
         }

         String var4 = this.field_733.method_714().trim();
         if(var3 != null) {
            if(!var4.isEmpty()) {
               this.field_557.cursorCounter8.method_4676(var4);
            }

            this.field_733.writeText("");
            this.field_557.canLoseFocus4.method_707().method_682();
         }

         if(var3 != null) {
            return;
         }
      }

      super.method_856(var1, var2);
   }

   // $FF: renamed from: a (bcb) void
   protected void method_865(bcb var1) {
      String[] var2 = class_752.method_4253();
      if(var1.field_450 == 1) {
         this.method_985();
         if(var2 != null) {
            return;
         }
      }

      super.method_865(var1);
   }

   // $FF: renamed from: a () void
   private void method_985() {
      class_1436 var1 = this.field_557.cursorCounter8.field_3707;
      class_261 var10001 = new class_261;
      var10001.method_1506(this.field_557.cursorCounter8, 3);
      var1.method_7821(var10001);
   }

   // $FF: renamed from: <clinit> () void
   static void method_983() {
      boolean var10000 = true;
      char[] var10003 = ";×ä\'ã7Û£$û9Ò8è2ÿ?Ì\f".toCharArray();
      Object var10004 = var10003.length;
      Object var3 = true;
      char[] var10002 = var10003;
      char[] var10001 = (char[])var10004;
      int var0 = 0;

      while(true) {
         var10003 = var10002;
         var10002 = var10001;
         var10001 = var10003;
         char[] var4 = var10002;
         var10002 = var10003;
         if(var10003 <= var0) {
            field_737 = (new String((char[])var3)).intern();
            return;
         }

         char var10007 = (char)((Object[])var3)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 171;
            break;
         case 1:
            var10009 = 95;
            break;
         case 2:
            var10009 = 150;
            break;
         case 3:
            var10009 = 27;
            break;
         case 4:
            var10009 = 112;
            break;
         case 5:
            var10009 = 170;
            break;
         default:
            var10009 = 114;
         }

         ((Object[])var3)[var0] = (char)(var10007 ^ var4 ^ var10009);
         ++var0;
      }
   }
}
