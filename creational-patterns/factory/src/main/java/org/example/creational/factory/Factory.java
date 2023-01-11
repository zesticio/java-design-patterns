package org.example.creational.factory;

public class Factory {

  public PDU create(int commandId) {
    PDU pdu = null;
    switch (commandId) {
      case Constants.SUBMIT_SM:
        pdu = new SubmitSM();
        break;
      case Constants.DELIVER_SM:
        pdu = new DeliverSM();
        break;
      case Constants.CANCEL_SM:
        pdu = new CancelSM();
        break;
      default:
        pdu = new GenericNack();
        break;
    }
    return pdu;
  }
}
