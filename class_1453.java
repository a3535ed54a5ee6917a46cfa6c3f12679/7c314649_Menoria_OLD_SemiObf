import com.google.common.base.Splitter;
import com.google.common.collect.Maps;
import java.io.IOException;
import java.io.InputStream;
import java.util.IllegalFormatException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

// $FF: renamed from: pJ
public class class_1453 {

   // $FF: renamed from: a com.google.common.base.Splitter
   private static final Splitter field_7715;
   // $FF: renamed from: b java.util.regex.Pattern
   private static final Pattern field_7716;
   // $FF: renamed from: c java.util.Map
   Map field_7717;
   // $FF: renamed from: e boolean
   private boolean field_7718;
   // $FF: renamed from: f java.lang.String
   private static final String field_7719;
   // $FF: renamed from: h java.lang.String[]
   private static final String[] field_7720;


   // $FF: renamed from: <init> () void
   public void method_7911() {
      super();
      this.field_7717 = Maps.newHashMap();
   }

   // $FF: renamed from: b (bqy, java.util.List) void
   public synchronized void method_7912(bqy var1, List var2) {
      this.field_7717.clear();
      String[] var3 = class_752.method_4253();
      Iterator var4 = var2.iterator();

      label39:
      while(true) {
         if(var4.hasNext()) {
            String var5 = (String)var4.next();
            String[] var10000 = field_7720;
            String var6 = String.format("lang/%s.lang", new Object[]{var5});
            if(var3 == null) {
               break;
            }

            Iterator var7 = var1.method_223().iterator();

            while(var7.hasNext()) {
               String var8 = (String)var7.next();

               label31: {
                  try {
                     bqx var10002 = new bqx;
                     var10002.method_8226(var8, var6);
                     this.method_7915(var1.method_225(var10002));
                  } catch (IOException var10) {
                     break label31;
                  }

                  if(var3 == null) {
                     continue label39;
                  }
               }

               if(var3 == null) {
                  break;
               }
            }

            if(var3 != null) {
               continue;
            }
         }

         this.method_7914();
         break;
      }

   }

   // $FF: renamed from: b () boolean
   public boolean method_7913() {
      return this.field_7718;
   }

   // $FF: renamed from: c () void
   private void method_7914() {
      this.field_7718 = false;
      String[] var1 = class_752.method_4253();
      int var2 = 0;
      int var3 = 0;
      Iterator var4 = this.field_7717.values().iterator();

      int var10000;
      int var10001;
      label56:
      while(true) {
         if(var4.hasNext()) {
            String var5 = (String)var4.next();
            int var6 = var5.length();
            var10000 = var3;
            var10001 = var6;

            label51:
            while(true) {
               var3 = var10000 + var10001;
               var10000 = 0;
               if(var1 == null) {
                  break label56;
               }

               int var7 = 0;

               while(true) {
                  if(var7 >= var6) {
                     break label51;
                  }

                  var10000 = var5.charAt(var7);
                  var10001 = 256;
                  if(var1 == null) {
                     break;
                  }

                  if(var10000 >= 256) {
                     ++var2;
                  }

                  ++var7;
                  if(var1 == null) {
                     break label51;
                  }
               }
            }

            if(var1 != null) {
               continue;
            }
         }

         var10000 = var2;
         break;
      }

      float var9 = (float)var10000 / (float)var3;

      class_1453 var10;
      label35: {
         label34: {
            try {
               var10 = this;
               double var11;
               var10001 = (var11 = (double)var9 - 0.1D) == 0.0D?0:(var11 < 0.0D?-1:1);
               if(var1 == null) {
                  break label35;
               }

               if(var10001 > 0) {
                  break label34;
               }
            } catch (IllegalFormatException var8) {
               throw method_7920(var8);
            }

            var10001 = 0;
            break label35;
         }

         var10001 = 1;
      }

      var10.field_7718 = (boolean)var10001;
   }

   // $FF: renamed from: b (java.util.List) void
   private void method_7915(List var1) {
      String[] var10000 = class_752.method_4253();
      Iterator var3 = var1.iterator();
      String[] var2 = var10000;

      while(var3.hasNext()) {
         bqw var4 = (bqw)var3.next();
         this.method_7916(var4.method_234());
         if(var2 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: b (java.io.InputStream) void
   private void method_7916(InputStream param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: a (java.lang.String) java.lang.String
   private String method_7917(String var1) {
      String[] var10000 = class_752.method_4253();
      String var3 = (String)this.field_7717.get(var1);
      String[] var2 = var10000;

      String var5;
      label32: {
         try {
            var5 = var3;
            if(var2 == null) {
               return var5;
            }

            if(var3 == null) {
               break label32;
            }
         } catch (IllegalFormatException var4) {
            throw method_7920(var4);
         }

         var5 = var3;
         return var5;
      }

      var5 = var1;
      return var5;
   }

   // $FF: renamed from: b (java.lang.String, java.lang.Object[]) java.lang.String
   public String method_7918(String var1, Object[] var2) {
      String var3 = this.method_7917(var1);

      try {
         return String.format(var3, var2);
      } catch (IllegalFormatException var5) {
         StringBuilder var10000 = new StringBuilder();
         String[] var10001 = field_7720;
         return var10000.append("Format error: ").append(var3).toString();
      }
   }

   // $FF: renamed from: <clinit> () void
   static void method_7919() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (java.util.IllegalFormatException) java.util.IllegalFormatException
   private static IllegalFormatException method_7920(IllegalFormatException var0) {
      return var0;
   }
}
