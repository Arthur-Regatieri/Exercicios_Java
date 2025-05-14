public sealed abstract class Ticket permits Mid, Family {
    protected String movie;
    protected double value;
    protected boolean dub;
    protected String subtitle;
    protected int ticket;
    protected double total;

    public int getTicket() {
        return ticket;
    }

    public double getTotal() {
        return total = this.value * ticket;
    }
    

    public String getMovie() {
        return movie;
    }

    public double getValue() {
        return value;
    }

    public void setDub(boolean dub) {

        this.dub = dub;
    }

    public void setMovie(String movie) {
        this.movie = movie;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void setTicket(int ticket) {
        this.ticket = ticket;
    }

    public String getSubtitle() {
        return subtitle;
    }
    public void legendado(){
        System.out.println("Legendado");
    }

    public void isDub( boolean dub){
        if (dub) {
        this.subtitle = "Dublado";            
        }
        this.subtitle = "Legendado";
    }

    //    abstract Ticket convert(Ticket ticket);

}
