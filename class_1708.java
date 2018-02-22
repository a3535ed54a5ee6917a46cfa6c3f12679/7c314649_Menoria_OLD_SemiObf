
// $FF: renamed from: vn
class class_1708 {

   // $FF: renamed from: b int
   final int field_8951;
   // $FF: renamed from: c java.lang.Object
   Object field_8952;
   // $FF: renamed from: d vn
   class_1708 field_8953;
   // $FF: renamed from: e int
   final int field_8954;
   // $FF: renamed from: f java.lang.String
   private static final String field_8955 = "CL_00001491";


   // $FF: renamed from: <init> (int, int, java.lang.Object, vn) void
   void method_9488(int var1, int var2, Object var3, class_1708 var4) {
      super();
      this.field_8952 = var3;
      this.field_8953 = var4;
      this.field_8951 = var2;
      this.field_8954 = var1;
   }

   // $FF: renamed from: b () int
   public final int method_9489() {
      return this.field_8951;
   }

   // $FF: renamed from: c () java.lang.Object
   public final Object method_9490() {
      return this.field_8952;
   }

   public final boolean equals(Object var1) {
      String[] var2 = class_752.method_4253();
      Object var10000 = var1;
      if(var2 != null) {
         if(!(var1 instanceof class_1708)) {
            return false;
         }

         var10000 = var1;
      }

      boolean var9;
      label62: {
         class_1708 var3 = (class_1708)var10000;
         Integer var4 = Integer.valueOf(this.method_9489());
         Integer var5 = Integer.valueOf(var3.method_9489());
         var10000 = var4;
         if(var2 != null) {
            if(var4 != var5) {
               Integer var8 = var4;
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

            var10000 = this.method_9490();
         }

         Object var6 = var10000;
         Object var7 = var3.method_9490();
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
      return class_1706.method_9485(this.field_8951);
   }

   public final String toString() {
      return this.method_9489() + "=" + this.method_9490();
   }

   // $FF: renamed from: <clinit> () void
   static void method_9491() {
      boolean var10000 = true;
      char[] var10003 = "°Âò®Â÷ðÃ".toCharArray();
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
            field_8955 = (new String((char[])var4)).intern();
            String var2 = field_8955;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         byte var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 126;
            break;
         case 1:
            var10009 = 78;
            break;
         case 2:
            var10009 = 68;
            break;
         case 3:
            var10009 = 127;
            break;
         case 4:
            var10009 = 47;
            break;
         case 5:
            var10009 = 79;
            break;
         default:
            var10009 = 19;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}
