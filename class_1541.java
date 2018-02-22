import com.google.gson.Gson;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.ParameterizedType;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import org.apache.logging.log4j.Logger;

// $FF: renamed from: ql
public class class_1541 implements class_55, class_69 {

   // $FF: renamed from: a org.apache.logging.log4j.Logger
   private static final Logger field_8084;
   // $FF: renamed from: b com.google.gson.Gson
   private static final Gson field_8085;
   // $FF: renamed from: c java.lang.reflect.ParameterizedType
   private static final ParameterizedType field_8086;
   // $FF: renamed from: d qg
   public static final class_1531 field_8087;
   // $FF: renamed from: f rb
   private final class_1024 field_8088;
   // $FF: renamed from: g qh
   private final class_1533 field_8089;
   // $FF: renamed from: h bqy
   private final bqy field_8090;
   // $FF: renamed from: i java.lang.String
   private static final String field_8091;
   // $FF: renamed from: j java.lang.String[]
   private static final String[] field_8092;


   // $FF: renamed from: <init> (bqy, bbj) void
   public void method_8363(bqy var1, bbj var2) {
      super();
      class_1024 var10001 = new class_1024;
      var10001.method_5804();
      this.field_8088 = var10001;
      this.field_8090 = var1;
      class_1533 var3 = new class_1533;
      var3.method_8300(this, var2);
      this.field_8089 = var3;
   }

   // $FF: renamed from: a (bqy) void
   public void method_221(bqy var1) {
      String[] var10000 = class_752.method_4253();
      this.field_8089.method_8301();
      this.field_8088.method_5811();
      Iterator var3 = var1.method_223().iterator();
      String[] var2 = var10000;

      label60:
      do {
         Iterator var15 = var3;

         while(var15.hasNext()) {
            String var4 = (String)var3.next();

            try {
               bqx var10001 = new bqx;
               String[] var11 = field_8092;
               var10001.method_8226(var4, "sounds.json");
               List var5 = var1.method_225(var10001);
               Iterator var6 = var5.iterator();

               while(true) {
                  if(!var6.hasNext()) {
                     continue label60;
                  }

                  bqw var7 = (bqw)var6.next();

                  try {
                     Map var8 = (Map)field_8085.fromJson(new InputStreamReader(var7.method_234()), field_8086);
                     var15 = var8.entrySet().iterator();
                     if(var2 == null) {
                        break;
                     }

                     Iterator var9 = var15;

                     while(var9.hasNext()) {
                        Entry var10 = (Entry)var9.next();

                        try {
                           var10001 = new bqx;
                           var10001.method_8226(var4, (String)var10.getKey());
                           this.method_8364(var10001, (class_1433)var10.getValue());
                           if(var2 == null || var2 == null) {
                              break;
                           }
                        } catch (RuntimeException var12) {
                           throw method_8379(var12);
                        }
                     }
                  } catch (RuntimeException var13) {
                     String[] var16 = field_8092;
                     field_8084.warn("Invalid sounds.json", var13);
                  }

                  if(var2 == null) {
                     continue label60;
                  }
               }
            } catch (IOException var14) {
               continue label60;
            }
         }

         return;
      } while(var2 != null);

   }

   // $FF: renamed from: b (bqx, p6) void
   private void method_8364(bqx param1, class_1433 param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (bqx) qk
   public class_1539 method_8365(bqx var1) {
      return (class_1539)this.field_8088.method_188(var1);
   }

   // $FF: renamed from: b (p9) void
   public void method_8366(class_38 var1) {
      this.field_8089.method_8310(var1);
   }

   // $FF: renamed from: b (p9, int) void
   public void method_8367(class_38 var1, int var2) {
      this.field_8089.method_8315(var1, var2);
   }

   // $FF: renamed from: b (yz, float) void
   public void method_8368(class_792 var1, float var2) {
      this.field_8089.method_8317(var1, var2);
   }

   // $FF: renamed from: a () void
   public void method_8369() {
      this.field_8089.method_8313();
   }

   // $FF: renamed from: b () void
   public void method_8370() {
      this.field_8089.method_8306();
   }

   // $FF: renamed from: c () void
   public void method_8371() {
      this.field_8089.method_8305();
   }

   // $FF: renamed from: k () void
   public void method_362() {
      this.field_8089.method_8307();
   }

   // $FF: renamed from: d () void
   public void method_8372() {
      this.field_8089.method_8314();
   }

   // $FF: renamed from: b (aw, float) void
   public void method_8373(class_930 param1, float param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: c (p9) void
   public void method_8374(class_38 var1) {
      this.field_8089.method_8309(var1);
   }

   // $FF: renamed from: b (aw[]) qk
   public class_1539 method_8375(class_930 ... param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: d (p9) boolean
   public boolean method_8376(class_38 var1) {
      return this.field_8089.method_8308(var1);
   }

   // $FF: renamed from: b (ql) rb
   static class_1024 method_8377(class_1541 var0) {
      return var0.field_8088;
   }

   // $FF: renamed from: <clinit> () void
   static void method_8378() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (java.lang.Exception) java.lang.Exception
   private static Exception method_8379(Exception var0) {
      return var0;
   }
}
