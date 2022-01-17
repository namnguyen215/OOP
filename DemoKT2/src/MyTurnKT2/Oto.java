
package MyTurnKT2;
public class Oto extends PTGT {
    private String engine;
    private int seats;

    public Oto() {
    }

    public Oto(String engine, int seats, String code, String color, String brand, double price, int year) {
        super(code, color, brand, price, year);
        this.engine = engine;
        this.seats = seats;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }
    
}
