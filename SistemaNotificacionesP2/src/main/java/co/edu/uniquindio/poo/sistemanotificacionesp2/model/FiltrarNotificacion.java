public class FiltrarNotificacion {

    protected FiltrarNotificacion next;

    public void  setNext (FiltrarNotificacion next){
        this.next = next;
    }

    public boolean manejo (Notificacion notificacion){
        if (next != null) return next.manejo(notificacion);
        return true;
    }
}
