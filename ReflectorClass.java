
public class ReflectorClass {

   private String targetClassName;
   private boolean checked;
   private Class targetClass;
   // $FF: renamed from: h java.lang.String
   private static final String field_4225 = "(Reflector) Class not present: ";


   // $FF: renamed from: <init> (java.lang.String) void
   public void method_5107(String var1) {
      super();
      this.targetClassName = null;
      this.checked = false;
      this.targetClass = null;
      this.targetClassName = var1;
      Class var2 = this.getTargetClass();
   }

   // $FF: renamed from: <init> (java.lang.Class) void
   public void method_5108(Class var1) {
      super();
      this.targetClassName = null;
      this.checked = false;
      this.targetClass = null;
      this.targetClass = var1;
      this.targetClassName = var1.getName();
      this.checked = true;
   }

   public Class getTargetClass() {
      try {
         if(this.checked) {
            return this.targetClass;
         }
      } catch (ClassNotFoundException var4) {
         throw method_5109(var4);
      }

      this.checked = true;

      try {
         this.targetClass = Class.forName(class_870.method_5124(this.targetClassName));
      } catch (ClassNotFoundException var2) {
         Config.log("(Reflector) Class not present: " + this.targetClassName);
      } catch (Throwable var3) {
         var3.printStackTrace();
      }

      return this.targetClass;
   }

   public boolean exists() {
      return this.getTargetClass() != null;
   }

   public String getTargetClassName() {
      return this.targetClassName;
   }

   // $FF: renamed from: b (java.lang.ClassNotFoundException) java.lang.ClassNotFoundException
   private static ClassNotFoundException method_5109(ClassNotFoundException var0) {
      return var0;
   }

   // $FF: renamed from: <clinit> () void
   static void method_5110() {
      boolean var10000 = true;
      char[] var10003 = "z¼ê~¦´ËG«¥2»Þ[ª¬|¬£X«éa¦¹Ëù".toCharArray();
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
            field_4225 = (new String((char[])var3)).intern();
            return;
         }

         char var10007 = (char)((Object[])var3)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 237;
            break;
         case 1:
            var10009 = 122;
            break;
         case 2:
            var10009 = 139;
            break;
         case 3:
            var10009 = 222;
            break;
         case 4:
            var10009 = 64;
            break;
         case 5:
            var10009 = 145;
            break;
         default:
            var10009 = 133;
         }

         ((Object[])var3)[var0] = (char)(var10007 ^ var4 ^ var10009);
         ++var0;
      }
   }
}
