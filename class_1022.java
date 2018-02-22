import com.google.common.collect.Maps;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

// $FF: renamed from: ra
public class class_1022 implements class_49 {

   // $FF: renamed from: b org.apache.logging.log4j.Logger
   private static final Logger field_5396;
   // $FF: renamed from: d java.util.Map
   protected final Map field_5397;
   // $FF: renamed from: h java.lang.String[]
   private static final String[] field_5398;


   // $FF: renamed from: <init> () void
   public void method_5804() {
      super();
      this.field_5397 = this.method_5805();
   }

   // $FF: renamed from: a () java.util.Map
   protected Map method_5805() {
      return Maps.newHashMap();
   }

   // $FF: renamed from: a (java.lang.Object) java.lang.Object
   public Object method_188(Object var1) {
      return this.field_5397.get(var1);
   }

   // $FF: renamed from: b (java.lang.Object, java.lang.Object) void
   public void method_189(Object var1, Object var2) {
      String[] var3 = class_752.method_4253();
      Map var10000 = this.field_5397;
      Object var10001 = var1;
      if(var3 != null) {
         if(this.field_5397.containsKey(var1)) {
            Logger var5 = field_5396;
            StringBuilder var6 = new StringBuilder();
            String[] var4 = field_5398;
            var5.debug(var6.append("Adding duplicate key \'").append(var1).append("\' to registry").toString());
         }

         var10000 = this.field_5397;
         var10001 = var1;
      }

      var10000.put(var10001, var2);
   }

   // $FF: renamed from: c () java.util.Set
   public Set method_5806() {
      return Collections.unmodifiableSet(this.field_5397.keySet());
   }

   // $FF: renamed from: d (java.lang.Object) boolean
   public boolean method_5807(Object var1) {
      return this.field_5397.containsKey(var1);
   }

   // $FF: renamed from: <clinit> () void
   static void method_5808() {
      String[] var5 = new String[2];
      int var3 = 0;
      String var2 = "Ì·´ëu¡þ³¹~ªó¤¥`äâ°¢d¥òà®~äÌ";
      int var4 = "Ì·´ëu¡þ³¹~ªó¤¥`äâ°¢d¥òà®~äÌ".length();
      char var1 = 13;
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
            char[] var10 = var8;
            var8 = var10003;
            if(var10003 <= var6) {
               var5[var3++] = (new String((char[])var9)).intern();
               if((var0 += var1) >= var4) {
                  field_5398 = var5;
                  field_5396 = LogManager.getLogger();
                  return;
               }

               var1 = var2.charAt(var0);
               break;
            }

            char var10007 = (char)((Object[])var9)[var6];
            short var10009;
            switch(var6 % 7) {
            case 0:
               var10009 = 192;
               break;
            case 1:
               var10009 = 188;
               break;
            case 2:
               var10009 = 235;
               break;
            case 3:
               var10009 = 89;
               break;
            case 4:
               var10009 = 224;
               break;
            case 5:
               var10009 = 44;
               break;
            default:
               var10009 = 239;
            }

            ((Object[])var9)[var6] = (char)(var10007 ^ var10 ^ var10009);
            ++var6;
         }
      }
   }
}
