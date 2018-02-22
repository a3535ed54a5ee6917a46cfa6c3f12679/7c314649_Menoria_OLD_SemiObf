import java.lang.reflect.Constructor;

public class ReflectorConstructor {

   private ReflectorClass reflectorClass;
   private Class[] parameterTypes;
   private boolean checked;
   private Constructor targetConstructor;
   // $FF: renamed from: h java.lang.String[]
   private static final String[] field_7934;


   // $FF: renamed from: <init> (ReflectorClass, java.lang.Class[]) void
   public void method_8172(ReflectorClass var1, Class[] var2) {
      super();
      this.reflectorClass = null;
      this.parameterTypes = null;
      this.checked = false;
      this.targetConstructor = null;
      this.reflectorClass = var1;
      this.parameterTypes = var2;
      Constructor var3 = this.getTargetConstructor();
   }

   public Constructor getTargetConstructor() {
      if(this.checked) {
         return this.targetConstructor;
      } else {
         this.checked = true;
         Class var1 = this.reflectorClass.getTargetClass();
         if(var1 == null) {
            return null;
         } else {
            this.targetConstructor = findConstructor(var1, this.parameterTypes);
            if(this.targetConstructor == null) {
               StringBuilder var10000 = new StringBuilder();
               String[] var2 = field_7934;
               Config.dbg(var10000.append("(Reflector) Constructor not present: ").append(var1.getName()).append(", params: ").append(Config.arrayToString((Object[])this.parameterTypes)).toString());
            }

            if(this.targetConstructor != null && !this.targetConstructor.isAccessible()) {
               this.targetConstructor.setAccessible(true);
            }

            return this.targetConstructor;
         }
      }
   }

   private static Constructor findConstructor(Class var0, Class[] var1) {
      Constructor[] var2 = var0.getDeclaredConstructors();

      for(int var3 = 0; var3 < var2.length; ++var3) {
         Constructor var4 = var2[var3];
         Class[] var5 = var4.getParameterTypes();
         if(Reflector.matchesTypes(var1, var5)) {
            return var4;
         }
      }

      return null;
   }

   public boolean exists() {
      String[] var1 = class_752.method_4253();
      ReflectorConstructor var10000 = this;
      if(var1 != null) {
         if(this.checked) {
            return this.targetConstructor != null;
         }

         var10000 = this;
      }

      return var10000.getTargetConstructor() != null;
   }

   public void deactivate() {
      this.checked = true;
      this.targetConstructor = null;
   }

   // $FF: renamed from: <clinit> () void
   static void method_8173() {
      String[] var5 = new String[2];
      int var3 = 0;
      String var2 = "ÙNê¡ÞÃÑ%«Iô¥Ù¸Ã]í£ÂÑA÷´ÙÝ\\ý®Ù";
      int var4 = "ÙNê¡ÞÃÑ%«Iô¥Ù¸Ã]í£ÂÑA÷´ÙÝ\\ý®Ù".length();
      char var1 = 10;
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
                  field_7934 = var5;
                  return;
               }

               var1 = var2.charAt(var0);
               break;
            }

            char var10007 = (char)((Object[])var9)[var6];
            short var10009;
            switch(var6 % 7) {
            case 0:
               var10009 = 69;
               break;
            case 1:
               var10009 = 17;
               break;
            case 2:
               var10009 = 25;
               break;
            case 3:
               var10009 = 199;
               break;
            case 4:
               var10009 = 112;
               break;
            case 5:
               var10009 = 40;
               break;
            default:
               var10009 = 17;
            }

            ((Object[])var9)[var6] = (char)(var10007 ^ var10 ^ var10009);
            ++var6;
         }
      }
   }
}
