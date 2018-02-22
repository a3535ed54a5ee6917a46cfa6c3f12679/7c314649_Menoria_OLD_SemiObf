import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.io.File;
import java.io.FileFilter;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

// $FF: renamed from: pu
public class class_1511 {

   // $FF: renamed from: b java.io.FileFilter
   protected static final FileFilter field_7952;
   // $FF: renamed from: c java.io.File
   private final File field_7953;
   // $FF: renamed from: d pt
   public final class_56 field_7954;
   // $FF: renamed from: f java.io.File
   private final File field_7955;
   // $FF: renamed from: g pS
   public final class_1479 field_7956;
   // $FF: renamed from: h pt
   private class_56 field_7957;
   // $FF: renamed from: i boolean
   private boolean field_7958;
   // $FF: renamed from: j java.util.List
   private List field_7959;
   // $FF: renamed from: k java.util.List
   private List field_7960;
   // $FF: renamed from: l java.lang.String
   private static final String field_7961;
   // $FF: renamed from: m java.lang.String[]
   private static final String[] field_7962;


   // $FF: renamed from: <init> (java.io.File, java.io.File, pt, pS, bbj) void
   public void method_8195(File var1, File var2, class_56 var3, class_1479 var4, bbj var5) {
      String[] var10000 = class_752.method_4253();
      super();
      this.field_7959 = Lists.newArrayList();
      this.field_7960 = Lists.newArrayList();
      this.field_7953 = var1;
      this.field_7955 = var2;
      this.field_7954 = var3;
      this.field_7956 = var4;
      this.method_8196();
      this.method_8198();
      Iterator var7 = var5.field_4496.iterator();
      String[] var6 = var10000;

      label40:
      do {
         boolean var11 = var7.hasNext();

         while(var11) {
            String var8 = (String)var7.next();
            Iterator var9 = this.field_7959.iterator();

            while(true) {
               if(!var9.hasNext()) {
                  continue label40;
               }

               class_1514 var10 = (class_1514)var9.next();
               var11 = var10.method_8221().equals(var8);
               if(var6 == null) {
                  break;
               }

               label32: {
                  if(var6 != null) {
                     if(!var11) {
                        break label32;
                     }

                     this.field_7960.add(var10);
                  }

                  if(var6 != null) {
                     continue label40;
                  }
               }

               if(var6 == null) {
                  continue label40;
               }
            }
         }

         return;
      } while(var6 != null);

   }

   // $FF: renamed from: a () void
   private void method_8196() {
      String[] var1 = class_752.method_4253();
      if(var1 != null && !this.field_7953.isDirectory()) {
         this.field_7953.delete();
         this.field_7953.mkdirs();
      }

   }

   // $FF: renamed from: b () java.util.List
   private List method_8197() {
      String[] var1 = class_752.method_4253();
      File var10000 = this.field_7953;
      List var2;
      if(var1 != null) {
         if(!this.field_7953.isDirectory()) {
            var2 = Collections.emptyList();
            return var2;
         }

         var10000 = this.field_7953;
      }

      var2 = Arrays.asList(var10000.listFiles(field_7952));
      return var2;
   }

   // $FF: renamed from: c () void
   public void method_8198() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: d () java.util.List
   public List method_8199() {
      return ImmutableList.copyOf(this.field_7959);
   }

   // $FF: renamed from: e () java.util.List
   public List method_8200() {
      return ImmutableList.copyOf(this.field_7960);
   }

   // $FF: renamed from: b (java.util.List) void
   public void method_8201(List var1) {
      this.field_7960.clear();
      this.field_7960.addAll(var1);
   }

   // $FF: renamed from: f () java.io.File
   public File method_8202() {
      return this.field_7953;
   }

   // $FF: renamed from: b (java.lang.String) void
   public void method_8203(String var1) {
      String[] var10000 = class_752.method_4253();
      String var3 = var1.substring(var1.lastIndexOf("/") + 1);
      String[] var2 = var10000;
      boolean var6 = var3.contains("?");
      if(var2 != null) {
         if(var6) {
            var3 = var3.substring(0, var3.indexOf("?"));
         }

         String[] var5 = field_7962;
         var6 = var3.endsWith(".zip");
      }

      if(var6) {
         File var7 = new File(this.field_7955, var3.replaceAll("\\W", ""));
         String[] var10004 = field_7962;
         File var4 = var7;
         this.method_8206();
         this.method_8204(var1, var4);
      }

   }

   // $FF: renamed from: b (java.lang.String, java.io.File) void
   private void method_8204(String var1, File var2) {
      HashMap var3 = Maps.newHashMap();
      class_169 var10000 = new class_169;
      var10000.method_651();
      class_169 var4 = var10000;
      String[] var5 = field_7962;
      var3.put("X-Minecraft-Username", bao.method_5273().method_5285().method_6995());
      var3.put("X-Minecraft-UUID", bao.method_5273().method_5285().method_6994());
      var3.put("X-Minecraft-Version", "1.7.10");
      this.field_7958 = true;
      bao.method_5273().method_5236(var4);
      class_1513 var10002 = new class_1513;
      var10002.method_8214(this);
      class_1703.method_9461(var2, var1, var10002, var3, 52428800, var4, bao.method_5273().method_5287());
   }

   // $FF: renamed from: g () pt
   public class_56 method_8205() {
      return this.field_7957;
   }

   // $FF: renamed from: h () void
   public void method_8206() {
      this.field_7957 = null;
      this.field_7958 = false;
   }

   // $FF: renamed from: b (pu) boolean
   static boolean method_8207(class_1511 var0) {
      return var0.field_7958;
   }

   // $FF: renamed from: b (pu, boolean) boolean
   static boolean method_8208(class_1511 var0, boolean var1) {
      return var0.field_7958 = var1;
   }

   // $FF: renamed from: b (pu, pt) pt
   static class_56 method_8209(class_1511 var0, class_56 var1) {
      return var0.field_7957 = var1;
   }

   // $FF: renamed from: <clinit> () void
   static void method_8210() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (java.lang.Exception) java.lang.Exception
   private static Exception method_8211(Exception var0) {
      return var0;
   }
}
