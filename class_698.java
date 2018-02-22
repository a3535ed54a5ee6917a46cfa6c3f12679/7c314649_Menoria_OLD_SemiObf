
// $FF: renamed from: xs
public class class_698 extends class_690 {

   // $FF: renamed from: aG c7
   private final class_926 field_3088;
   // $FF: renamed from: aH int
   private int field_3089;
   // $FF: renamed from: aI java.lang.String
   private static final String field_3090 = "CL_00001672";


   // $FF: renamed from: <init> (ahb) void
   public void method_3847(ahb var1) {
      super.method_3847(var1);
      class_927 var10001 = new class_927;
      var10001.method_5447(this);
      this.field_3088 = var10001;
      this.field_3089 = 0;
   }

   // $FF: renamed from: <init> (ahb, double, double, double) void
   public void method_3980(ahb var1, double var2, double var4, double var6) {
      super.method_3980(var1, var2, var4, var6);
      class_927 var10001 = new class_927;
      var10001.method_5447(this);
      this.field_3088 = var10001;
      this.field_3089 = 0;
   }

   // $FF: renamed from: c () void
   protected void method_3848() {
      super.method_3848();
      this.method_3849().method_9497(23, "");
      this.method_3849().method_9497(24, "");
   }

   // $FF: renamed from: a (ro) void
   protected void method_3908(class_1583 var1) {
      super.method_3908(var1);
      this.field_3088.method_5437(var1);
      this.method_3849().method_9506(23, this.method_4022().method_5439());
      this.method_3849().method_9506(24, class_1556.method_8482(this.method_4022().method_5435()));
   }

   // $FF: renamed from: b (ro) void
   protected void method_3909(class_1583 var1) {
      super.method_3909(var1);
      this.field_3088.method_5436(var1);
   }

   // $FF: renamed from: s () int
   public int method_3994() {
      return 6;
   }

   // $FF: renamed from: u () aji
   public aji method_3996() {
      return class_1192.field_6161;
   }

   // $FF: renamed from: a () c7
   public class_926 method_4022() {
      return this.field_3088;
   }

   // $FF: renamed from: b (int, int, int, boolean) void
   public void method_3982(int var1, int var2, int var3, boolean var4) {
      class_698 var6;
      label24: {
         String[] var5 = class_752.method_4253();
         int var10000 = var4;
         if(var5 != null) {
            if(var4 == 0) {
               return;
            }

            var6 = this;
            if(var5 == null) {
               break label24;
            }

            var10000 = this.field_3029 - this.field_3089;
         }

         if(var10000 < 4) {
            return;
         }

         this.method_4022().method_5440(this.field_2990);
         var6 = this;
      }

      var6.field_3089 = this.field_3029;
   }

   // $FF: renamed from: c (yz) boolean
   public boolean method_3919(class_792 var1) {
      String[] var2 = class_752.method_4253();
      boolean var10000 = this.field_2990.field_1832;
      if(var2 != null) {
         if(this.field_2990.field_1832) {
            var1.method_4587(this.method_4022());
         }

         var10000 = super.method_3919(var1);
      }

      return var10000;
   }

   // $FF: renamed from: i (int) void
   public void method_3974(int param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: c (java.lang.Throwable) java.lang.Throwable
   private static Throwable method_4023(Throwable var0) {
      return var0;
   }

   // $FF: renamed from: <clinit> () void
   static void method_4009() {
      boolean var10000 = true;
      char[] var10003 = "ó17â-ÅÁK_à".toCharArray();
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
            field_3090 = (new String((char[])var4)).intern();
            String var2 = field_3090;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 17;
            break;
         case 1:
            var10009 = 220;
            break;
         case 2:
            var10009 = 201;
            break;
         case 3:
            var10009 = 115;
            break;
         case 4:
            var10009 = 188;
            break;
         case 5:
            var10009 = 84;
            break;
         default:
            var10009 = 80;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}
