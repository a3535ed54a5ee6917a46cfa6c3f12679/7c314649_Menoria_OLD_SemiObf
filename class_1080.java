import com.google.common.collect.Iterators;
import com.google.common.collect.Lists;
import java.util.Iterator;
import java.util.List;

// $FF: renamed from: rQ
public abstract class class_1080 implements class_66 {

   // $FF: renamed from: b java.util.List
   protected List field_5696;
   // $FF: renamed from: c rY
   private class_1560 field_5697;
   // $FF: renamed from: d java.lang.String
   private static final String field_5698;
   // $FF: renamed from: h java.lang.String[]
   private static final String[] field_5699;


   // $FF: renamed from: <init> () void
   public void method_6123() {
      super();
      this.field_5696 = Lists.newArrayList();
   }

   // $FF: renamed from: b (rV) rV
   public class_66 method_340(class_66 var1) {
      var1.method_338().method_8532(this.method_338());
      this.field_5696.add(var1);
      return this;
   }

   // $FF: renamed from: d () java.util.List
   public List method_344() {
      return this.field_5696;
   }

   // $FF: renamed from: b (java.lang.String) rV
   public class_66 method_339(String var1) {
      class_1082 var10001 = new class_1082;
      var10001.method_6134(var1);
      return this.method_340(var10001);
   }

   // $FF: renamed from: b (rY) rV
   public class_66 method_337(class_1560 var1) {
      String[] var10000 = class_752.method_4253();
      this.field_5697 = var1;
      String[] var2 = var10000;
      Iterator var3 = this.field_5696.iterator();

      while(var3.hasNext()) {
         class_66 var4 = (class_66)var3.next();
         var4.method_338().method_8532(this.method_338());
         if(var2 == null) {
            break;
         }
      }

      return this;
   }

   // $FF: renamed from: a () rY
   public class_1560 method_338() {
      if(this.field_5697 == null) {
         class_1560 var10001 = new class_1560;
         var10001.method_8514();
         this.field_5697 = var10001;
         Iterator var1 = this.field_5696.iterator();

         while(var1.hasNext()) {
            class_66 var2 = (class_66)var1.next();
            var2.method_338().method_8532(this.field_5697);
         }
      }

      return this.field_5697;
   }

   public Iterator iterator() {
      return Iterators.concat(Iterators.forArray(new class_1080[]{this}), method_6124(this.field_5696));
   }

   // $FF: renamed from: b () java.lang.String
   public final String method_342() {
      String[] var10000 = class_752.method_4253();
      StringBuilder var2 = new StringBuilder();
      Iterator var3 = this.iterator();
      String[] var1 = var10000;

      StringBuilder var5;
      while(true) {
         if(var3.hasNext()) {
            class_66 var4 = (class_66)var3.next();
            var5 = var2.append(var4.method_341());
            if(var1 == null) {
               break;
            }

            if(var1 != null) {
               continue;
            }
         }

         var5 = var2;
         break;
      }

      return var5.toString();
   }

   // $FF: renamed from: c () java.lang.String
   public final String method_343() {
      StringBuilder var2 = new StringBuilder();
      String[] var10000 = class_752.method_4253();
      Iterator var3 = this.iterator();
      String[] var1 = var10000;

      StringBuilder var5;
      while(true) {
         if(var3.hasNext()) {
            class_66 var4 = (class_66)var3.next();
            var2.append(var4.method_338().method_8533());
            var2.append(var4.method_341());
            var5 = var2.append(class_130.field_297);
            if(var1 == null) {
               break;
            }

            if(var1 != null) {
               continue;
            }
         }

         var5 = var2;
         break;
      }

      return var5.toString();
   }

   // $FF: renamed from: b (java.lang.Iterable) java.util.Iterator
   public static Iterator method_6124(Iterable var0) {
      Iterator var10000 = var0.iterator();
      class_1551 var10001 = new class_1551;
      var10001.method_8419();
      Iterator var1 = Iterators.concat(Iterators.transform(var10000, var10001));
      class_1552 var2 = new class_1552;
      var2.method_8422();
      var1 = Iterators.transform(var1, var2);
      return var1;
   }

   public boolean equals(Object var1) {
      String[] var2 = class_752.method_4253();
      Object var10000 = this;
      if(var2 != null) {
         if(this == var1) {
            return true;
         }

         var10000 = var1;
      }

      if(var2 != null) {
         if(!(var10000 instanceof class_1080)) {
            return false;
         }

         var10000 = var1;
      }

      boolean var4;
      label41: {
         class_1080 var3 = (class_1080)var10000;
         var4 = this.field_5696.equals(var3.field_5696);
         if(var2 != null) {
            if(!var4) {
               break label41;
            }

            var4 = this.method_338().equals(var3.method_338());
         }

         if(var2 == null) {
            return var4;
         }

         if(var4) {
            var4 = true;
            return var4;
         }
      }

      var4 = false;
      return var4;
   }

   public int hashCode() {
      return 31 * this.field_5697.hashCode() + this.field_5696.hashCode();
   }

   public String toString() {
      StringBuilder var10000 = new StringBuilder();
      String[] var1 = field_5699;
      return var10000.append("BaseComponent{style=").append(this.field_5697).append(", siblings=").append(this.field_5696).append('}').toString();
   }

   // $FF: renamed from: <clinit> () void
   static void method_6125() {
      String[] var5 = new String[3];
      int var3 = 0;
      String var2 = "æ¬÷­46¤Ý¬£ö®ÿhoûê©Û¬û72ºÕ±û¡,$¹Î¦òªe";
      int var4 = "æ¬÷­46¤Ý¬£ö®ÿhoûê©Û¬û72ºÕ±û¡,$¹Î¦òªe".length();
      char var1 = 11;
      int var0 = -1;

      while(true) {
         ++var0;
         String var10002 = var2.substring(var0, var0 + var1);
         boolean var10000 = true;
         char[] var10003 = var10002.toCharArray();
         Object var10004 = var10003.length;
         Object var9 = true;
         char[] var8 = var10003;
         char[] var10001 = (char[])var10004;
         int var6 = 0;

         while(true) {
            var10003 = var8;
            var8 = var10001;
            var10001 = var10003;
            char[] var11 = var8;
            var8 = var10003;
            if(var10003 <= var6) {
               var5[var3++] = (new String((char[])var9)).intern();
               if((var0 += var1) >= var4) {
                  field_5699 = var5;
                  String[] var10 = field_5699;
                  field_5698 = "CL_00001257";
                  return;
               }

               var1 = var2.charAt(var0);
               break;
            }

            char var10007 = (char)((Object[])var9)[var6];
            short var10009;
            switch(var6 % 7) {
            case 0:
               var10009 = 201;
               break;
            case 1:
               var10009 = 185;
               break;
            case 2:
               var10009 = 220;
               break;
            case 3:
               var10009 = 157;
               break;
            case 4:
               var10009 = 204;
               break;
            case 5:
               var10009 = 91;
               break;
            default:
               var10009 = 92;
            }

            ((Object[])var9)[var6] = (char)(var10007 ^ var11 ^ var10009);
            ++var6;
         }
      }
   }
}
