public class Engine {
//    содержится информация о мощности двигателя и о типе (бензин, дизель, электро).
    String powerEngine;
    String typeEngine;
    public Engine(String powerEngine, String typeEngine) {
        this.powerEngine = powerEngine;
        this.typeEngine = typeEngine;

    }
    public String toString() {
        return powerEngine + "-" + typeEngine;
    }
}
