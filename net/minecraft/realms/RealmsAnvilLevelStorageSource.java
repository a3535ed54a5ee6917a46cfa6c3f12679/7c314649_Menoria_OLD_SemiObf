package net.minecraft.realms;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import net.minecraft.realms.RealmsLevelSummary;
import net.minecraft.realms.RealmsScreen;

public class RealmsAnvilLevelStorageSource {

   private class_30 levelStorageSource;


   // $FF: renamed from: <init> (j_) void
   public void method_10048(class_30 var1) {
      super();
      this.levelStorageSource = var1;
   }

   public String getName() {
      return this.levelStorageSource.method_135();
   }

   public boolean levelExists(String var1) {
      return this.levelStorageSource.method_146(var1);
   }

   public boolean convertLevel(String var1, class_81 var2) {
      return this.levelStorageSource.method_145(var1, var2);
   }

   public boolean requiresConversion(String var1) {
      return this.levelStorageSource.method_144(var1);
   }

   public boolean isNewLevelIdAcceptable(String var1) {
      return this.levelStorageSource.method_140(var1);
   }

   public boolean deleteLevel(String var1) {
      return this.levelStorageSource.method_141(var1);
   }

   public boolean isConvertible(String var1) {
      return this.levelStorageSource.method_143(var1);
   }

   public void renameLevel(String var1, String var2) {
      this.levelStorageSource.method_142(var1, var2);
   }

   public void clearAll() {
      this.levelStorageSource.method_138();
   }

   public List getLevelList() {
      ArrayList var2 = new ArrayList();
      boolean var1 = RealmsScreen.method_3793();
      Iterator var3 = this.levelStorageSource.method_137().iterator();

      ArrayList var10000;
      while(true) {
         if(var3.hasNext()) {
            class_1339 var4 = (class_1339)var3.next();
            var10000 = var2;
            if(!var1) {
               break;
            }

            RealmsLevelSummary var10001 = new RealmsLevelSummary;
            var10001.method_6818(var4);
            var2.add(var10001);
            if(var1) {
               continue;
            }
         }

         var10000 = var2;
         break;
      }

      return var10000;
   }
}
