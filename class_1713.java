
// $FF: renamed from: vq
class class_1713 {

   // $FF: renamed from: b long
   final long field_8980;
   // $FF: renamed from: c java.lang.Object
   Object field_8981;
   // $FF: renamed from: d vq
   class_1713 field_8982;
   // $FF: renamed from: e int
   final int field_8983;
   // $FF: renamed from: f java.lang.String
   private static final String field_8984 = "CL_00001493";


   // $FF: renamed from: <init> (int, long, java.lang.Object, vq) void
   void method_9546(int var1, long var2, Object var4, class_1713 var5) {
      super();
      this.field_8981 = var4;
      this.field_8982 = var5;
      this.field_8980 = var2;
      this.field_8983 = var1;
   }

   // $FF: renamed from: b () long
   public final long method_9547() {
      return this.field_8980;
   }

   // $FF: renamed from: c () java.lang.Object
   public final Object method_9548() {
      return this.field_8981;
   }

   public final boolean equals(Object var1) {
      String[] var2 = class_752.method_4253();
      Object var10000 = var1;
      if(var2 != null) {
         if(!(var1 instanceof class_1713)) {
            return false;
         }

         var10000 = var1;
      }

      boolean var9;
      label62: {
         class_1713 var3 = (class_1713)var10000;
         Long var4 = Long.valueOf(this.method_9547());
         Long var5 = Long.valueOf(var3.method_9547());
         var10000 = var4;
         if(var2 != null) {
            if(var4 != var5) {
               Long var8 = var4;
               if(var2 != null) {
                  if(var4 == null) {
                     break label62;
                  }

                  var8 = var4;
               }

               var9 = var8.equals(var5);
               if(var2 == null) {
                  return var9;
               }

               if(!var9) {
                  break label62;
               }
            }

            var10000 = this.method_9548();
         }

         Object var6 = var10000;
         Object var7 = var3.method_9548();
         var10000 = var6;
         if(var2 != null) {
            if(var6 == var7) {
               return true;
            }

            var10000 = var6;
         }

         if(var2 != null) {
            if(var10000 == null) {
               break label62;
            }

            var10000 = var6;
         }

         var9 = var10000.equals(var7);
         if(var2 == null) {
            return var9;
         }

         if(var9) {
            return true;
         }
      }

      var9 = false;
      return var9;
   }

   public final int hashCode() {
      return class_1711.method_9535(this.field_8980);
   }

   public final String toString() {
      return this.method_9547() + "=" + this.method_9548();
   }

   // $FF: renamed from: <clinit> () void
   static void method_9549() {
      boolean var10000 = true;
      char[] var10003 = "t\bå\b\"£p".toCharArray();
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
            field_8984 = (new String((char[])var4)).intern();
            String var2 = field_8984;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 16;
            break;
         case 1:
            var10009 = 99;
            break;
         case 2:
            var10009 = 157;
            break;
         case 3:
            var10009 = 31;
            break;
         case 4:
            var10009 = 157;
            break;
         case 5:
            var10009 = 53;
            break;
         default:
            var10009 = 180;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}
