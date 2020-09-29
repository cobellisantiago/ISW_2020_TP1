package com.cobelliluetichperezvazquez.trabajointegrador.gestores;

import org.springframework.stereotype.Repository;

@Repository("DomicilioRepository")
public class DomicilioRepository {

 public String falalala(boolean fistBumpA, boolean fistBumpB) {
     if(fistBumpA && fistBumpB){
         return "falalala";
     }else{
         return "give me a fist bump Baymax!";
     }
 }
}
