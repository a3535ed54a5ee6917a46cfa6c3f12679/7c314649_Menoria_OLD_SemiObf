
// $FF: renamed from: l_
public class Gui2 implements class_31 {

   // $FF: renamed from: b bao
   private final bao field_7147;
   // $FF: renamed from: c bcb
   private final bcb field_7148;
   // $FF: renamed from: d bcb
   private final bcb field_7149;
   // $FF: renamed from: e java.lang.String
   private static final String field_7150 = "CL_00000678";


   // $FF: renamed from: <init> (bcb, bcb) void
   public void setEnabled2(bcb var1, bcb var2) {
      super();
      this.field_7147 = bao.method_5273();
      this.field_7148 = var1;
      this.field_7149 = var2;
   }

   // $FF: renamed from: b (int, int, int, int, int, bmh, int, int, boolean) void
   public void method_147(int var1, int var2, int var3, int var4, int var5, bmh var6, int var7, int var8, boolean var9) {
      String[] var10 = class_752.method_4253();
      bcb var10000 = this.field_7148;
      if(var10 != null) {
         if(this.field_7148 != null) {
            this.field_7148.field_448 = var3;
            this.field_7148.method_750(this.field_7147, var7, var8);
         }

         var10000 = this.field_7149;
      }

      if(var10 != null) {
         if(var10000 == null) {
            return;
         }

         this.field_7149.field_448 = var3;
         var10000 = this.field_7149;
      }

      var10000.method_750(this.field_7147, var7, var8);
   }

   // $FF: renamed from: b (int, int, int, int, int, int) boolean
   public boolean method_148(int var1, int var2, int var3, int var4, int var5, int var6) {
      String[] var7 = class_752.method_4253();
      bcb var10000 = this.field_7148;
      boolean var8;
      if(var7 != null) {
         if(this.field_7148.method_753(this.field_7147, var2, var3)) {
            var8 = this.field_7148 instanceof class_141;
            if(var7 != null) {
               if(var8) {
                  this.field_7147.canLoseFocus7.method_5351(((class_141)this.field_7148).method_761(), 1);
                  this.field_7148.field_449 = this.field_7147.canLoseFocus7.method_5355(class_101.method_464(this.field_7148.field_450));
               }

               var8 = true;
            }

            return var8;
         }

         var10000 = this.field_7149;
      }

      label48: {
         if(var7 != null) {
            if(var10000 == null) {
               break label48;
            }

            var10000 = this.field_7149;
         }

         var8 = var10000.method_753(this.field_7147, var2, var3);
         if(var7 == null) {
            return var8;
         }

         if(var8) {
            var8 = this.field_7149 instanceof class_141;
            if(var7 != null) {
               if(var8) {
                  this.field_7147.canLoseFocus7.method_5351(((class_141)this.field_7149).method_761(), 1);
                  this.field_7149.field_449 = this.field_7147.canLoseFocus7.method_5355(class_101.method_464(this.field_7149.field_450));
               }

               var8 = true;
            }

            return var8;
         }
      }

      var8 = false;
      return var8;
   }

   // $FF: renamed from: c (int, int, int, int, int, int) void
   public void method_149(int var1, int var2, int var3, int var4, int var5, int var6) {
      String[] var7 = class_752.method_4253();
      bcb var10000 = this.field_7148;
      if(var7 != null) {
         if(this.field_7148 != null) {
            this.field_7148.method_752(var2, var3);
         }

         var10000 = this.field_7149;
      }

      if(var7 != null) {
         if(var10000 == null) {
            return;
         }

         var10000 = this.field_7149;
      }

      var10000.method_752(var2, var3);
   }

   // $FF: renamed from: <clinit> () void
   static void setEnabled3() {
      boolean var10000 = true;
      char[] var10003 = "Ë2ÄIÿ¸dZ".toCharArray();
      Object var10004 = var10003.length;
      Object var4 = true;
      char[] var10002 = var10003;
      char[] var10001 = (char[])var10004;
      int var0 = 0;

      while(true) {
         var10003 = var10002;
         var10002 = var10001;
         var10001 = var10003;
         char[] var5 = var10002;
         var10002 = var10003;
         if(var10003 <= var0) {
            field_7150 = (new String((char[])var4)).intern();
            String var2 = field_7150;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 177;
            break;
         case 1:
            var10009 = 107;
            break;
         case 2:
            var10009 = 84;
            break;
         case 3:
            var10009 = 128;
            break;
         case 4:
            var10009 = 205;
            break;
         case 5:
            var10009 = 64;
            break;
         default:
            var10009 = 246;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}
