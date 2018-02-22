import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

// $FF: renamed from: ko
public class class_1351 extends class_1350 {

   // $FF: renamed from: b kl
   private final class_1348 field_7033;
   // $FF: renamed from: c java.lang.String
   private final String field_7034;
   // $FF: renamed from: d java.util.Set
   private final Set field_7035;
   // $FF: renamed from: e java.lang.String
   private String field_7036;
   // $FF: renamed from: f java.lang.String
   private String field_7037;
   // $FF: renamed from: g java.lang.String
   private String field_7038;
   // $FF: renamed from: h boolean
   private boolean field_7039;
   // $FF: renamed from: i boolean
   private boolean field_7040;
   // $FF: renamed from: j java.lang.String[]
   private static final String[] field_7041;


   // $FF: renamed from: <init> (kl, java.lang.String) void
   public void setMaxStringLength0(class_1348 var1, String var2) {
      super.method_7294();
      this.field_7035 = new HashSet();
      this.field_7037 = "";
      this.field_7038 = "";
      this.field_7039 = true;
      this.field_7040 = true;
      this.field_7033 = var1;
      this.field_7034 = var2;
      this.field_7036 = var2;
   }

   // $FF: renamed from: a () java.lang.String
   public String method_7296() {
      return this.field_7034;
   }

   // $FF: renamed from: d () java.lang.String
   public String setMaxStringLength1() {
      return this.field_7036;
   }

   // $FF: renamed from: b (java.lang.String) void
   public void setMaxStringLength2(String var1) {
      try {
         if(var1 == null) {
            IllegalArgumentException var10000 = new IllegalArgumentException("Name cannot be null");
            String[] var10002 = field_7041;
            throw var10000;
         }
      } catch (IllegalArgumentException var2) {
         throw getMaxStringLength3(var2);
      }

      this.field_7036 = var1;
      this.field_7033.method_7188(this);
   }

   // $FF: renamed from: e () java.util.Collection
   public Collection setMaxStringLength3() {
      return this.field_7035;
   }

   // $FF: renamed from: f () java.lang.String
   public String setMaxStringLength4() {
      return this.field_7037;
   }

   // $FF: renamed from: c (java.lang.String) void
   public void setMaxStringLength5(String var1) {
      try {
         if(var1 == null) {
            IllegalArgumentException var10000 = new IllegalArgumentException("Prefix cannot be null");
            String[] var10002 = field_7041;
            throw var10000;
         }
      } catch (IllegalArgumentException var2) {
         throw getMaxStringLength3(var2);
      }

      this.field_7037 = var1;
      this.field_7033.method_7188(this);
   }

   // $FF: renamed from: g () java.lang.String
   public String setMaxStringLength6() {
      return this.field_7038;
   }

   // $FF: renamed from: d (java.lang.String) void
   public void setMaxStringLength7(String var1) {
      try {
         if(var1 == null) {
            IllegalArgumentException var10000 = new IllegalArgumentException("Suffix cannot be null");
            String[] var10002 = field_7041;
            throw var10000;
         }
      } catch (IllegalArgumentException var2) {
         throw getMaxStringLength3(var2);
      }

      this.field_7038 = var1;
      this.field_7033.method_7188(this);
   }

   // $FF: renamed from: a (java.lang.String) java.lang.String
   public String method_7297(String var1) {
      return this.setMaxStringLength4() + var1 + this.setMaxStringLength6();
   }

   // $FF: renamed from: b (kn, java.lang.String) java.lang.String
   public static String setMaxStringLength8(class_1350 param0, String param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: c () boolean
   public boolean method_7299() {
      return this.field_7039;
   }

   // $FF: renamed from: b (boolean) void
   public void setMaxStringLength9(boolean var1) {
      this.field_7039 = var1;
      this.field_7033.method_7188(this);
   }

   // $FF: renamed from: b () boolean
   public boolean method_7298() {
      return this.field_7040;
   }

   // $FF: renamed from: c (boolean) void
   public void getMaxStringLength0(boolean var1) {
      this.field_7040 = var1;
      this.field_7033.method_7188(this);
   }

   // $FF: renamed from: h () int
   public int getMaxStringLength1() {
      int var2 = 0;
      String[] var1 = class_752.method_4253();

      int var10000;
      label37: {
         label36: {
            try {
               var10000 = this.method_7299();
               if(var1 == null) {
                  break label37;
               }

               if(var10000 == 0) {
                  break label36;
               }
            } catch (IllegalArgumentException var4) {
               throw getMaxStringLength3(var4);
            }

            var2 |= 1;
         }

         var10000 = this.method_7298();
      }

      label27: {
         try {
            if(var1 == null) {
               return var10000;
            }

            if(var10000 == 0) {
               break label27;
            }
         } catch (IllegalArgumentException var3) {
            throw getMaxStringLength3(var3);
         }

         var2 |= 2;
      }

      var10000 = var2;
      return var10000;
   }

   // $FF: renamed from: b (int) void
   public void getMaxStringLength2(int var1) {
      String[] var2 = class_752.method_4253();

      class_1351 var10000;
      int var10001;
      label39: {
         label38: {
            try {
               var10000 = this;
               var10001 = var1 & 1;
               if(var2 == null) {
                  break label39;
               }

               if(var10001 > 0) {
                  break label38;
               }
            } catch (IllegalArgumentException var4) {
               throw getMaxStringLength3(var4);
            }

            var10001 = 0;
            break label39;
         }

         var10001 = 1;
      }

      label30: {
         label29: {
            try {
               var10000.setMaxStringLength9((boolean)var10001);
               var10000 = this;
               var10001 = var1 & 2;
               if(var2 == null) {
                  break label30;
               }

               if(var10001 > 0) {
                  break label29;
               }
            } catch (IllegalArgumentException var3) {
               throw getMaxStringLength3(var3);
            }

            var10001 = 0;
            break label30;
         }

         var10001 = 1;
      }

      var10000.getMaxStringLength0((boolean)var10001);
   }

   // $FF: renamed from: b (java.lang.IllegalArgumentException) java.lang.IllegalArgumentException
   private static IllegalArgumentException getMaxStringLength3(IllegalArgumentException var0) {
      return var0;
   }

   // $FF: renamed from: <clinit> () void
   static void getMaxStringLength4() {
      String[] var5 = new String[3];
      int var3 = 0;
      String var2 = "g#+JÎT(#FÎUf#^y+(ÒQY)9ÒP3!d +JÎT(#FÎUf#^";
      int var4 = "g#+JÎT(#FÎUf#^y+(ÒQY)9ÒP3!d +JÎT(#FÎUf#^".length();
      char var1 = 21;
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
                  field_7041 = var5;
                  return;
               }

               var1 = var2.charAt(var0);
               break;
            }

            char var10007 = (char)((Object[])var9)[var6];
            short var10009;
            switch(var6 % 7) {
            case 0:
               var10009 = 127;
               break;
            case 1:
               var10009 = 187;
               break;
            case 2:
               var10009 = 14;
               break;
            case 3:
               var10009 = 5;
               break;
            case 4:
               var10009 = 186;
               break;
            case 5:
               var10009 = 122;
               break;
            default:
               var10009 = 166;
            }

            ((Object[])var9)[var6] = (char)(var10007 ^ var10 ^ var10009);
            ++var6;
         }
      }
   }
}
