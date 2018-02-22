import java.net.URI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.Logger;
import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;

// $FF: renamed from: ld
public class class_185 extends bdw implements class_35 {

   // $FF: renamed from: b java.util.Set
   private static final Set field_724;
   // $FF: renamed from: i org.apache.logging.log4j.Logger
   private static final Logger field_725;
   // $FF: renamed from: r java.lang.String
   private String field_726;
   // $FF: renamed from: s int
   private int field_727;
   // $FF: renamed from: t boolean
   private boolean field_728;
   // $FF: renamed from: u boolean
   private boolean field_729;
   // $FF: renamed from: v int
   private int field_730;
   // $FF: renamed from: w java.util.List
   private List field_731;
   // $FF: renamed from: x java.net.URI
   private URI field_732;
   // $FF: renamed from: y k_
   protected GuiTextField field_733;
   // $FF: renamed from: z java.lang.String
   private String field_734;
   // $FF: renamed from: A java.lang.String
   private static final String field_735;
   // $FF: renamed from: B java.lang.String[]
   private static final String[] field_736;


   // $FF: renamed from: <init> () void
   public void method_651() {
      super.method_651();
      this.field_726 = "";
      this.field_727 = -1;
      this.field_731 = new ArrayList();
      this.field_734 = "";
   }

   // $FF: renamed from: <init> (java.lang.String) void
   public void method_976(String var1) {
      super.method_651();
      this.field_726 = "";
      this.field_727 = -1;
      this.field_731 = new ArrayList();
      this.field_734 = "";
      this.field_734 = var1;
   }

   // $FF: renamed from: b () void
   public void initGui() {
      Keyboard.enableRepeatEvents(true);
      this.field_727 = this.field_557.canLoseFocus4.method_707().method_680().size();
      GuiTextField var10001 = new GuiTextField;
      var10001.GuiTextField(this.fontRendererObj, 4, this.height - 12, this.width - 4, 12);
      this.field_733 = var10001;
      this.field_733.setMaxStringLength(100);
      this.field_733.setEnableBackgroundDrawing(false);
      this.field_733.setFocused(true);
      this.field_733.writeText(this.field_734);
      this.field_733.setCanLoseFocus(false);
   }

   // $FF: renamed from: m () void
   public void method_872() {
      Keyboard.enableRepeatEvents(false);
      this.field_557.canLoseFocus4.method_707().method_682();
   }

   // $FF: renamed from: e () void
   public void method_871() {
      this.field_733.method_712();
   }

   // $FF: renamed from: a (char, int) void
   protected void method_856(char var1, int var2) {
      String[] var3;
      label89: {
         var3 = class_752.method_4253();
         class_185 var10000 = this;
         boolean var10001 = false;
         if(var3 != null) {
            this.field_729 = false;
            if(var2 == 15) {
               this.method_979();
               if(var3 != null) {
                  break label89;
               }
            }

            var10000 = this;
            var10001 = false;
         }

         var10000.field_728 = var10001;
      }

      int var5 = var2;
      short var6 = 1;
      if(var3 != null) {
         if(var2 == 1) {
            this.field_557.method_5236((bdw)null);
            if(var3 != null) {
               return;
            }
         }

         var5 = var2;
         var6 = 28;
      }

      label93: {
         if(var3 != null) {
            if(var5 == var6) {
               break label93;
            }

            var5 = var2;
            var6 = 156;
         }

         if(var3 != null) {
            if(var5 == var6) {
               break label93;
            }

            var5 = var2;
            var6 = 200;
         }

         if(var3 != null) {
            if(var5 == var6) {
               this.method_981(-1);
               if(var3 != null) {
                  return;
               }
            }

            var5 = var2;
            var6 = 208;
         }

         if(var3 != null) {
            if(var5 == var6) {
               this.method_981(1);
               if(var3 != null) {
                  return;
               }
            }

            var5 = var2;
            var6 = 201;
         }

         label94: {
            if(var3 != null) {
               if(var5 == var6) {
                  this.field_557.canLoseFocus4.method_707().method_683(this.field_557.canLoseFocus4.method_707().method_692() - 1);
                  if(var3 != null) {
                     return;
                  }
               }

               var5 = var2;
               if(var3 == null) {
                  break label94;
               }

               var6 = 209;
            }

            if(var5 == var6) {
               this.field_557.canLoseFocus4.method_707().method_683(-this.field_557.canLoseFocus4.method_707().method_692() + 1);
               if(var3 != null) {
                  return;
               }
            }

            this.field_733.method_726(var1, var2);
         }

         if(var3 != null) {
            return;
         }
      }

      String var4 = this.field_733.method_714().trim();
      if(var4.length() > 0) {
         this.method_977(var4);
      }

      this.field_557.method_5236((bdw)null);
   }

   // $FF: renamed from: b (java.lang.String) void
   public void method_977(String var1) {
      this.field_557.canLoseFocus4.method_707().method_681(var1);
      this.field_557.cursorCounter8.method_4676(var1);
   }

   // $FF: renamed from: k () void
   public void method_869() {
      super.method_869();
      String[] var10000 = class_752.method_4253();
      int var2 = Mouse.getEventDWheel();
      String[] var1 = var10000;
      int var3 = var2;
      if(var1 != null) {
         if(var2 == 0) {
            return;
         }

         var3 = var2;
      }

      label44: {
         byte var10001 = 1;
         if(var1 != null) {
            if(var3 > 1) {
               var2 = 1;
            }

            var3 = var2;
            if(var1 == null) {
               break label44;
            }

            var10001 = -1;
         }

         if(var3 < var10001) {
            var2 = -1;
         }

         var3 = method_878();
      }

      label28: {
         if(var1 != null) {
            if(var3 != 0) {
               break label28;
            }

            var3 = var2 * 7;
         }

         var2 = var3;
      }

      this.field_557.canLoseFocus4.method_707().method_683(var2);
   }

   // $FF: renamed from: a (int, int, int) void
   protected void method_862(int param1, int param2, int param3) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: a (boolean, int) void
   public void method_160(boolean var1, int var2) {
      String[] var3 = class_752.method_4253();
      int var10000 = var2;
      if(var3 != null) {
         if(var2 != 0) {
            return;
         }

         var10000 = var1;
      }

      if(var10000 != 0) {
         this.method_978(this.field_732);
      }

      this.field_732 = null;
      this.field_557.method_5236(this);
   }

   // $FF: renamed from: b (java.net.URI) void
   private void method_978(URI var1) {
      try {
         String[] var4 = field_736;
         Class var2 = Class.forName("java.awt.Desktop");
         Object var3 = var2.getMethod("getDesktop", new Class[0]).invoke((Object)null, new Object[0]);
         var2.getMethod("browse", new Class[]{URI.class}).invoke(var3, new Object[]{var1});
      } catch (Throwable var5) {
         String[] var10001 = field_736;
         field_725.error("Couldn\'t open link", var5);
      }

   }

   // $FF: renamed from: f () void
   public void method_979() {
      class_185 var7;
      label68: {
         String[] var1;
         String var2;
         int var10000;
         int var10001;
         label69: {
            label70: {
               var1 = class_752.method_4253();
               var10000 = this.field_728;
               if(var1 != null) {
                  if(this.field_728) {
                     this.field_733.method_718(this.field_733.method_721(-1, this.field_733.getCursorPosition(), false) - this.field_733.getCursorPosition());
                     var10000 = this.field_730;
                     var10001 = this.field_731.size();
                     if(var1 == null) {
                        break label69;
                     }

                     if(var10000 < var10001) {
                        break label70;
                     }

                     this.field_730 = 0;
                     if(var1 != null) {
                        break label70;
                     }
                  }

                  var10000 = this.field_733.method_721(-1, this.field_733.getCursorPosition(), false);
               }

               int var3 = var10000;
               this.field_731.clear();
               this.field_730 = 0;
               String var4 = this.field_733.method_714().substring(var3).toLowerCase();
               var2 = this.field_733.method_714().substring(0, this.field_733.getCursorPosition());
               this.method_980(var2, var4);
               var7 = this;
               if(var1 != null) {
                  if(this.field_731.isEmpty()) {
                     return;
                  }

                  this.field_728 = true;
                  var7 = this;
               }

               var7.field_733.method_718(var3 - this.field_733.getCursorPosition());
            }

            var7 = this;
            if(var1 == null) {
               break label68;
            }

            var10000 = this.field_731.size();
            var10001 = 1;
         }

         if(var10000 > var10001) {
            StringBuilder var5 = new StringBuilder();
            Iterator var6 = this.field_731.iterator();

            while(var6.hasNext()) {
               var2 = (String)var6.next();
               if(var1 == null) {
                  return;
               }

               if(var1 != null) {
                  if(var5.length() > 0) {
                     String[] var8 = field_736;
                     var5.append(", ");
                  }

                  var5.append(var2);
               }

               if(var1 == null) {
                  break;
               }
            }

            bcc var10 = this.field_557.canLoseFocus4.method_707();
            class_1082 var9 = new class_1082;
            var9.method_6134(var5.toString());
            var10.method_676(var9, 1);
         }

         var7 = this;
      }

      var7.field_733.method_716((String)this.field_731.get(this.field_730++));
   }

   // $FF: renamed from: b (java.lang.String, java.lang.String) void
   private void method_980(String var1, String var2) {
      String[] var3 = class_752.method_4253();
      if(var3 != null) {
         if(var1.length() < 1) {
            return;
         }

         class_1436 var10000 = this.field_557.cursorCounter8.field_3707;
         class_332 var10001 = new class_332;
         var10001.method_1885(var1);
         var10000.method_7821(var10001);
      }

      this.field_729 = true;
   }

   // $FF: renamed from: a (int) void
   public void method_981(int var1) {
      int var3 = this.field_727 + var1;
      int var4 = this.field_557.canLoseFocus4.method_707().method_680().size();
      String[] var2 = class_752.method_4253();
      int var10000 = var3;
      if(var2 != null) {
         if(var3 < 0) {
            var3 = 0;
         }

         var10000 = var3;
      }

      int var10001 = var4;
      if(var2 != null) {
         if(var10000 > var4) {
            var3 = var4;
         }

         var10000 = var3;
         var10001 = this.field_727;
      }

      if(var2 != null) {
         if(var10000 == var10001) {
            return;
         }

         var10000 = var3;
         var10001 = var4;
      }

      class_185 var5;
      label53: {
         if(var2 != null) {
            if(var10000 == var10001) {
               this.field_727 = var4;
               this.field_733.writeText(this.field_726);
               if(var2 != null) {
                  return;
               }
            }

            var5 = this;
            if(var2 == null) {
               break label53;
            }

            var10000 = this.field_727;
            var10001 = var4;
         }

         if(var10000 == var10001) {
            this.field_726 = this.field_733.method_714();
         }

         this.field_733.writeText((String)this.field_557.canLoseFocus4.method_707().method_680().get(var3));
         var5 = this;
      }

      var5.field_727 = var3;
   }

   // $FF: renamed from: a (int, int, float) void
   public void drawScreen(int param1, int param2, float param3) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (java.lang.String[]) void
   public void method_982(String[] var1) {
      String[] var2 = class_752.method_4253();
      class_185 var10000 = this;
      if(var2 != null) {
         if(!this.field_729) {
            return;
         }

         this.field_728 = false;
         var10000 = this;
      }

      var10000.field_731.clear();
      String[] var3 = var1;
      int var4 = var1.length;
      int var5 = 0;

      String var6;
      String var8;
      while(true) {
         if(var5 < var4) {
            var6 = var3[var5];
            if(var2 != null) {
               var8 = var6;
               if(var2 == null) {
                  break;
               }

               if(var6.length() > 0) {
                  this.field_731.add(var6);
               }

               ++var5;
            }

            if(var2 != null) {
               continue;
            }
         }

         var8 = this.field_733.method_714().substring(this.field_733.method_721(-1, this.field_733.getCursorPosition(), false));
         break;
      }

      label64: {
         String var7 = var8;
         var6 = StringUtils.getCommonPrefix(var1);
         int var9 = var6.length();
         if(var2 != null) {
            label65: {
               if(var9 > 0) {
                  var9 = var7.equalsIgnoreCase(var6);
                  if(var2 == null) {
                     break label65;
                  }

                  if(var9 == 0) {
                     this.field_733.method_718(this.field_733.method_721(-1, this.field_733.getCursorPosition(), false) - this.field_733.getCursorPosition());
                     this.field_733.method_716(var6);
                     if(var2 != null) {
                        return;
                     }
                  }
               }

               var10000 = this;
               if(var2 == null) {
                  break label64;
               }

               var9 = this.field_731.size();
            }
         }

         if(var9 <= 0) {
            return;
         }

         this.field_728 = true;
         var10000 = this;
      }

      var10000.method_979();
   }

   // $FF: renamed from: d () boolean
   public boolean method_876() {
      return false;
   }

   // $FF: renamed from: <clinit> () void
   static void method_983() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: c (java.lang.Exception) java.lang.Exception
   private static Exception method_984(Exception var0) {
      return var0;
   }
}
