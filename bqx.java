import org.apache.commons.lang3.Validate;

public class bqx {

   // $FF: renamed from: a java.lang.String
   private final String field_7975;
   // $FF: renamed from: b java.lang.String
   private final String field_7976;
   // $FF: renamed from: h java.lang.String
   private static final String field_7977 = "minecraft";


   // $FF: renamed from: <init> (java.lang.String, java.lang.String) void
   public void method_8226(String var1, String var2) {
      label19: {
         label18: {
            String[] var10000 = class_752.method_4253();
            super();
            String[] var3 = var10000;
            Validate.notNull(var2);
            if(var3 != null) {
               if(var1 != null && var1.length() != 0) {
                  break label18;
               }

               this.field_7975 = "minecraft";
            }

            if(var3 != null) {
               break label19;
            }
         }

         this.field_7975 = var1;
      }

      this.field_7976 = var2;
   }

   // $FF: renamed from: <init> (java.lang.String) void
   public void method_8227(String var1) {
      super();
      String var2 = "minecraft";
      String var3 = var1;
      int var4 = var1.indexOf(58);
      if(var4 >= 0) {
         var3 = var1.substring(var4 + 1, var1.length());
         if(var4 > 1) {
            var2 = var1.substring(0, var4);
         }
      }

      this.field_7975 = var2.toLowerCase();
      this.field_7976 = var3;
   }

   // $FF: renamed from: a () java.lang.String
   public String method_8228() {
      return this.field_7976;
   }

   // $FF: renamed from: b () java.lang.String
   public String method_8229() {
      return this.field_7975;
   }

   public String toString() {
      return this.field_7975 + ":" + this.field_7976;
   }

   public boolean equals(Object var1) {
      String[] var2 = class_752.method_4253();
      Object var10000 = this;
      if(var2 != null) {
         if(this == var1) {
            return true;
         }

         var10000 = var1;
      }

      boolean var4 = var10000 instanceof bqx;
      if(var2 != null) {
         if(var4) {
            label41: {
               bqx var3 = (bqx)var1;
               var4 = this.field_7975.equals(var3.field_7975);
               if(var2 != null) {
                  if(!var4) {
                     break label41;
                  }

                  var4 = this.field_7976.equals(var3.field_7976);
               }

               if(var2 == null) {
                  return var4;
               }

               if(var4) {
                  var4 = true;
                  return var4;
               }
            }

            var4 = false;
            return var4;
         }

         var4 = false;
      }

      return var4;
   }

   public int hashCode() {
      return 31 * this.field_7975.hashCode() + this.field_7976.hashCode();
   }

   // $FF: renamed from: <clinit> () void
   static void method_8230() {
      boolean var10000 = true;
      char[] var10003 = "hDÁ\\8ícY".toCharArray();
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
            field_7977 = (new String((char[])var3)).intern();
            return;
         }

         char var10007 = (char)((Object[])var3)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 22;
            break;
         case 1:
            var10009 = 62;
            break;
         case 2:
            var10009 = 188;
            break;
         case 3:
            var10009 = 42;
            break;
         case 4:
            var10009 = 72;
            break;
         case 5:
            var10009 = 140;
            break;
         default:
            var10009 = 244;
         }

         ((Object[])var3)[var0] = (char)(var10007 ^ var4 ^ var10009);
         ++var0;
      }
   }
}
