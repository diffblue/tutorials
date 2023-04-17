package org.example;

import org.example.model.Message;
import org.example.model.SchoolMember;

public class Validator {

  boolean validateMessage(Message msg){
    return msg.getBody() instanceof SchoolMember;
  }

}
