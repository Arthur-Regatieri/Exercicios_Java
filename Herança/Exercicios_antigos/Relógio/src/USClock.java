public non-sealed class USClock extends Clock {

    private String periodIndicator;

    public String getPeriodIndicator() {
        return periodIndicator;
    }

    public void setAfterMidday() {
        this.periodIndicator = "PM";
    }

    public void setBeforeMidday() {
        this.periodIndicator = "AM";
    }

    public void setHour(int hour){
        if (hour > 12 && hour <=23){
            this.hour = hour -12;
            setAfterMidday();
        } else if (hour >=24) {
            setBeforeMidday();
            this.hour = 0;   
        } else {
            this.hour = hour;
        }
    }


    Clock convert(final Clock clock){
        this.second = clock.getSecond();
        this.minute = clock.getMinute();
        switch (clock) {
            case USClock usClock: this.hour = usClock.getHour();
                this.periodIndicator = usClock.getPeriodIndicator();
                break;
        
            case BRLClock brlClock: this.setHour(brlClock.getHour());;

                break;

            default:

                break;
        }
        return this;
    }
    
    @Override
    public String getTime() {
        // TODO Auto-generated method stub
        return super.getTime() + " " + this.periodIndicator;
    }
}
