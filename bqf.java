import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.apache.logging.log4j.Logger;

public class bqf implements class_52, class_55 {

   // $FF: renamed from: a org.apache.logging.log4j.Logger
   private static final Logger field_7904;
   // $FF: renamed from: b java.util.Map
   private final Map field_7905;
   // $FF: renamed from: c java.util.Map
   private final Map field_7906;
   // $FF: renamed from: d java.util.List
   private final List field_7907;
   // $FF: renamed from: e java.util.Map
   private final Map field_7908;
   // $FF: renamed from: f bqy
   private bqy field_7909;
   private static final String __OBFID;
   // $FF: renamed from: h java.lang.String[]
   private static final String[] field_7910;


   // $FF: renamed from: <init> (bqy) void
   public void method_8115(bqy var1) {
      super();
      this.field_7905 = Maps.newHashMap();
      this.field_7906 = Maps.newHashMap();
      this.field_7907 = Lists.newArrayList();
      this.field_7908 = Maps.newHashMap();
      this.field_7909 = var1;
   }

   // $FF: renamed from: a (bqx) void
   public void bindTexture(bqx var1) {
      String[] var2 = class_752.method_4253();
      if(Config.isRandomMobs()) {
         var1 = RandomMobs.getTextureLocation(var1);
      }

      Object var3 = (bqh)this.field_7905.get(var1);

      Object var10000;
      label23: {
         label22: {
            try {
               var10000 = var3;
               if(var2 == null) {
                  break label23;
               }

               if(var3 != null) {
                  break label22;
               }
            } catch (class_643 var4) {
               throw method_8125(var4);
            }

            bpu var5 = new bpu;
            var5.method_7967(var1);
            var3 = var5;
            this.method_8120(var1, (bqh)var3);
         }

         var10000 = (bqh)var3;
      }

      bqi.method_8166(((bqh)var10000).method_222());
   }

   // $FF: renamed from: a (int) bqx
   public bqx method_8117(int var1) {
      return (bqx)this.field_7906.get(Integer.valueOf(var1));
   }

   // $FF: renamed from: a (bqx, bpz) boolean
   public boolean method_8118(bqx param1, bpz param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: a (bqx, pi) boolean
   public boolean method_8119(bqx param1, class_53 param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: a (bqx, bqh) boolean
   public boolean method_8120(bqx var1, bqh var2) {
      boolean var3 = true;
      Object var4 = var2;

      String[] var8;
      try {
         var2.method_221(this.field_7909);
      } catch (IOException var9) {
         Logger var11 = field_7904;
         StringBuilder var10001 = new StringBuilder();
         var8 = field_7910;
         var11.warn(var10001.append("Failed to load texture: ").append(var1).toString(), var9);
         var4 = bqi.field_7928;
         this.field_7905.put(var1, var4);
         var3 = false;
      } catch (Throwable var10) {
         var8 = field_7910;
         class_1346 var6 = class_1346.method_7153(var10, "Registering texture");
         class_1605 var7 = var6.method_7150("Resource location being registered");
         var7.method_8778("Resource location", var1);
         class_1500 var10002 = new class_1500;
         var10002.method_8126(this, var2);
         var7.method_8777("Texture object class", var10002);
         class_643 var10000 = new class_643;
         var10000.method_3525(var6);
         throw var10000;
      }

      this.field_7905.put(var1, var4);
      return var3;
   }

   // $FF: renamed from: b (bqx) bqh
   public bqh method_8121(bqx var1) {
      return (bqh)this.field_7905.get(var1);
   }

   // $FF: renamed from: a (java.lang.String, bpq) bqx
   public bqx method_8122(String param1, bpq param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: e () void
   public void method_220() {
      String[] var10000 = class_752.method_4253();
      Iterator var2 = this.field_7907.iterator();
      String[] var1 = var10000;

      while(var2.hasNext()) {
         class_52 var3 = (class_52)var2.next();
         var3.method_220();
         if(var1 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: c (bqx) void
   public void method_8123(bqx var1) {
      String[] var10000 = class_752.method_4253();
      bqh var3 = this.method_8121(var1);
      String[] var2 = var10000;

      bqh var5;
      label20: {
         try {
            var5 = var3;
            if(var2 == null) {
               break label20;
            }

            if(var3 == null) {
               return;
            }
         } catch (class_643 var4) {
            throw method_8125(var4);
         }

         var5 = var3;
      }

      bqi.method_8144(var5.method_222());
   }

   // $FF: renamed from: a (bqy) void
   public void method_221(bqy param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: <clinit> () void
   static void method_8124() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (AG) AG
   private static class_643 method_8125(class_643 var0) {
      return var0;
   }
}
