import com.google.common.collect.Maps;
import java.util.Iterator;
import java.util.Map;

// $FF: renamed from: l5
public class class_1332 {

   // $FF: renamed from: b bqx
   private static final bqx field_6841;
   // $FF: renamed from: c bqf
   private final bqf field_6842;
   // $FF: renamed from: d java.util.Map
   private final Map field_6843;
   // $FF: renamed from: e java.lang.String
   private static final String field_6844;


   // $FF: renamed from: <init> (bqf) void
   public void method_7000(bqf var1) {
      super();
      this.field_6843 = Maps.newHashMap();
      this.field_6842 = var1;
   }

   // $FF: renamed from: b (jQ) void
   public void method_7001(class_1296 var1) {
      class_1336.method_7055(this.method_7003(var1));
   }

   // $FF: renamed from: b (jQ, boolean) void
   public void method_7002(class_1296 var1, boolean var2) {
      class_1336.method_7056(this.method_7003(var1), var2);
   }

   // $FF: renamed from: c (jQ) l7
   private class_1336 method_7003(class_1296 var1) {
      String[] var10000 = class_752.method_4253();
      class_1336 var3 = (class_1336)this.field_6843.get(var1.field_6638);
      String[] var2 = var10000;
      class_1336 var4 = var3;
      if(var2 != null) {
         if(var3 == null) {
            var4 = new class_1336;
            var4.method_7054(this, var1, (Object)null);
            var3 = var4;
            this.field_6843.put(var1.field_6638, var3);
         }

         var4 = var3;
      }

      return var4;
   }

   // $FF: renamed from: b () void
   public void method_7004() {
      String[] var10000 = class_752.method_4253();
      Iterator var2 = this.field_6843.values().iterator();
      String[] var1 = var10000;

      while(true) {
         if(var2.hasNext()) {
            class_1336 var3 = (class_1336)var2.next();
            this.field_6842.method_8123(class_1336.method_7057(var3));
            if(var1 == null) {
               break;
            }

            if(var1 != null) {
               continue;
            }
         }

         this.field_6843.clear();
         break;
      }

   }

   // $FF: renamed from: b (l5) bqf
   static bqf method_7005(class_1332 var0) {
      return var0.field_6842;
   }

   // $FF: renamed from: c () bqx
   static bqx method_7006() {
      return field_6841;
   }

   // $FF: renamed from: <clinit> () void
   static void method_7007() {
      String[] var6 = new String[2];
      int var4 = 0;
      String var3 = "§â¥³ A÷ø»²!ÿ¸¸ @ø\"!¦QçæãXH¥";
      int var5 = "§â¥³ A÷ø»²!ÿ¸¸ @ø\"!¦QçæãXH¥".length();
      char var2 = 26;
      int var1 = -1;

      while(true) {
         ++var1;
         String var10002 = var3.substring(var1, var1 + var2);
         boolean var10000 = true;
         char[] var10003 = var10002.toCharArray();
         Object var10004 = var10003.length;
         Object var11 = true;
         char[] var10 = var10003;
         char[] var10001 = (char[])var10004;
         int var7 = 0;

         while(true) {
            var10003 = var10;
            var10 = var10001;
            var10001 = var10003;
            char[] var12 = var10;
            var10 = var10003;
            if(var10003 <= var7) {
               var6[var4++] = (new String((char[])var11)).intern();
               if((var1 += var2) >= var5) {
                  field_6844 = "CL_00000663";
                  bqx var9 = new bqx;
                  var9.method_8227("textures/map/map_icons.png");
                  field_6841 = var9;
                  return;
               }

               var2 = var3.charAt(var1);
               break;
            }

            char var10007 = (char)((Object[])var11)[var7];
            short var10009;
            switch(var7 % 7) {
            case 0:
               var10009 = 149;
               break;
            case 1:
               var10009 = 40;
               break;
            case 2:
               var10009 = 56;
               break;
            case 3:
               var10009 = 208;
               break;
            case 4:
               var10009 = 39;
               break;
            case 5:
               var10009 = 145;
               break;
            default:
               var10009 = 144;
            }

            ((Object[])var11)[var7] = (char)(var10007 ^ var12 ^ var10009);
            ++var7;
         }
      }
   }
}
