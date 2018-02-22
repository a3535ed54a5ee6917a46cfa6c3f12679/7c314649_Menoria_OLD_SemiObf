import com.google.common.base.Charsets;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.io.Files;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.ParameterizedType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import org.apache.commons.io.IOUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

// $FF: renamed from: uR
public class class_1640 {

   // $FF: renamed from: b org.apache.logging.log4j.Logger
   protected static final Logger field_8536;
   // $FF: renamed from: c com.google.gson.Gson
   protected final Gson field_8537;
   // $FF: renamed from: d java.io.File
   private final File field_8538;
   // $FF: renamed from: e java.util.Map
   private final Map field_8539;
   // $FF: renamed from: f boolean
   private boolean field_8540;
   // $FF: renamed from: g java.lang.reflect.ParameterizedType
   private static final ParameterizedType field_8541;
   // $FF: renamed from: h java.lang.String
   private static final String field_8542;
   // $FF: renamed from: i java.lang.String[]
   private static final String[] field_8543;


   // $FF: renamed from: <init> (java.io.File) void
   public void method_8987(File var1) {
      super();
      this.field_8539 = Maps.newHashMap();
      this.field_8540 = true;
      this.field_8538 = var1;
      GsonBuilder var2 = (new GsonBuilder()).setPrettyPrinting();
      class_1647 var10002 = new class_1647;
      var10002.method_9035(this, (Object)null);
      var2.registerTypeHierarchyAdapter(class_1629.class, var10002);
      this.field_8537 = var2.create();
   }

   // $FF: renamed from: a () boolean
   public boolean method_8988() {
      return this.field_8540;
   }

   // $FF: renamed from: b (boolean) void
   public void method_8989(boolean var1) {
      this.field_8540 = var1;
   }

   // $FF: renamed from: b (uL) void
   public void method_8990(class_1629 var1) {
      this.field_8539.put(this.method_8994(var1.method_8936()), var1);

      try {
         this.method_8999();
      } catch (IOException var3) {
         String[] var10001 = field_8543;
         field_8536.warn("Could not save the list after adding a user.", var3);
      }

   }

   // $FF: renamed from: a (java.lang.Object) uL
   public class_1629 method_8991(Object var1) {
      this.method_8996();
      return (class_1629)this.field_8539.get(this.method_8994(var1));
   }

   // $FF: renamed from: b (java.lang.Object) void
   public void method_8992(Object var1) {
      this.field_8539.remove(this.method_8994(var1));

      try {
         this.method_8999();
      } catch (IOException var3) {
         String[] var10001 = field_8543;
         field_8536.warn("Could not save the list after removing a user.", var3);
      }

   }

   // $FF: renamed from: b () java.lang.String[]
   public String[] method_8993() {
      return (String[])((String[])this.field_8539.keySet().toArray(new String[this.field_8539.size()]));
   }

   // $FF: renamed from: c (java.lang.Object) java.lang.String
   protected String method_8994(Object var1) {
      return var1.toString();
   }

   // $FF: renamed from: e (java.lang.Object) boolean
   protected boolean method_8995(Object var1) {
      return this.field_8539.containsKey(this.method_8994(var1));
   }

   // $FF: renamed from: c () void
   private void method_8996() {
      String[] var10000 = class_752.method_4253();
      ArrayList var2 = Lists.newArrayList();
      String[] var1 = var10000;
      Iterator var3 = this.field_8539.values().iterator();

      boolean var5;
      while(true) {
         if(var3.hasNext()) {
            class_1629 var4 = (class_1629)var3.next();
            var5 = var4.method_8937();
            if(var1 == null) {
               break;
            }

            if(var1 != null && var5) {
               var2.add(var4.method_8936());
            }

            if(var1 != null) {
               continue;
            }
         }

         var3 = var2.iterator();
         var5 = var3.hasNext();
         break;
      }

      while(var5) {
         Object var6 = var3.next();
         this.field_8539.remove(var6);
         if(var1 == null) {
            break;
         }

         var5 = var3.hasNext();
      }

   }

   // $FF: renamed from: b (com.google.gson.JsonObject) uL
   protected class_1629 method_8997(JsonObject var1) {
      class_1629 var10000 = new class_1629;
      var10000.method_8935((Object)null, var1);
      return var10000;
   }

   // $FF: renamed from: d () java.util.Map
   protected Map method_8998() {
      return this.field_8539;
   }

   // $FF: renamed from: e () void
   public void method_8999() {
      Collection var1 = this.field_8539.values();
      String var2 = this.field_8537.toJson(var1);
      BufferedWriter var3 = null;

      try {
         var3 = Files.newWriter(this.field_8538, Charsets.UTF_8);
         var3.write(var2);
      } finally {
         IOUtils.closeQuietly(var3);
      }

   }

   // $FF: renamed from: <clinit> () void
   static void method_9000() {
      String[] var5 = new String[3];
      int var3 = 0;
      String var2 = "h&ÇN\rNÁ,K\fNSPYÞEP^ÄIOPYÜENÁN[×ÛEN\n.K\fNSPYÞEP^ÄIOPYÜENÇVUJ×UOAÙ";
      int var4 = "h&ÇN\rNÁ,K\fNSPYÞEP^ÄIOPYÜENÁN[×ÛEN\n.K\fNSPYÞEP^ÄIOPYÜENÇVUJ×UOAÙ".length();
      char var1 = 11;
      int var0 = -1;

      while(true) {
         ++var0;
         String var10002 = var2.substring(var0, var0 + var1);
         boolean var10000 = true;
         char[] var10003 = var10002.toCharArray();
         Object var10004 = var10003.length;
         Object var10 = true;
         char[] var9 = var10003;
         char[] var10001 = (char[])var10004;
         int var6 = 0;

         while(true) {
            var10003 = var9;
            var9 = var10001;
            var10001 = var10003;
            char[] var12 = var9;
            var9 = var10003;
            if(var10003 <= var6) {
               var5[var3++] = (new String((char[])var10)).intern();
               if((var0 += var1) >= var4) {
                  field_8543 = var5;
                  String[] var11 = field_8543;
                  field_8542 = "CL_00001876";
                  field_8536 = LogManager.getLogger();
                  class_1646 var8 = new class_1646;
                  var8.method_9030();
                  field_8541 = var8;
                  return;
               }

               var1 = var2.charAt(var0);
               break;
            }

            char var10007 = (char)((Object[])var10)[var6];
            short var10009;
            switch(var6 % 7) {
            case 0:
               var10009 = 157;
               break;
            case 1:
               var10009 = 133;
               break;
            case 2:
               var10009 = 216;
               break;
            case 3:
               var10009 = 86;
               break;
            case 4:
               var10009 = 223;
               break;
            case 5:
               var10009 = 9;
               break;
            default:
               var10009 = 129;
            }

            ((Object[])var10)[var6] = (char)(var10007 ^ var12 ^ var10009);
            ++var6;
         }
      }
   }
}
