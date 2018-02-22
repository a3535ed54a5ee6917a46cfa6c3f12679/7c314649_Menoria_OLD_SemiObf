import com.mojang.authlib.GameProfile;
import com.mojang.authlib.properties.Property;
import java.util.Iterator;

// $FF: renamed from: rl
public final class class_1570 {

   // $FF: renamed from: a java.lang.String
   private static final String field_8257;
   // $FF: renamed from: h java.lang.String[]
   private static final String[] field_8258;


   // $FF: renamed from: <init> () void
   public void method_8623() {
      super();
   }

   // $FF: renamed from: b (ro) com.mojang.authlib.GameProfile
   public static GameProfile method_8624(class_1583 param0) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (ro, com.mojang.authlib.GameProfile) void
   public static void method_8625(class_1583 var0, GameProfile var1) {
      String[] var2 = class_752.method_4253();
      GameProfile var10000 = var1;
      String[] var10;
      if(var2 != null) {
         if(!class_1723.method_9630(var1.getName())) {
            var10 = field_8258;
            var0.initGui1("Name", var1.getName());
         }

         var10000 = var1;
      }

      if(var2 != null) {
         if(var10000.getId() != null) {
            var10 = field_8258;
            var0.initGui1("Id", var1.getId().toString());
         }

         var10000 = var1;
      }

      if(!var10000.getProperties().isEmpty()) {
         class_1583 var11 = new class_1583;
         var11.method_8628();
         class_1583 var3 = var11;
         Iterator var4 = var1.getProperties().keySet().iterator();

         label56:
         while(true) {
            boolean var12 = var4.hasNext();

            label53:
            while(var12) {
               String var5 = (String)var4.next();
               class_1580 var13 = new class_1580;
               var13.method_8628();
               class_1580 var6 = var13;
               if(var2 == null) {
                  return;
               }

               Iterator var8 = var1.getProperties().get(var5).iterator();

               while(var8.hasNext()) {
                  Property var9 = (Property)var8.next();
                  var11 = new class_1583;
                  var11.method_8628();
                  class_1583 var7 = var11;
                  var10 = field_8258;
                  var7.initGui1("Value", var9.getValue());
                  if(var2 != null) {
                     var12 = var9.hasSignature();
                     if(var2 == null) {
                        continue label53;
                     }

                     if(var12) {
                        var7.initGui1("Signature", var9.getSignature());
                     }

                     var6.method_8650(var7);
                  }

                  if(var2 == null) {
                     break;
                  }
               }

               var3.method_8664(var5, var6);
               if(var2 != null) {
                  continue label56;
               }
               break;
            }

            String[] var10001 = field_8258;
            var0.method_8664("Properties", var3);
            break;
         }
      }

   }

   // $FF: renamed from: b (java.lang.Throwable) java.lang.Throwable
   private static Throwable method_8626(Throwable var0) {
      return var0;
   }

   // $FF: renamed from: <clinit> () void
   static void method_8627() {
      // $FF: Couldn't be decompiled
   }
}
