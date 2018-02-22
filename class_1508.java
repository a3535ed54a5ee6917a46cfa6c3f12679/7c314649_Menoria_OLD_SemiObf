import com.google.common.collect.Lists;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

// $FF: renamed from: po
public class class_1508 implements bqy {

   // $FF: renamed from: b java.util.List
   protected final List field_7944;
   // $FF: renamed from: c pS
   private final class_1479 field_7945;
   // $FF: renamed from: d java.lang.String
   private static final String field_7946;
   // $FF: renamed from: h java.lang.String[]
   private static final String[] field_7947;


   // $FF: renamed from: <init> (pS) void
   public void method_8187(class_1479 var1) {
      super();
      this.field_7944 = new ArrayList();
      this.field_7945 = var1;
   }

   // $FF: renamed from: b (pt) void
   public void method_8188(class_56 var1) {
      this.field_7944.add(var1);
   }

   // $FF: renamed from: a () java.util.Set
   public Set method_223() {
      return null;
   }

   // $FF: renamed from: a (bqx) bqw
   public bqw method_224(bqx var1) {
      String[] var10000 = class_752.method_4253();
      class_56 var3 = null;
      String[] var2 = var10000;
      bqx var4 = method_8189(var1);
      int var5 = this.field_7944.size() - 1;

      while(var5 >= 0) {
         class_56 var6;
         class_56 var8;
         boolean var9;
         label39: {
            var6 = (class_56)this.field_7944.get(var5);
            var8 = var3;
            if(var2 != null) {
               if(var3 == null) {
                  var9 = var6.method_229(var4);
                  if(var2 == null) {
                     break label39;
                  }

                  if(var9) {
                     var3 = var6;
                  }
               }

               var8 = var6;
            }

            var9 = var8.method_229(var1);
         }

         if(var9) {
            InputStream var7;
            label26: {
               var7 = null;
               var8 = var3;
               if(var2 != null) {
                  if(var3 == null) {
                     break label26;
                  }

                  var8 = var3;
               }

               var7 = var8.method_228(var4);
            }

            class_1443 var10 = new class_1443;
            var10.method_7872(var1, var6.method_228(var1), var7, this.field_7945);
            return var10;
         }

         --var5;
         if(var2 == null) {
            break;
         }
      }

      throw new FileNotFoundException(var1.toString());
   }

   // $FF: renamed from: b (bqx) java.util.List
   public List method_225(bqx var1) {
      String[] var10000 = class_752.method_4253();
      ArrayList var3 = Lists.newArrayList();
      String[] var2 = var10000;
      bqx var4 = method_8189(var1);
      Iterator var5 = this.field_7944.iterator();

      boolean var8;
      ArrayList var12;
      while(true) {
         if(var5.hasNext()) {
            class_56 var6 = (class_56)var5.next();
            var8 = var6.method_229(var1);
            if(var2 == null) {
               break;
            }

            label41: {
               InputStream var10;
               label40: {
                  class_56 var9;
                  bqx var10001;
                  label56: {
                     if(var2 != null) {
                        if(!var8) {
                           break label41;
                        }

                        var9 = var6;
                        var10001 = var4;
                        if(var2 == null) {
                           break label56;
                        }

                        var8 = var6.method_229(var4);
                     }

                     if(!var8) {
                        var10 = null;
                        break label40;
                     }

                     var9 = var6;
                     var10001 = var4;
                  }

                  var10 = var9.method_228(var10001);
               }

               InputStream var7 = var10;
               class_1443 var11 = new class_1443;
               var11.method_7872(var1, var6.method_228(var1), var7, this.field_7945);
               var3.add(var11);
            }

            if(var2 != null) {
               continue;
            }
         }

         var12 = var3;
         if(var2 == null) {
            return var12;
         }

         var8 = var3.isEmpty();
         break;
      }

      if(var8) {
         throw new FileNotFoundException(var1.toString());
      } else {
         var12 = var3;
         return var12;
      }
   }

   // $FF: renamed from: d (bqx) bqx
   static bqx method_8189(bqx var0) {
      bqx var10000 = new bqx;
      String var10002 = var0.method_8229();
      StringBuilder var10003 = (new StringBuilder()).append(var0.method_8228());
      String[] var10004 = field_7947;
      var10000.method_8226(var10002, var10003.append(".mcmeta").toString());
      return var10000;
   }

   // $FF: renamed from: <clinit> () void
   static void method_8190() {
      String[] var5 = new String[2];
      int var3 = 0;
      String var2 = "x D.ÑÕ\n\\,{x\"{";
      int var4 = "x D.ÑÕ\n\\,{x\"{".length();
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
                  field_7947 = var5;
                  String[] var10 = field_7947;
                  field_7946 = "CL_00001074";
                  return;
               }

               var1 = var2.charAt(var0);
               break;
            }

            char var10007 = (char)((Object[])var9)[var6];
            short var10009;
            switch(var6 % 7) {
            case 0:
               var10009 = 208;
               break;
            case 1:
               var10009 = 135;
               break;
            case 2:
               var10009 = 240;
               break;
            case 3:
               var10009 = 164;
               break;
            case 4:
               var10009 = 245;
               break;
            case 5:
               var10009 = 10;
               break;
            default:
               var10009 = 14;
            }

            ((Object[])var9)[var6] = (char)(var10007 ^ var11 ^ var10009);
            ++var6;
         }
      }
   }
}
