package com.mohamed.lock.controller;

import com.mohamed.lock.model.Door;
import com.mohamed.lock.model.DoorState;
import com.mohamed.lock.model.WaterBody;

public class LockController {
   public LockController() {
   }

   public static void main(String[] var0) {
      WaterBody var1 = new WaterBody(15);
      WaterBody var2 = new WaterBody(15);
      Door var3 = new Door(var1, var2);
      var3.openDoor();
      DoorState var4 = var3.getState();
      System.out.println(var4);
   }
}
