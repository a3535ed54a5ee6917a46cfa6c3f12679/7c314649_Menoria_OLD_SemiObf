import java.util.Stack;
import org.apache.logging.log4j.Logger;

// $FF: renamed from: rB
public class class_1520 {

   // $FF: renamed from: b org.apache.logging.log4j.Logger
   private static final Logger field_7997;
   // $FF: renamed from: c java.lang.String
   private static final String field_7998;
   // $FF: renamed from: h java.lang.String[]
   private static final String[] field_7999;


   // $FF: renamed from: <init> () void
   public void method_8249() {
      super();
   }

   // $FF: renamed from: b (java.lang.String) rm
   public static class_1571 method_8250(String var0) {
      var0 = var0.trim();
      String[] var10000 = class_752.method_4253();
      int var2 = method_8251(var0);
      String[] var1 = var10000;
      if(var2 != 1) {
         class_887 var6 = new class_887;
         String[] var4 = field_7999;
         var6.method_5169("Encountered multiple top tags, only one expected");
         throw var6;
      } else {
         class_1522 var3 = null;
         String var5 = var0;
         String var10001 = "{";
         if(var1 != null) {
            if(var0.startsWith("{")) {
               var10000 = field_7999;
               var3 = method_8252("tag", var0);
               return var3.method_8263();
            }

            var5 = method_8254(var0, false);
            var10001 = method_8255(var0, false);
         }

         var3 = method_8252(var5, var10001);
         return var3.method_8263();
      }
   }

   // $FF: renamed from: c (java.lang.String) int
   static int method_8251(String var0) {
      int var2 = 0;
      String[] var10000 = class_752.method_4253();
      int var3 = 0;
      String[] var1 = var10000;
      Stack var4 = new Stack();
      int var5 = 0;

      String[] var7;
      int var9;
      class_887 var10;
      StringBuilder var10002;
      while(true) {
         if(var5 < var0.length()) {
            char var6 = var0.charAt(var5);
            var9 = var6;
            if(var1 == null) {
               break;
            }

            label177: {
               if(var1 != null) {
                  if(var6 == 34) {
                     var9 = var5;
                     if(var1 != null) {
                        label149: {
                           if(var5 > 0) {
                              var9 = var0.charAt(var5 - 1);
                              if(var1 == null) {
                                 break label149;
                              }

                              if(var9 == 92) {
                                 if(var3 == 0) {
                                    var10 = new class_887;
                                    var10002 = new StringBuilder();
                                    var7 = field_7999;
                                    var10.method_5169(var10002.append("Illegal use of \\\": ").append(var0).toString());
                                    throw var10;
                                 }
                                 break label177;
                              }
                           }

                           var9 = var3;
                        }
                     }

                     if(var1 != null) {
                        var9 = var9 == 0?1:0;
                     }

                     var3 = var9;
                     if(var1 != null) {
                        break label177;
                     }
                  }

                  var9 = var3;
               }

               if(var1 != null) {
                  if(var9 != 0) {
                     break label177;
                  }

                  var9 = var6;
               }

               if(var1 != null) {
                  label170: {
                     if(var9 != 123) {
                        var9 = var6;
                        if(var1 == null) {
                           break label170;
                        }

                        if(var6 != 91) {
                           label171: {
                              char var8;
                              label172: {
                                 var8 = var6;
                                 byte var10001 = 125;
                                 if(var1 != null) {
                                    label173: {
                                       if(var6 == 125) {
                                          var8 = var4.isEmpty();
                                          if(var1 != null) {
                                             if(var8 != 0) {
                                                break label171;
                                             }

                                             var8 = ((Character)var4.pop()).charValue();
                                          }

                                          var10001 = 123;
                                          if(var1 == null) {
                                             break label173;
                                          }

                                          if(var8 != 123) {
                                             break label171;
                                          }
                                       }

                                       var8 = var6;
                                       if(var1 == null) {
                                          break label172;
                                       }

                                       var10001 = 93;
                                    }
                                 }

                                 if(var8 != var10001) {
                                    break label177;
                                 }

                                 var8 = var4.isEmpty();
                              }

                              label99: {
                                 if(var1 != null) {
                                    if(var8 != 0) {
                                       break label99;
                                    }

                                    var8 = ((Character)var4.pop()).charValue();
                                 }

                                 if(var8 == 91) {
                                    break label177;
                                 }
                              }

                              var10 = new class_887;
                              var10002 = new StringBuilder();
                              var7 = field_7999;
                              var10.method_5169(var10002.append("Unbalanced square brackets []: ").append(var0).toString());
                              throw var10;
                           }

                           var10 = new class_887;
                           var10002 = new StringBuilder();
                           var7 = field_7999;
                           var10.method_5169(var10002.append("Unbalanced curly brackets {}: ").append(var0).toString());
                           throw var10;
                        }
                     }

                     if(var1 == null) {
                        break label177;
                     }

                     var9 = var4.isEmpty();
                  }
               }

               if(var9 != 0) {
                  ++var2;
               }

               var4.push(Character.valueOf(var6));
            }

            ++var5;
            if(var1 != null) {
               continue;
            }
         }

         var9 = var3;
         break;
      }

      if(var1 != null) {
         if(var9 != 0) {
            var10 = new class_887;
            var10002 = new StringBuilder();
            var7 = field_7999;
            var10.method_5169(var10002.append("Unbalanced quotation: ").append(var0).toString());
            throw var10;
         }

         var9 = var4.isEmpty();
      }

      if(var1 != null) {
         if(var9 == 0) {
            var10 = new class_887;
            var10002 = new StringBuilder();
            String[] var10003 = field_7999;
            var10.method_5169(var10002.append("Unbalanced brackets: ").append(var0).toString());
            throw var10;
         }

         var9 = var2;
      }

      if(var1 != null) {
         if(var9 == 0) {
            var9 = var0.isEmpty();
            if(var1 == null) {
               return var9;
            }

            if(var9 == 0) {
               return 1;
            }
         }

         var9 = var2;
      }

      return var9;
   }

   // $FF: renamed from: b (java.lang.String, java.lang.String) rC
   static class_1522 method_8252(String var0, String var1) {
      var1 = var1.trim();
      String[] var10000 = class_752.method_4253();
      method_8251(var1);
      String[] var2 = var10000;
      boolean var10 = var1.startsWith("{");
      String var3;
      String var4;
      String var5;
      int var6;
      String[] var8;
      String var11;
      class_887 var12;
      int var14;
      byte var10001;
      StringBuilder var10002;
      if(var2 != null) {
         if(var10) {
            var11 = var1;
            if(var2 != null) {
               if(!var1.endsWith("}")) {
                  var12 = new class_887;
                  var10002 = new StringBuilder();
                  var8 = field_7999;
                  var12.method_5169(var10002.append("Unable to locate ending bracket for: ").append(var1).toString());
                  throw var12;
               }

               var11 = var1.substring(1, var1.length() - 1);
            }

            var1 = var11;
            class_1525 var16 = new class_1525;
            var16.method_8268(var0);
            class_1525 var9 = var16;

            while(var1.length() > 0) {
               var3 = method_8253(var1, false);
               var11 = var3;
               if(var2 != null) {
                  if(var3.length() <= 0) {
                     continue;
                  }

                  var11 = method_8254(var3, false);
               }

               var4 = var11;
               var5 = method_8255(var3, false);
               var9.field_8010.add(method_8252(var4, var5));
               var14 = var1.length();
               if(var2 != null) {
                  if(var14 < var3.length() + 1 && var2 != null) {
                     break;
                  }

                  var14 = var1.charAt(var3.length());
               }

               var6 = var14;
               if(var2 != null) {
                  if(var6 != 44) {
                     label175: {
                        var14 = var6;
                        var10001 = 123;
                        if(var2 != null) {
                           if(var6 == 123) {
                              break label175;
                           }

                           var14 = var6;
                           var10001 = 125;
                        }

                        if(var2 != null) {
                           if(var14 == var10001) {
                              break label175;
                           }

                           var14 = var6;
                           var10001 = 91;
                        }

                        if(var2 != null) {
                           if(var14 == var10001) {
                              break label175;
                           }

                           var14 = var6;
                           var10001 = 93;
                        }

                        if(var14 != var10001) {
                           var12 = new class_887;
                           var10002 = new StringBuilder();
                           var8 = field_7999;
                           var12.method_5169(var10002.append("Unexpected token \'").append((char)var6).append("\' at: ").append(var1.substring(var3.length())).toString());
                           throw var12;
                        }
                     }
                  }

                  var1 = var1.substring(var3.length() + 1);
               }

               if(var2 == null) {
                  break;
               }
            }

            return var9;
         }

         var10 = var1.startsWith("[");
      }

      label176: {
         if(var2 != null) {
            if(!var10) {
               break label176;
            }

            var8 = field_7999;
            var10 = var1.matches("\\[[-\\d|,\\s]+\\]");
         }

         label177: {
            if(var2 != null) {
               if(var10) {
                  break label176;
               }

               var11 = var1;
               if(var2 == null) {
                  break label177;
               }

               var10 = var1.endsWith("]");
            }

            if(!var10) {
               var12 = new class_887;
               var10002 = new StringBuilder();
               var8 = field_7999;
               var12.method_5169(var10002.append("Unable to locate ending bracket for: ").append(var1).toString());
               throw var12;
            }

            var11 = var1.substring(1, var1.length() - 1);
         }

         var1 = var11;
         class_1524 var13 = new class_1524;
         var13.method_8267(var0);
         class_1524 var7 = var13;

         while(var1.length() > 0) {
            var3 = method_8253(var1, true);
            if(var2 != null) {
               if(var3.length() > 0) {
                  var4 = method_8254(var3, true);
                  var5 = method_8255(var3, true);
                  var7.field_8008.add(method_8252(var4, var5));
                  var14 = var1.length();
                  if(var2 != null) {
                     if(var14 < var3.length() + 1 && var2 != null) {
                        break;
                     }

                     var14 = var1.charAt(var3.length());
                  }

                  var6 = var14;
                  if(var2 != null) {
                     if(var6 != 44) {
                        label181: {
                           var14 = var6;
                           var10001 = 123;
                           if(var2 != null) {
                              if(var6 == 123) {
                                 break label181;
                              }

                              var14 = var6;
                              var10001 = 125;
                           }

                           if(var2 != null) {
                              if(var14 == var10001) {
                                 break label181;
                              }

                              var14 = var6;
                              var10001 = 91;
                           }

                           if(var2 != null) {
                              if(var14 == var10001) {
                                 break label181;
                              }

                              var14 = var6;
                              var10001 = 93;
                           }

                           if(var14 != var10001) {
                              var12 = new class_887;
                              var10002 = new StringBuilder();
                              var8 = field_7999;
                              var12.method_5169(var10002.append("Unexpected token \'").append((char)var6).append("\' at: ").append(var1.substring(var3.length())).toString());
                              throw var12;
                           }
                        }
                     }

                     var1 = var1.substring(var3.length() + 1);
                  }

                  if(var2 != null) {
                     continue;
                  }
               }

               field_7997.debug(var1);
            }

            if(var2 == null) {
               break;
            }
         }

         return var7;
      }

      class_1523 var15 = new class_1523;
      var15.method_8265(var0, var1);
      return var15;
   }

   // $FF: renamed from: b (java.lang.String, boolean) java.lang.String
   private static String method_8253(String var0, boolean var1) {
      int var3 = method_8256(var0, ':');
      String[] var2 = class_752.method_4253();
      int var10000 = var3;
      String[] var12;
      class_887 var13;
      StringBuilder var10002;
      if(var2 != null) {
         label247: {
            if(var3 < 0) {
               var10000 = var1;
               if(var2 == null) {
                  break label247;
               }

               if(var1 == 0) {
                  var13 = new class_887;
                  var10002 = new StringBuilder();
                  var12 = field_7999;
                  var13.method_5169(var10002.append("Unable to locate name/value separator for string: ").append(var0).toString());
                  throw var13;
               }
            }

            var10000 = method_8256(var0, ',');
         }
      }

      int var4 = var10000;
      var10000 = var4;
      if(var2 != null) {
         label240: {
            if(var4 >= 0) {
               var10000 = var4;
               if(var2 == null) {
                  break label240;
               }

               if(var4 < var3) {
                  var10000 = var1;
                  if(var2 == null) {
                     break label240;
                  }

                  if(var1 == 0) {
                     var13 = new class_887;
                     var10002 = new StringBuilder();
                     var12 = field_7999;
                     var13.method_5169(var10002.append("Name error at: ").append(var0).toString());
                     throw var13;
                  }
               }
            }

            var10000 = var1;
         }
      }

      label251: {
         if(var2 != null) {
            if(var10000 == 0) {
               break label251;
            }

            var10000 = var3;
         }

         if(var2 != null) {
            label224: {
               if(var10000 >= 0) {
                  var10000 = var3;
                  if(var2 == null) {
                     break label224;
                  }

                  if(var3 <= var4) {
                     break label251;
                  }
               }

               var10000 = -1;
            }
         }

         var3 = var10000;
      }

      Stack var5 = new Stack();
      int var6 = var3 + 1;
      int var7 = 0;
      byte var8 = 0;
      int var9 = 0;
      int var10 = 0;

      String var15;
      int var10001;
      while(true) {
         if(var6 < var0.length()) {
            var15 = var0;
            var10001 = var6;
            if(var2 == null) {
               break;
            }

            label208: {
               char var11;
               label253: {
                  var11 = var0.charAt(var6);
                  var10000 = var11;
                  if(var2 != null) {
                     if(var11 == 34) {
                        var10000 = var6;
                        if(var2 != null) {
                           label201: {
                              if(var6 > 0) {
                                 var10000 = var0.charAt(var6 - 1);
                                 if(var2 == null) {
                                    break label201;
                                 }

                                 if(var10000 == 92) {
                                    var10000 = var7;
                                    if(var2 == null) {
                                       break label208;
                                    }

                                    if(var7 == 0) {
                                       var13 = new class_887;
                                       var10002 = new StringBuilder();
                                       var12 = field_7999;
                                       var13.method_5169(var10002.append("Illegal use of \\\": ").append(var0).toString());
                                       throw var13;
                                    }
                                    break label253;
                                 }
                              }

                              var10000 = var7;
                           }
                        }

                        if(var2 != null) {
                           var10000 = var10000 == 0?1:0;
                        }

                        var7 = var10000;
                        var10000 = var7;
                        if(var2 != null) {
                           label133: {
                              if(var7 != 0) {
                                 var10000 = var9;
                                 if(var2 == null) {
                                    break label133;
                                 }

                                 if(var9 == 0) {
                                    var8 = 1;
                                 }
                              }

                              var10000 = var7;
                           }
                        }

                        if(var2 == null) {
                           break label208;
                        }

                        if(var10000 != 0) {
                           break label253;
                        }

                        var10 = var6;
                        if(var2 != null) {
                           break label253;
                        }
                     }

                     var10000 = var7;
                  }

                  if(var2 == null) {
                     break label208;
                  }

                  if(var10000 == 0) {
                     label188: {
                        label255: {
                           var10000 = var11;
                           byte var14 = 123;
                           if(var2 != null) {
                              if(var11 == 123) {
                                 break label255;
                              }

                              var10000 = var11;
                              var14 = 91;
                           }

                           if(var2 != null) {
                              if(var10000 == var14) {
                                 break label255;
                              }

                              var10000 = var11;
                              var14 = 125;
                           }

                           if(var2 != null) {
                              label148: {
                                 if(var10000 == var14) {
                                    label146: {
                                       label256: {
                                          var10000 = var5.isEmpty();
                                          if(var2 != null) {
                                             if(var10000 != 0) {
                                                break label256;
                                             }

                                             var10000 = ((Character)var5.pop()).charValue();
                                          }

                                          var14 = 123;
                                          if(var2 == null) {
                                             break label148;
                                          }

                                          if(var10000 == 123) {
                                             break label146;
                                          }
                                       }

                                       var13 = new class_887;
                                       var10002 = new StringBuilder();
                                       var12 = field_7999;
                                       var13.method_5169(var10002.append("Unbalanced curly brackets {}: ").append(var0).toString());
                                       throw var13;
                                    }
                                 }

                                 var10000 = var11;
                                 var14 = 93;
                              }
                           }

                           if(var2 != null) {
                              label257: {
                                 if(var10000 == var14) {
                                    label171: {
                                       label258: {
                                          var10000 = var5.isEmpty();
                                          if(var2 != null) {
                                             if(var10000 != 0) {
                                                break label258;
                                             }

                                             var10000 = ((Character)var5.pop()).charValue();
                                          }

                                          var14 = 91;
                                          if(var2 == null) {
                                             break label257;
                                          }

                                          if(var10000 == 91) {
                                             break label171;
                                          }
                                       }

                                       var13 = new class_887;
                                       var10002 = new StringBuilder();
                                       String[] var10003 = field_7999;
                                       var13.method_5169(var10002.append("Unbalanced square brackets []: ").append(var0).toString());
                                       throw var13;
                                    }
                                 }

                                 var10000 = var11;
                                 if(var2 == null) {
                                    break label208;
                                 }

                                 var14 = 44;
                              }
                           }

                           if(var10000 == var14) {
                              var10000 = var5.isEmpty();
                              if(var2 == null) {
                                 break label208;
                              }

                              if(var10000 != 0) {
                                 return var0.substring(0, var6);
                              }
                           }
                           break label188;
                        }

                        var5.push(Character.valueOf(var11));
                     }
                  }
               }

               var10000 = Character.isWhitespace(var11);
            }

            label259: {
               if(var2 != null) {
                  if(var10000 != 0) {
                     break label259;
                  }

                  var10000 = var7;
               }

               if(var2 != null) {
                  label120: {
                     if(var10000 == 0) {
                        var10000 = var8;
                        if(var2 == null) {
                           break label120;
                        }

                        if(var8 != 0) {
                           var10000 = var10;
                           if(var2 == null) {
                              break label120;
                           }

                           if(var10 != var6) {
                              return var0.substring(0, var10 + 1);
                           }
                        }
                     }

                     var10000 = 1;
                  }
               }

               var9 = var10000;
            }

            ++var6;
            if(var2 != null) {
               continue;
            }
         }

         var15 = var0;
         var10001 = 0;
         break;
      }

      return var15.substring(var10001, var6);
   }

   // $FF: renamed from: c (java.lang.String, boolean) java.lang.String
   private static String method_8254(String var0, boolean var1) {
      String[] var2 = class_752.method_4253();
      int var10000 = var1;
      if(var2 != null) {
         label36: {
            if(var1 != 0) {
               label34: {
                  var0 = var0.trim();
                  String var4 = var0;
                  if(var2 != null) {
                     if(!var0.startsWith("{")) {
                        var10000 = var0.startsWith("[");
                        if(var2 == null) {
                           break label36;
                        }

                        if(var10000 == 0) {
                           break label34;
                        }
                     }

                     var4 = "";
                  }

                  return var4;
               }
            }

            var10000 = var0.indexOf(58);
         }
      }

      int var3 = var10000;
      var10000 = var3;
      if(var2 != null) {
         if(var3 >= 0) {
            return var0.substring(0, var3).trim();
         }

         var10000 = var1;
      }

      if(var10000 != 0) {
         return "";
      } else {
         class_887 var5 = new class_887;
         StringBuilder var10002 = new StringBuilder();
         String[] var10003 = field_7999;
         var5.method_5169(var10002.append("Unable to locate name/value separator for string: ").append(var0).toString());
         throw var5;
      }
   }

   // $FF: renamed from: d (java.lang.String, boolean) java.lang.String
   private static String method_8255(String var0, boolean var1) {
      String[] var2 = class_752.method_4253();
      int var10000 = var1;
      if(var2 != null) {
         label36: {
            if(var1 != 0) {
               label34: {
                  var0 = var0.trim();
                  String var4 = var0;
                  if(var2 != null) {
                     if(!var0.startsWith("{")) {
                        var10000 = var0.startsWith("[");
                        if(var2 == null) {
                           break label36;
                        }

                        if(var10000 == 0) {
                           break label34;
                        }
                     }

                     var4 = var0;
                  }

                  return var4;
               }
            }

            var10000 = var0.indexOf(58);
         }
      }

      int var3 = var10000;
      var10000 = var3;
      if(var2 != null) {
         if(var3 >= 0) {
            return var0.substring(var3 + 1).trim();
         }

         var10000 = var1;
      }

      if(var10000 != 0) {
         return var0;
      } else {
         class_887 var5 = new class_887;
         StringBuilder var10002 = new StringBuilder();
         String[] var10003 = field_7999;
         var5.method_5169(var10002.append("Unable to locate name/value separator for string: ").append(var0).toString());
         throw var5;
      }
   }

   // $FF: renamed from: b (java.lang.String, char) int
   private static int method_8256(String var0, char var1) {
      String[] var10000 = class_752.method_4253();
      int var3 = 0;
      String[] var2 = var10000;
      int var4 = 0;

      int var6;
      while(true) {
         if(var3 < var0.length()) {
            char var5 = var0.charAt(var3);
            var6 = var5;
            if(var2 == null) {
               break;
            }

            label98: {
               if(var2 != null) {
                  if(var5 == 34) {
                     var6 = var3;
                     if(var2 != null) {
                        label70: {
                           if(var3 > 0) {
                              var6 = var0.charAt(var3 - 1);
                              if(var2 == null) {
                                 break label70;
                              }

                              if(var6 == 92) {
                                 break label98;
                              }
                           }

                           var6 = var4;
                        }
                     }

                     if(var2 != null) {
                        var6 = var6 == 0?1:0;
                     }

                     var4 = var6;
                     if(var2 != null) {
                        break label98;
                     }
                  }

                  var6 = var4;
               }

               if(var2 != null) {
                  if(var6 != 0) {
                     break label98;
                  }

                  var6 = var5;
               }

               char var10001 = var1;
               if(var2 != null) {
                  if(var6 == var1) {
                     return var3;
                  }

                  var6 = var5;
                  if(var2 == null) {
                     return var6;
                  }

                  var10001 = 123;
               }

               if(var6 != var10001) {
                  var6 = var5;
                  if(var2 == null) {
                     return var6;
                  }

                  if(var5 != 91) {
                     break label98;
                  }
               }

               var6 = -1;
               return var6;
            }

            ++var3;
            if(var2 != null) {
               continue;
            }
         }

         var6 = -1;
         break;
      }

      return var6;
   }

   // $FF: renamed from: <clinit> () void
   static void method_8257() {
      // $FF: Couldn't be decompiled
   }
}
