public non-sealed class BRLClock extends Clock {
    public Clock convert(final Clock clock){
        this.second = clock.getSecond();
        this.minute = clock.getMinute();
        switch (clock) {
            case USClock usClock: this.hour = (usClock.getPeriodIndicator().equals("PM")) ? usClock.getHour() +12 : usClock.getHour();

                break;
        
            case BRLClock brlClock: this.hour = brlClock.getHour();

                break;
        }
        return this;
    }
}