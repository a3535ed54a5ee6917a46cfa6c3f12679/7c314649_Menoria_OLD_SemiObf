import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.logging.log4j.Logger;

// $FF: renamed from: nG
public class class_1387 {

   // $FF: renamed from: b org.apache.logging.log4j.Logger
   private static final Logger field_7375;
   // $FF: renamed from: c bao
   private final bao field_7376;
   // $FF: renamed from: d java.util.List
   private final List field_7377;
   // $FF: renamed from: h java.lang.String[]
   private static final String[] field_7378;


   // $FF: renamed from: <init> (bao) void
   public void method_7569(bao var1) {
      super();
      this.field_7377 = new ArrayList();
      this.field_7376 = var1;
      this.method_7570();
   }

   // $FF: renamed from: b () void
   public void method_7570() {
      String[] var1 = class_752.method_4253();

      try {
         this.field_7377.clear();
         File var10000 = new File(this.field_7376.canLoseFocus9, "servers.dat");
         String[] var5 = field_7378;
         class_1583 var2 = class_1569.method_8614(var10000);

         class_1583 var9;
         label44: {
            try {
               var9 = var2;
               if(var1 == null) {
                  break label44;
               }

               if(var2 == null) {
                  return;
               }
            } catch (Exception var7) {
               throw method_7580(var7);
            }

            var9 = var2;
         }

         var5 = field_7378;
         class_1580 var3 = var9.method_8689("servers", 10);
         int var4 = 0;

         while(var4 < var3.method_8658()) {
            try {
               this.field_7377.add(class_1386.method_7563(var3.method_8653(var4)));
               ++var4;
               if(var1 == null || var1 == null) {
                  break;
               }
            } catch (Exception var6) {
               throw method_7580(var6);
            }
         }
      } catch (Exception var8) {
         String[] var10001 = field_7378;
         field_7375.error("Couldn\'t load server list", var8);
      }

   }

   // $FF: renamed from: c () void
   public void method_7571() {
      String[] var1 = class_752.method_4253();

      try {
         class_1580 var10000 = new class_1580;
         var10000.method_8628();
         class_1580 var2 = var10000;
         Iterator var3 = this.field_7377.iterator();

         while(true) {
            if(var3.hasNext()) {
               class_1386 var4 = (class_1386)var3.next();

               try {
                  var2.method_8650(var4.method_7560());
                  if(var1 == null) {
                     break;
                  }

                  if(var1 != null) {
                     continue;
                  }
               } catch (Exception var6) {
                  throw method_7580(var6);
               }
            }

            class_1583 var9 = new class_1583;
            var9.method_8628();
            class_1583 var8 = var9;
            String[] var5 = field_7378;
            var8.method_8664("servers", var2);
            class_1569.method_8612(var8, new File(this.field_7376.canLoseFocus9, "servers.dat"));
            break;
         }
      } catch (Exception var7) {
         String[] var10001 = field_7378;
         field_7375.error("Couldn\'t save server list", var7);
      }

   }

   // $FF: renamed from: b (int) nF
   public class_1386 method_7572(int var1) {
      return (class_1386)this.field_7377.get(var1);
   }

   // $FF: renamed from: c (int) void
   public void method_7573(int var1) {
      this.field_7377.remove(var1);
   }

   // $FF: renamed from: b (nF) void
   public void method_7574(class_1386 var1) {
      this.field_7377.add(var1);
   }

   // $FF: renamed from: d () int
   public int method_7575() {
      return this.field_7377.size();
   }

   // $FF: renamed from: b (int, int) void
   public void method_7576(int var1, int var2) {
      class_1386 var3 = this.method_7572(var1);
      this.field_7377.set(var1, this.method_7572(var2));
      this.field_7377.set(var2, var3);
      this.method_7571();
   }

   // $FF: renamed from: b (int, nF) void
   public void method_7577(int var1, class_1386 var2) {
      this.field_7377.set(var1, var2);
   }

   // $FF: renamed from: c (nF) void
   public static void method_7578(class_1386 var0) {
      class_1387 var10000 = new class_1387;
      var10000.method_7569(bao.method_5273());
      class_1387 var2 = var10000;
      var2.method_7570();
      String[] var1 = class_752.method_4253();
      int var3 = 0;

      while(true) {
         if(var3 < var2.method_7575()) {
            label32: {
               class_1386 var4 = var2.method_7572(var3);
               if(var1 == null) {
                  break;
               }

               if(var1 != null) {
                  if(var4.field_7361.equals(var0.field_7361) && var4.field_7362.equals(var0.field_7362)) {
                     var2.method_7577(var3, var0);
                     if(var1 != null) {
                        break label32;
                     }
                  }

                  ++var3;
               }

               if(var1 != null) {
                  continue;
               }
            }
         }

         var2.method_7571();
         break;
      }

   }

   // $FF: renamed from: <clinit> () void
   static void method_7579() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (java.lang.Exception) java.lang.Exception
   private static Exception method_7580(Exception var0) {
      return var0;
   }
}
