import java.util.Iterator;
import java.util.List;
import java.util.Random;

// $FF: renamed from: i7
public class class_1200 extends class_1199 {

   // $FF: renamed from: a boolean
   private boolean field_6235;
   // $FF: renamed from: i java.lang.String
   private static final String field_6236 = "Valid";


   // $FF: renamed from: <init> () void
   public void method_6448() {
      super.method_6448();
   }

   // $FF: renamed from: <init> (ahb, java.util.Random, int, int, int) void
   public void method_6464(ahb var1, Random var2, int var3, int var4, int var5) {
      super.method_6449(var3, var4);
      String[] var10000 = class_752.method_4253();
      List var7 = class_1249.method_6578(var2, var5);
      class_1118 var10001 = new class_1118;
      var10001.method_6276(var1.method_2041(), 0, var2, (var3 << 4) + 2, (var4 << 4) + 2, var7, var5);
      class_1118 var8 = var10001;
      this.field_6230.add(var8);
      String[] var6 = var10000;
      var8.method_6197(var8, this.field_6230, var2);
      List var9 = var8.field_5820;
      List var10 = var8.field_5819;

      int var11;
      int var15;
      label61: {
         while(true) {
            label58: {
               if(var9.isEmpty()) {
                  var15 = var10.isEmpty();
                  if(var6 == null) {
                     break label58;
                  }

                  if(var6 == null) {
                     break label61;
                  }

                  if(var15 != 0) {
                     break;
                  }
               }

               var15 = var9.isEmpty();
            }

            class_1094 var12;
            if(var6 != null) {
               if(var15 != 0) {
                  var11 = var2.nextInt(var10.size());
                  var12 = (class_1094)var10.remove(var11);
                  var12.method_6197(var8, this.field_6230, var2);
                  if(var6 != null) {
                     continue;
                  }
               }

               var15 = var2.nextInt(var9.size());
            }

            var11 = var15;
            var12 = (class_1094)var9.remove(var11);
            var12.method_6197(var8, this.field_6230, var2);
            if(var6 == null) {
               break;
            }
         }

         this.method_6453();
         var15 = 0;
      }

      var11 = var15;
      Iterator var14 = this.field_6230.iterator();

      while(true) {
         if(var14.hasNext()) {
            class_1094 var13 = (class_1094)var14.next();
            if(var6 == null) {
               break;
            }

            if(!(var13 instanceof class_1119)) {
               ++var11;
            }

            if(var6 != null) {
               continue;
            }
         }

         int var16 = var11;
         if(var6 != null) {
            var16 = var11 > 2?1:0;
         }

         this.field_6235 = (boolean)var16;
         break;
      }

   }

   // $FF: renamed from: e () boolean
   public boolean method_6460() {
      return this.field_6235;
   }

   // $FF: renamed from: b (ro) void
   public void method_6455(class_1583 var1) {
      super.method_6455(var1);
      var1.initGui4("Valid", this.field_6235);
   }

   // $FF: renamed from: c (ro) void
   public void method_6457(class_1583 var1) {
      super.method_6457(var1);
      this.field_6235 = var1.method_8690("Valid");
   }

   // $FF: renamed from: <clinit> () void
   static void method_6463() {
      boolean var10000 = true;
      char[] var10003 = "/RÐµÄ".toCharArray();
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
            field_6236 = (new String((char[])var3)).intern();
            return;
         }

         char var10007 = (char)((Object[])var3)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 251;
            break;
         case 1:
            var10009 = 177;
            break;
         case 2:
            var10009 = 62;
            break;
         case 3:
            var10009 = 94;
            break;
         case 4:
            var10009 = 34;
            break;
         case 5:
            var10009 = 162;
            break;
         default:
            var10009 = 116;
         }

         ((Object[])var3)[var0] = (char)(var10007 ^ var4 ^ var10009);
         ++var0;
      }
   }
}
