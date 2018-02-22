package ca.diiza.l;

import ca.diiza.l.class_13;
import ca.diiza.l.class_153;
import ca.diiza.l.class_155;
import ca.diiza.l.class_156;
import ca.diiza.l.class_206;
import ca.diiza.l.class_860;
import ca.diiza.l.class_862;
import ca.diiza.l.n;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;

// $FF: renamed from: ca.diiza.l.g
public class class_205 extends bdw implements class_13 {

   // $FF: renamed from: b int
   protected static final int field_937 = 64;
   // $FF: renamed from: i int
   protected static final int field_938 = 160;
   // $FF: renamed from: r int
   protected static final int field_939 = 9;
   // $FF: renamed from: s ca.diiza.l.l
   private class_860 field_940;
   // $FF: renamed from: t java.util.List
   private List<n> field_941;
   // $FF: renamed from: u ca.diiza.l.e[]
   private class_153[] field_942;
   // $FF: renamed from: v ca.diiza.l.b
   private class_156 field_943;
   // $FF: renamed from: w ca.diiza.l.c
   private class_155 field_944;
   // $FF: renamed from: x ca.diiza.l.c
   private class_155 field_945;
   // $FF: renamed from: y ca.diiza.l.c
   private class_155 field_946;
   // $FF: renamed from: z ca.diiza.l.c
   private class_155 field_947;
   // $FF: renamed from: A ca.diiza.l.c
   private class_155 field_948;
   // $FF: renamed from: B ca.diiza.l.c
   private class_155 field_949;
   // $FF: renamed from: C ca.diiza.l.c
   private class_155 field_950;
   // $FF: renamed from: D java.util.concurrent.ConcurrentHashMap
   private ConcurrentHashMap<n, Object> field_951;
   // $FF: renamed from: E int
   private int field_952;
   // $FF: renamed from: F boolean
   private boolean field_953;
   // $FF: renamed from: G int
   private int field_954;
   // $FF: renamed from: H bdw
   private bdw field_955;
   // $FF: renamed from: I java.lang.String[]
   private static final String[] field_956;


   // $FF: renamed from: <init> (bdw) void
   public void method_1118(bdw var1) {
      int var10000 = class_862.method_5031();
      super.method_651();
      this.field_940 = class_860.field_3998;
      this.field_941 = this.field_940.method_4980();
      this.field_942 = new class_153[9];
      class_156 var10002 = new class_156;
      var10002.method_809(0, 0, 0, 12, 90);
      this.field_943 = var10002;
      this.field_951 = new ConcurrentHashMap();
      int var2 = var10000;
      this.field_955 = var1;
      int var3 = 0;

      while(var3 < 9) {
         class_153[] var4 = this.field_942;
         class_153 var5 = new class_153;
         var5.method_785(var3, this);
         var4[var3] = var5;
         ++var3;
         if(var2 != 0) {
            break;
         }
      }

   }

   // $FF: renamed from: b () void
   public void initGui() {
      this.buttonList.clear();
      int var10000 = class_862.method_5030();
      Keyboard.enableRepeatEvents(true);
      class_153[] var2 = this.field_942;
      int var3 = var2.length;
      int var4 = 0;
      int var1 = var10000;

      while(true) {
         if(var4 < var3) {
            class_153 var5 = var2[var4];
            this.buttonList.add(var5);
            ++var4;
            if(var1 == 0) {
               break;
            }

            if(var1 != 0) {
               continue;
            }
         }

         this.buttonList.add(this.field_943);
         this.method_1125();
         var4 = this.width / 2;
         break;
      }

      int var7 = this.height + 90 >> 1;
      class_155 var10001 = new class_155;
      int var10004 = var4 - 65;
      int var10005 = var7 + 7;
      String[] var6;
      String var10008;
      if(this.field_955 == null) {
         var6 = field_956;
         var10008 = "Fermer";
      } else {
         var6 = field_956;
         var10008 = "Retour";
      }

      var10001.method_748(0, var10004, var10005, 40, 14, var10008);
      this.field_944 = var10001;
      this.buttonList.add(this.field_944);
      var10001 = new class_155;
      var10004 = var4 - 20;
      var10005 = var7 + 7;
      var6 = field_956;
      var10001.method_748(0, var10004, var10005, 40, 14, "Ajouter");
      this.field_945 = var10001;
      this.buttonList.add(this.field_945);
      var10001 = new class_155;
      var10001.method_748(0, var4 + 25, var7 + 7, 40, 14, "Supprimer");
      this.field_946 = var10001;
      this.buttonList.add(this.field_946);
      var10001 = new class_155;
      var10001.method_748(0, var4 - 65, var7 + 7, 60, 14, "Supprimer");
      this.field_947 = var10001;
      this.buttonList.add(this.field_947);
      var10001 = new class_155;
      var10001.method_748(0, var4 + 5, var7 + 7, 60, 14, "Annuler");
      this.field_948 = var10001;
      this.buttonList.add(this.field_948);
      var10001 = new class_155;
      var10001.method_748(0, 0, 0, 14, 14, "<");
      this.field_949 = var10001;
      this.buttonList.add(this.field_949);
      var10001 = new class_155;
      var10001.method_748(0, 0, 0, 14, 14, ">");
      this.field_950 = var10001;
      this.buttonList.add(this.field_950);
      this.method_1119(this.field_953);
   }

   // $FF: renamed from: m () void
   public void method_872() {
      Keyboard.enableRepeatEvents(false);
   }

   // $FF: renamed from: a (int, int, float) void
   public void drawScreen(int var1, int var2, float var3) {
      int var4 = class_862.method_5030();
      boolean var10002 = this.field_953;
      if(var4 != 0) {
         var10002 = !this.field_953;
      }

      this.field_944.field_451 = this.field_944.field_452 = var10002;
      var10002 = this.field_953;
      if(var4 != 0) {
         var10002 = !this.field_953;
      }

      this.field_945.field_451 = this.field_945.field_452 = var10002;
      var10002 = this.field_953;
      if(var4 != 0) {
         var10002 = !this.field_953;
      }

      this.field_946.field_451 = this.field_946.field_452 = var10002;
      this.field_947.field_451 = this.field_947.field_452 = this.field_953;
      this.field_948.field_451 = this.field_948.field_452 = this.field_953;
      class_155 var10000 = this.field_945;
      int var10001 = this.field_940.method_4992();
      if(var4 != 0) {
         var10001 = var10001 == this.field_940.method_4991()?1:0;
      }

      var10000.field_451 = (boolean)var10001;
      int var5 = Math.min(160, this.field_954) + 16;
      int var6 = this.height - 90 >> 1;
      int var7 = this.height + 90 >> 1;
      int var8 = this.width - var5 - 45 - 10 >> 1;
      int var9 = this.width + var5 + 45 + 10 >> 1;
      drawRect(var8 - 2, var6 - 2, var9 + 2, var7 + 2, -1610612736);
      String[] var14 = field_956;
      String var10 = String.format("Waypoints [%s]", new Object[]{class_860.field_3998.method_4990(class_860.field_3998.method_4991())});
      int var11 = this.fontRendererObj.getCharWidth(var10);
      int var12 = this.width - var11 >> 1;
      int var13 = this.width + var11 >> 1;
      this.field_949.field_447 = var12 - 18;
      this.field_949.field_448 = var6 - 22;
      this.field_950.field_447 = var13 + 4;
      this.field_950.field_448 = var6 - 22;
      drawRect(var12 - 2, var6 - 22, var13 + 2, var6 - 8, -1610612736);
      this.drawCenteredString(this.fontRendererObj, var10, this.width / 2, var6 - 19, -1);
      super.drawScreen(var1, var2, var3);
      if(class_689.method_3977() == 0) {
         ++var4;
         class_862.method_5029(var4);
      }

   }

   // $FF: renamed from: e () void
   public void method_871() {
      int var10000 = class_862.method_5031();
      int var2 = (int)this.field_943.method_815();
      int var1 = var10000;
      class_205 var3 = this;
      if(var1 == 0) {
         if(this.field_952 == var2) {
            return;
         }

         this.field_952 = var2;
         var3 = this;
      }

      var3.method_1127();
   }

   // $FF: renamed from: a (char, int) void
   protected void method_856(char var1, int var2) {
      int var3 = class_862.method_5030();
      class_205 var10000 = this;
      if(var3 != 0) {
         super.method_856(var1, var2);
         switch(var2) {
         case 199:
            this.field_943.method_814(this.field_943.method_819());
            if(var3 != 0) {
               return;
            }
         case 200:
            this.field_943.method_823();
            if(var3 != 0) {
               return;
            }
         case 201:
            this.field_943.method_825();
         case 202:
         case 203:
         case 204:
         case 205:
         case 206:
         default:
            if(var3 != 0) {
               return;
            }
         case 207:
            this.field_943.method_814(this.field_943.method_817());
            if(var3 != 0) {
               return;
            }
         case 208:
            this.field_943.method_822();
            if(var3 != 0) {
               return;
            }
         case 209:
            var10000 = this;
         }
      }

      var10000.field_943.method_824();
   }

   // $FF: renamed from: k () void
   public void method_869() {
      int var10000 = class_862.method_5031();
      super.method_869();
      int var1 = var10000;
      int var2 = Mouse.getDWheel();
      var10000 = var2;
      if(var1 == 0) {
         if(var2 == 0) {
            return;
         }

         var10000 = var2;
      }

      if(var1 == 0) {
         var10000 = var10000 < 0?3:-3;
      }

      var2 = var10000;
      this.field_943.method_814(this.field_943.method_815() + (float)var2);
   }

   // $FF: renamed from: a (bcb) void
   protected void method_865(bcb var1) {
      int var2 = class_862.method_5030();
      bcb var10000 = var1;
      class_155 var10001 = this.field_944;
      if(var2 != 0) {
         if(var1 == this.field_944) {
            this.field_557.method_5236(this.field_955);
         }

         var10000 = var1;
         var10001 = this.field_946;
      }

      if(var2 != 0) {
         if(var10000 == var10001) {
            this.method_1119(true);
         }

         var10000 = var1;
         var10001 = this.field_948;
      }

      if(var2 != 0) {
         if(var10000 == var10001) {
            this.method_1119(false);
         }

         var10000 = var1;
         var10001 = this.field_947;
      }

      if(var2 != 0) {
         if(var10000 == var10001) {
            boolean var3 = false;
            Iterator var5 = this.field_951.keySet().iterator();

            while(true) {
               if(var5.hasNext()) {
                  class_862 var4 = (class_862)var5.next();
                  var3 |= this.field_941.remove(var4);
                  if(var2 == 0) {
                     break;
                  }

                  if(var2 != 0) {
                     continue;
                  }
               }

               if(var3) {
                  this.field_940.method_4981();
                  this.method_1125();
               }
               break;
            }

            this.method_1119(false);
         }

         var10000 = var1;
         var10001 = this.field_945;
      }

      if(var2 != 0) {
         if(var10000 == var10001) {
            label59: {
               class_205 var6 = this;
               if(var2 != 0) {
                  if(this.field_940.method_4992() != this.field_940.method_4991()) {
                     break label59;
                  }

                  var6 = this;
               }

               bao var7 = var6.field_557;
               class_206 var8 = new class_206;
               var8.method_1131(this, (class_862)null);
               var7.method_5236(var8);
            }
         }

         var10000 = var1;
         var10001 = this.field_949;
      }

      if(var2 != 0) {
         if(var10000 == var10001) {
            this.method_1119(false);
            this.field_940.method_4995();
            this.field_941 = this.field_940.method_4980();
            this.method_1125();
         }

         var10000 = var1;
         var10001 = this.field_950;
      }

      if(var10000 == var10001) {
         this.method_1119(false);
         this.field_940.method_4996();
         this.field_941 = this.field_940.method_4980();
         this.method_1125();
      }

   }

   // $FF: renamed from: a (boolean) void
   protected void method_1119(boolean var1) {
      this.field_953 = var1;
      this.field_951.clear();
   }

   // $FF: renamed from: a () boolean
   protected boolean method_1120() {
      return this.field_953;
   }

   // $FF: renamed from: a (ca.diiza.l.n) boolean
   protected boolean method_1121(class_862 var1) {
      return this.field_951.containsKey(var1);
   }

   // $FF: renamed from: b (ca.diiza.l.n) void
   protected void method_1122(class_862 var1) {
      int var2 = class_862.method_5030();
      boolean var10000 = this.field_941.contains(var1);
      if(var2 != 0) {
         if(var10000) {
            return;
         }

         this.field_941.add(var1);
      }

      this.field_940.method_4981();
      this.method_1125();
      this.field_943.method_814(this.field_943.method_817());
   }

   // $FF: renamed from: c (ca.diiza.l.n) void
   protected void method_1123(class_862 var1) {
      class_205 var4;
      label33: {
         int var2 = class_862.method_5031();
         boolean var10000 = this.field_953;
         if(var2 == 0) {
            if(this.field_953) {
               Object var3 = this.field_951.remove(var1);
               if(var2 == 0) {
                  if(var3 != null) {
                     return;
                  }

                  this.field_951.put(var1, var1);
               }

               if(var2 == 0) {
                  return;
               }
            }

            var4 = this;
            if(var2 != 0) {
               break label33;
            }

            var10000 = this.field_941.remove(var1);
         }

         if(!var10000) {
            return;
         }

         this.field_940.method_4981();
         var4 = this;
      }

      var4.method_1125();
   }

   // $FF: renamed from: d (ca.diiza.l.n) void
   protected void method_1124(class_862 var1) {
      int var2 = class_862.method_5031();
      class_205 var10000 = this;
      if(var2 == 0) {
         if(!this.field_941.contains(var1)) {
            return;
         }

         this.field_940.method_4981();
         var10000 = this;
      }

      var10000.method_1125();
   }

   // $FF: renamed from: f () void
   private void method_1125() {
      int var10000 = class_862.method_5030();
      this.field_954 = 64;
      int var1 = var10000;
      int var2 = 0;
      int var3 = this.field_941.size();

      while(true) {
         if(var2 < var3) {
            class_862 var4 = (class_862)this.field_941.get(var2);
            int var10001 = this.field_954;
            FontRenderer var10002 = this.fontRendererObj;
            StringBuilder var10003 = (new StringBuilder()).append(var2 + 1);
            String[] var10004 = field_956;
            this.field_954 = Math.max(var10001, var10002.getCharWidth(var10003.append(") ").append(var4.field_4144).toString()));
            ++var2;
            if(var1 == 0) {
               break;
            }

            if(var1 != 0) {
               continue;
            }
         }

         this.field_943.method_818(0.0F);
         this.field_943.method_816((float)this.field_941.size());
         this.field_943.method_820((float)Math.min(9, this.field_941.size()));
         this.field_952 = (int)this.field_943.method_815();
         this.method_1126();
         this.method_1127();
         break;
      }

   }

   // $FF: renamed from: g () void
   private void method_1126() {
      int var2 = Math.min(160, this.field_954) + 16;
      int var10000 = class_862.method_5030();
      int var3 = this.height - 90 - 4 >> 1;
      int var1 = var10000;
      int var4 = this.width - var2 - 45 - 12 >> 1;
      int var5 = this.width + var2 + 45 + 12 >> 1;
      int var6 = 0;

      while(true) {
         if(var6 < 9) {
            this.field_942[var6].method_787(var4 + 2, var3 + 2 + 10 * var6, var2 + 45, 9);
            ++var6;
            if(var1 == 0) {
               break;
            }

            if(var1 != 0) {
               continue;
            }
         }

         this.field_943.field_447 = var5 - 12;
         this.field_943.field_448 = var3 + 2;
         break;
      }

   }

   // $FF: renamed from: h () void
   private void method_1127() {
      int var10000 = class_862.method_5030();
      int var2 = 0;
      int var1 = var10000;

      while(var2 < 9) {
         int var3 = var2 + this.field_952;
         this.field_942[var2].method_786(var3 + 1, var3 < this.field_941.size()?(class_862)this.field_941.get(var3):null);
         ++var2;
         if(var1 == 0) {
            break;
         }
      }

   }

   // $FF: renamed from: i () bao
   protected bao method_1128() {
      return this.field_557;
   }

   // $FF: renamed from: <clinit> () void
   static void method_1129() {
      // $FF: Couldn't be decompiled
   }
}
