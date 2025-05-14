public class App {
    public static void main(String[] args) throws Exception {
        Ticket ticket = new Mid();

        ticket.setTicket(4);
        ticket.setMovie("Premonição");
        ticket.setDub(false);
        ticket.isDub(ticket.dub);
        ticket.setValue(50);

        if (ticket instanceof Mid mid) {
            mid.midEntry(ticket.getValue());
        } else if (ticket instanceof Family fam) {
            fam.Familyticket(ticket.getValue());            
        }

        System.out.println("Valor do ingresso: R$"+ ticket.getValue());
        System.out.println("Filme: "+ ticket.getMovie());
        System.out.println(ticket.getSubtitle());
        System.out.println("Quantidade de ingressos: " + ticket.getTicket());
        System.out.println("Total: R$"+ ticket.getTotal());

    }
}
