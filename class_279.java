import java.util.zip.DataFormatException;
import java.util.zip.Deflater;

// $FF: renamed from: sx
public class class_279 extends class_250 {

   // $FF: renamed from: c int
   private int field_1484;
   // $FF: renamed from: d int
   private int field_1485;
   // $FF: renamed from: e int
   private int field_1486;
   // $FF: renamed from: f int
   private int field_1487;
   // $FF: renamed from: g byte[]
   private byte[] field_1488;
   // $FF: renamed from: h byte[]
   private byte[] field_1489;
   // $FF: renamed from: i boolean
   private boolean field_1490;
   // $FF: renamed from: j int
   private int field_1491;
   // $FF: renamed from: k byte[]
   private static byte[] field_1492;
   // $FF: renamed from: l java.lang.String[]
   private static final String[] field_1493;


   // $FF: renamed from: <init> () void
   public void method_1449() {
      super.method_1449();
   }

   // $FF: renamed from: <init> (gI, boolean, int) void
   public void method_1607(class_1069 var1, boolean var2, int var3) {
      super.method_1449();
      this.field_1484 = var1.fontRendererObj1;
      this.field_1485 = var1.fontRendererObj2;
      this.field_1490 = var2;
      class_1595 var4 = method_1611(var1, var2, var3);
      Deflater var5 = new Deflater(-1);
      this.field_1487 = var4.field_8311;
      this.field_1486 = var4.field_8310;

      try {
         this.field_1489 = var4.field_8309;
         var5.setInput(var4.field_8309, 0, var4.field_8309.length);
         var5.finish();
         this.field_1488 = new byte[var4.field_8309.length];
         this.field_1491 = var5.deflate(this.field_1488);
      } finally {
         var5.end();
      }

   }

   // $FF: renamed from: a () int
   public static int method_1608() {
      return 196864;
   }

   // $FF: renamed from: b (d) void
   public void method_1453(class_112 param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: c (d) void
   public void method_1454(class_112 var1) {
      var1.writeInt(this.field_1484);
      var1.writeInt(this.field_1485);
      var1.writeBoolean(this.field_1490);
      var1.writeShort((short)(this.field_1486 & '\uffff'));
      var1.writeShort((short)(this.field_1487 & '\uffff'));
      var1.writeInt(this.field_1491);
      var1.writeBytes(this.field_1488, 0, this.field_1491);
   }

   // $FF: renamed from: b (tF) void
   public void method_1609(class_64 var1) {
      var1.getBlock3(this);
   }

   // $FF: renamed from: c () java.lang.String
   public String method_1457() {
      String[] var10000 = field_1493;
      return String.format("x=%d, z=%d, full=%b, sects=%d, add=%d, size=%d", new Object[]{Integer.valueOf(this.field_1484), Integer.valueOf(this.field_1485), Boolean.valueOf(this.field_1490), Integer.valueOf(this.field_1486), Integer.valueOf(this.field_1487), Integer.valueOf(this.field_1491)});
   }

   // $FF: renamed from: e () byte[]
   public byte[] method_1610() {
      return this.field_1489;
   }

   // $FF: renamed from: b (gI, boolean, int) tH
   public static class_1595 method_1611(class_1069 var0, boolean var1, int var2) {
      int var4 = 0;
      String[] var10000 = class_752.method_4253();
      class_1072[] var5 = var0.method_6019();
      int var6 = 0;
      class_1595 var10001 = new class_1595;
      var10001.method_8729();
      class_1595 var7 = var10001;
      String[] var3 = var10000;
      byte[] var8 = field_1492;
      byte var12 = var1;
      if(var3 != null) {
         if(var1 != 0) {
            var0.field_5642 = true;
         }

         var12 = 0;
      }

      int var9 = var12;

      int var15;
      label265: {
         label264: {
            class_1068 var11;
            class_1072 var14;
            label263:
            while(true) {
               if(var9 < var5.length) {
                  var14 = var5[var9];
                  if(var3 == null) {
                     break;
                  }

                  label180: {
                     if(var14 != null) {
                        label178: {
                           var15 = var1;
                           if(var3 != null) {
                              label176: {
                                 if(var1 != 0) {
                                    var15 = var5[var9].method_6077();
                                    if(var3 == null) {
                                       break label176;
                                    }

                                    if(var15 != 0) {
                                       break label178;
                                    }
                                 }

                                 var15 = var2 & 1 << var9;
                              }
                           }

                           if(var15 != 0) {
                              var7.field_8310 |= 1 << var9;
                              if(var3 == null) {
                                 break label180;
                              }

                              if(var5[var9].method_6087() != null) {
                                 var7.field_8311 |= 1 << var9;
                                 ++var6;
                              }
                           }
                        }
                     }

                     ++var9;
                  }

                  if(var3 != null) {
                     continue;
                  }

                  var9 = 0;
               } else {
                  var9 = 0;
               }

               while(true) {
                  if(var9 < var5.length) {
                     var14 = var5[var9];
                     if(var3 == null) {
                        break label263;
                     }

                     if(var14 != null) {
                        label160: {
                           var15 = var1;
                           if(var3 != null) {
                              label158: {
                                 if(var1 != 0) {
                                    var15 = var5[var9].method_6077();
                                    if(var3 == null) {
                                       break label158;
                                    }

                                    if(var15 != 0) {
                                       break label160;
                                    }
                                 }

                                 var15 = var2 & 1 << var9;
                              }
                           }

                           if(var15 != 0) {
                              byte[] var10 = var5[var9].method_6085();
                              System.arraycopy(var10, 0, var8, var4, var10.length);
                              var4 += var10.length;
                           }
                        }
                     }

                     ++var9;
                     if(var3 != null) {
                        continue;
                     }

                     var9 = 0;
                  } else {
                     var9 = 0;
                  }

                  while(true) {
                     if(var9 < var5.length) {
                        var14 = var5[var9];
                        if(var3 == null) {
                           break label263;
                        }

                        if(var14 != null) {
                           label150: {
                              var15 = var1;
                              if(var3 != null) {
                                 label148: {
                                    if(var1 != 0) {
                                       var15 = var5[var9].method_6077();
                                       if(var3 == null) {
                                          break label148;
                                       }

                                       if(var15 != 0) {
                                          break label150;
                                       }
                                    }

                                    var15 = var2 & 1 << var9;
                                 }
                              }

                              if(var15 != 0) {
                                 var11 = var5[var9].method_6088();
                                 System.arraycopy(var11.field_5619, 0, var8, var4, var11.field_5619.length);
                                 var4 += var11.field_5619.length;
                              }
                           }
                        }

                        ++var9;
                        if(var3 != null) {
                           continue;
                        }

                        var9 = 0;
                     } else {
                        var9 = 0;
                     }

                     while(true) {
                        if(var9 < var5.length) {
                           var14 = var5[var9];
                           if(var3 == null) {
                              break label263;
                           }

                           if(var14 != null) {
                              label140: {
                                 var15 = var1;
                                 if(var3 != null) {
                                    label138: {
                                       if(var1 != 0) {
                                          var15 = var5[var9].method_6077();
                                          if(var3 == null) {
                                             break label138;
                                          }

                                          if(var15 != 0) {
                                             break label140;
                                          }
                                       }

                                       var15 = var2 & 1 << var9;
                                    }
                                 }

                                 if(var15 != 0) {
                                    var11 = var5[var9].method_6089();
                                    System.arraycopy(var11.field_5619, 0, var8, var4, var11.field_5619.length);
                                    var4 += var11.field_5619.length;
                                 }
                              }
                           }

                           ++var9;
                           if(var3 != null) {
                              continue;
                           }
                        }

                        var15 = var0.field_5629.field_1820.field_5736;
                        if(var3 != null) {
                           if(!var0.field_5629.field_1820.field_5736) {
                              var9 = 0;

                              while(true) {
                                 if(var9 < var5.length) {
                                    var14 = var5[var9];
                                    if(var3 == null) {
                                       break label263;
                                    }

                                    if(var14 != null) {
                                       label130: {
                                          var15 = var1;
                                          if(var3 != null) {
                                             label128: {
                                                if(var1 != 0) {
                                                   var15 = var5[var9].method_6077();
                                                   if(var3 == null) {
                                                      break label128;
                                                   }

                                                   if(var15 != 0) {
                                                      break label130;
                                                   }
                                                }

                                                var15 = var2 & 1 << var9;
                                             }
                                          }

                                          if(var15 != 0) {
                                             var11 = var5[var9].method_6090();
                                             System.arraycopy(var11.field_5619, 0, var8, var4, var11.field_5619.length);
                                             var4 += var11.field_5619.length;
                                          }
                                       }
                                    }

                                    ++var9;
                                    if(var3 != null) {
                                       continue;
                                    }

                                    var15 = var6;
                                    break;
                                 }

                                 var15 = var6;
                                 break;
                              }
                           } else {
                              var15 = var6;
                           }
                        }

                        if(var3 == null) {
                           break label265;
                        }

                        if(var15 <= 0) {
                           var15 = var1;
                           break label265;
                        }

                        var9 = 0;
                        if(var9 >= var5.length) {
                           break label264;
                        }

                        if(var3 == null) {
                           return var7;
                        }

                        var14 = var5[var9];
                        break label263;
                     }
                  }
               }
            }

            while(true) {
               if(var14 != null) {
                  label120: {
                     label119: {
                        label118: {
                           var12 = var1;
                           if(var3 != null) {
                              if(var1 == 0) {
                                 break label118;
                              }

                              var14 = var5[var9];
                              if(var3 == null) {
                                 break label119;
                              }

                              var12 = var14.method_6077();
                           }

                           if(var12 != 0) {
                              break label120;
                           }
                        }

                        var14 = var5[var9];
                     }

                     if(var14.method_6087() != null && (var2 & 1 << var9) != 0) {
                        var11 = var5[var9].method_6087();
                        System.arraycopy(var11.field_5619, 0, var8, var4, var11.field_5619.length);
                        var4 += var11.field_5619.length;
                     }
                  }
               }

               ++var9;
               if(var3 == null || var9 >= var5.length) {
                  break;
               }

               if(var3 == null) {
                  return var7;
               }

               var14 = var5[var9];
            }
         }

         var15 = var1;
      }

      if(var15 != 0) {
         byte[] var13 = var0.method_6060();
         System.arraycopy(var13, 0, var8, var4, var13.length);
         var4 += var13.length;
      }

      var7.field_8309 = new byte[var4];
      System.arraycopy(var8, 0, var7.field_8309, 0, var4);
      return var7;
   }

   // $FF: renamed from: f () int
   public int method_1612() {
      return this.field_1484;
   }

   // $FF: renamed from: g () int
   public int method_1613() {
      return this.field_1485;
   }

   // $FF: renamed from: h () int
   public int method_1614() {
      return this.field_1486;
   }

   // $FF: renamed from: i () int
   public int method_1615() {
      return this.field_1487;
   }

   // $FF: renamed from: j () boolean
   public boolean method_1616() {
      return this.field_1490;
   }

   // $FF: renamed from: <clinit> () void
   static void method_1458() {
      String[] var5 = new String[2];
      int var3 = 0;
      String var2 = "F¼d\\ t¯7L©$¹0^ß«k¯%K.|àÛ ß·9øh¸h±Ãa]Óíw¸0LÂè`ñÞ%[ð!¹ÒdL·aàÛ ";
      int var4 = "F¼d\\ t¯7L©$¹0^ß«k¯%K.|àÛ ß·9øh¸h±Ãa]Óíw¸0LÂè`ñÞ%[ð!¹ÒdL·aàÛ ".length();
      char var1 = 26;
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
                  field_1493 = var5;
                  field_1492 = new byte[196864];
                  return;
               }

               var1 = var2.charAt(var0);
               break;
            }

            char var10007 = (char)((Object[])var9)[var6];
            short var10009;
            switch(var6 % 7) {
            case 0:
               var10009 = 196;
               break;
            case 1:
               var10009 = 29;
               break;
            case 2:
               var10009 = 62;
               break;
            case 3:
               var10009 = 132;
               break;
            case 4:
               var10009 = 255;
               break;
            case 5:
               var10009 = 63;
               break;
            default:
               var10009 = 13;
            }

            ((Object[])var9)[var6] = (char)(var10007 ^ var10 ^ var10009);
            ++var6;
         }
      }
   }

   // $FF: renamed from: b (java.util.zip.DataFormatException) java.util.zip.DataFormatException
   private static DataFormatException method_1617(DataFormatException var0) {
      return var0;
   }
}
