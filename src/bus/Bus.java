package bus;
public class Bus {
    private String name;
    private int trace;

    // Constructor
    public Bus(String name, int trace) {
        this.name = name;
        this.trace = trace;
    }

    // Getter y Setter para name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter y Setter para trace
    public int getTrace() {
        return trace;
    }

    public void setTrace(int trace) {
        this.trace = trace;
    }

    public void sumTrace(int newTrace){
        setTrace(trace+newTrace);
    }
    // Metodo paint
    public void paint(int trace) {
        String space = "";
        for (int i = 0; i < trace; i++) {
           space += " ";
        }
        System.out.println(space+"          "+name);
        System.out.println(space+"    l_______________________");
        System.out.println(space+"    |  [°][ ][ ][ ][ ][___°_]l_");
        System.out.println(space+"**  |                         °|");
        System.out.println(space+"  * l====OO===============O====");
    }

    // Método main para probar la clase
    public static void main(String[] args) {
        Bus bus = new Bus("Bus 1", 15);
        bus.paint(bus.getTrace());
        bus.sumTrace(4);
        bus.paint(bus.getTrace());
        bus.sumTrace(4);
        bus.paint(bus.getTrace());
        bus.sumTrace(4);
        bus.paint(bus.getTrace());
    }
}
