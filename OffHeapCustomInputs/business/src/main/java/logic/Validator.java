package logic;

import pattern.Message;
import pattern.SchoolMember;

public class Validator {

  boolean validateMessage(Message msg){
    return msg.getBody() instanceof SchoolMember;
  }

}
