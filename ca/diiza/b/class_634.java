package ca.diiza.b;

import java.io.IOException;
import java.net.ServerSocket;

// $FF: renamed from: ca.diiza.b.e
public class class_634 extends Thread {

   // $FF: renamed from: a java.net.ServerSocket
   private ServerSocket field_2764;


   // $FF: renamed from: <init> (java.net.ServerSocket) void
   public void method_3504(ServerSocket var1) {
      super();
      this.field_2764 = var1;
   }

   public void run() {
      try {
         while(true) {
            this.field_2764.accept();
         }
      } catch (IOException var2) {
         ;
      }
   }
}
