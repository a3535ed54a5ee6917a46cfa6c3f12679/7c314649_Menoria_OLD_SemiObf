import java.util.Random;

// $FF: renamed from: hd
public abstract class class_1162 extends class_1151 {

   // $FF: renamed from: <init> (boolean) void
   public void method_6350(boolean var1) {
      super.method_6350(var1);
   }

   // $FF: renamed from: b (aji) boolean
   protected boolean method_6362(aji var1) {
      boolean var3;
      label69: {
         String[] var2;
         aji var4;
         label70: {
            var2 = class_752.method_4253();
            awt var10000 = var1.method_2424();
            awt var10001 = awt.field_4170;
            if(var2 != null) {
               if(var10000 == awt.field_4170) {
                  break label69;
               }

               var4 = var1;
               if(var2 == null) {
                  break label70;
               }

               var10000 = var1.method_2424();
               var10001 = awt.field_4179;
            }

            if(var10000 == var10001) {
               break label69;
            }

            var4 = var1;
         }

         Object var5 = class_1192.field_6027;
         if(var2 != null) {
            if(var4 == class_1192.field_6027) {
               break label69;
            }

            var4 = var1;
            var5 = class_1192.field_6028;
         }

         if(var2 != null) {
            if(var4 == var5) {
               break label69;
            }

            var4 = var1;
            var5 = class_1192.field_6042;
         }

         if(var2 != null) {
            if(var4 == var5) {
               break label69;
            }

            var4 = var1;
            var5 = class_1192.field_6043;
         }

         if(var2 != null) {
            if(var4 == var5) {
               break label69;
            }

            var4 = var1;
            var5 = class_1192.field_6031;
         }

         if(var2 != null) {
            if(var4 == var5) {
               break label69;
            }

            var4 = var1;
            var5 = class_1192.field_6131;
         }

         if(var4 != var5) {
            var3 = false;
            return var3;
         }
      }

      var3 = true;
      return var3;
   }

   // $FF: renamed from: a (ahb, java.util.Random, int, int, int) void
   public void method_6363(ahb var1, Random var2, int var3, int var4, int var5) {}
}
