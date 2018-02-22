import java.lang.reflect.Method;

public class ReflectorMethod {

   private ReflectorClass reflectorClass;
   private String targetMethodName;
   private Class[] targetMethodParameterTypes;
   private boolean checked;
   private Method targetMethod;
   // $FF: renamed from: h java.lang.String
   private static final String field_2600 = "(Reflector) Method not pesent: ";


   // $FF: renamed from: <init> (ReflectorClass, java.lang.String) void
   public void method_3243(ReflectorClass var1, String var2) {
      this.method_3244(var1, var2, (Class[])null);
   }

   // $FF: renamed from: <init> (ReflectorClass, java.lang.String, java.lang.Class[]) void
   public void method_3244(ReflectorClass var1, String var2, Class[] var3) {
      super();
      this.reflectorClass = null;
      this.targetMethodName = null;
      this.targetMethodParameterTypes = null;
      this.checked = false;
      this.targetMethod = null;
      this.reflectorClass = var1;
      this.targetMethodName = var2;
      this.targetMethodParameterTypes = var3;
      Method var4 = this.getTargetMethod();
   }

   public Method getTargetMethod() {
      if(this.checked) {
         return this.targetMethod;
      } else {
         this.checked = true;
         Class var1 = this.reflectorClass.getTargetClass();
         if(var1 == null) {
            return null;
         } else {
            Method[] var2 = var1.getDeclaredMethods();
            int var3 = 0;

            Method var4;
            while(true) {
               if(var3 >= var2.length) {
                  Config.log("(Reflector) Method not pesent: " + var1.getName() + "." + this.targetMethodName);
                  return null;
               }

               var4 = var2[var3];
               if(var4.getName().equals(this.targetMethodName)) {
                  if(this.targetMethodParameterTypes == null) {
                     break;
                  }

                  Class[] var5 = var4.getParameterTypes();
                  if(Reflector.matchesTypes(this.targetMethodParameterTypes, var5)) {
                     break;
                  }
               }

               ++var3;
            }

            this.targetMethod = var4;
            if(!this.targetMethod.isAccessible()) {
               this.targetMethod.setAccessible(true);
            }

            return this.targetMethod;
         }
      }
   }

   public boolean exists() {
      String[] var1 = class_752.method_4253();
      ReflectorMethod var10000 = this;
      if(var1 != null) {
         if(this.checked) {
            return this.targetMethod != null;
         }

         var10000 = this;
      }

      return var10000.getTargetMethod() != null;
   }

   public Class getReturnType() {
      String[] var10000 = class_752.method_4253();
      Method var2 = this.getTargetMethod();
      String[] var1 = var10000;
      Method var3 = var2;
      if(var1 != null) {
         if(var2 == null) {
            return null;
         }

         var3 = var2;
      }

      return var3.getReturnType();
   }

   public void deactivate() {
      this.checked = true;
      this.targetMethod = null;
   }

   // $FF: renamed from: <clinit> () void
   static void method_3245() {
      boolean var10000 = true;
      char[] var10003 = "ÆÒ_Ö ïHì?èUÔì JÕ¿º".toCharArray();
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
            field_2600 = (new String((char[])var3)).intern();
            return;
         }

         char var10007 = (char)((Object[])var3)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 185;
            break;
         case 1:
            var10009 = 215;
            break;
         case 2:
            var10009 = 109;
            break;
         case 3:
            var10009 = 231;
            break;
         case 4:
            var10009 = 155;
            break;
         case 5:
            var10009 = 37;
            break;
         default:
            var10009 = 55;
         }

         ((Object[])var3)[var0] = (char)(var10007 ^ var4 ^ var10009);
         ++var0;
      }
   }
}
