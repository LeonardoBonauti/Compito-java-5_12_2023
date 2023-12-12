public class Point {
    //Attributi

    private final int lowBound = 0;
    private final int highBound = 1000;


    private int x;
    private int y;

    //metodi costruttori
    public Point(int x, int y){

        if(range(x, lowBound, highBound)){
            this.x = x;
        }else {
            //se la x data in input non è compresa nel piano viene assegnato valore nullo
            this.x = 0;
        }

        if (range(y, lowBound, highBound)){
            this.y = y;
        }else{
            //se la y data in input non è compresa nel piano viene assegnato valore nullo
            this.y = 0;
        }

    }
    public Point(){
        x = 0;
        y = 0;
    }

    //metodi getter e setter
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    public void setX(int x) {
        this.x = x;
    }
    public void setY(int y) {
        this.y = y;
    }

    //metodi ausiliari:
    //Metodo che verifica che un valore sia contenuto all'interno di un range
    private boolean range(int value, int lowBound, int highBound){

        if((value <= highBound) || (value >= lowBound)){
            return true;
        }else{
            return false;
        }

    }

    //Metodi:
    //metodo che sposta orizzontalmente il punto (tenendo conto dei limiti del piano cartesiano [0-1000])
    public boolean moveX(int distance){

        int newX = x + distance;

        if(range(newX, lowBound, highBound)){
            x = newX;
            return true;
        }else{
            return false;
        }
    }

    //metodo che sposta verticalmente il punto (tenendo conto dei limiti del piano cartesiano [0-1000])
    public boolean moveY(int distance){

        int newY = y + distance;

        if(range(newY, lowBound, highBound)){
            y = newY;
            return true;
        }else{
            return false;
        }
    }
}
