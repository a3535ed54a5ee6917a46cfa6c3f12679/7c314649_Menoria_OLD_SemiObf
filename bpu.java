import java.awt.image.BufferedImage;
import java.io.InputStream;
import javax.imageio.ImageIO;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class bpu extends bpp {

   // $FF: renamed from: c org.apache.logging.log4j.Logger
   private static final Logger field_7771;
   // $FF: renamed from: b bqx
   protected final bqx field_7772;
   // $FF: renamed from: h java.lang.String[]
   private static final String[] field_7773;


   // $FF: renamed from: <init> (bqx) void
   public void method_7967(bqx var1) {
      super.method_7950();
      this.field_7772 = var1;
   }

   // $FF: renamed from: a (bqy) void
   public void method_221(bqy var1) {
      this.method_7951();
      String[] var10000 = class_752.method_4253();
      InputStream var3 = null;
      String[] var2 = var10000;
      boolean var16 = false;

      InputStream var25;
      try {
         var16 = true;
         bqw var4 = var1.method_224(this.field_7772);
         var3 = var4.method_234();
         BufferedImage var5 = ImageIO.read(var3);
         boolean var6 = false;
         boolean var7 = false;

         label145: {
            label144: {
               try {
                  boolean var22 = var4.method_235();
                  if(var2 == null) {
                     break label145;
                  }

                  if(!var22) {
                     break label144;
                  }
               } catch (RuntimeException var20) {
                  throw method_7969(var20);
               }

               try {
                  label153: {
                     String[] var10 = field_7773;
                     class_1422 var8 = (class_1422)var4.method_236("texture");

                     class_1422 var24;
                     label134: {
                        try {
                           var24 = var8;
                           if(var2 == null) {
                              break label134;
                           }

                           if(var8 == null) {
                              break label153;
                           }
                        } catch (RuntimeException var18) {
                           throw method_7969(var18);
                        }

                        var6 = var8.method_7764();
                        var24 = var8;
                     }

                     var7 = var24.method_7765();
                  }
               } catch (RuntimeException var19) {
                  Logger var23 = field_7771;
                  StringBuilder var10001 = new StringBuilder();
                  String[] var10002 = field_7773;
                  var23.warn(var10001.append("Failed reading metadata of: ").append(this.field_7772).toString(), var19);
               }
            }

            bqi.method_8152(this.method_222(), var5, var6, var7);
         }

         var16 = false;
      } finally {
         if(var16) {
            label119: {
               label118: {
                  try {
                     var25 = var3;
                     if(var2 == null) {
                        break label118;
                     }

                     if(var3 == null) {
                        break label119;
                     }
                  } catch (RuntimeException var17) {
                     throw method_7969(var17);
                  }

                  var25 = var3;
               }

               var25.close();
            }

         }
      }

      var25 = var3;
      if(var2 != null) {
         if(var3 == null) {
            return;
         }

         var25 = var3;
      }

      var25.close();
   }

   // $FF: renamed from: <clinit> () void
   static void method_7968() {
      String[] var5 = new String[2];
      int var3 = 0;
      String var2 = "\\ª»Fÿn®ª^ïÏZª¢Vã\b¢¦Fë\\®ã]ìÓÏ";
      int var4 = "\\ª»Fÿn®ª^ïÏZª¢Vã\b¢¦Fë\\®ã]ìÓÏ".length();
      char var1 = 7;
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
                  field_7773 = var5;
                  field_7771 = LogManager.getLogger();
                  return;
               }

               var1 = var2.charAt(var0);
               break;
            }

            char var10007 = (char)((Object[])var9)[var6];
            short var10009;
            switch(var6 % 7) {
            case 0:
               var10009 = 194;
               break;
            case 1:
               var10009 = 37;
               break;
            case 2:
               var10009 = 41;
               break;
            case 3:
               var10009 = 216;
               break;
            case 4:
               var10009 = 96;
               break;
            case 5:
               var10009 = 3;
               break;
            default:
               var10009 = 5;
            }

            ((Object[])var9)[var6] = (char)(var10007 ^ var10 ^ var10009);
            ++var6;
         }
      }
   }

   // $FF: renamed from: b (java.lang.RuntimeException) java.lang.RuntimeException
   private static RuntimeException method_7969(RuntimeException var0) {
      return var0;
   }
}
