import com.google.common.collect.Sets;
import java.io.File;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import net.minecraft.server.MinecraftServer;
import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.Logger;

// $FF: renamed from: ve
public class class_1700 extends class_1699 {

   // $FF: renamed from: a org.apache.logging.log4j.Logger
   private static final Logger field_8915;
   // $FF: renamed from: d net.minecraft.server.MinecraftServer
   private final MinecraftServer field_8916;
   // $FF: renamed from: e java.io.File
   private final File field_8917;
   // $FF: renamed from: f java.util.Set
   private final Set field_8918;
   // $FF: renamed from: g int
   private int field_8919;
   // $FF: renamed from: h boolean
   private boolean field_8920;
   // $FF: renamed from: i java.lang.String[]
   private static final String[] field_8921;


   // $FF: renamed from: <init> (net.minecraft.server.MinecraftServer, java.io.File) void
   public void method_9405(MinecraftServer var1, File var2) {
      super.method_9396();
      this.field_8918 = Sets.newHashSet();
      this.field_8919 = -300;
      this.field_8920 = false;
      this.field_8916 = var1;
      this.field_8917 = var2;
   }

   // $FF: renamed from: b () void
   public void method_9406() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: c () void
   public void method_9407() {
      try {
         FileUtils.writeStringToFile(this.field_8917, method_9410(this.field_8914));
      } catch (IOException var2) {
         String[] var10001 = field_8921;
         field_8915.error("Couldn\'t save stats", var2);
      }

   }

   // $FF: renamed from: b (yz, u2, int) void
   public void method_9401(class_792 param1, class_1601 param2, int param3) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: d () java.util.Set
   public Set method_9408() {
      HashSet var1 = Sets.newHashSet(this.field_8918);
      this.field_8918.clear();
      this.field_8920 = false;
      return var1;
   }

   // $FF: renamed from: b (java.lang.String) java.util.Map
   public Map method_9409(String param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (java.util.Map) java.lang.String
   public static String method_9410(Map param0) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: e () void
   public void method_9411() {
      String[] var10000 = class_752.method_4253();
      Iterator var2 = this.field_8914.keySet().iterator();
      String[] var1 = var10000;

      while(var2.hasNext()) {
         class_1601 var3 = (class_1601)var2.next();
         this.field_8918.add(var3);
         if(var1 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: b (xi) void
   public void method_9412(class_793 param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: c (xi) void
   public void method_9413(class_793 param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: f () boolean
   public boolean method_9414() {
      return this.field_8920;
   }

   // $FF: renamed from: <clinit> () void
   static void method_9415() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (java.lang.Throwable) java.lang.Throwable
   private static Throwable method_9416(Throwable var0) {
      return var0;
   }
}
