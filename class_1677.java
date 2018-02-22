
// $FF: renamed from: vP
public class class_1677 extends class_1674 {

   // $FF: renamed from: g gt
   private class_587 field_8749;
   // $FF: renamed from: h java.lang.String[]
   private static final String[] field_8750;


   // $FF: renamed from: <init> () void
   public void method_9242() {
      String[] var10001 = field_8750;
      super.method_9235("container.enderchest", false, 27);
   }

   // $FF: renamed from: b (gt) void
   public void method_9243(class_587 var1) {
      this.field_8749 = var1;
   }

   // $FF: renamed from: b (rr) void
   public void method_9244(class_1580 var1) {
      String[] var10000 = class_752.method_4253();
      int var3 = 0;
      String[] var2 = var10000;

      while(true) {
         if(var3 < this.method_83()) {
            this.method_87(var3, (add)null);
            ++var3;
            if(var2 == null) {
               break;
            }

            if(var2 != null) {
               continue;
            }
         }

         var3 = 0;
         break;
      }

      while(var3 < var1.method_8658()) {
         class_1583 var4 = var1.method_8653(var3);
         String[] var10001 = field_8750;
         int var5 = var4.initGui9("Slot") & 255;
         if(var2 != null) {
            if(var5 >= 0 && var5 < this.method_83()) {
               this.method_87(var5, add.method_3727(var4));
            }

            ++var3;
         }

         if(var2 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: a () rr
   public class_1580 method_9245() {
      String[] var10000 = class_752.method_4253();
      class_1580 var10001 = new class_1580;
      var10001.method_8628();
      class_1580 var2 = var10001;
      String[] var1 = var10000;
      int var3 = 0;

      while(var3 < this.method_83()) {
         add var4 = this.method_84(var3);
         if(var1 != null) {
            if(var4 != null) {
               class_1583 var6 = new class_1583;
               var6.method_8628();
               class_1583 var5 = var6;
               String[] var7 = field_8750;
               var5.method_8665("Slot", (byte)var3);
               var4.method_3737(var5);
               var2.method_8650(var5);
            }

            ++var3;
         }

         if(var1 == null) {
            break;
         }
      }

      return var2;
   }

   // $FF: renamed from: b (yz) boolean
   public boolean method_92(class_792 var1) {
      String[] var2 = class_752.method_4253();
      class_1677 var10000 = this;
      boolean var3;
      if(var2 != null) {
         if(this.field_8749 != null) {
            var3 = this.field_8749.method_3151(var1);
            if(var2 == null) {
               return var3;
            }

            if(!var3) {
               return false;
            }
         }

         var10000 = this;
      }

      var3 = var10000.method_92(var1);
      return var3;
   }

   // $FF: renamed from: m () void
   public void method_93() {
      String[] var1 = class_752.method_4253();
      class_1677 var10000 = this;
      if(var1 != null) {
         if(this.field_8749 != null) {
            this.field_8749.method_3149();
         }

         var10000 = this;
      }

      var10000.method_93();
   }

   // $FF: renamed from: n () void
   public void method_94() {
      String[] var1 = class_752.method_4253();
      class_1677 var10000 = this;
      if(var1 != null) {
         if(this.field_8749 != null) {
            this.field_8749.method_3150();
         }

         super.method_94();
         var10000 = this;
      }

      var10000.field_8749 = null;
   }

   // $FF: renamed from: <clinit> () void
   static void method_9246() {
      String[] var5 = new String[2];
      int var3 = 0;
      String var2 = "½ÎßGÍÞGô+ÐVû&ÁØVæ6";
      int var4 = "½ÎßGÍÞGô+ÐVû&ÁØVæ6".length();
      char var1 = 4;
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
                  field_8750 = var5;
                  return;
               }

               var1 = var2.charAt(var0);
               break;
            }

            char var10007 = (char)((Object[])var9)[var6];
            short var10009;
            switch(var6 % 7) {
            case 0:
               var10009 = 169;
               break;
            case 1:
               var10009 = 229;
               break;
            case 2:
               var10009 = 247;
               break;
            case 3:
               var10009 = 116;
               break;
            case 4:
               var10009 = 210;
               break;
            case 5:
               var10009 = 5;
               break;
            default:
               var10009 = 181;
            }

            ((Object[])var9)[var6] = (char)(var10007 ^ var10 ^ var10009);
            ++var6;
         }
      }
   }
}
