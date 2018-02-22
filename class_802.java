
// $FF: renamed from: xJ
public class class_802 extends class_797 {

   // $FF: renamed from: eb java.lang.String
   private static final String field_3738 = "snowballpoof";


   // $FF: renamed from: <init> (ahb) void
   public void method_3847(ahb var1) {
      super.method_3847(var1);
   }

   // $FF: renamed from: <init> (ahb, sv) void
   public void method_4682(ahb var1, class_752 var2) {
      super.method_4682(var1, var2);
   }

   // $FF: renamed from: <init> (ahb, double, double, double) void
   public void method_4683(ahb var1, double var2, double var4, double var6) {
      super.method_4683(var1, var2, var4, var6);
   }

   // $FF: renamed from: b (azu) void
   protected void method_4687(azu var1) {
      String[] var2 = class_752.method_4253();
      if(var1.field_4218 != null) {
         byte var3 = 0;
         boolean var10000 = var1.field_4218 instanceof class_790;
         if(var2 != null) {
            if(var10000) {
               var3 = 3;
            }

            var1.field_4218.method_3896(class_1691.method_9331(this, this.method_4688()), (float)var3);
         }
      }

      int var4 = 0;

      while(true) {
         if(var4 < 8) {
            this.field_2990.method_2087("snowballpoof", this.field_2994, this.field_2995, this.field_2996, 0.0D, 0.0D, 0.0D);
            ++var4;
            if(var2 == null) {
               break;
            }

            if(var2 != null) {
               continue;
            }
         }

         class_802 var5 = this;
         if(var2 != null) {
            if(this.field_2990.field_1832) {
               break;
            }

            var5 = this;
         }

         var5.method_3851();
         break;
      }

   }

   // $FF: renamed from: <clinit> () void
   static void method_4689() {
      boolean var10000 = true;
      char[] var10003 = "¡4nÕ¿0".toCharArray();
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
            field_3738 = (new String((char[])var3)).intern();
            return;
         }

         char var10007 = (char)((Object[])var3)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 44;
            break;
         case 1:
            var10009 = 15;
            break;
         case 2:
            var10009 = 47;
            break;
         case 3:
            var10009 = 62;
            break;
         case 4:
            var10009 = 150;
            break;
         case 5:
            var10009 = 207;
            break;
         default:
            var10009 = 121;
         }

         ((Object[])var3)[var0] = (char)(var10007 ^ var4 ^ var10009);
         ++var0;
      }
   }
}
