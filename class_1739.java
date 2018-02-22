
// $FF: renamed from: yo
public class class_1739 extends class_1737 {

   // $FF: renamed from: a int
   private int field_9085;
   // $FF: renamed from: k int
   private int field_9086;
   // $FF: renamed from: l java.lang.String
   private static final String field_9087 = "mobGriefing";


   // $FF: renamed from: <init> (sw) void
   public void method_9671(class_753 var1) {
      super.method_9671(var1);
      this.field_9086 = -1;
   }

   // $FF: renamed from: b () boolean
   public boolean method_9649() {
      String[] var1 = class_752.method_4253();
      boolean var10000 = super.method_9649();
      if(var1 != null) {
         if(!var10000) {
            return false;
         }

         var10000 = this.field_9075.field_2990.method_2196().method_5878("mobGriefing");
      }

      if(var1 != null) {
         if(!var10000) {
            return false;
         }

         var10000 = this.field_9079.method_2671(this.field_9075.field_2990, this.field_9076, this.field_9077, this.field_9078);
      }

      if(var1 != null) {
         var10000 = !var10000;
      }

      return var10000;
   }

   // $FF: renamed from: e () void
   public void method_9652() {
      super.method_9652();
      this.field_9085 = 0;
   }

   // $FF: renamed from: c () boolean
   public boolean method_9650() {
      int var4;
      label32: {
         String[] var10000 = class_752.method_4253();
         double var2 = this.field_9075.method_3889((double)this.field_9076, (double)this.field_9077, (double)this.field_9078);
         String[] var1 = var10000;
         var4 = this.field_9085;
         if(var1 != null) {
            if(this.field_9085 > 240) {
               break label32;
            }

            var4 = this.field_9079.method_2671(this.field_9075.field_2990, this.field_9076, this.field_9077, this.field_9078);
         }

         if(var1 != null) {
            if(var4 != 0) {
               break label32;
            }

            double var5;
            var4 = (var5 = var2 - 4.0D) == 0.0D?0:(var5 < 0.0D?-1:1);
         }

         if(var1 == null) {
            return (boolean)var4;
         }

         if(var4 < 0) {
            var4 = 1;
            return (boolean)var4;
         }
      }

      var4 = 0;
      return (boolean)var4;
   }

   // $FF: renamed from: f () void
   public void method_9653() {
      super.method_9653();
      this.field_9075.field_2990.method_2217(this.field_9075.method_3845(), this.field_9076, this.field_9077, this.field_9078, -1);
   }

   // $FF: renamed from: g () void
   public void method_9654() {
      String[] var10000 = class_752.method_4253();
      super.method_9654();
      String[] var1 = var10000;
      int var3 = this.field_9075.method_4165().nextInt(20);
      if(var1 != null) {
         if(var3 == 0) {
            this.field_9075.field_2990.method_2210(1010, this.field_9076, this.field_9077, this.field_9078, 0);
         }

         ++this.field_9085;
         var3 = (int)((float)this.field_9085 / 240.0F * 10.0F);
      }

      class_1739 var4;
      label43: {
         int var2 = var3;
         var3 = var2;
         int var10001 = this.field_9086;
         if(var1 != null) {
            if(var2 != this.field_9086) {
               this.field_9075.field_2990.method_2217(this.field_9075.method_3845(), this.field_9076, this.field_9077, this.field_9078, var2);
               this.field_9086 = var2;
            }

            var4 = this;
            if(var1 == null) {
               break label43;
            }

            var3 = this.field_9085;
            var10001 = 240;
         }

         if(var3 != var10001) {
            return;
         }

         var4 = this;
      }

      ahb var5 = var4.field_9075.field_2990;
      if(var1 != null) {
         if(var5.field_1818 != class_918.field_4630) {
            return;
         }

         this.field_9075.field_2990.method_2056(this.field_9076, this.field_9077, this.field_9078);
         this.field_9075.field_2990.method_2210(1012, this.field_9076, this.field_9077, this.field_9078, 0);
         var5 = this.field_9075.field_2990;
      }

      var5.method_2210(2001, this.field_9076, this.field_9077, this.field_9078, aji.method_2415(this.field_9079));
   }

   // $FF: renamed from: <clinit> () void
   static void method_9674() {
      boolean var10000 = true;
      char[] var10003 = "òIÛu:ùEû".toCharArray();
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
            field_9087 = (new String((char[])var3)).intern();
            return;
         }

         char var10007 = (char)((Object[])var3)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 202;
            break;
         case 1:
            var10009 = 189;
            break;
         case 2:
            var10009 = 126;
            break;
         case 3:
            var10009 = 201;
            break;
         case 4:
            var10009 = 82;
            break;
         case 5:
            var10009 = 6;
            break;
         default:
            var10009 = 46;
         }

         ((Object[])var3)[var0] = (char)(var10007 ^ var4 ^ var10009);
         ++var0;
      }
   }
}
