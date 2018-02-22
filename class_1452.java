import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

// $FF: renamed from: pI
public class class_1452 implements class_55 {

   // $FF: renamed from: a org.apache.logging.log4j.Logger
   private static final Logger field_7709;
   // $FF: renamed from: b pS
   private final class_1479 field_7710;
   // $FF: renamed from: c java.lang.String
   private String field_7711;
   // $FF: renamed from: d pJ
   protected static final class_1453 field_7712;
   // $FF: renamed from: f java.util.Map
   private Map field_7713;
   // $FF: renamed from: h java.lang.String[]
   private static final String[] field_7714;


   // $FF: renamed from: <init> (pS, java.lang.String) void
   public void method_7902(class_1479 var1, String var2) {
      super();
      this.field_7713 = Maps.newHashMap();
      this.field_7710 = var1;
      this.field_7711 = var2;
      class_1450.method_7895(field_7712);
   }

   // $FF: renamed from: b (java.util.List) void
   public void method_7903(List var1) {
      String[] var10000 = class_752.method_4253();
      this.field_7713.clear();
      String[] var2 = var10000;
      Iterator var3 = var1.iterator();

      label75:
      do {
         boolean var14 = var3.hasNext();

         label72:
         while(var14) {
            class_56 var4 = (class_56)var3.next();

            String[] var8;
            Logger var15;
            StringBuilder var10001;
            try {
               var8 = field_7714;
               class_1487 var5 = (class_1487)var4.method_231(this.field_7710, "language");

               class_1487 var16;
               label67: {
                  try {
                     var16 = var5;
                     if(var2 == null) {
                        break label67;
                     }

                     if(var5 == null) {
                        continue label75;
                     }
                  } catch (RuntimeException var11) {
                     throw method_7910(var11);
                  }

                  var16 = var5;
               }

               Iterator var6 = var16.method_8029().iterator();

               while(true) {
                  if(!var6.hasNext()) {
                     continue label75;
                  }

                  class_1451 var7 = (class_1451)var6.next();

                  label58: {
                     String var17;
                     Map var18;
                     label57: {
                        try {
                           var18 = this.field_7713;
                           var17 = var7.method_7898();
                           if(var2 == null) {
                              break label57;
                           }

                           var14 = var18.containsKey(var17);
                           if(var2 == null) {
                              continue label72;
                           }
                        } catch (RuntimeException var10) {
                           throw method_7910(var10);
                        }

                        try {
                           if(var14) {
                              break label58;
                           }

                           var18 = this.field_7713;
                           var17 = var7.method_7898();
                        } catch (RuntimeException var9) {
                           throw method_7910(var9);
                        }
                     }

                     var18.put(var17, var7);
                  }

                  if(var2 == null) {
                     continue label75;
                  }
               }
            } catch (RuntimeException var12) {
               var15 = field_7709;
               var10001 = new StringBuilder();
               var8 = field_7714;
               var15.warn(var10001.append("Unable to parse metadata section of resourcepack: ").append(var4.method_233()).toString(), var12);
            } catch (IOException var13) {
               var15 = field_7709;
               var10001 = new StringBuilder();
               String[] var10002 = field_7714;
               var15.warn(var10001.append("Unable to parse metadata section of resourcepack: ").append(var4.method_233()).toString(), var13);
            }
            continue label75;
         }

         return;
      } while(var2 != null);

   }

   // $FF: renamed from: a (bqy) void
   public void method_221(bqy param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b () boolean
   public boolean method_7904() {
      return field_7712.method_7913();
   }

   // $FF: renamed from: c () boolean
   public boolean method_7905() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (pH) void
   public void method_7906(class_1451 var1) {
      this.field_7711 = var1.method_7898();
   }

   // $FF: renamed from: d () pH
   public class_1451 method_7907() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: e () java.util.SortedSet
   public SortedSet method_7908() {
      return Sets.newTreeSet(this.field_7713.values());
   }

   // $FF: renamed from: <clinit> () void
   static void method_7909() {
      String[] var5 = new String[3];
      int var3 = 0;
      String var2 = "zÛ^{s2CÔ[bYbÕÉIo\ns\\zwÎ}bÓW.6ÈJaußXmC6sÔ¶l]";
      int var4 = "zÛ^{s2CÔ[bYbÕÉIo\ns\\zwÎ}bÓW.6ÈJaußXmC6sÔ¶l]".length();
      char var1 = 8;
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
            char[] var11 = var9;
            var9 = var10003;
            if(var10003 <= var6) {
               var5[var3++] = (new String((char[])var10)).intern();
               if((var0 += var1) >= var4) {
                  field_7714 = var5;
                  field_7709 = LogManager.getLogger();
                  class_1453 var8 = new class_1453;
                  var8.method_7911();
                  field_7712 = var8;
                  return;
               }

               var1 = var2.charAt(var0);
               break;
            }

            char var10007 = (char)((Object[])var10)[var6];
            short var10009;
            switch(var6 % 7) {
            case 0:
               var10009 = 241;
               break;
            case 1:
               var10009 = 93;
               break;
            case 2:
               var10009 = 14;
               break;
            case 3:
               var10009 = 222;
               break;
            case 4:
               var10009 = 233;
               break;
            case 5:
               var10009 = 145;
               break;
            default:
               var10009 = 158;
            }

            ((Object[])var10)[var6] = (char)(var10007 ^ var11 ^ var10009);
            ++var6;
         }
      }
   }

   // $FF: renamed from: b (java.lang.RuntimeException) java.lang.RuntimeException
   private static RuntimeException method_7910(RuntimeException var0) {
      return var0;
   }
}
