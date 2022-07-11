package ru.netology.spr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SQRServiceTest {
     @Test
     public void calcCvadr () {
         SQRService service = new SQRService();

         int expected = 3;
         int actual = service.calcCvadr(200, 300);
         Assertions.assertEquals(expected, actual);



         }
     }

