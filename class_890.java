
// $FF: renamed from: aF
public class class_890 {

   // $FF: renamed from: a int
   public int yPosition8;
   // $FF: renamed from: b boolean
   public boolean yPosition9;
   // $FF: renamed from: h java.lang.String[]
   private static final String[] width0;


   // $FF: renamed from: <init> (java.lang.String) void
   public void method_5177(String var1) {
      String[] var10000 = class_752.method_4253();
      super();
      String[] var2 = var10000;
      this.yPosition8 = 1;
      this.yPosition9 = false;
      boolean var4 = var1.equals("4");
      if(var2 != null) {
         if(var4) {
            this.yPosition8 = 4;
            return;
         }

         var4 = var1.equals("2");
      }

      if(var2 != null) {
         if(var4) {
            this.yPosition8 = 2;
            return;
         }

         var4 = var1.equals("F");
      }

      String[] var3;
      if(var2 != null) {
         if(var4) {
            this.yPosition9 = true;
            return;
         }

         var3 = width0;
         var4 = var1.equals("4F");
      }

      String var5;
      label48: {
         if(var2 != null) {
            if(var4) {
               this.yPosition8 = 4;
               this.yPosition9 = true;
               return;
            }

            var5 = var1;
            if(var2 == null) {
               break label48;
            }

            var3 = width0;
            var4 = var1.equals("2F");
         }

         if(var4) {
            this.yPosition8 = 2;
            this.yPosition9 = true;
            return;
         }

         StringBuilder var6 = new StringBuilder();
         String[] var10001 = width0;
         var5 = var6.append("NaturalTextures: Unknown type: ").append(var1).toString();
      }

      Config.warn(var5);
   }

   // $FF: renamed from: a () boolean
   public boolean method_5178() {
      String[] var1 = class_752.method_4253();
      int var10000 = this.yPosition8;
      if(var1 != null) {
         if(this.yPosition8 != 2) {
            label29: {
               var10000 = this.yPosition8;
               if(var1 != null) {
                  if(this.yPosition8 == 4) {
                     break label29;
                  }

                  var10000 = this.yPosition9;
               }

               if(var1 != null) {
                  if(var10000 != 0) {
                     return true;
                  }

                  var10000 = 0;
               }

               return (boolean)var10000;
            }
         }

         var10000 = 1;
      }

      return (boolean)var10000;
   }

   // $FF: renamed from: <clinit> () void
   static void method_5179() {
      String[] var5 = new String[3];
      int var3 = 0;
      String var2 = "jílíÊ¯l|\nÎ£mu-ûL~1Üµ9 `;û";
      int var4 = "jílíÊ¯l|\nÎ£mu-ûL~1Üµ9 `;û".length();
      char var1 = 2;
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
                  width0 = var5;
                  return;
               }

               var1 = var2.charAt(var0);
               break;
            }

            char var10007 = (char)((Object[])var9)[var6];
            short var10009;
            switch(var6 % 7) {
            case 0:
               var10009 = 67;
               break;
            case 1:
               var10009 = 182;
               break;
            case 2:
               var10009 = 198;
               break;
            case 3:
               var10009 = 4;
               break;
            case 4:
               var10009 = 241;
               break;
            case 5:
               var10009 = 100;
               break;
            default:
               var10009 = 13;
            }

            ((Object[])var9)[var6] = (char)(var10007 ^ var10 ^ var10009);
            ++var6;
         }
      }
   }
}
