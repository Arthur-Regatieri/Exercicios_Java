public non-sealed class Family extends Ticket {


    /*public Ticket convert (final Ticket ticket) {
        
        switch (ticket) {
            case Family family: Familyticket(getValue());
                
                break;
        
            case Mid mid:
                break;
        }

            return this;
    }*/

    public void Familyticket(double value){
        if (this.ticket > 3) {
          this.value = value * 0.95;        
    }
}   
}
