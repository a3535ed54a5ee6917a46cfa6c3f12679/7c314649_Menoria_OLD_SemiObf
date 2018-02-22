import java.lang.reflect.Field;

// $FF: renamed from: aG
public class class_891 {

   // $FF: renamed from: a ReflectorClass
   private ReflectorClass width1;
   // $FF: renamed from: b java.lang.String
   private String width2;
   // $FF: renamed from: c boolean
   private boolean width3;
   // $FF: renamed from: d java.lang.reflect.Field
   private Field width4;
   // $FF: renamed from: h java.lang.String
   private static final String width5 = "(Reflector) Field not present: ";


   // $FF: renamed from: <init> (ReflectorClass, java.lang.String) void
   public void method_5180(ReflectorClass var1, String var2) {
      super();
      this.width1 = null;
      this.width2 = null;
      this.width3 = false;
      this.width4 = null;
      this.width1 = var1;
      this.width2 = var2;
      Field var3 = this.method_5181();
   }

   // $FF: renamed from: a () java.lang.reflect.Field
   public Field method_5181() {
      try {
         if(this.width3) {
            return this.width4;
         }
      } catch (SecurityException var6) {
         throw method_5185(var6);
      }

      this.width3 = true;
      Class var1 = this.width1.getTargetClass();

      try {
         if(var1 == null) {
            return null;
         }
      } catch (SecurityException var5) {
         throw method_5185(var5);
      }

      try {
         String var10002 = this.width2;
         this.width4 = var1.getDeclaredField(class_870.method_5126(var1, this.width2));
         if(!this.width4.isAccessible()) {
            this.width4.setAccessible(true);
         }
      } catch (SecurityException var3) {
         var3.printStackTrace();
      } catch (NoSuchFieldException var4) {
         Config.log("(Reflector) Field not present: " + var1.getName() + "." + this.width2);
      }

      return this.width4;
   }

   // $FF: renamed from: b () java.lang.Object
   public Object method_5182() {
      return Reflector.getFieldValue((Object)null, this);
   }

   // $FF: renamed from: a (java.lang.Object) void
   public void method_5183(Object var1) {
      Reflector.setFieldValue((Object)null, this, var1);
   }

   // $FF: renamed from: c () boolean
   public boolean method_5184() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (java.lang.SecurityException) java.lang.SecurityException
   private static SecurityException method_5185(SecurityException var0) {
      return var0;
   }

   // $FF: renamed from: <clinit> () void
   static void method_5186() {
      boolean var10000 = true;
      char[] var10003 = "cvÚÑæú?KÍª»ð.HÛäíkTÍÒù÷?".toCharArray();
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
            width5 = (new String((char[])var3)).intern();
            return;
         }

         char var10007 = (char)((Object[])var3)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 2;
            break;
         case 1:
            var10009 = 109;
            break;
         case 2:
            var10009 = 246;
            break;
         case 3:
            var10009 = 254;
            break;
         case 4:
            var10009 = 195;
            break;
         case 5:
            var10009 = 180;
            break;
         default:
            var10009 = 208;
         }

         ((Object[])var3)[var0] = (char)(var10007 ^ var4 ^ var10009);
         ++var0;
      }
   }
}
