import java.lang.*;
public class Asiakas {
    static int count = 1; //saadaan samalla pdiettyä kirjaa asiakkaiden kokonaismäärästä
    private int id;
    private String name;
    private long start;
    private long end;

    public Asiakas(String name) {
        this.name = name;
        this.id = count;
        this.start = System.nanoTime();
        this.start = System.nanoTime();
        count++;
    }
        public String getName() {
            return this.name;
        }
        public int getId() {
            return this.id;
        }
        public long getStart() {
            return this.start;
        }
        public long getEnd() {
            return this.end;
        }
        public void setName(String name) {
            this.name = name;
        }
        public void setStart(long time) {
            this.start = time;
        }
        public void setEnd(long time) {
            this.end = time;
        }
        public long getTime() {
            return this.end - this.start;
        }

        //hyvin tuntuu metodit toimivan
    public static void main(String[] args) {
        Asiakas testi = new Asiakas("Jere");
        Asiakas testi2 = new Asiakas("Jussi");
        System.out.println("Nimi: " + testi.getName() + " ID: " + testi.getId());
        System.out.println("Nimi: " + testi2.getName() + " ID: " + testi2.getId());
        testi.setEnd(System.nanoTime());
        System.out.println(testi.getTime());
    }
}

