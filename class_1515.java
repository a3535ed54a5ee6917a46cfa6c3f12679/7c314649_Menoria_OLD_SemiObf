import com.google.common.base.Joiner;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.io.FileNotFoundException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

// $FF: renamed from: py
public class class_1515 implements class_54 {

   // $FF: renamed from: b org.apache.logging.log4j.Logger
   private static final Logger field_7978;
   // $FF: renamed from: c com.google.common.base.Joiner
   private static final Joiner field_7979;
   // $FF: renamed from: d java.util.Map
   private final Map field_7980;
   // $FF: renamed from: e java.util.List
   private final List field_7981;
   // $FF: renamed from: f java.util.Set
   private final Set field_7982;
   // $FF: renamed from: g pS
   private final class_1479 field_7983;
   // $FF: renamed from: h java.lang.String
   private static final String field_7984;
   // $FF: renamed from: i java.lang.String[]
   private static final String[] field_7985;


   // $FF: renamed from: <init> (pS) void
   public void method_8231(class_1479 var1) {
      super();
      this.field_7980 = Maps.newHashMap();
      this.field_7981 = Lists.newArrayList();
      this.field_7982 = Sets.newLinkedHashSet();
      this.field_7983 = var1;
   }

   // $FF: renamed from: b (pt) void
   public void method_8232(class_56 var1) {
      String[] var10000 = class_752.method_4253();
      Iterator var4 = var1.method_230().iterator();
      String[] var2 = var10000;

      while(var4.hasNext()) {
         String var5 = (String)var4.next();
         this.field_7982.add(var5);
         class_1508 var3 = (class_1508)this.field_7980.get(var5);
         class_1508 var6 = var3;
         if(var2 != null) {
            if(var3 == null) {
               var6 = new class_1508;
               var6.method_8187(this.field_7983);
               var3 = var6;
               this.field_7980.put(var5, var3);
            }

            var6 = var3;
         }

         var6.method_8188(var1);
         if(var2 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: a () java.util.Set
   public Set method_223() {
      return this.field_7982;
   }

   // $FF: renamed from: a (bqx) bqw
   public bqw method_224(bqx var1) {
      String[] var10000 = class_752.method_4253();
      bqy var3 = (bqy)this.field_7980.get(var1.method_8229());
      String[] var2 = var10000;
      bqy var4 = var3;
      if(var2 != null) {
         if(var3 == null) {
            throw new FileNotFoundException(var1.toString());
         }

         var4 = var3;
      }

      return var4.method_224(var1);
   }

   // $FF: renamed from: b (bqx) java.util.List
   public List method_225(bqx var1) {
      String[] var10000 = class_752.method_4253();
      bqy var3 = (bqy)this.field_7980.get(var1.method_8229());
      String[] var2 = var10000;
      bqy var4 = var3;
      if(var2 != null) {
         if(var3 == null) {
            throw new FileNotFoundException(var1.toString());
         }

         var4 = var3;
      }

      return var4.method_225(var1);
   }

   // $FF: renamed from: c () void
   private void method_8233() {
      this.field_7980.clear();
      this.field_7982.clear();
   }

   // $FF: renamed from: b (java.util.List) void
   public void method_226(List var1) {
      String[] var10000 = class_752.method_4253();
      this.method_8233();
      Logger var10001 = field_7978;
      StringBuilder var10002 = new StringBuilder();
      String[] var10003 = field_7985;
      var10002 = var10002.append("Reloading ResourceManager: ");
      Joiner var5 = field_7979;
      class_1516 var10005 = new class_1516;
      var10005.method_8236(this);
      var10001.info(var10002.append(var5.join(Iterables.transform(var1, var10005))).toString());
      String[] var2 = var10000;
      Iterator var3 = var1.iterator();

      while(true) {
         if(var3.hasNext()) {
            class_56 var4 = (class_56)var3.next();
            this.method_8232(var4);
            if(var2 == null) {
               break;
            }

            if(var2 != null) {
               continue;
            }
         }

         this.method_8234();
         break;
      }

   }

   // $FF: renamed from: b (ps) void
   public void method_227(class_55 var1) {
      this.field_7981.add(var1);
      var1.method_221(this);
   }

   // $FF: renamed from: d () void
   private void method_8234() {
      String[] var10000 = class_752.method_4253();
      Iterator var2 = this.field_7981.iterator();
      String[] var1 = var10000;

      while(var2.hasNext()) {
         class_55 var3 = (class_55)var2.next();
         var3.method_221(this);
         if(var1 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: <clinit> () void
   static void method_8235() {
      String[] var5 = new String[3];
      int var3 = 0;
      String var2 = "þ&c(ðÊ¼aÚôÝ§t\"ÜÏ³a5«J¥w¡Oã6Ãv";
      int var4 = "þ&c(ðÊ¼aÚôÝ§t\"ÜÏ³a5«J¥w¡Oã6Ãv".length();
      char var1 = 2;
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
                  field_7985 = var5;
                  String[] var11 = field_7985;
                  field_7984 = "CL_00001091";
                  field_7978 = LogManager.getLogger();
                  String[] var8 = field_7985;
                  field_7979 = Joiner.on(", ");
                  return;
               }

               var1 = var2.charAt(var0);
               break;
            }

            char var10007 = (char)((Object[])var10)[var6];
            short var10009;
            switch(var6 % 7) {
            case 0:
               var10009 = 65;
               break;
            case 1:
               var10009 = 149;
               break;
            case 2:
               var10009 = 105;
               break;
            case 3:
               var10009 = 212;
               break;
            case 4:
               var10009 = 2;
               break;
            case 5:
               var10009 = 61;
               break;
            default:
               var10009 = 236;
            }

            ((Object[])var10)[var6] = (char)(var10007 ^ var12 ^ var10009);
            ++var6;
         }
      }
   }
}
