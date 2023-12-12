public class Circle {

    //Attributi:
    private Point centre;
    private Double radious;

    //Metodi costruttori:
    public Circle(int x, int y, Double radious){
        centre = new Point(x, y);
        this.radious = radious;
    }
    public Circle(){
        centre = new Point(0, 0);
        radious = 1.0;
    }

    //Metodi getter e setter:
    public Point getCentre() {
        return centre;
    }
    public Double getRadious() {
        return radious;
    }

    //Metodi Ausiliari:

    //metodo che calcola la distanza tra 2 punti
    private Double calculateDistance(Point point1, Point point2){

        return Math.sqrt(Math.pow(point1.getX() - point2.getX(), 2) + Math.pow(point1.getY() - point2.getY(), 2));

    }

    //Metodi:

    //metodo che verifica di appartenenza di un punto al cerchio
    public boolean isInside(Point point){

        Double distance = calculateDistance(point, centre);

        if(distance > radious){
            return false;
        }else{
            return true;
        }

    }

    //metodo che sposta la X del centro di una certa distanza (il centro dovrà però rimanre compreso tra i confini del piano)
    public boolean moveX(int distantce){
        return centre.moveX(distantce);
    }
    //metodo che sposta la Y del centro di una certa distanza (il centro dovrà però rimanre compreso tra i confini del piano)
    public boolean moveY(int distantce){
        return centre.moveY(distantce);
    }

}
