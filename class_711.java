
// $FF: renamed from: xE
public class class_711 extends class_708 {

   // $FF: renamed from: aF int
   public int field_3177;
   // $FF: renamed from: eb java.lang.String[]
   private static final String[] field_3178;


   // $FF: renamed from: <init> (ahb) void
   public void method_3847(ahb var1) {
      super.method_3847(var1);
      this.field_3177 = 1;
   }

   // $FF: renamed from: <init> (ahb, double, double, double, double, double, double) void
   public void method_4064(ahb var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      super.method_4064(var1, var2, var4, var6, var8, var10, var12);
      this.field_3177 = 1;
   }

   // $FF: renamed from: <init> (ahb, sv, double, double, double) void
   public void method_4065(ahb var1, class_752 var2, double var3, double var5, double var7) {
      super.method_4065(var1, var2, var3, var5, var7);
      this.field_3177 = 1;
   }

   // $FF: renamed from: b (azu) void
   protected void method_4067(azu var1) {
      String[] var2 = class_752.method_4253();
      Object var10000 = this;
      if(var2 != null) {
         if(this.field_2990.field_1832) {
            return;
         }

         var10000 = var1.field_4218;
      }

      label17: {
         if(var2 != null) {
            if(var10000 == null) {
               break label17;
            }

            var10000 = var1.field_4218;
         }

         ((class_689)var10000).method_3896(class_1691.method_9330(this, this.field_3168), 6.0F);
      }

      ahb var3 = this.field_2990;
      double var10002 = this.field_2994;
      double var10003 = this.field_2995;
      double var10004 = this.field_2996;
      float var10005 = (float)this.field_3177;
      class_1038 var10007 = this.field_2990.method_2196();
      String[] var10008 = field_3178;
      var3.method_2126((class_689)null, var10002, var10003, var10004, var10005, true, var10007.method_5878("mobGriefing"));
      this.method_3851();
   }

   // $FF: renamed from: b (ro) void
   public void method_3909(class_1583 var1) {
      super.method_3909(var1);
      String[] var10001 = field_3178;
      var1.method_8667("ExplosionPower", this.field_3177);
   }

   // $FF: renamed from: a (ro) void
   public void method_3908(class_1583 var1) {
      String[] var2 = class_752.method_4253();
      class_711 var10000 = this;
      class_1583 var10001 = var1;
      if(var2 != null) {
         super.method_3908(var1);
         String[] var3 = field_3178;
         if(!var1.initGui8("ExplosionPower", 99)) {
            return;
         }

         var10000 = this;
         var10001 = var1;
      }

      String[] var10002 = field_3178;
      var10000.field_3177 = var10001.method_8681("ExplosionPower");
   }

   // $FF: renamed from: <clinit> () void
   static void method_4068() {
      String[] var5 = new String[2];
      int var3 = 0;
      String var2 = "l4Ò\r_vg2Þ-D#À&Ezn5à%Sa";
      int var4 = "l4Ò\r_vg2Þ-D#À&Ezn5à%Sa".length();
      char var1 = 11;
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
                  field_3178 = var5;
                  return;
               }

               var1 = var2.charAt(var0);
               break;
            }

            char var10007 = (char)((Object[])var9)[var6];
            short var10009;
            switch(var6 % 7) {
            case 0:
               var10009 = 34;
               break;
            case 1:
               var10009 = 120;
               break;
            case 2:
               var10009 = 147;
               break;
            case 3:
               var10009 = 105;
               break;
            case 4:
               var10009 = 219;
               break;
            case 5:
               var10009 = 21;
               break;
            default:
               var10009 = 48;
            }

            ((Object[])var9)[var6] = (char)(var10007 ^ var10 ^ var10009);
            ++var6;
         }
      }
   }
}
